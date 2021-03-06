package com.bravi.capigoatrainer.domain;

/**
 * Created by Mauricio on 03/06/2014.
 */
import java.util.ArrayList;
import java.util.List;

public class VerbList {

    List<Verb> list = new ArrayList<Verb>();

    //Default Constructor
    public VerbList(){

    };

    //public int Round(int min, int max)
    //{
    //this.roundVector = new Array();

    //max+1 because slice doesn't get the last index
    //this.roundVector = verbBucket.slice(min, max+1);
    //this.roundVector = new Array();

    //max+1 because slice doesn't get the last index
    //this.roundVector = verbBucket.slice(min, max+1);

    //}

    public List<Verb> getVerbListByRound(int roundNumber){

        this.loadFullVerbList();

        return new ArrayList<Verb>();

    }

    public void loadFullVerbList(){
        list.add(new Verb("ask","asked","asked","Say something in order to obtain an answer or some information/ Say to (someone) that one wants them to do or give something"));
        list.add(new Verb("awake","awoke","awoken","Stop sleeping"));
        list.add(new Verb("be","was/were","been","Exist/ Occur; take place"));
        list.add(new Verb("bear","bore","born","Carry/ Support/ Endure/ Carry the weight of"));
        list.add(new Verb("beat","beat","beaten","Strike (a person or an animal) repeatedly and violently so as to hurt or injure them, typically with an implement such as a club or whip/ Defeat (someone) in a game or other competitive situation"));
        list.add(new Verb("become","became","become","Begin to be/ (of clothing) Look good on or suit (someone)"));
        list.add(new Verb("begin","began","begun","Perform or undergo the first part of (an action or activity)"));
        list.add(new Verb("believe","believed","believed","Accept that (something) is true, especially without proof/ Feel sure of the truth of/ Hold (something) as an opinion; think"));
        list.add(new Verb("bend","bent","bent","Shape or force (something straight) into a curve or angle/(of a person) Incline the body downward from the vertical"));
        list.add(new Verb("bet","bet","bet","Risk something, usually a sum of money, against someone else's on the basis of the outcome of a future event, such as the result of a race or game/ Feel sure"));
        list.add(new Verb("bid","bid","bid","Offer (a certain price) for something, especially at an auction/ Make an effort or attempt to achieve"));
        list.add(new Verb("bind","bound","bound","Tie or fasten (something) tightly/ Stick together or cause to stick together in a single mass"));
        list.add(new Verb("bite","bit","bitten","Use the teeth to cut into something in order to eat it/ (of a tool, tire, boot, etc.) Grip or take hold on a surface"));
        list.add(new Verb("bleed","bled","bled","Lose blood from the body as a result of injury or illness/ Draw blood from (someone), especially as a former method of treatment in medicine"));
        list.add(new Verb("blow","blew","blown","(of wind) Move creating an air current/ (of a person) Expel air through pursed lips"));
        list.add(new Verb("break","broke","broken","Separate or cause to separate into pieces as a result of a blow, shock, or strain/ Interrupt (a continuity, sequence, or course)"));
        list.add(new Verb("breed","bred","bred","(of animals) Mate and then produce offspring"));
        list.add(new Verb("bring","brought","brought","Take or go with (someone or something) to a place/ Cause (someone or something) to be in a particular state or condition"));
        list.add(new Verb("broadcast","broadcast","broadcast","Transmit (a program or some information) by radio or television/ Scatter (seeds) by hand or machine rather than placing in drills or rows"));
        list.add(new Verb("build","built","built","Construct (something) by putting parts or material together"));
        list.add(new Verb("burn","burnt","burnt","(of a fire) Flame or glow while consuming a material such as coal or wood/ Be or cause to be destroyed by fire/ (of a person, the skin, or a part of the body) Become red and painful through exposure to the sun"));
        list.add(new Verb("burst","burst","burst","(of a container) break suddenly and violently apart, spilling the contents, typically as a result of an impact or internal pressure"));
        list.add(new Verb("bust","bust","bust","To go bankrupt/to collapse from the strain of making a supreme effort"));
        list.add(new Verb("buy","bought","bought","Obtain in exchange for payment"));
        list.add(new Verb("call","called","called","Cry out to (someone) in order to summon them or attract their attention/Give (an infant or animal) a specified name"));
        list.add(new Verb("cast","cast","cast","Throw (something) forcefully in a specified direction/Cause (light or shadow) to appear on a surface"));
        list.add(new Verb("catch","caught","caught","Intercept and hold (something that has been thrown, propelled, or dropped)/Capture (a person or animal that tries or would try to escape)"));
        list.add(new Verb("choose","chose","chosen","Pick out or select (someone or something) as being the best or most appropriate of two or more alternatives"));
        list.add(new Verb("clap","clapped","clapped","Strike the palms of (one's hands) together repeatedly, typically in order to applaud"));
        list.add(new Verb("cling","clung","clung","(of a person or animal) hold on tightly to"));
        list.add(new Verb("come","came","come","Move or travel toward or into a place thought of as near or familiar to the speaker/Occur; happen; take place"));
        list.add(new Verb("cost","cost","cost","(of an object or an action) require the payment of (a specified sum of money) before it can be acquired or done/Estimate the price of"));
        list.add(new Verb("creep","crept","crept","Move slowly and carefully, especially in order to avoid being heard or noticed/(of an unwanted and negative characteristic or fact) occur or develop gradually and almost imperceptibly"));
        list.add(new Verb("cut","cut","cut","Make an opening, incision, or wound in (something) with a sharp-edged tool or object/Remove (something) from something larger by using a sharp implement"));
        list.add(new Verb("dare","dared","dared","Have the courage to do something/ Defy or challenge (someone) to do something"));
        list.add(new Verb("deal","dealt","dealt","Distribute (cards) in an orderly rotation to the players for a game or round/ Take part in commercial trading of a particular commodity"));
        list.add(new Verb("dig","dug","dug","Break up and move earth with a tool or machine, or with hands, paws, snout, etc/ Like, appreciate, or understand"));
        list.add(new Verb("dive","dived","dived","Plunge head first into water/ (of an aircraft or bird) Plunge steeply downward through the air"));
        list.add(new Verb("do","did","done","Perform (an action, the precise nature of which is often unspecified)/ Achieve or complete, in particular/ Used before a verb (except be, can, may, ought, shall, will ) in questions and negative statements/ Used to refer to a verb already mentioned"));
        list.add(new Verb("draw","drew","drawn","Produce (a picture or diagram) by making lines and marks, especially with a pen or pencil, on paper/ Pull or drag (something such as a vehicle) so as to make it follow behind"));
        list.add(new Verb("dream","dreamt","dreamt","Experience dreams during sleep/ Contemplate the possibility of doing something or that something might be the case"));
        list.add(new Verb("drink","drank","drunk","Take (a liquid) into the mouth and swallow/ Watch or listen to something with eager pleasure or interest"));
        list.add(new Verb("drive","drove","driven","Operate and control the direction and speed of a motor vehicle/ Propel or carry along by force in a specified direction"));
        list.add(new Verb("eat","ate","eaten","Put (food) into the mouth and chew and swallow it"));
        list.add(new Verb("fall","fell","fallen","Move downward, typically rapidly and freely without control, from a higher to a lower level/ (of a person) Lose one's balance and collapse"));
        list.add(new Verb("feed","fed","fed","Give food to/ Supply (a machine) with material, power, or other things necessary for its operation"));
        list.add(new Verb("feel","felt","felt","Be aware of (a person or object) through touching or being touched/ Experience (an emotion or sensation)"));
        list.add(new Verb("fight","fought","fought","Take part in a violent struggle involving the exchange of physical blows or the use of weapons/ "));
        list.add(new Verb("find","found","found","discover or perceive by chance or unexpectedly/ identify (something) as being present "));
        list.add(new Verb("fit","fit","fit","be of the right shape and size for/ install or fix (something) into place"));
        list.add(new Verb("flee","fled","fled","run away from a place or situation of danger/ run away from (someone or something)"));
        list.add(new Verb("fling","flung","flung","throw or hurl forcefully"));
        list.add(new Verb("fly","flew","flown","(of a bird, bat, or insect) move through the air using wings/ move or be hurled quickly through the air"));
        list.add(new Verb("forbid","forbade","forbidden","refuse to allow (something)/ order (someone) not to do something/ refuse entry to a place or area"));
        list.add(new Verb("forecast","forecast","forecast","predict or estimate (a future event or trend)"));
        list.add(new Verb("foresee","foresaw","foreseen","be aware of beforehand; predict"));
        list.add(new Verb("forget","forgot","forgotten","fail to remember/ inadvertently neglect to do or mention something/ deliberately cease to think of"));
        list.add(new Verb("forgive","forgave","forgiven","stop feeling angry or resentful towards (someone) for an offence, flaw, or mistake/ no longer feel angry about or wish to punish (an offence, flaw, or mistake)/ cancel (a debt)"));
        list.add(new Verb("forsake","forsook","forsaken","abandon or leave/ renounce or give up (something valued or pleasant)"));
        list.add(new Verb("freeze","froze","frozen","(with reference to a liquid) turn or be turned into ice or another solid as a result of extreme cold/ store (something) at a very low temperature in order to preserve it"));
        list.add(new Verb("get","got","got","come to have (something); receive/ succeed in attaining, achieving, or experiencing; obtain"));
        list.add(new Verb("give","gave","given","freely transfer the possession of (something) to (someone)/ cause or allow (someone or something) to have or experience (something); provide with"));
        list.add(new Verb("go","went","gone/been","move from one place to another; travel/ leave; depart"));
        list.add(new Verb("grind","ground","ground","reduce (something) to small particles or powder by crushing it/ rub or cause to rub together gratingly"));
        list.add(new Verb("grow","grew","grown","(of a living thing) undergo natural development by increasing in size and changing physically/ come into existence and develop"));
        list.add(new Verb("handwrite","handwrote","handwritten","write by hand"));
        list.add(new Verb("hang","hung","hung","suspend or be suspended from above with the lower part dangling free/ kill (someone) by tying a rope attached from above around their neck and removing the support from beneath them (often used as a form of capital punishment)"));
        list.add(new Verb("have","had","had","possess, own, or hold/ experience; undergo/ used with a past participle to form the perfect, pluperfect, and future perfect tenses, and the conditional mood"));
        list.add(new Verb("hear","heard","heard","perceive with the ear the sound made by (someone or something)/ be told or informed of"));
        list.add(new Verb("help","helped","helped","make it easier or possible for (someone) to do something by offering them one's services or resources/ serve someone with (food or drink)"));
        list.add(new Verb("hide","hid","hidden","put or keep out of sight"));
        list.add(new Verb("hit","hit","hit","bring one's hand or a tool or weapon into contact with (someone or something) quickly and forcefully/ cause harm or distress to"));
        list.add(new Verb("hold","held","held","grasp, carry, or support with one's arms or hands/ keep or detain (someone)"));
        list.add(new Verb("hurt","hurt","hurt","cause pain or injury to/ be detrimental to"));
        list.add(new Verb("inlay","inlaid","inlaid","ornament (an object) by embedding pieces of a different material in it, flush with its surface"));
        list.add(new Verb("input","input","input","put (data) into a computer"));
        list.add(new Verb("keep","kept","kept","have or retain possession of/ continue or cause to continue in a specified condition, position, course, etc"));
        list.add(new Verb("kneel","knelt","knelt","be in or assume a position in which the body is supported by a knee or the knees, as when praying or showing submission"));
        list.add(new Verb("knit","knit","knit","make (a garment or other item) by interlocking loops of wool or other yarn with knitting needles or on a machine/ unite or cause to unite"));
        list.add(new Verb("know","knew","known","be aware of through observation, inquiry, or information/ have developed a relationship with (someone) through meeting and spending time with them; be familiar or friendly with."));
        list.add(new Verb("lay","laid","laid","put (something) down gently or carefully/ put down and set in position for use"));
        list.add(new Verb("lead","led","led","cause (a person or animal) to go with one by holding them by the hand, a halter, a rope, etc. while moving forward/ be a route or means of access to a particular place or in a particular direction"));
        list.add(new Verb("lean","leant","leant","be in or move into a sloping position"));
        list.add(new Verb("leap","leapt","leapt","jump or spring a long way, to a great height, or with great force/ select"));
        list.add(new Verb("learn","learnt","learnt","select/ move quickly and suddenly"));
        list.add(new Verb("leave","left","left","go away from/ allow or cause to remain"));
        list.add(new Verb("lend","lent","lent","grant to (someone) the use of (something) on the understanding that it will be returned/ contribute or add (a quality) to"));
        list.add(new Verb("let","let","let","not prevent or forbid; allow/ used in the imperative to formulate various expressions"));
        list.add(new Verb("lie","lay","lain","(of a person or animal) be in or assume a horizontal or resting position on a supporting surface/ be, remain, or be kept in a specified state"));
        list.add(new Verb("light","lit","lit","provide with light or lighting; illuminate/ make (something) start burning; ignite"));
        list.add(new Verb("like","liked","liked","find agreeable, enjoyable, or satisfactory/ wish for; want"));
        list.add(new Verb("live","lived","lived","remain alive/ make one's home in a particular place or with a particular person"));
        list.add(new Verb("look","looked","looked","direct one's gaze in a specified direction/ regard in a specified way"));
        list.add(new Verb("lose","lost","lost","be deprived of or cease to have or retain (something)/ become unable to find (something or someone)"));
        list.add(new Verb("make","made","made","To cause to exist or happen; bring about; create/ To bring into existence by shaping, modifying, or putting together material; construct"));
        list.add(new Verb("mean","meant","meant","intend to convey or refer to (a particular thing); signify/ intend (something) to occur or be the case"));
        list.add(new Verb("meet","met","met","arrange or happen to come into the presence or company of (someone)/ touch; join"));
        list.add(new Verb("melt","melted","molten","make or become liquefied by heating/ make or become more tender or loving"));
        list.add(new Verb("mislead","misled","misled","cause (someone) to have a wrong idea or impression"));
        list.add(new Verb("mistake","mistook","mistaken","be wrong about"));
        list.add(new Verb("misunderstand","misunderstood","misunderstood","fail to interpret or understand (something) correctly/ fail to interpret or understand the words or actions of (someone) correctly"));
        list.add(new Verb("move","moved","moved","go in a specified direction or manner; change position/ make progress; develop in a particular manner or direction"));
        list.add(new Verb("mow","mowed","mown","cut down (grass) with a machine/ cut down (grass or a cereal crop) with a scythe"));
        list.add(new Verb("need","needed","needed","require (something) because it is essential or very important rather than just desirable/ expressing necessity or obligation"));
        list.add(new Verb("overdraw","overdrew","overdrawn","draw money from (one's bank account) in excess of what the account holds/ exaggerate in describing or depicting (someone or something)"));
        list.add(new Verb("overhear","overheard","overheard","hear (someone or something) without meaning to or without the knowledge of the speaker"));
        list.add(new Verb("overtake","overtook","overtaken","catch up with and pass while travelling in the same direction/ (especially of misfortune) come suddenly or unexpectedly upon"));
        list.add(new Verb("pay","paid","paid","give (someone) money that is due for work done, goods received, or a debt incurred/ suffer a misfortune as a consequence of an action"));
        list.add(new Verb("play","played","played","engage in activity for enjoyment and recreation rather than a serious or practical purpose/ take part in (a sport)"));
        list.add(new Verb("preset","preset","preset","set or adjust (a value that controls the operation of a device) in advance of its use"));
        list.add(new Verb("prove","proved","proven","demonstrate the truth or existence of (something) by evidence or argument/ demonstrate to be the specified thing by evidence or argument"));
        list.add(new Verb("put","put","put","move to or place in a particular position/ bring into a particular state or condition"));
        list.add(new Verb("quit","quit","quit","leave (a place), usually permanently"));
        list.add(new Verb("read","read","read","look at and comprehend the meaning of (written or printed matter) by interpreting the characters or symbols of which it is composed/ discover (information) by reading it in a written or printed source"));
        list.add(new Verb("rid","rid","rid","make someone or something free of (an unwanted person or thing)/ be freed or relieved of"));
        list.add(new Verb("ride","rode","ridden","sit on and control the movement of (an animal, typically a horse)/ be carried or supported by (something moving with great momentum)"));
        list.add(new Verb("ring","rang","rung","surround (someone or something), especially for protection or containment/ put an aluminium strip around the leg of (a bird) for subsequent identification"));
        list.add(new Verb("rise","rose","risen","move from a lower position to a higher one; come or go up/ get up from lying, sitting, or kneeling"));
        list.add(new Verb("run","ran","run","move at a speed faster than a walk, never having both or all the feet on the ground at the same time/ pass or cause to pass quickly in a particular direction"));
        list.add(new Verb("saw","sawed","sawn","cut (something) using a saw"));
        list.add(new Verb("say","said","said","utter words so as to convey information, an opinion, a feeling or intention, or an instruction/ assume something in order to work out what its consequences would be; make a hypothesis"));
        list.add(new Verb("see","saw","seen","perceive with the eyes; discern visually/ discern or deduce after reflection or from information; understand"));
        list.add(new Verb("seem","seemed","seemed","give the impression of being something or having a particular quality/ be unable to do something, despite having tried"));
        list.add(new Verb("seek","sought","sought","attempt to find (something)/ attempt or desire to obtain or achieve (something)	/ ask for (something) from someone"));
        list.add(new Verb("sell","sold","sold","give or hand over (something) in exchange for money/ persuade someone of the merits of"));
        list.add(new Verb("send","sent","sent","cause to go or be taken to a particular destination; arrange for the delivery of, especially by post/ cause to be in a specified state"));
        list.add(new Verb("set","set","set","put, lay, or stand (something) in a specified place or position/ put or bring into a specified state"));
        list.add(new Verb("sew","sewed","sewn","Join, fasten, or repair (something) by making stitches with a needle and thread"));
        list.add(new Verb("shake","shook","shaken","(of a structure or area of land) tremble or vibrate/ move (an object) up and down or from side to side with rapid, forceful, jerky movements"));
        list.add(new Verb("shave","shaved","shaven","(of a man) cut the hair off the face with a razor/ cut (a thin slice or slices) from the surface of something"));
        list.add(new Verb("shine","shone","shone","(of the sun or another source of light) give out a bright light/ be very talented or perform very well"));
        list.add(new Verb("shoot","shot","shot","kill or wound (a person or animal) with a bullet or arrow/ move or cause to move suddenly and rapidly in a particular direction"));
        list.add(new Verb("show","showed","shown","be, allow, or cause to be visible/ allow (a quality or emotion) to be perceived; display"));
        list.add(new Verb("shrink","shrank","shrunk","become or make smaller in size or amount/ move back or away, especially because of fear or disgust"));
        list.add(new Verb("shut","shut","shut","move (something) into position so as to block an opening; close/ old or bring together the sides of (something) so as to close it"));
        list.add(new Verb("sing","sang","sung","make musical sounds with the voice, especially words with a set tune/ make a high-pitched whistling or buzzing sound"));
        list.add(new Verb("sink","sank","sunk","go down below the surface of something, especially of a liquid; become submerged/ descend from a higher to a lower position; drop downwards"));
        list.add(new Verb("sit","sat","sat","adopt or be in a position in which one's weight is supported by one's buttocks rather than one's feet and one's back is upright/ be or remain in a particular position or state"));
        list.add(new Verb("slay","slew","slain","kill (a person or animal) in a violent way"));
        list.add(new Verb("sleep","slept","slept","A natural periodic state of rest for the mind and body, in which the eyes usually close and consciousness is completely or partially lost, so that there is a decrease in bodily movement and responsiveness to external stimuli"));
        list.add(new Verb("slide","slid","slid","move smoothly along a surface while maintaining continuous contact with it"));
        list.add(new Verb("sling","slung","slung","suspend or arrange (something), especially with a strap or straps, so that it hangs loosely in a particular position/ casually throw or fling"));
        list.add(new Verb("slit","slit","slit","make a long, narrow cut in/ squint"));
        list.add(new Verb("smell","smelt","smelt","perceive or detect the odour or scent of (something)/ emit an odour or scent of a specified kind"));
        list.add(new Verb("sneak","sneaked","sneaked","move or go in a furtive or stealthy way/ (especially in children's use) inform an adult or person in authority of a companion's misdeeds; tell tales"));
        list.add(new Verb("sow","sowed","sown","Plant (seed) by scattering it on or in the earth/ disseminate or introduce (something undesirable)"));
        list.add(new Verb("speak","spoke","spoken","say something in order to convey information or to express a feeling/ talk to in order to reprove or advise"));
        list.add(new Verb("speed","sped","sped","move quickly"));
        list.add(new Verb("spell","spelt","spelt","Write or name the letters that form (a word) in correct sequence"));
        list.add(new Verb("spend","spent","spent","give (money) to pay for goods, services, or so as to benefit someone or something/ pass (time) in a specified way or in a particular place"));
        list.add(new Verb("spill","spilt","spilt","cause or allow (liquid) to flow over the edge of its container, especially unintentionally/ reveal (confidential information) to someone"));
        list.add(new Verb("spin","span","spun","turn or whirl round quickly/ draw out and twist (the fibres of wool, cotton, or other material) to convert them into yarn, either by hand or with machinery"));
        list.add(new Verb("spit","spat","spat","eject saliva forcibly from one's mouth, sometimes as a gesture of contempt or anger/ light rain falls"));
        list.add(new Verb("split","split","split","break or cause to break forcibly into parts, especially into halves or along the grain/ (with reference to a group of people) divide into two or more groups"));
        list.add(new Verb("spoil","spoilt","spoilt","diminish or destroy the value or quality of/ harm the character of (a child) by being too lenient or indulgent"));
        list.add(new Verb("spread","spread","spread","open out (something) so as to extend its surface area, width, or length/ extend over a large or increasing area"));
        list.add(new Verb("spring","sprang","sprung","ove or jump suddenly or rapidly upwards or forwards/ originate or arise from"));
        list.add(new Verb("stand","stood","stood","have or maintain an upright position, supported by one's feet/ (of an object, building, or settlement) be situated in a particular place or position"));
        list.add(new Verb("start","started","started","begin or be reckoned from a particular point in time or space; come into being/ cause to happen or begin"));
        list.add(new Verb("steal","stole","stolen","take (another person's property) without permission or legal right and without intending to return it/ move somewhere quietly or surreptitiously"));
        list.add(new Verb("stick","stuck","stuck","push a sharp or pointed object into or through (something)/ insert, thrust, or push/ be fixed in a particular position or unable to move or be moved"));
        list.add(new Verb("sting","stung","stung","To pierce or wound painfully with or as if with a sharp-pointed structure or organ, as that of certain insects/ swindle or exorbitantly overcharge (someone)"));
        list.add(new Verb("stink","stank","stunk","have a strong unpleasant smell/ be very unpleasant, contemptible, or scandalous"));
        list.add(new Verb("strike","struck","struck","hit forcibly and deliberately with one's hand or a weapon or other implement/ (of a disaster, disease, or other unwelcome phenomenon) occur suddenly and have harmful or damaging effects on"));
        list.add(new Verb("string","strung","strung","hang (something) so that it stretches in a long line"));
        list.add(new Verb("strip","stript","stript","remove all coverings from/ leave bare of accessories or fittings"));
        list.add(new Verb("strive","strove","striven","make great efforts to achieve or obtain something/ struggle or fight vigorously"));
        list.add(new Verb("swear","swore","sworn","make a solemn statement or promise undertaking to do something or affirming that something is the case/ use offensive language, especially as an expression of anger"));
        list.add(new Verb("sweat","sweat","sweat","To excrete perspiration through the pores in the skin; perspire"));
        list.add(new Verb("sweep","swept","swept","clean (an area) by brushing away dirt or litter/ move swiftly and smoothly"));
        list.add(new Verb("swell","swelled","swollen","(especially of a part of the body) become larger or rounder in size, typically as a result of an accumulation of fluid/ become or make greater in intensity, number, amount, or volume"));
        list.add(new Verb("swim","swam","swum","propel the body through water by using the limbs, or (in the case of a fish or other aquatic animal) by using fins, tail, or other bodily movement/ be immersed in or covered with liquid"));
        list.add(new Verb("swing","swung","swung","move or cause to move back and forth or from side to side while suspended or on an axis/ move by grasping a support from below and leaping"));
        list.add(new Verb("take","took","taken","lay hold of (something) with one's hands; reach for and hold/ Remove (someone or something) from a particular place"));
        list.add(new Verb("talk","talked","talked","speak in order to give information or express ideas or feelings; converse or communicate by spoken words/ have formal dealings or discussions; negotiate"));
        list.add(new Verb("teach","taught","taught","impart knowledge to or instruct (someone) as to how to do something/ cause (someone) to learn or understand something by example or experience"));
        list.add(new Verb("tear","tore","torn","pull (something) apart or to pieces with force/ move very quickly in a reckless or excited manner"));
        list.add(new Verb("tell","told","told","communicate information to someone in spoken or written words/ decide or determine correctly or with certainty"));
        list.add(new Verb("think","thought","thought","have a particular belief or idea/ direct one's mind towards someone or something; use one's mind actively to form connected ideas"));
        list.add(new Verb("throw","threw","thrown","propel (something) with force through the air by a movement of the arm and hand/ send suddenly into a particular state or condition"));
        list.add(new Verb("thrust","thrust","thrust","push suddenly or violently in a specified direction"));
        list.add(new Verb("tread","trod","trodden","walk in a specified way"));
        list.add(new Verb("try","tried","tried","make an attempt or effort to do something/ subject (someone) to trial"));
        list.add(new Verb("turn","turned","turned","move or cause to move in a circular direction wholly or partly around an axis or point/ move (something) so that it is in a different position in relation to its surroundings or its previous position"));
        list.add(new Verb("understand","understood","understood","perceive the intended meaning of (words, a language, or a speaker)/ interpret or view (something) in a particular way"));
        list.add(new Verb("upset","upset","upset","make (someone) unhappy, disappointed, or worried/ knock (something) ove"));
        list.add(new Verb("use","used","used","take, hold, or deploy (something) as a means of accomplishing or achieving something; employ/ take or consume (an amount) from a limited supply"));
        list.add(new Verb("wake","woke","woken","emerge or cause to emerge from sleep; stop sleeping"));
        list.add(new Verb("want","wanted","wanted","have a desire to possess or do (something); wish for"));
        list.add(new Verb("wear","wore","worn","have (something) on one's body as clothing, decoration, or protection/ damage, erode, or destroy by friction or use"));
        list.add(new Verb("weep","wept","wept","shed tears/ used in names of tree and shrub varieties with drooping branches, e.g. weeping cherry"));
        list.add(new Verb("wet","wet","wet","cover or touch with liquid; moisten"));
        list.add(new Verb("win","won","won","be successful or victorious in (a contest or conflict)/ acquire or secure as a result of a contest, conflict, bet, or other endeavour"));
        list.add(new Verb("wind","wound","wound","cause (someone) to have difficulty breathing because of exertion or a blow to the stomach"));
        list.add(new Verb("withdraw","withdrew","withdrawn","remove or take away (something) from a particular place or position/ leave or cause to leave a place or situation"));
        list.add(new Verb("withhold","withheld","withheld","refuse to give (something that is due to or is desired by another)/ suppress or hold back (an emotion or reaction)"));
        list.add(new Verb("withstand","withstood","withstood","remain undamaged or unaffected by; resist/ offer strong resistance or opposition to"));
        list.add(new Verb("work","worked","worked","be engaged in physical or mental activity in order to achieve a result/ (of a machine or system) function, especially properly or effectively"));
        list.add(new Verb("wring","wrung","wrung","squeeze and twist (something) to force liquid from it/ break (an animal's neck) by twisting it forcibly"));
        list.add(new Verb("write","wrote","written","mark (letters, words, or other symbols) on a surface, typically paper, with a pen, pencil, or similar implement/ compose, write, and send (a letter) to someone"));
    }

}

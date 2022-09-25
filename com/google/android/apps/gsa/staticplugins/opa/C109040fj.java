package com.google.android.apps.gsa.staticplugins.opa;

import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.app.C0167am;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.C1773f;
import androidx.core.content.C1878d;
import androidx.core.p098j.C2100o;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.assist.p507f.p508a.C9414c;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.a.a;
import com.google.android.apps.gsa.assistant.settings.shared.ai;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.p.e;
import com.google.android.apps.gsa.assistant.shared.p.f;
import com.google.android.apps.gsa.assistant.shared.p.k;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.api.a.be;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80499b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80501d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80502e;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81164dm;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.opa.C83572ac;
import com.google.android.apps.gsa.opa.C83580ak;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83634aw;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83635ax;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83649bk;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83650bl;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import com.google.android.apps.gsa.p8839t.p8847h.C118449y;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86314e;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.p6930h.C87559b;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6941ui.C88522b;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.search.shared.p6941ui.C88531k;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88515i;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87967kf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87968kg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87969kh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88106pj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88263ve;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88264vf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88265vg;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90024cc;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90057di;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90090eo;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.chathead.C108135a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108214al;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108215am;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108227ay;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108229b;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108238bi;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108244bo;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108263cg;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108436iq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108454jh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108455ji;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109100ar;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109101as;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109105b;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109106c;
import com.google.android.apps.gsa.staticplugins.opa.imageviewer.C109285g;
import com.google.android.apps.gsa.staticplugins.opa.imageviewer.C109286h;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.C109291b;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106056l;
import com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106062r;
import com.google.android.apps.gsa.staticplugins.opa.p8182af.C106127d;
import com.google.android.apps.gsa.staticplugins.opa.p8182af.C106146w;
import com.google.android.apps.gsa.staticplugins.opa.p8182af.C106147x;
import com.google.android.apps.gsa.staticplugins.opa.p8182af.C106148y;
import com.google.android.apps.gsa.staticplugins.opa.p8183ag.C106158g;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106163d;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106174o;
import com.google.android.apps.gsa.staticplugins.opa.p8281ao.C107129a;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107144k;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107145l;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107156w;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107379c;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107383g;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107384h;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107463ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107467af;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.C107606q;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.p8309b.C107590b;
import com.google.android.apps.gsa.staticplugins.opa.p8310av.C107621a;
import com.google.android.apps.gsa.staticplugins.opa.p8311aw.C107623a;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107658ar;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107952c;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108051f;
import com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108052g;
import com.google.android.apps.gsa.staticplugins.opa.p8344bk.C108093b;
import com.google.android.apps.gsa.staticplugins.opa.p8345bl.C108098d;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109245s;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109246t;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.p8370a.C109212a;
import com.google.android.apps.gsa.staticplugins.opa.p8371i.C109264b;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109399b;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109459e;
import com.google.android.apps.gsa.staticplugins.opa.p8401o.C109754a;
import com.google.android.apps.gsa.staticplugins.opa.p8408q.C109951a;
import com.google.android.apps.gsa.staticplugins.opa.p8591u.C113711a;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114513a;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114514b;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l;
import com.google.android.apps.gsa.staticplugins.opa.promo.C109935l;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110014a;
import com.google.android.apps.gsa.staticplugins.opa.searchbox.C110426a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113628g;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113629h;
import com.google.android.apps.gsa.staticplugins.opa.util.C113766ai;
import com.google.android.apps.gsa.staticplugins.opa.util.C113768ak;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.apps.gsa.staticplugins.opa.util.C113792bh;
import com.google.android.apps.gsa.staticplugins.opa.util.C113793bi;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.apps.gsa.staticplugins.opa.util.C113809by;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.apps.gsa.staticplugins.opa.util.C113854ci;
import com.google.android.apps.gsa.staticplugins.opa.util.C113855cj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113857cl;
import com.google.android.apps.gsa.staticplugins.opa.util.C113858cm;
import com.google.android.apps.gsa.staticplugins.opa.util.C113859cn;
import com.google.android.apps.gsa.staticplugins.opa.util.C113861cp;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.util.C113869cx;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.android.apps.gsa.staticplugins.opa.util.C113884o;
import com.google.android.apps.gsa.staticplugins.opa.util.C113889t;
import com.google.android.apps.gsa.staticplugins.opa.util.C113890u;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113983b;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113985d;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113986e;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113990i;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114582bc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128666e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128667f;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9749c.C128659a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9749c.p9750a.C128660a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.conversation.p1855h.C22704h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.material.featurehighlight.C28521c;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1653d.C19624b;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3898a.C50869e;
import com.google.assistant.p3897e.p3898a.C50870f;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3912f.C51211f;
import com.google.assistant.p3897e.p3917i.p3918a.C51305cu;
import com.google.assistant.p3897e.p3917i.p3918a.C51569mo;
import com.google.assistant.p3897e.p3917i.p3918a.C51570mp;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52533vg;
import com.google.assistant.p3897e.p3921j.p3926e.C51994gt;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58847bk;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.p4553a.C59529cz;
import com.google.common.p4552o.p4553a.C59569y;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72290n;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.fj */
/* compiled from: PG */
public final class C109040fj implements C88531k, C109043fm, C109327jr, C109051fu, C109050ft, C109740nn, C109345kh, C109064ga, C90991b, C109049fs, C113859cn, C107590b, C2333ah, C109056fz {

    /* renamed from: a */
    public static final C59071e f303210a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.fj");

    /* renamed from: cF */
    private static final Interpolator f303211cF = C91107f.m148859b(0.16f, 0.0f, 0.0f, 1.0f);

    /* renamed from: cG */
    private static final Interpolator f303212cG = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: cH */
    private static final Interpolator f303213cH = C91107f.m148859b(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: cI */
    private static final Map f303214cI;

    /* renamed from: A */
    final C28521c f303215A;

    /* renamed from: B */
    final C109328js f303216B;

    /* renamed from: C */
    final C113710u f303217C;

    /* renamed from: D */
    public final C107955f f303218D;

    /* renamed from: E */
    public final C107952c f303219E;

    /* renamed from: F */
    View f303220F;

    /* renamed from: G */
    View f303221G;

    /* renamed from: H */
    PopupMenu f303222H;

    /* renamed from: I */
    PopupMenu f303223I;

    /* renamed from: J */
    public C113768ak f303224J;

    /* renamed from: K */
    public final C108436iq f303225K;

    /* renamed from: L */
    LinearLayout f303226L;

    /* renamed from: M */
    C109743nq f303227M;

    /* renamed from: N */
    final ImageView f303228N;

    /* renamed from: O */
    public final ImageView f303229O;

    /* renamed from: P */
    final FrameLayout f303230P;

    /* renamed from: Q */
    public final C108303dt f303231Q;

    /* renamed from: R */
    final C108321ej f303232R;

    /* renamed from: S */
    public final AtomicReference f303233S = new AtomicReference((Object) null);

    /* renamed from: T */
    public final C107623a f303234T;

    /* renamed from: U */
    public long f303235U;

    /* renamed from: V */
    public C109138h f303236V;

    /* renamed from: W */
    C107711b f303237W;

    /* renamed from: X */
    public C107659as f303238X;

    /* renamed from: Y */
    public C107606q f303239Y;

    /* renamed from: Z */
    public final C107144k f303240Z;

    /* renamed from: aA */
    public final Interpolator f303241aA;

    /* renamed from: aB */
    boolean f303242aB;

    /* renamed from: aC */
    boolean f303243aC;

    /* renamed from: aD */
    public boolean f303244aD;

    /* renamed from: aE */
    public boolean f303245aE;

    /* renamed from: aF */
    public final C118561t f303246aF;

    /* renamed from: aG */
    public final C58833ax f303247aG;

    /* renamed from: aH */
    public final C58833ax f303248aH;

    /* renamed from: aI */
    public final C108237bh f303249aI;

    /* renamed from: aJ */
    public final PopupMenu.OnMenuItemClickListener f303250aJ;

    /* renamed from: aK */
    public final C68214a f303251aK;

    /* renamed from: aL */
    public final C68214a f303252aL;

    /* renamed from: aM */
    public final C83580ak f303253aM;

    /* renamed from: aN */
    public final C58833ax f303254aN;

    /* renamed from: aO */
    public final C109738nl f303255aO;

    /* renamed from: aP */
    public final View f303256aP;

    /* renamed from: aQ */
    public final View f303257aQ;

    /* renamed from: aR */
    public final C68214a f303258aR;

    /* renamed from: aS */
    public final boolean f303259aS;

    /* renamed from: aT */
    public C109264b f303260aT;

    /* renamed from: aU */
    final C109733ng f303261aU;

    /* renamed from: aV */
    public final C106062r f303262aV;

    /* renamed from: aW */
    AnimatorSet f303263aW;

    /* renamed from: aX */
    AnimatorSet f303264aX;

    /* renamed from: aY */
    public final C110014a f303265aY;

    /* renamed from: aZ */
    public final C114748b f303266aZ;

    /* renamed from: aa */
    public final C88515i f303267aa;

    /* renamed from: ab */
    public final C58833ax f303268ab;

    /* renamed from: ac */
    public final C106158g f303269ac;

    /* renamed from: ad */
    final C113628g f303270ad;

    /* renamed from: ae */
    public final C58833ax f303271ae;

    /* renamed from: af */
    public final C68214a f303272af;

    /* renamed from: ag */
    public final C108454jh f303273ag;

    /* renamed from: ah */
    final C107621a f303274ah;

    /* renamed from: ai */
    public C109026ey f303275ai = C109026ey.UNINITIALIZED;

    /* renamed from: aj */
    Animator f303276aj;

    /* renamed from: ak */
    Animator f303277ak;

    /* renamed from: al */
    boolean f303278al = false;

    /* renamed from: am */
    AnimatorSet f303279am;

    /* renamed from: an */
    AnimatorSet f303280an;

    /* renamed from: ao */
    Bundle f303281ao;

    /* renamed from: ap */
    public boolean f303282ap;

    /* renamed from: aq */
    byte[] f303283aq;

    /* renamed from: ar */
    boolean f303284ar;

    /* renamed from: as */
    public final C68214a f303285as;

    /* renamed from: at */
    public final C109346ki f303286at;

    /* renamed from: au */
    final C109754a f303287au;

    /* renamed from: av */
    public final C68214a f303288av;

    /* renamed from: aw */
    C50870f f303289aw;

    /* renamed from: ax */
    public final int f303290ax;

    /* renamed from: ay */
    public final C2100o f303291ay;

    /* renamed from: az */
    boolean f303292az;

    /* renamed from: b */
    final C108051f f303293b;

    /* renamed from: bA */
    public boolean f303294bA;

    /* renamed from: bB */
    boolean f303295bB;

    /* renamed from: bC */
    public boolean f303296bC = true;

    /* renamed from: bD */
    public boolean f303297bD;

    /* renamed from: bE */
    public boolean f303298bE;

    /* renamed from: bF */
    public boolean f303299bF = false;

    /* renamed from: bG */
    boolean f303300bG = false;

    /* renamed from: bH */
    public boolean f303301bH;

    /* renamed from: bI */
    public boolean f303302bI;

    /* renamed from: bJ */
    public boolean f303303bJ;

    /* renamed from: bK */
    public boolean f303304bK;

    /* renamed from: bL */
    public C108228az f303305bL = C108228az.UNINITIALIZED;

    /* renamed from: bM */
    int f303306bM = 0;

    /* renamed from: bN */
    public be f303307bN = be.a;

    /* renamed from: bO */
    public boolean f303308bO = false;

    /* renamed from: bP */
    public C108237bh f303309bP;

    /* renamed from: bQ */
    public C11300h f303310bQ;

    /* renamed from: bR */
    public boolean f303311bR;

    /* renamed from: bS */
    public final C68214a f303312bS;

    /* renamed from: bT */
    public final C68214a f303313bT;

    /* renamed from: bU */
    public final C114524l f303314bU;

    /* renamed from: bV */
    public final C108093b f303315bV;

    /* renamed from: bW */
    public final C68214a f303316bW;

    /* renamed from: bX */
    public final C68214a f303317bX;

    /* renamed from: bY */
    public String f303318bY;

    /* renamed from: bZ */
    public final C58833ax f303319bZ;

    /* renamed from: ba */
    public final C113916t f303320ba;

    /* renamed from: bb */
    public final C68214a f303321bb;

    /* renamed from: bc */
    public final C108215am f303322bc;

    /* renamed from: bd */
    public final C109105b f303323bd;

    /* renamed from: be */
    public C106147x f303324be;

    /* renamed from: bf */
    public final C68214a f303325bf;

    /* renamed from: bg */
    boolean f303326bg;

    /* renamed from: bh */
    public final C113868cw f303327bh;

    /* renamed from: bi */
    public final C68214a f303328bi;

    /* renamed from: bj */
    public final C108135a f303329bj;

    /* renamed from: bk */
    final C109935l f303330bk;

    /* renamed from: bl */
    public final C114513a f303331bl;

    /* renamed from: bm */
    public C83572ac f303332bm = C83572ac.UNINITIALIZED;

    /* renamed from: bn */
    public boolean f303333bn = false;

    /* renamed from: bo */
    public boolean f303334bo = false;

    /* renamed from: bp */
    public boolean f303335bp = false;

    /* renamed from: bq */
    public boolean f303336bq = false;

    /* renamed from: br */
    public C58833ax f303337br = C58836b.f156633a;

    /* renamed from: bs */
    public boolean f303338bs = false;

    /* renamed from: bt */
    public Runnable f303339bt = null;

    /* renamed from: bu */
    public byte[] f303340bu;

    /* renamed from: bv */
    public boolean f303341bv;

    /* renamed from: bw */
    boolean f303342bw = true;

    /* renamed from: bx */
    boolean f303343bx;

    /* renamed from: by */
    public boolean f303344by;

    /* renamed from: bz */
    public boolean f303345bz;

    /* renamed from: c */
    public final Context f303346c;

    /* renamed from: cA */
    public final C109951a f303347cA;

    /* renamed from: cB */
    public final C114250c f303348cB;

    /* renamed from: cC */
    public final C108780dn f303349cC = new C108780dn(this);

    /* renamed from: cD */
    public final C108801ee f303350cD = new C108801ee(this);

    /* renamed from: cE */
    public C109268ic f303351cE;

    /* renamed from: cJ */
    private final C109871p f303352cJ;

    /* renamed from: cK */
    private final C107710u f303353cK;

    /* renamed from: cL */
    private HotwordResultMetadata f303354cL;

    /* renamed from: cM */
    private final int f303355cM;

    /* renamed from: cN */
    private final Window f303356cN;

    /* renamed from: cO */
    private final ViewStub f303357cO;

    /* renamed from: cP */
    private final a f303358cP;

    /* renamed from: cQ */
    private final C109285g f303359cQ;

    /* renamed from: cR */
    private C109753o f303360cR;

    /* renamed from: cS */
    private final C108244bo f303361cS;

    /* renamed from: cT */
    private final C113711a f303362cT;

    /* renamed from: cU */
    private final C9388a f303363cU;

    /* renamed from: cV */
    private C109026ey f303364cV = C109026ey.UNINITIALIZED;

    /* renamed from: cW */
    private boolean f303365cW;

    /* renamed from: cX */
    private boolean f303366cX;

    /* renamed from: cY */
    private boolean f303367cY;

    /* renamed from: cZ */
    private int f303368cZ;

    /* renamed from: ca */
    public final C58833ax f303369ca;

    /* renamed from: cb */
    public final boolean f303370cb;

    /* renamed from: cc */
    public final boolean f303371cc;

    /* renamed from: cd */
    public int f303372cd;

    /* renamed from: ce */
    public final boolean f303373ce;

    /* renamed from: cf */
    public final C68214a f303374cf;

    /* renamed from: cg */
    public final C68214a f303375cg;

    /* renamed from: ch */
    public final C89150g f303376ch;

    /* renamed from: ci */
    public final C2333ah f303377ci = new C108497cn(this);

    /* renamed from: cj */
    public final C2333ah f303378cj = new C108518cy(this);

    /* renamed from: ck */
    public String f303379ck;

    /* renamed from: cl */
    public final C68214a f303380cl;

    /* renamed from: cm */
    public final C68214a f303381cm;

    /* renamed from: cn */
    public final C68214a f303382cn;

    /* renamed from: co */
    public CharSequence f303383co = BuildConfig.FLAVOR;

    /* renamed from: cp */
    public Optional f303384cp = Optional.empty();

    /* renamed from: cq */
    final C0167am f303385cq;

    /* renamed from: cr */
    boolean f303386cr = false;

    /* renamed from: cs */
    public final C68214a f303387cs;

    /* renamed from: ct */
    public final C68214a f303388ct;

    /* renamed from: cu */
    final GestureDetector.SimpleOnGestureListener f303389cu = new C108807ek(this);

    /* renamed from: cv */
    public int f303390cv = 1;

    /* renamed from: cw */
    public int f303391cw = 1;

    /* renamed from: cx */
    public final C88523c f303392cx;

    /* renamed from: cy */
    public final C113812ca f303393cy;

    /* renamed from: cz */
    public final C106174o f303394cz;

    /* renamed from: d */
    public final C68214a f303395d;

    /* renamed from: dA */
    private final C58833ax f303396dA;

    /* renamed from: dB */
    private final C68214a f303397dB;

    /* renamed from: dC */
    private final C68214a f303398dC;

    /* renamed from: dD */
    private final C68214a f303399dD;

    /* renamed from: dE */
    private final C68214a f303400dE;

    /* renamed from: dF */
    private final C68214a f303401dF;

    /* renamed from: dG */
    private final C68214a f303402dG;

    /* renamed from: dH */
    private final C109266ia f303403dH;

    /* renamed from: dI */
    private final C108429ij f303404dI;

    /* renamed from: dJ */
    private final C68214a f303405dJ;

    /* renamed from: dK */
    private boolean f303406dK = false;

    /* renamed from: dL */
    private final C68214a f303407dL;

    /* renamed from: dM */
    private final C81517a f303408dM;

    /* renamed from: dN */
    private final C104149a f303409dN;

    /* renamed from: dO */
    private C108492ci f303410dO;

    /* renamed from: dP */
    private C108515cv f303411dP;

    /* renamed from: dQ */
    private final C9414c f303412dQ;

    /* renamed from: dR */
    private C108802ef f303413dR;

    /* renamed from: da */
    private final C9413b f303414da;

    /* renamed from: db */
    private final C22871g f303415db;

    /* renamed from: dc */
    private final C22871g f303416dc;

    /* renamed from: dd */
    private final C106163d f303417dd;

    /* renamed from: de */
    private final C90464f f303418de;

    /* renamed from: df */
    private final String f303419df;

    /* renamed from: dg */
    private final C68214a f303420dg;

    /* renamed from: dh */
    private final C68214a f303421dh;

    /* renamed from: di */
    private final C107619d f303422di;

    /* renamed from: dj */
    private final C68214a f303423dj;

    /* renamed from: dk */
    private final boolean f303424dk;

    /* renamed from: dl */
    private final Query f303425dl;

    /* renamed from: dm */
    private final C68214a f303426dm;

    /* renamed from: dn */
    private final C58833ax f303427dn;

    /* renamed from: do */
    private final C68214a f303428do;

    /* renamed from: dp */
    private final ai f303429dp;

    /* renamed from: dq */
    private final C68214a f303430dq;

    /* renamed from: dr */
    private final C58833ax f303431dr;

    /* renamed from: ds */
    private int f303432ds;

    /* renamed from: dt */
    private boolean f303433dt;

    /* renamed from: du */
    private long f303434du;

    /* renamed from: dv */
    private long f303435dv;

    /* renamed from: dw */
    private final C68214a f303436dw;

    /* renamed from: dx */
    private final C68214a f303437dx;

    /* renamed from: dy */
    private final C68214a f303438dy;

    /* renamed from: dz */
    private final boolean f303439dz;

    /* renamed from: e */
    public final C21370a f303440e;

    /* renamed from: f */
    public final Activity f303441f;

    /* renamed from: g */
    public Bundle f303442g;

    /* renamed from: h */
    public final C58833ax f303443h;

    /* renamed from: i */
    public final C109042fl f303444i;

    /* renamed from: j */
    public final C113863cr f303445j;

    /* renamed from: k */
    public final C89911f f303446k;

    /* renamed from: l */
    public final C90931ca f303447l;

    /* renamed from: m */
    public final C22871g f303448m;

    /* renamed from: n */
    public final ViewGroup f303449n;

    /* renamed from: o */
    public final C108230ba f303450o;

    /* renamed from: p */
    final C88499t f303451p;

    /* renamed from: q */
    final C87682aj f303452q;

    /* renamed from: r */
    public final C107658ar f303453r;

    /* renamed from: s */
    public final C107698i f303454s;

    /* renamed from: t */
    public final C86124t f303455t;

    /* renamed from: u */
    public final C109065gb f303456u;

    /* renamed from: v */
    public final C109039fi f303457v;

    /* renamed from: w */
    final int f303458w;

    /* renamed from: x */
    final C109759oe f303459x;

    /* renamed from: y */
    ChatUiHelpController f303460y;

    /* renamed from: z */
    public final C109291b f303461z;

    static {
        C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, Integer.valueOf(R.string.opa_greeting_bubble_text_1));
        gzVar.mo55429h(2, Integer.valueOf(R.string.opa_greeting_bubble_text_2));
        gzVar.mo55429h(3, Integer.valueOf(R.string.opa_greeting_bubble_text_3));
        gzVar.mo55429h(4, Integer.valueOf(R.string.opa_greeting_bubble_text_4));
        gzVar.mo55429h(5, Integer.valueOf(R.string.opa_greeting_bubble_text_5));
        gzVar.mo55429h(6, Integer.valueOf(R.string.opa_greeting_bubble_text_6));
        gzVar.mo55429h(7, Integer.valueOf(R.string.opa_greeting_bubble_text_7));
        gzVar.mo55429h(8, Integer.valueOf(R.string.opa_greeting_bubble_text_8));
        gzVar.mo55429h(9, Integer.valueOf(R.string.opa_greeting_bubble_text_9));
        gzVar.mo55429h(10, Integer.valueOf(R.string.opa_greeting_bubble_text_10));
        gzVar.mo55429h(11, Integer.valueOf(R.string.opa_greeting_bubble_text_11));
        f303214cI = gzVar.mo55427f(false);
    }

    public C109040fj(C91097g gVar, C107659as asVar, C88515i iVar, Window window, C109042fl flVar, C58833ax axVar, C68214a aVar, Activity activity, C68214a aVar2, C107710u uVar, C107698i iVar2, C113863cr crVar, C89911f fVar, C58833ax axVar2, C90931ca caVar, C22871g gVar2, C22871g gVar3, C22871g gVar4, C86124t tVar, C104149a aVar3, C109871p pVar, C108115c cVar, C68214a aVar4, C9388a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C90465g gVar5, C9413b bVar, C9414c cVar2, C109760of ofVar, C109066gc gcVar, C108303dt dtVar, C113710u uVar2, C107952c cVar3, C107955f fVar2, C21370a aVar9, C58833ax axVar3, C58833ax axVar4, C108227ay ayVar, C114514b bVar2, C107145l lVar, C68214a aVar10, C113629h hVar, C58833ax axVar5, C106174o oVar, C109951a aVar11, C58833ax axVar6, C68214a aVar12, C68214a aVar13, C86054o oVar2, C68214a aVar14, C83580ak akVar, C68214a aVar15, C68214a aVar16, C58833ax axVar7, C109329jt jtVar, a aVar17, C107619d dVar, boolean z, C118561t tVar2, C109738nl nlVar, C106163d dVar2, C109291b bVar3, C109275ij ijVar, C68214a aVar18, C68214a aVar19, C68214a aVar20, C113711a aVar21, Query query, C108052g gVar6, C68214a aVar22, C106062r rVar, C113812ca caVar2, C58833ax axVar8, C114748b bVar4, C58833ax axVar9, C68214a aVar23, C68214a aVar24, C109734nh nhVar, C113916t tVar3, C68214a aVar25, C68214a aVar26, C108215am amVar, C108321ej ejVar, C114524l lVar2, C108093b bVar5, C109106c cVar4, C106148y yVar, C68214a aVar27, boolean z2, boolean z3, boolean z4, int i, boolean z5, C68214a aVar28, C68214a aVar29, C68214a aVar30, C68214a aVar31, C68214a aVar32, C68214a aVar33, C68214a aVar34, C68214a aVar35, C58833ax axVar10, C73906a aVar36, C89150g gVar7, C68214a aVar37, C68214a aVar38, C109267ib ibVar, C68214a aVar39, C68214a aVar40, C68214a aVar41, C68214a aVar42, C68214a aVar43, C68214a aVar44, C68214a aVar45, C68214a aVar46, C0167am amVar2, C107621a aVar47, C68214a aVar48, C68214a aVar49, C113868cw cwVar, C58833ax axVar11, C68214a aVar50, C108135a aVar51, ai aiVar, C114250c cVar5, C109935l lVar3, C68214a aVar52, C108429ij ijVar2, C68214a aVar53, C68214a aVar54, C68214a aVar55, C68214a aVar56, C81517a aVar57) {
        C108230ba baVar;
        Handler handler;
        ViewStub viewStub;
        C107659as asVar2 = asVar;
        Activity activity2 = activity;
        C107710u uVar3 = uVar;
        C86124t tVar4 = tVar;
        C109760of ofVar2 = ofVar;
        C107145l lVar4 = lVar;
        C113629h hVar2 = hVar;
        C109329jt jtVar2 = jtVar;
        C109738nl nlVar2 = nlVar;
        C109275ij ijVar3 = ijVar;
        C109106c cVar6 = cVar4;
        C106148y yVar2 = yVar;
        boolean z6 = z3;
        this.f303346c = activity.getApplicationContext();
        this.f303415db = gVar3;
        this.f303416dc = gVar4;
        this.f303412dQ = cVar2;
        this.f303440e = aVar9;
        this.f303441f = activity2;
        this.f303444i = flVar;
        String str = BuildConfig.FLAVOR;
        this.f303445j = crVar;
        this.f303446k = fVar;
        this.f303405dJ = aVar53;
        this.f303447l = caVar;
        this.f303448m = gVar2;
        this.f303443h = axVar2;
        this.f303455t = tVar4;
        this.f303409dN = aVar3;
        this.f303353cK = uVar3;
        this.f303454s = iVar2;
        this.f303267aa = iVar;
        this.f303356cN = window;
        this.f303461z = bVar3;
        this.f303427dn = axVar9;
        this.f303395d = aVar25;
        this.f303321bb = aVar26;
        this.f303232R = ejVar;
        this.f303315bV = bVar5;
        this.f303438dy = aVar24;
        this.f303371cc = z4;
        this.f303325bf = aVar37;
        this.f303372cd = i;
        this.f303373ce = z5;
        this.f303375cg = aVar38;
        this.f303437dx = aVar;
        this.f303436dw = aVar40;
        this.f303312bS = aVar41;
        this.f303400dE = aVar42;
        this.f303401dF = aVar43;
        this.f303402dG = aVar44;
        this.f303396dA = axVar11;
        this.f303301bH = tVar4.mo79746e(C90053de.f248949P);
        this.f303328bi = aVar50;
        this.f303329bj = aVar51;
        this.f303429dp = aiVar;
        this.f303388ct = aVar54;
        this.f303387cs = aVar55;
        this.f303407dL = aVar56;
        this.f303302bI = false;
        this.f303303bJ = false;
        this.f303313bT = aVar48;
        this.f303430dq = aVar52;
        this.f303404dI = ijVar2;
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024);
        C109754a aVar58 = new C109754a();
        this.f303287au = aVar58;
        aVar58.f305797b = new C108525db(this);
        this.f303361cS = new C108244bo(mo97500bJ());
        uVar3.mo96220c(aVar58, C88244um.UPDATE_CURRENT_NETWORK_TYPE);
        this.f303288av = aVar8;
        this.f303352cJ = pVar;
        this.f303246aF = tVar2;
        this.f303414da = bVar;
        this.f303247aG = axVar5;
        this.f303417dd = dVar2;
        this.f303268ab = axVar3;
        this.f303394cz = oVar;
        this.f303251aK = aVar13;
        this.f303399dD = aVar2;
        this.f303252aL = aVar14;
        this.f303420dg = aVar15;
        this.f303421dh = aVar16;
        this.f303369ca = axVar7;
        this.f303424dk = z;
        this.f303347cA = aVar11;
        boolean bj = mo97518bj();
        C108237bh a = C108238bi.m179897a(activity2, tVar4, bj ? 1 : 0, z6);
        this.f303249aI = a;
        m181389cf(bj);
        this.f303309bP = a;
        this.f303458w = window.getNavigationBarColor();
        this.f303271ae = axVar6;
        this.f303272af = aVar12;
        this.f303253aM = akVar;
        this.f303255aO = nlVar2;
        uVar3.mo96220c(nlVar2, C88244um.OPA_KEEP_SCREEN_ON);
        this.f303423dj = aVar20;
        this.f303362cT = aVar21;
        this.f303425dl = query;
        this.f303262aV = rVar;
        this.f303393cy = caVar2;
        this.f303254aN = axVar;
        this.f303426dm = aVar23;
        this.f303266aZ = bVar4;
        this.f303320ba = tVar3;
        this.f303322bc = amVar;
        this.f303439dz = z2;
        this.f303370cb = z6;
        this.f303248aH = axVar10;
        this.f303376ch = gVar7;
        this.f303380cl = aVar45;
        this.f303274ah = aVar47;
        C22871g gVar8 = (C22871g) hVar2.f314643a.mo17428b();
        gVar8.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) hVar2.f314644b).f184585a);
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) hVar2.f314645c).f184585a);
        a3.getClass();
        C58833ax axVar12 = (C58833ax) hVar2.f314646d.mo17428b();
        axVar12.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) hVar2.f314647e).f184585a);
        a4.getClass();
        C113628g gVar9 = new C113628g(gVar8, a2, a3, axVar12, a4);
        this.f303270ad = gVar9;
        m181401cr();
        C108455ji jiVar = (C108455ji) aVar19.mo27525b();
        gVar.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) jiVar.f301678a).f184585a);
        a5.getClass();
        C107710u uVar4 = (C107710u) jiVar.f301679b.mo17428b();
        uVar4.getClass();
        Context context = (Context) jiVar.f301680c.mo17428b();
        context.getClass();
        C108454jh jhVar = new C108454jh(gVar, a5, uVar4, context);
        this.f303273ag = jhVar;
        jhVar.f301672a.mo96220c(jhVar, C88244um.WEB_ANSWER_HISTORY_RESPONSE);
        this.f303231Q = dtVar;
        this.f303419df = oVar2.mo79659F() != null ? oVar2.mo79659F() : str;
        C90464f a6 = gVar5.mo84210a(activity2);
        this.f303418de = a6;
        C113628g gVar10 = gVar9;
        C90464f fVar3 = a6;
        C109065gb a7 = gcVar.mo97561a(gVar, this, this, this, this, new C105977ab(this), asVar, fVar3, new C106000ac(this), new C106071ad(this), this);
        this.f303456u = a7;
        C109039fi fiVar = new C109039fi(this, a7);
        this.f303457v = fiVar;
        this.f303428do = aVar31;
        this.f303327bh = cwVar;
        this.f303348cB = cVar5;
        this.f303330bk = lVar3;
        this.f303408dM = aVar57;
        C108789dw dwVar = new C108789dw(this);
        this.f303392cx = dwVar;
        if (axVar8.mo56113h()) {
            C110014a aVar59 = (C110014a) axVar8.mo56107c();
            this.f303265aY = aVar59;
            aVar59.mo98295g(dwVar);
        } else {
            this.f303265aY = null;
        }
        this.f303453r = new C108797ea(this);
        this.f303250aJ = new C108812ep(this, new C113809by(a7, this.f303441f, (C87559b) this.f303443h.mo56107c(), new C106110ae(this), C58886cw.m90973a(new C106117af(this)), (C86314e) null, aVar36));
        m181391ch();
        C108230ba ca = m181384ca(ayVar, dtVar, asVar);
        this.f303450o = ca;
        boolean z7 = ca instanceof C113986e;
        this.f303259aS = z7;
        C107623a o = ca.mo95426o();
        this.f303234T = o;
        this.f303285as = aVar6;
        C109347kj kjVar = (C109347kj) aVar7.mo27525b();
        ca.getClass();
        C86124t tVar5 = (C86124t) kjVar.f304598a.mo17428b();
        tVar5.getClass();
        C68214a a8 = C68219e.m98518a(((C68226l) kjVar.f304599b).f184585a);
        a8.getClass();
        C21370a aVar60 = (C21370a) kjVar.f304600c.mo17428b();
        aVar60.getClass();
        C90929bz bzVar = (C90929bz) kjVar.f304601d.mo17428b();
        C109346ki kiVar = r0;
        C90929bz bzVar2 = bzVar;
        bzVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) kjVar.f304602e.mo17428b();
        C109039fi fiVar2 = fiVar;
        C109347kj kjVar2 = kjVar;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        sharedPreferences.getClass();
        Context context2 = (Context) kjVar2.f304603f.mo17428b();
        C107623a aVar61 = o;
        Context context3 = context2;
        context2.getClass();
        C68214a a9 = C68219e.m98518a(((C68226l) kjVar2.f304604g).f184585a);
        boolean z8 = z7;
        C68214a aVar62 = a9;
        a9.getClass();
        C68214a a10 = C68219e.m98518a(((C68226l) kjVar2.f304605h).f184585a);
        C108230ba baVar2 = ca;
        C68214a aVar63 = a10;
        a10.getClass();
        C68214a a11 = C68219e.m98518a(((C68226l) kjVar2.f304606i).f184585a);
        C68214a aVar64 = a11;
        a11.getClass();
        C68214a a12 = C68219e.m98518a(((C68226l) kjVar2.f304607j).f184585a);
        a12.getClass();
        C68214a a13 = C68219e.m98518a(((C68226l) kjVar2.f304608k).f184585a);
        a13.getClass();
        C109065gb gbVar = a7;
        C68214a a14 = C68219e.m98518a(((C68226l) kjVar2.f304609l).f184585a);
        a14.getClass();
        Boolean bool = (Boolean) kjVar2.f304610m.mo17428b();
        bool.getClass();
        C109039fi fiVar3 = fiVar2;
        C109065gb gbVar2 = gbVar;
        C109039fi fiVar4 = fiVar3;
        C109346ki kiVar2 = new C109346ki(ca, this, this, tVar5, a8, aVar60, bzVar2, sharedPreferences2, context3, aVar62, aVar63, aVar64, a12, a13, a14, bool.booleanValue());
        C109346ki kiVar3 = kiVar;
        this.f303286at = kiVar3;
        C107710u uVar5 = uVar;
        uVar5.mo96220c(kiVar3, C88244um.TTS_PLAYBACK_STARTED, C88244um.TTS_PLAYBACK_DONE, C88244um.ON_TELEPHONY_OBTAINED, C88244um.ON_TELEPHONY_LOST, C88244um.START_OF_SPEECH);
        ViewGroup h = baVar2.mo95419h();
        this.f303449n = h;
        this.f303256aP = h.findViewById(R.id.opa_search_plate_container);
        this.f303257aQ = h.findViewById(R.id.opa_rich_input_container);
        h.getViewTreeObserver().addOnGlobalLayoutListener(new C106150ag(this, gVar7));
        C114513a a15 = bVar2.mo101365a(h, mo97538k(), fVar3);
        this.f303331bl = a15;
        a15.mo101364e(this.f303353cK, this.f303454s);
        C108436iq n = baVar2.mo95425n();
        n.getClass();
        this.f303225K = n;
        this.f303241aA = AnimationUtils.loadInterpolator(this.f303346c, R.interpolator.opa_default_interpolator);
        FrameLayout frameLayout = (FrameLayout) h.findViewById(R.id.opa_fab_container);
        this.f303230P = frameLayout;
        ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).bottomMargin = 0;
        ImageView imageView = (ImageView) h.findViewById(R.id.opa_history_expander);
        this.f303228N = imageView;
        C28292j jVar = new C28292j(33259);
        jVar.mo33795i(5);
        C28295m.m52919e(imageView, jVar);
        C86124t tVar6 = tVar;
        if (tVar6.mo79746e(C90014bt.f247760nI) || aVar61.mo95358d() == 3) {
            C91097g gVar11 = gVar;
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new C89943l(new C109007et(this, gVar)));
        }
        if (z2) {
            C107384h hVar3 = (C107384h) aVar27.mo27525b();
            ViewStub viewStub2 = (ViewStub) h.findViewById(R.id.proactive_overlay_view_stub);
            viewStub2.getClass();
            asVar.getClass();
            baVar2.getClass();
            SharedPreferences sharedPreferences3 = (SharedPreferences) hVar3.f298872a.mo17428b();
            sharedPreferences3.getClass();
            C109790aj ajVar = (C109790aj) hVar3.f298873b.mo17428b();
            ajVar.getClass();
            C86054o oVar3 = (C86054o) hVar3.f298874c.mo17428b();
            oVar3.getClass();
            Context context4 = (Context) hVar3.f298875d.mo17428b();
            context4.getClass();
            C2391v vVar = (C2391v) hVar3.f298876e.mo17428b();
            vVar.getClass();
            C107383g gVar12 = new C107383g(viewStub2, asVar, baVar2, sharedPreferences3, ajVar, oVar3, context4, vVar);
            this.f303319bZ = C58833ax.m90834k(gVar12);
            ((C107379c) aVar33.mo27525b()).f298856a = C58833ax.m90834k(gVar12);
        } else {
            this.f303319bZ = C58836b.f156633a;
        }
        this.f303238X = asVar;
        if (z8) {
            activity.getWindow().setDimAmount(((float) ((int) tVar6.mo79743a(C90014bt.f247467hh))) / 100.0f);
        }
        this.f303223I = new PopupMenu(this.f303441f, n.mo95255g());
        if (z8) {
            h.findViewById(R.id.opa_menu).setVisibility(8);
            baVar = baVar2;
        } else if (m181378bx(baVar2)) {
            baVar = baVar2;
            this.f303220F = ((C113989h) ((C113988g) baVar).mo100833bf().mo56107c()).mo100838aU();
        } else {
            baVar = baVar2;
            if (axVar3.mo56113h()) {
                this.f303220F = m181372bW((C109212a) axVar3.mo56107c());
                this.f303220F.setOnClickListener(new C89943l(new C106159ah(this)));
            } else {
                this.f303220F = h.findViewById(R.id.opa_menu);
                View view = this.f303220F;
                C28292j jVar2 = new C28292j(27100);
                jVar2.mo33795i(5);
                C28295m.m52919e(view, jVar2);
                this.f303222H = new PopupMenu(this.f303441f, this.f303220F, 8388613);
                m181392ci();
            }
        }
        if (z8 && tVar6.mo79746e(C90014bt.f247616kX)) {
            this.f303221G = m181371bV();
        }
        ImageView imageView2 = (ImageView) h.findViewById(R.id.opa_lock_icon);
        this.f303229O = imageView2;
        if (axVar5.mo56113h()) {
            View.OnClickListener bU = m181370bU();
            if (m181378bx(baVar)) {
                ((C113989h) ((C113988g) baVar).mo100833bf().mo56107c()).mo100898cw(bU);
            } else {
                imageView2.setOnClickListener(bU);
            }
        }
        TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout) h.findViewById(R.id.opa_main_view_inner);
        if (tVar6.mo79746e(C90014bt.f247771nT) || tVar6.mo79746e(C90014bt.f247204cj)) {
            touchInterceptingFrameLayout.f253398a = new C109008eu(this, tVar6, axVar10);
        }
        m181399cp(touchInterceptingFrameLayout);
        if (axVar4.mo56113h()) {
            C106158g gVar13 = (C106158g) axVar4.mo56107c();
            this.f303269ac = gVar13;
            gVar13.f296273h = new C107130ap(this);
            handler = null;
        } else {
            handler = null;
            this.f303269ac = null;
        }
        if (this.f303319bZ.mo56113h()) {
            C107383g gVar14 = (C107383g) this.f303319bZ.mo56107c();
            Display display = ((DisplayManager) gVar14.f298864a.getSystemService("display")).getDisplay(0);
            Point point = new Point();
            display.getRealSize(point);
            Resources resources = gVar14.f298864a.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 126;
            double d = (double) point.y;
            Double.isNaN(d);
            this.f303355cM = ((int) (d * 0.8d)) - dimensionPixelSize;
        } else {
            this.f303355cM = aVar61.mo95357c();
        }
        this.f303290ax = aVar61.mo95355a();
        if (!z4) {
            this.f303238X.mo96191s(h);
            if (tVar6.mo79746e(C90014bt.f247626kh)) {
                this.f303239Y = (C107606q) aVar39.mo27525b();
                C107606q qVar = this.f303239Y;
                qVar.f299360k = this;
                qVar.f299361l = this;
            }
        } else {
            this.f303238X.mo96191s(h);
        }
        baVar.mo95371M(this.f303238X);
        baVar.mo95371M(this);
        if (z8 || this.f303294bA) {
            this.f303238X.mo96153ae(false);
            this.f303238X.mo96150ab(false);
        }
        if (m181378bx(baVar)) {
            this.f303238X.mo96189q(((C113989h) ((C113988g) baVar).mo100833bf().mo56107c()).mo100839aV());
        }
        if ((baVar instanceof C113988g) && ((C113988g) baVar).mo100832be().mo56113h()) {
            ((C113985d) ((C113988g) baVar).mo100832be().mo56107c()).mo100829bk(this.f303238X.mo96181i());
        }
        if (mo97528bv()) {
            viewStub = (ViewStub) h.findViewById(R.id.opa_titan_persistent_finish_setup_bar_view_stub);
        } else {
            viewStub = (ViewStub) h.findViewById(R.id.opa_persistent_finish_setup_bar_view_stub);
        }
        this.f303357cO = viewStub;
        if (m181405cv() && ((C113884o) aVar30.mo27525b()).mo100742a()) {
            ((C113983b) ((C113988g) baVar).mo100831bd().mo56107c()).mo100828bj((ViewGroup) this.f303238X.mo96181i().findViewById(R.id.auto_complete_grid));
        }
        if (mo97520bl()) {
            ((C113989h) ((C113988g) baVar).mo100833bf().mo56107c()).mo100897cv(new C107638ay(this));
        }
        mo97445aG(this.f303309bP);
        if (!z3 || !m181378bx(baVar) || (!tVar6.mo79746e(C90014bt.f247786ni) && !tVar6.mo79746e(C90014bt.f247793np))) {
            this.f303291ay = new C2100o(this.f303346c, this.f303389cu, handler);
        } else {
            Context context5 = this.f303346c;
            GestureDetector.SimpleOnGestureListener simpleOnGestureListener = this.f303389cu;
            C113989h hVar4 = (C113989h) ((C113988g) baVar).mo100833bf().mo56107c();
            Context context6 = this.f303346c;
            C107659as asVar3 = this.f303238X;
            simpleOnGestureListener.getClass();
            baVar.getClass();
            flVar.getClass();
            hVar4.getClass();
            context6.getClass();
            asVar3.getClass();
            C109275ij ijVar4 = ijVar;
            C86124t tVar7 = (C86124t) ijVar4.f304408a.mo17428b();
            tVar7.getClass();
            C106062r rVar2 = (C106062r) ijVar4.f304409b.mo17428b();
            rVar2.getClass();
            this.f303291ay = new C2100o(context5, new C109274ii(simpleOnGestureListener, baVar, flVar, hVar4, context6, asVar3, tVar7, rVar2), (Handler) null);
        }
        C109269id idVar = (C109269id) aVar4.mo27525b();
        baVar.getClass();
        ((C109271if) idVar.f304392a.mo17428b()).getClass();
        ((Context) idVar.f304393b.mo17428b()).getClass();
        C86124t tVar8 = (C86124t) idVar.f304394c.mo17428b();
        tVar8.getClass();
        C9388a aVar65 = (C9388a) idVar.f304395d.mo17428b();
        aVar65.getClass();
        C68214a a16 = C68219e.m98518a(((C68226l) idVar.f304396e).f184585a);
        a16.getClass();
        this.f303351cE = new C109268ic(baVar, tVar8, aVar65, a16);
        C109268ic icVar = this.f303351cE;
        icVar.f304391g = new C108788dv();
        C109270ie ieVar = icVar.f304386b;
        icVar.f304391g.getClass();
        if (tVar6.mo79746e(C90014bt.f247262do)) {
            C109323jn jnVar = (C109323jn) aVar22.mo27525b();
            baVar.getClass();
            C68214a a17 = C68219e.m98518a(((C68226l) jnVar.f304526a).f184585a);
            a17.getClass();
            C68214a a18 = C68219e.m98518a(((C68226l) jnVar.f304527b).f184585a);
            a18.getClass();
            C68214a a19 = C68219e.m98518a(((C68226l) jnVar.f304528c).f184585a);
            a19.getClass();
            C68214a a20 = C68219e.m98518a(((C68226l) jnVar.f304529d).f184585a);
            a20.getClass();
            C22871g gVar15 = (C22871g) jnVar.f304530e.mo17428b();
            gVar15.getClass();
            C86124t tVar9 = (C86124t) jnVar.f304531f.mo17428b();
            tVar9.getClass();
            C118426bs bsVar = (C118426bs) jnVar.f304532g.mo17428b();
            bsVar.getClass();
            C118449y yVar3 = (C118449y) jnVar.f304533h.mo17428b();
            yVar3.getClass();
            C58833ax k = C58833ax.m90834k(new C109322jm(baVar, a17, a18, a19, a20, gVar15, tVar9, bsVar, yVar3));
            this.f303431dr = k;
            uVar5.mo96220c((C87682aj) k.mo56107c(), C88244um.OPA_ZERO_STATE_RESPONSE);
        } else {
            this.f303431dr = C58836b.f156633a;
        }
        this.f303363cU = aVar5;
        if (mo97530by()) {
            ((C113990i) ((C113988g) baVar).mo100834bg().mo56107c()).mo100920cz(fiVar4);
        }
        C109286h hVar5 = (C109286h) aVar10.mo27525b();
        ViewStub viewStub3 = (ViewStub) h.findViewById(R.id.imageviewer_overlay_view_stub);
        baVar.getClass();
        viewStub3.getClass();
        C91189au auVar = (C91189au) hVar5.f304435a.mo17428b();
        auVar.getClass();
        C22871g gVar16 = (C22871g) hVar5.f304436b.mo17428b();
        gVar16.getClass();
        Context context7 = (Context) hVar5.f304437c.mo17428b();
        context7.getClass();
        C107129a aVar66 = (C107129a) hVar5.f304438d.mo17428b();
        aVar66.getClass();
        C109285g gVar17 = new C109285g(baVar, viewStub3, auVar, gVar16, context7, aVar66);
        this.f303359cQ = gVar17;
        C109036ff ffVar = new C109036ff(this);
        baVar.getClass();
        axVar7.getClass();
        C107145l lVar5 = lVar;
        C68214a a21 = C68219e.m98518a(((C68226l) lVar5.f298243a).f184585a);
        a21.getClass();
        Activity activity3 = (Activity) lVar5.f298244b.mo17428b();
        activity3.getClass();
        C107710u uVar6 = (C107710u) lVar5.f298245c.mo17428b();
        uVar6.getClass();
        C68214a a22 = C68219e.m98518a(((C68226l) lVar5.f298246d).f184585a);
        a22.getClass();
        PackageManager packageManager = (PackageManager) lVar5.f298247e.mo17428b();
        packageManager.getClass();
        C22871g gVar18 = (C22871g) lVar5.f298248f.mo17428b();
        gVar18.getClass();
        C107156w wVar = (C107156w) lVar5.f298249g.mo17428b();
        wVar.getClass();
        C107129a aVar67 = (C107129a) lVar5.f298250h.mo17428b();
        aVar67.getClass();
        C113863cr crVar2 = (C113863cr) lVar5.f298251i.mo17428b();
        crVar2.getClass();
        this.f303240Z = new C107144k(baVar, axVar7, ffVar, gVar17, a21, activity3, uVar6, a22, packageManager, gVar18, wVar, aVar67, crVar2);
        m181383cE();
        this.f303237W = cVar.mo96460a(this.f303346c, baVar, this.f303267aa);
        this.f303237W.f299737k = mo97508bR();
        this.f303237W.mo96241a(this.f303353cK);
        this.f303451p = new C108800ed(this);
        C107376aq aqVar = new C107376aq(this);
        this.f303452q = aqVar;
        this.f303353cK.mo96220c(aqVar, C88244um.TTS_PLAYBACK_DONE, C88244um.TTS_PLAYBACK_STARTED, C88244um.OPA_NOTIFY_NO_CARD_IN_RESPONSE, C88244um.OPA_NOTIFY_DISPLAY_PHOTOS_IN_RESPONSE, C88244um.NOTIFY_COMPLETED_ASSISTANT_CONVERSATION, C88244um.ATTACH_WEBVIEW, C88244um.OPA_SESSION_SERVICE_EVENT, C88244um.UPDATE_MEDIA_EXECUTION);
        if (this.f303411dP == null) {
            this.f303411dP = new C108515cv(this);
        }
        C108515cv cvVar = this.f303411dP;
        baVar.getClass();
        cvVar.getClass();
        gbVar2.getClass();
        C109760of ofVar3 = ofVar;
        C86124t tVar10 = (C86124t) ofVar3.f305830a.mo17428b();
        tVar10.getClass();
        SharedPreferences sharedPreferences4 = (SharedPreferences) ofVar3.f305831b.mo17428b();
        sharedPreferences4.getClass();
        bm bmVar = (bm) ofVar3.f305832c.mo17428b();
        bmVar.getClass();
        C68214a a23 = C68219e.m98518a(((C68226l) ofVar3.f305833d).f184585a);
        a23.getClass();
        C22871g gVar19 = (C22871g) ofVar3.f305834e.mo17428b();
        gVar19.getClass();
        C113869cx cxVar = (C113869cx) ofVar3.f305835f.mo17428b();
        cxVar.getClass();
        C68214a a24 = C68219e.m98518a(((C68226l) ofVar3.f305836g).f184585a);
        a24.getClass();
        C109734nh nhVar2 = (C109734nh) ofVar3.f305837h.mo17428b();
        nhVar2.getClass();
        C68214a a25 = C68219e.m98518a(((C68226l) ofVar3.f305838i).f184585a);
        a25.getClass();
        C68214a a26 = C68219e.m98518a(((C68226l) ofVar3.f305839j).f184585a);
        a26.getClass();
        C109759oe oeVar = new C109759oe(baVar, this, cvVar, gbVar2, tVar10, sharedPreferences4, bmVar, a23, gVar19, cxVar, a24, nhVar2, a25, a26);
        this.f303459x = oeVar;
        if (oeVar.mo98101h()) {
            this.f303353cK.mo96220c(oeVar, C88244um.TTS_PLAYBACK_STARTED, C88244um.TTS_PLAYBACK_DONE, C88244um.OPA_SESSION_SERVICE_EVENT);
        }
        C109065gb gbVar3 = gbVar2;
        this.f303261aU = nhVar.mo98054a(baVar, gbVar3);
        if (this.f303455t.mo79746e(C90014bt.f247180cL)) {
            this.f303215A = new C109009ev(this);
        } else {
            this.f303460y = null;
            this.f303215A = null;
        }
        C109042fl flVar2 = this.f303444i;
        baVar.getClass();
        flVar2.getClass();
        C109329jt jtVar3 = jtVar;
        Context context8 = (Context) jtVar3.f304549a.mo17428b();
        context8.getClass();
        C58833ax axVar13 = (C58833ax) jtVar3.f304550b.mo17428b();
        axVar13.getClass();
        C113916t tVar11 = (C113916t) jtVar3.f304551c.mo17428b();
        tVar11.getClass();
        C109328js jsVar = new C109328js(baVar, flVar2, this, context8, axVar13, tVar11);
        this.f303216B = jsVar;
        C107710u uVar7 = this.f303353cK;
        uVar7.mo96220c(jsVar, C88244um.NOTIFY_DEVICE_SELECTION_SUPPRESSION);
        uVar7.mo96220c(jsVar, C88244um.GACS_FORCE_SUPPRESS_PHONE_OPA_SESSION);
        this.f303358cP = aVar17;
        this.f303219E = cVar3;
        this.f303218D = fVar2;
        this.f303217C = uVar2;
        this.f303281ao = new Bundle();
        C58976aa aaVar = C58975e.f156826a;
        C113628g gVar20 = gVar10;
        gVar20.f314641h = baVar;
        gVar20.f314642i = this;
        this.f303422di = dVar;
        this.f303258aR = aVar18;
        this.f303316bW = aVar28;
        this.f303317bX = aVar29;
        this.f303397dB = aVar32;
        this.f303398dC = aVar34;
        this.f303374cf = aVar35;
        C58833ax k2 = C58833ax.m90834k(this);
        C58833ax k3 = C58833ax.m90834k(oeVar);
        C58833ax k4 = C58833ax.m90834k(a15);
        C58833ax k5 = C58833ax.m90834k(jsVar);
        C58833ax.m90834k(this.f303238X);
        this.f303293b = gVar6.mo96384a(k2, k3, gbVar3, k4, k5, C58833ax.m90834k(this.f303444i));
        this.f303314bU = lVar2;
        C108779dm dmVar = new C108779dm(this);
        String M = C87566i.m142238M(activity.getIntent().getExtras());
        gVar.getClass();
        baVar.getClass();
        C109106c cVar7 = cVar4;
        C68214a a27 = C68219e.m98518a(((C68226l) cVar7.f303843a).f184585a);
        a27.getClass();
        C109399b bVar6 = (C109399b) cVar7.f303844b.mo17428b();
        bVar6.getClass();
        Context context9 = (Context) cVar7.f303845c.mo17428b();
        context9.getClass();
        C22871g gVar21 = (C22871g) cVar7.f303846d.mo17428b();
        gVar21.getClass();
        C86124t tVar12 = (C86124t) cVar7.f303847e.mo17428b();
        tVar12.getClass();
        C68214a a28 = C68219e.m98518a(((C68226l) cVar7.f303848f).f184585a);
        a28.getClass();
        C109101as asVar4 = (C109101as) cVar7.f303849g.mo17428b();
        asVar4.getClass();
        C68214a a29 = C68219e.m98518a(((C68226l) cVar7.f303850h).f184585a);
        a29.getClass();
        C68214a a30 = C68219e.m98518a(((C68226l) cVar7.f303851i).f184585a);
        a30.getClass();
        C68214a a31 = C68219e.m98518a(((C68226l) cVar7.f303852j).f184585a);
        a31.getClass();
        this.f303323bd = new C109105b(dmVar, gVar, baVar, M, a27, bVar6, context9, gVar21, tVar12, a28, asVar4, a29, a30, a31);
        C108782dp dpVar = new C108782dp(this);
        C108783dq dqVar = new C108783dq(this);
        C106148y yVar4 = yVar;
        C68214a a32 = C68219e.m98518a(((C68226l) yVar4.f296246a).f184585a);
        a32.getClass();
        C68214a a33 = C68219e.m98518a(((C68226l) yVar4.f296247b).f184585a);
        a33.getClass();
        C68214a a34 = C68219e.m98518a(((C68226l) yVar4.f296248c).f184585a);
        a34.getClass();
        C68214a a35 = C68219e.m98518a(((C68226l) yVar4.f296249d).f184585a);
        a35.getClass();
        C106146w wVar2 = (C106146w) yVar4.f296250e.mo17428b();
        wVar2.getClass();
        C106127d dVar3 = (C106127d) yVar4.f296251f.mo17428b();
        dVar3.getClass();
        C86124t tVar13 = (C86124t) yVar4.f296252g.mo17428b();
        tVar13.getClass();
        C68219e.m98518a(((C68226l) yVar4.f296253h).f184585a).getClass();
        Activity activity4 = (Activity) yVar4.f296254i.mo17428b();
        activity4.getClass();
        C68214a a36 = C68219e.m98518a(((C68226l) yVar4.f296255j).f184585a);
        a36.getClass();
        this.f303324be = new C106147x(dpVar, dqVar, a32, a33, a34, a35, wVar2, dVar3, tVar13, activity4, a36);
        this.f303403dH = ibVar.mo97733a(C58833ax.m90834k(oeVar));
        if (z4) {
            gVar7.f241687c.mo5705f(this.f303378cj);
        }
        this.f303385cq = amVar2;
        this.f303381cm = aVar46;
        this.f303382cn = aVar49;
    }

    /* renamed from: bS */
    private final AnimatorSet m181368bS() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f303450o.mo95420i(), View.TRANSLATION_Y, new float[]{C91115n.m148870b(80.0f, this.f303346c), 0.0f});
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(f303211cF);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f303450o.mo95420i(), View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setStartDelay(117);
        ofFloat2.setDuration(250);
        ofFloat2.setInterpolator(f303212cG);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f303449n.findViewById(R.id.opa_search_plate_container), View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat3.setStartDelay(83);
        ofFloat3.setDuration(67);
        ofFloat3.setInterpolator(f303213cH);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        return animatorSet;
    }

    /* renamed from: bT */
    private final ValueAnimator m181369bT(int i, int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.addUpdateListener(new C108498co(this));
        return ofObject;
    }

    /* renamed from: bU */
    private final View.OnClickListener m181370bU() {
        return new C89943l(new C109010ew(this));
    }

    /* renamed from: bV */
    private final View m181371bV() {
        View inflate = LayoutInflater.from(this.f303346c).inflate(R.layout.feedback_badge_view, (ViewGroup) null);
        inflate.getClass();
        ViewGroup viewGroup = (ViewGroup) inflate;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, this.f303346c.getResources().getDimensionPixelSize(R.dimen.feedback_badge_icon_margin_right), 0);
        ((FrameLayout) this.f303449n.findViewById(R.id.opa_main_view_inner)).addView(viewGroup, layoutParams);
        viewGroup.setOnClickListener(new C108524da(this));
        return viewGroup;
    }

    /* renamed from: bW */
    private final View m181372bW(C109212a aVar) {
        ViewGroup b = aVar.mo97673b();
        ViewGroup viewGroup = (ViewGroup) b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(b);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        b.setPadding(this.f303309bP.mo96664g(), b.getPaddingTop(), this.f303309bP.mo96664g(), b.getPaddingBottom());
        ((FrameLayout) this.f303449n.findViewById(R.id.opa_main_view_inner)).addView(b, layoutParams);
        this.f303449n.findViewById(R.id.opa_menu).setVisibility(8);
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142273aU(r2.f303442g);
     */
    /* renamed from: bX */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.shared.search.Query m181373bX(com.google.android.apps.gsa.shared.search.Query r3) {
        /*
            r2 = this;
            android.os.Bundle r0 = r2.f303442g
            java.lang.String r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142234I(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0012
            java.lang.String r1 = "android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME"
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84278aO(r1, r0)
        L_0x0012:
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247045J
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x002a
            android.os.Bundle r0 = r2.f303442g
            byte[] r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142273aU(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "android.opa.extra.APP_INTEGRATION_CLIENT_VOICE_PLATE_PARAMS"
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84303ao(r1, r0)
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109040fj.m181373bX(com.google.android.apps.gsa.shared.search.Query):com.google.android.apps.gsa.shared.search.Query");
    }

    /* renamed from: bY */
    private final Query m181374bY(Query query) {
        byte[] bArr = this.f303283aq;
        if (bArr == null) {
            return query;
        }
        Query aZ = query.mo84289aZ(bArr);
        this.f303283aq = null;
        return aZ;
    }

    /* renamed from: bZ */
    private final Query m181375bZ(Query query) {
        return ((this.f303433dt || !this.f303319bZ.mo56113h()) && !this.f303282ap) ? query : query.mo84311aw("android.opa.extra.CLIENT_MODALITY_OVERRIDE", C51305cu.TYPING_MODALITY.f133565f);
    }

    /* renamed from: bn */
    public static boolean m181376bn(Bundle bundle) {
        return C87566i.m142296at(bundle) || C87566i.m142302az(bundle);
    }

    /* renamed from: bs */
    public static boolean m181377bs(int i) {
        return i == 2 || i == 3 || i == 4 || i == 10;
    }

    /* renamed from: bx */
    public static boolean m181378bx(C108230ba baVar) {
        return (baVar instanceof C113988g) && ((C113988g) baVar).mo100833bf().mo56113h();
    }

    /* renamed from: cA */
    private final boolean m181379cA() {
        if (m181406cw()) {
            return false;
        }
        if (this.f303238X.mo96177e() == 2) {
            return this.f303344by;
        }
        if (this.f303238X.mo96177e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: cB */
    private final boolean m181380cB() {
        return this.f303265aY != null && C87566i.m142261aI(this.f303442g);
    }

    /* renamed from: cC */
    private final boolean m181381cC(boolean z) {
        if (this.f303455t.mo79746e(C90014bt.f247733mi) && (C87566i.m142296at(this.f303442g) || C87566i.m142302az(this.f303442g))) {
            return true;
        }
        if (z || !((C113191cv) this.f303380cl.mo27525b()).mo99907c() || ((!this.f303238X.mo96132aE() && !this.f303455t.mo79746e(C90014bt.f247734mj)) || !this.f303384cp.isPresent() || ((LiveData) this.f303384cp.get()).mo3842a() != f.b)) {
            return false;
        }
        return true;
    }

    /* renamed from: cD */
    private final void m181382cD(int i) {
        if (mo97528bv()) {
            this.f303450o.mo95420i().findViewById(R.id.opa_search_plate).setBackgroundResource(0);
            m181399cp(this.f303450o.mo95420i());
        }
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C109026ey eyVar = C109026ey.UNINITIALIZED;
        C83572ac acVar = C83572ac.UNINITIALIZED;
        C113984c cVar = C113984c.UNKNOWN;
        C108228az azVar = C108228az.UNINITIALIZED;
        int i2 = i - 1;
        if (i2 == 0) {
            this.f303450o.mo95420i().setOutlineProvider(new C108132cf(this));
            this.f303450o.mo95420i().setClipToOutline(true);
        } else if (i2 == 1) {
            mo97471ag(true);
            this.f303450o.mo95420i().findViewById(R.id.opa_search_plate).setBackgroundResource(R.drawable.rounded_bottom_corner);
            this.f303450o.mo95420i().setBackgroundResource(R.drawable.rounded_bottom_corner);
        } else if (i2 != 3) {
            mo97471ag(true);
            this.f303450o.mo95420i().findViewById(R.id.opa_search_plate).setBackgroundResource(R.drawable.rounded_bottom_corner);
            this.f303450o.mo95420i().setBackgroundResource(R.drawable.opa_rounded_corner);
        } else {
            this.f303450o.mo95420i().setOutlineProvider(new C108133cg(this));
            this.f303450o.mo95420i().setClipToOutline(true);
        }
    }

    /* renamed from: cE */
    private final void m181383cE() {
        C58976aa aaVar = C58975e.f156826a;
        if (mo97530by()) {
            this.f303448m.mo28211k(m181385cb(), "ChatUiController useZeroStateCardFactory", new C108805ei(this));
        }
        C109871p pVar = this.f303352cJ;
        C108230ba baVar = this.f303450o;
        C109065gb gbVar = this.f303456u;
        FragmentManager fragmentManager = this.f303441f.getFragmentManager();
        C107659as asVar = this.f303238X;
        C107144k kVar = this.f303240Z;
        C109753o i = mo97537i();
        C109753o oVar = i;
        C108244bo boVar = this.f303361cS;
        C108244bo boVar2 = boVar;
        C108244bo boVar3 = boVar;
        C108214al a = this.f303322bc.mo96599a(this.f303450o, new C108803eg(this));
        C60870cx cxVar = (C60870cx) this.f303436dw.mo27525b();
        C60870cx cxVar2 = cxVar;
        C109138h hVar = r2;
        baVar.getClass();
        gbVar.getClass();
        fragmentManager.getClass();
        asVar.getClass();
        kVar.getClass();
        i.getClass();
        boVar3.getClass();
        cxVar.getClass();
        C107710u uVar = (C107710u) pVar.f306132a.mo17428b();
        C107710u uVar2 = uVar;
        uVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) pVar.f306133b).f184585a);
        C68214a aVar = a2;
        a2.getClass();
        C89911f fVar = (C89911f) pVar.f306134c.mo17428b();
        C89911f fVar2 = fVar;
        fVar.getClass();
        C108429ij ijVar = (C108429ij) pVar.f306135d.mo17428b();
        C108429ij ijVar2 = ijVar;
        ijVar.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) pVar.f306136e).f184585a);
        C68214a aVar2 = a3;
        a3.getClass();
        C109259hx hxVar = (C109259hx) pVar.f306137f.mo17428b();
        C109259hx hxVar2 = hxVar;
        hxVar.getClass();
        Context context = (Context) pVar.f306138g.mo17428b();
        Context context2 = context;
        context.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) pVar.f306139h).f184585a);
        C68214a aVar3 = a4;
        a4.getClass();
        Activity activity = (Activity) pVar.f306140i.mo17428b();
        Activity activity2 = activity;
        activity.getClass();
        C21370a aVar4 = (C21370a) pVar.f306141j.mo17428b();
        C21370a aVar5 = aVar4;
        aVar4.getClass();
        C114582bc bcVar = (C114582bc) pVar.f306142k.mo17428b();
        bcVar.getClass();
        C109138h hVar2 = new C109138h(baVar, gbVar, fragmentManager, asVar, kVar, oVar, boVar2, a, cxVar2, uVar2, aVar, fVar2, ijVar2, aVar2, hxVar2, context2, aVar3, activity2, aVar5, bcVar);
        this.f303236V = hVar;
        this.f303448m.mo28211k((C60870cx) this.f303436dw.mo27525b(), "ChatUiController useCardFactory", new C108804eh(this));
    }

    /* renamed from: ca */
    private final C108230ba m181384ca(C108227ay ayVar, C108303dt dtVar, C110426a aVar) {
        C108230ba a = ayVar.mo95438a(new C109011ex(this), this.f303232R, aVar, this.f303309bP, this.f303456u, C58886cw.m90973a(new C108107bs(this)), C58886cw.m90973a(new C108108bt(this)));
        a.mo95379U(dtVar);
        if (m181378bx(a)) {
            ((C113989h) ((C113988g) a).mo100833bf().mo56107c()).mo100903dG(new C109037fg(this));
        }
        return a;
    }

    /* renamed from: cb */
    private final C60870cx m181385cb() {
        this.f303311bR = true;
        return (C60870cx) this.f303312bS.mo27525b();
    }

    /* renamed from: cc */
    private final void m181386cc() {
        C108262cf cfVar = new C108262cf(1, 4);
        cfVar.f301176f = true;
        cfVar.mo96712f();
        cfVar.f301177g = true;
        cfVar.mo96714u();
        this.f303450o.mo95430s(cfVar);
    }

    /* renamed from: cd */
    private final void m181387cd() {
        Resources f = mo97534f();
        long a = this.f303455t.mo79743a(C90014bt.f247414gh);
        Map map = f303214cI;
        Integer valueOf = Integer.valueOf((int) a);
        int i = R.string.opa_greeting_bubble_text;
        String string = f.getString(((Integer) Map.EL.getOrDefault(map, valueOf, Integer.valueOf(R.string.opa_greeting_bubble_text))).intValue());
        C108262cf cfVar = new C108262cf(2, 4);
        if (!this.f303455t.mo79746e(C90014bt.f247626kh) || !this.f303455t.mo79746e(C90024cc.f248132c) || this.f303455t.mo79746e(C90014bt.f247611kS)) {
            C107621a aVar = this.f303274ah;
            Bundle bundle = this.f303442g;
            if (!aVar.mo96077d(bundle) || !C107621a.m178509b(bundle)) {
                i = 0;
            } else if (aVar.f299391c.mo79743a(C90057di.f249009e) == 1) {
                i = R.string.opa_voice_search_listening;
            } else if (aVar.f299391c.mo79743a(C90057di.f249009e) == 2) {
                i = R.string.opa_greeting_text_roti_chrome_nbu;
            }
            if (i != 0) {
                string = mo97534f().getString(i);
            }
        } else {
            string = mo97534f().getString(R.string.opa_citadel_greeting_bubble_text);
        }
        cfVar.f301174d = string;
        this.f303450o.mo95430s(cfVar);
    }

    /* renamed from: ce */
    private final void m181388ce() {
        Account a;
        C113710u uVar = this.f303217C;
        C109006es esVar = new C109006es(this);
        int a2 = (int) uVar.f314910a.mo79743a(C90014bt.f247333fF);
        if (a2 > 0 && (a = uVar.f314911b.mo79668a()) != null) {
            C60870cx f = uVar.f314911b.mo79672f(((C89994f) uVar.f314912c.mo27525b()).mo83887ag(), a, false, new C91032p());
            uVar.f314913d.mo85137b(new C109956s(f), (long) a2);
            uVar.f314913d.mo85147l(f, new C110937t(esVar));
        }
    }

    /* renamed from: cf */
    private final void m181389cf(int i) {
        if (this.f303356cN != null && i == 1) {
            if (this.f303409dN.mo93971b()) {
                this.f303356cN.setNavigationBarColor(C19391a.m36980a(this.f303441f, 16842801));
                this.f303356cN.setNavigationBarDividerColor(C19391a.m36980a(this.f303441f, 16842801));
            } else {
                this.f303356cN.setNavigationBarColor(C1878d.m5128a(this.f303346c, R.color.chatui_solid_background_fill_v2_dark));
            }
            View decorView = this.f303356cN.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -17);
            if (this.f303356cN == null) {
                return;
            }
            if (this.f303409dN.mo93971b()) {
                this.f303356cN.setNavigationBarDividerColor(C19391a.m36980a(this.f303441f, 16842801));
            } else {
                this.f303356cN.setNavigationBarDividerColor(C1878d.m5128a(this.f303346c, R.color.chatui_solid_background_fill_v2_dark));
            }
        }
    }

    /* renamed from: cg */
    private final void m181390cg() {
        if (m181378bx(this.f303450o)) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100871cA(false);
        } else {
            this.f303229O.setVisibility(8);
        }
        this.f303450o.mo95414ay();
    }

    /* renamed from: ch */
    private final void m181391ch() {
        C113768ak akVar = new C113768ak(this.f303445j);
        this.f303224J = akVar;
        akVar.mo100612d(R.id.opa_menu_account, 27101);
        this.f303224J.mo100612d(R.id.opa_menu_settings, 27102);
        this.f303224J.mo100612d(R.id.opa_menu_what_can_you_do, 27103);
        this.f303224J.mo100612d(R.id.opa_menu_feedback, 27104);
    }

    /* renamed from: ci */
    private final void m181392ci() {
        PopupMenu popupMenu = this.f303222H;
        popupMenu.getClass();
        popupMenu.getMenuInflater().inflate(R.menu.opa_menu, popupMenu.getMenu());
        C113768ak akVar = this.f303224J;
        akVar.getClass();
        popupMenu.setOnMenuItemClickListener(new C113766ai(akVar, this.f303250aJ));
        MenuItem findItem = popupMenu.getMenu().findItem(R.id.opa_menu_my_activity);
        if (findItem != null) {
            findItem.setVisible(false);
            findItem.setEnabled(false);
        }
        View view = this.f303220F;
        if (view != null) {
            C113768ak akVar2 = this.f303224J;
            akVar2.getClass();
            view.setOnClickListener(akVar2.mo100609a(28978, popupMenu.getMenu(), new C89943l(new C108517cx(popupMenu))));
            View view2 = this.f303220F;
            int g = this.f303309bP.mo96664g();
            View view3 = this.f303220F;
            view3.getClass();
            int paddingTop = view3.getPaddingTop();
            int g2 = this.f303309bP.mo96664g();
            View view4 = this.f303220F;
            view4.getClass();
            view2.setPadding(g, paddingTop, g2, view4.getPaddingBottom());
        }
    }

    /* renamed from: cj */
    private final void m181393cj(Bundle bundle) {
        if (!this.f303259aS) {
            return;
        }
        if (this.f303244aD) {
            bundle.remove("android.opa.extra.LAUNCHED_ON");
        } else {
            bundle.putInt("android.opa.extra.LAUNCHED_ON", C87566i.m142309h(this.f303442g));
        }
    }

    /* renamed from: ck */
    private final void m181394ck() {
        if (this.f303455t.mo79746e(C90014bt.f247780nc) && this.f303371cc) {
            ((C107759j) this.f303375cg.mo27525b()).mo96269e();
        }
    }

    /* renamed from: cl */
    private final void m181395cl() {
        if (!this.f303455t.mo79746e(C90014bt.f247693lv) && this.f303351cE != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f303281ao.putBoolean("android.opa.extra.INITIAL_QUERY", true);
            C90498f i = this.f303425dl.mo84480i();
            i.mo84562U(9);
            i.mo84572d(0, 562949953421312L);
            this.f303454s.mo96218a(i.mo84568a().mo84264aA(this.f303393cy.f315214a, this.f303281ao));
        }
    }

    /* renamed from: cm */
    private final void m181396cm() {
        if (this.f303368cZ == 1) {
            m181402cs();
        }
    }

    /* renamed from: cn */
    private final void m181397cn() {
        if (m181408cy()) {
            this.f303449n.setContentDescription(mo97534f().getString(R.string.opa_main_view_scrim_label_dismiss));
        } else {
            this.f303449n.setContentDescription(BuildConfig.FLAVOR);
        }
        mo97472ah();
    }

    /* renamed from: co */
    private final void m181398co(TtsRequest ttsRequest, boolean z) {
        Query aA = this.f303425dl.mo84244G(true).mo84264aA(this.f303393cy.f315214a, Bundle.EMPTY);
        this.f303454s.mo96218a(z ? aA.mo84255R(ttsRequest) : aA.mo84256S(ttsRequest));
    }

    /* renamed from: cp */
    private final void m181399cp(ViewGroup viewGroup) {
        ContextThemeWrapper a = C108435ip.m180256a(this.f303409dN, this.f303346c);
        if (this.f303409dN.mo93970a()) {
            viewGroup.setBackgroundColor(C19391a.m36980a(a, R.attr.assistantBackground));
        } else if (this.f303409dN.mo93971b()) {
            viewGroup.setBackgroundColor(C19391a.m36980a(a, 16842801));
        } else {
            viewGroup.setBackgroundColor(this.f303309bP.mo96661d());
        }
    }

    /* renamed from: cq */
    private static void m181400cq(View view, int i) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin = i;
        view.requestLayout();
    }

    /* renamed from: cr */
    private final void m181401cr() {
        boolean z = false;
        if (((Boolean) this.f303438dy.mo27525b()).booleanValue() && this.f303455t.mo79746e(C90014bt.f247834ou)) {
            z = true;
        }
        boolean aF = C87566i.m142258aF(this.f303441f.getIntent().getExtras());
        this.f303294bA = aF;
        if (!aF || !z) {
            C114748b bVar = this.f303266aZ;
            C53306j jVar = C53306j.MAIN_APP;
            jVar.name();
            bVar.f318449b = jVar;
            return;
        }
        C114748b bVar2 = this.f303266aZ;
        C53306j jVar2 = C53306j.DOCK;
        jVar2.name();
        bVar2.f318449b = jVar2;
    }

    /* renamed from: cs */
    private final void m181402cs() {
        boolean c = ((C113191cv) this.f303380cl.mo27525b()).mo99907c();
        if (!this.f303238X.mo96134aG()) {
            if (this.f303248aH.mo56113h()) {
                ((C108100a) this.f303248aH.mo56107c()).f300689c = C51211f.MANUAL;
            }
            mo97462aX(1);
            if (C87566i.m142254aB(this.f303442g)) {
                this.f303238X.mo96151ac(true);
                if (((C113191cv) this.f303380cl.mo27525b()).mo99907c()) {
                    this.f303238X.mo96114M();
                }
            }
        }
        if (c && !this.f303370cb) {
            boolean aP = C87566i.m142268aP(this.f303442g);
            this.f303448m.mo28213m("Maybe Expand to Full Screen", (long) this.f303346c.getResources().getInteger(R.integer.chatui_enter_animation_duration), new C107624ax(this, !aP));
        }
    }

    /* renamed from: ct */
    private final void m181403ct(List list) {
        if (m181378bx(this.f303450o) && list != null && !list.isEmpty()) {
            this.f303225K.mo95257i(new C107622aw(this, (C52533vg) list.get(0)));
        }
    }

    /* renamed from: cu */
    private final void m181404cu(List list) {
        PopupMenu popupMenu = this.f303223I;
        popupMenu.getClass();
        popupMenu.getMenu().clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C52533vg vgVar = (C52533vg) it.next();
            MenuItem add = popupMenu.getMenu().add(vgVar.f137895d);
            C113768ak akVar = this.f303224J;
            akVar.getClass();
            akVar.mo100612d(add.getItemId(), 28985);
            add.setOnMenuItemClickListener(new C108509cp(this, vgVar));
        }
        C113768ak akVar2 = this.f303224J;
        akVar2.getClass();
        popupMenu.setOnMenuItemClickListener(new C113766ai(akVar2, this.f303250aJ));
        View g = this.f303225K.mo95255g();
        C113768ak akVar3 = this.f303224J;
        akVar3.getClass();
        g.setOnClickListener(akVar3.mo100609a(28984, popupMenu.getMenu(), new C89943l(new C107949bc(popupMenu))));
    }

    /* renamed from: cv */
    private final boolean m181405cv() {
        C108230ba baVar = this.f303450o;
        return (baVar instanceof C113988g) && ((C113988g) baVar).mo100831bd().mo56113h();
    }

    /* renamed from: cw */
    private final boolean m181406cw() {
        return this.f303319bZ.mo56113h() && ((C107383g) this.f303319bZ.mo56107c()).mo95997a() == C107382f.READY_TO_RENDER;
    }

    /* renamed from: cx */
    private final boolean m181407cx() {
        return this.f303238X.mo96131aD() && ((C113191cv) this.f303380cl.mo27525b()).mo99907c();
    }

    /* renamed from: cy */
    private final boolean m181408cy() {
        if (this.f303275ai != C109026ey.MODE_CONVERSATION) {
            return true;
        }
        if (this.f303455t.mo79746e(C90014bt.f247735mk)) {
            return false;
        }
        if (!this.f303455t.mo79746e(C90029ch.f248284br) || this.f303298bE) {
            return true;
        }
        return false;
    }

    /* renamed from: cz */
    private final boolean m181409cz() {
        return this.f303370cb && C87566i.m142299aw(this.f303442g);
    }

    /* renamed from: j */
    public static C58833ax m181410j(String str) {
        if (str == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(C22704h.m42283b(str));
    }

    /* renamed from: A */
    public final void mo97413A() {
        if (this.f303455t.mo79746e(C90014bt.f247779nb) && this.f303455t.mo79746e(C90014bt.f247784ng) && mo97521bm()) {
            C108093b bVar = this.f303315bV;
            if (bVar.f300678a) {
                bVar.f300678a = false;
                this.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_3P);
            }
        }
    }

    /* renamed from: B */
    public final void mo97414B() {
        if (this.f303319bZ.mo56113h()) {
            C107383g gVar = (C107383g) this.f303319bZ.mo56107c();
            if (gVar.mo95997a() != C107382f.DISMISSED && gVar.mo95997a() != C107382f.DISMISSING) {
                this.f303448m.mo28213m("dismiss_proactive_ui", this.f303455t.mo79743a(C90014bt.f247165bx), new C114531z(this, gVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo97415C() {
        if (this.f303319bZ.mo56113h() && ((C107383g) this.f303319bZ.mo56107c()).mo95997a() == C107382f.RENDERED) {
            mo97414B();
        }
    }

    /* renamed from: D */
    public final void mo97416D(Runnable runnable) {
        if (mo97524bq()) {
            this.f303338bs = true;
            this.f303339bt = null;
            ((C106171l) this.f303247aG.mo56107c()).mo95343g(1, this.f303441f, new C108810en(this, runnable), this.f303456u);
            return;
        }
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo97417E(boolean z) {
        C113916t tVar = this.f303320ba;
        C58976aa aaVar = C58975e.f156826a;
        C89849ae aeVar = C89849ae.OPA_ENDSTATE_CANCEL_3P_EXIT;
        C58836b bVar = C58836b.f156633a;
        tVar.mo100764h(aeVar, bVar, bVar, bVar);
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "ui.TAP_EXIT_THIRD_PARTY";
        C51805du duVar2 = (C51805du) dsVar.build();
        if (z) {
            mo97544q();
        }
        mo97441aC(duVar2.toByteArray());
        this.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        if (this.f303455t.mo79746e(C90014bt.f247784ng)) {
            mo97413A();
        }
    }

    /* renamed from: F */
    public final void mo97418F() {
        if (this.f303234T.mo95358d() != 3) {
            mo97498bH(false, true, false, 2);
        }
    }

    /* renamed from: G */
    public final void mo97419G(boolean z) {
        View view = this.f303221G;
        if (view != null) {
            view.setVisibility(0);
        }
        mo97498bH(false, true, false, 14);
        mo97506bP(5);
        if (z) {
            this.f303323bd.mo97611c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo97420H(String str) {
        Intent x = C87566i.m142325x(str);
        C109065gb gbVar = this.f303456u;
        x.getClass();
        gbVar.mo65090b(x, new OpaResultCallback(0, Bundle.EMPTY));
    }

    /* renamed from: I */
    public final void mo97421I(ClientEventData clientEventData, boolean z, boolean z2) {
        if (!z) {
            mo97462aX(1);
        }
        this.f303454s.mo96219b(clientEventData);
        if (z2) {
            mo97452aN(false);
            this.f303450o.mo95377S();
        }
    }

    /* renamed from: J */
    public final void mo97422J(C83572ac acVar) {
        if (this.f303238X.mo96131aD()) {
            this.f303238X.mo96151ac(false);
        }
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C109026ey eyVar = C109026ey.UNINITIALIZED;
        C83572ac acVar2 = C83572ac.UNINITIALIZED;
        C113984c cVar = C113984c.UNKNOWN;
        C108228az azVar = C108228az.UNINITIALIZED;
        int ordinal = acVar.ordinal();
        if (ordinal == 3) {
            mo97455aQ();
        } else if (ordinal != 4) {
            mo97456aR();
        } else {
            mo97458aT();
        }
    }

    /* renamed from: K */
    public final void mo97423K(String str, String str2, String str3, String str4, C58833ax axVar, Bundle bundle) {
        Bundle g = mo97535g();
        g.putAll(bundle);
        boolean z = ((Boolean) ((C58847bk) axVar).f156646a).booleanValue() && m181379cA();
        C90498f i = this.f303425dl.mo84268aE(str2, false).mo84480i();
        i.f252965C |= !TextUtils.equals(i.f252976N, str3);
        i.f252976N = str3;
        Query bc = i.mo84568a().mo84245H(0, z, (QueryTriggerType) null).mo84264aA(this.f303393cy.f315214a, g).mo84344bc(str4);
        if (!z) {
            mo97462aX(1);
        }
        mo97426N(str, bc);
        m181394ck();
    }

    /* renamed from: L */
    public final void mo97424L(C52533vg vgVar) {
        C51016dg dgVar;
        C51016dg dgVar2;
        if (vgVar.f137893b == 2) {
            dgVar = (C51016dg) vgVar.f137894c;
        } else {
            dgVar = C51016dg.f132827g;
        }
        if ((dgVar.f132829a & 1) != 0) {
            if (vgVar.f137893b == 2) {
                dgVar2 = (C51016dg) vgVar.f137894c;
            } else {
                dgVar2 = C51016dg.f132827g;
            }
            mo97443aE(dgVar2);
        } else if (vgVar.f137893b == 3) {
            mo97454aP((String) vgVar.f137894c);
        } else {
            C59104x c = f303210a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ChatUiController");
            ((C59052c) ((C59052c) c).mo56372aa(22645)).mo56389s("Unsupported 3P Link %s", vgVar.f137895d);
        }
    }

    /* renamed from: M */
    public final void mo97425M() {
        this.f303450o.mo95393ad();
    }

    /* renamed from: N */
    public final void mo97426N(String str, Query query) {
        this.f303450o.mo95387aC();
        mo97543p(str, true, true);
        mo97439aA();
        Query aH = m181374bY(m181375bZ(m181373bX(query))).mo84271aH(C90719ac.f253778a.f253779b.nextLong());
        this.f303320ba.mo100766j(aH);
        this.f303454s.mo96218a(aH);
        this.f303238X.mo96142aO();
        mo97415C();
    }

    /* renamed from: O */
    public final void mo97427O() {
        int i = this.f303368cZ;
        if (i == 8) {
            this.f303238X.mo96115N(true);
            if (this.f303455t.mo79746e(C90037cp.f248429aJ)) {
                this.f303238X.mo96160al();
            }
        } else if (i == 2 || i == 5 || (!this.f303365cW && !this.f303366cX && i == 0)) {
            mo97503bM();
        } else if (i == 3) {
            this.f303238X.mo96115N(true);
            m181395cl();
        } else if (i == 1) {
            m181402cs();
            m181395cl();
        } else if (i == 7) {
            Optional o = this.f303238X.mo96186o();
            if (o.isPresent()) {
                ((C2332ag) o.get()).mo5708l(k.b);
            }
            m181402cs();
            mo97503bM();
        } else if (mo97517bi()) {
            mo97459aU();
        }
    }

    /* renamed from: P */
    public final void mo97428P() {
        int f = this.f303414da.mo17670f();
        C58976aa aaVar = C58975e.f156826a;
        if (f == 1) {
            Toast.makeText(this.f303346c, mo97534f().getText(R.string.opa_enable_screenshot_setting_prompt), 0).show();
            this.f303456u.mo65089a(new Intent("android.settings.VOICE_INPUT_SETTINGS"));
            mo97451aM(mo97534f().getText(R.string.opa_share_screenshot_setting_disabled), false);
        } else if (f == 2) {
            mo97451aM(mo97534f().getText(R.string.opa_contextual_cards_share_screenshot_error), false);
        } else {
            this.f303456u.mo65089a(this.f303412dQ.mo17671a());
        }
    }

    /* renamed from: Q */
    public final void mo97429Q() {
        this.f303331bl.mo101361a();
    }

    /* renamed from: R */
    public final void mo97430R() {
        mo97416D(new C106375am(this));
    }

    /* renamed from: S */
    public final void mo97431S(boolean z) {
        if (m181378bx(this.f303450o)) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100844bC(z);
        }
    }

    /* renamed from: T */
    public final void mo97432T(boolean z) {
        ChatUiHelpController chatUiHelpController = this.f303460y;
        if (chatUiHelpController != null && chatUiHelpController.f304448i.f137376e) {
            return;
        }
        if (mo97524bq()) {
            ((C106171l) this.f303247aG.mo56107c()).mo95343g(1, this.f303441f, new C108809em(this, z), this.f303456u);
        } else {
            mo97433U(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo97433U(boolean z) {
        if (this.f303268ab.mo56113h()) {
            C109245s j = C109246t.m181811j();
            j.mo97671b(z);
            ((C109212a) this.f303268ab.mo56107c()).mo97674c(j.mo97670a());
        }
    }

    /* renamed from: V */
    public final void mo97434V() {
        this.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        if (mo97530by()) {
            if (this.f303364cV == C109026ey.UNINITIALIZED) {
                ((C113990i) ((C113988g) this.f303450o).mo100834bg().mo56107c()).mo100918cJ();
            } else {
                ((C113990i) ((C113988g) this.f303450o).mo100834bg().mo56107c()).mo100917cI();
            }
        }
        C107698i iVar = this.f303454s;
        C88489j jVar = new C88489j(C87739bu.OPA_DISPLAY_CONTEXT_UPDATED);
        C62940bt btVar = C88105pi.f238198a;
        C88106pj pjVar = (C88106pj) C88107pk.f238199h.createBuilder();
        pjVar.copyOnWrite();
        C88107pk pkVar = (C88107pk) pjVar.instance;
        pkVar.f238201a |= 8;
        pkVar.f238205e = true;
        jVar.mo82014b(btVar, (C88107pk) pjVar.build());
        iVar.mo96219b(jVar.mo82013a());
        if (this.f303324be.mo95321b()) {
            this.f303324be.mo95320a();
            mo97453aO();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final void mo97435W(C19624b bVar, C19628b bVar2) {
        ((C113798bn) this.f303258aR.mo27525b()).mo24921c(bVar, bVar2);
    }

    /* renamed from: X */
    public final void mo97436X(boolean z) {
        if (z) {
            ((C113798bn) this.f303258aR.mo27525b()).mo24921c(new C19623a(2), (C19628b) null);
            return;
        }
        ViewGroup g = this.f303450o.mo95418g();
        if (g != null) {
            g.getViewTreeObserver().addOnGlobalLayoutListener(new C108527dd(this, g));
        }
    }

    /* renamed from: Y */
    public final void mo97437Y() {
        int a;
        C109268ic icVar = this.f303351cE;
        if (icVar != null && this.f303367cY) {
            C50870f fVar = this.f303289aw;
            if (fVar == null || !((a = C50869e.m85974a(fVar.f132452e)) == 0 || a == 2)) {
                C58976aa aaVar = C58975e.f156826a;
                icVar.f304389e = false;
                C109268ic icVar2 = this.f303351cE;
                icVar2.getClass();
                if (!icVar2.f304389e && icVar2.f304387c.mo17583e()) {
                    icVar2.f304390f = new ArrayList();
                    if (icVar2.f304385a.mo79746e(C90014bt.f247304ed) && icVar2.f304387c.mo17583e() && !icVar2.f304389e) {
                        icVar2.f304390f.add(((C108250bu) icVar2.f304388d.mo27525b()).mo96700a(C108248bs.f301110b, new Object[0]));
                    }
                    C109270ie ieVar = icVar2.f304386b;
                    ieVar.f304397a.mo95361C(icVar2.f304390f);
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo97438Z() {
        int a;
        if (this.f303455t.mo79746e(C90014bt.f247687lp)) {
            C50870f fVar = this.f303289aw;
            if (fVar == null || !((a = C50869e.m85974a(fVar.f132452e)) == 0 || a == 2)) {
                this.f303450o.mo95361C(Arrays.asList(new C108430ik[]{((C108250bu) this.f303321bb.mo27525b()).mo96700a(C108248bs.WHAT_CAN_YOU_DO, new Object[0])}));
            }
        }
    }

    /* renamed from: aA */
    public final void mo97439aA() {
        this.f303454s.mo96219b(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aB */
    public final void mo97440aB() {
        int i;
        if (!this.f303341bv && this.f303340bu != null) {
            C106163d dVar = this.f303417dd;
            if (dVar.f296285a.mo26870b() < dVar.f296287c + ((long) ((int) dVar.f296286b.mo79743a(C90014bt.f247397gQ)))) {
                i = dVar.f296288d + 1;
                dVar.f296288d = i;
            } else {
                dVar.f296287c = dVar.f296285a.mo26870b();
                dVar.f296288d = 1;
                i = 1;
            }
            if (((long) i) <= dVar.f296286b.mo79743a(C90014bt.f247398gR)) {
                C58976aa aaVar = C58975e.f156826a;
                mo97543p(BuildConfig.FLAVOR, false, true);
                Query F = C87566i.m142231F(this.f303442g);
                if (F == null) {
                    Bundle bundle = this.f303442g;
                    F = bundle != null ? (Query) bundle.getParcelable("opa-pending-lockscreen-query") : null;
                }
                if (F == null || !this.f303455t.mo79746e(C90014bt.f247083aU)) {
                    C109324jo joVar = (C109324jo) this.f303430dq.mo27525b();
                    byte[] bArr = this.f303340bu;
                    if (!joVar.f304535b.mo79746e(C90126fx.f251307gO) || !((C58833ax) joVar.f304537d.mo27525b()).mo56113h() || !((C74713bn) ((C58833ax) joVar.f304538e.mo27525b()).mo56107c()).mo71078c()) {
                        bArr.getClass();
                        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
                        C63088z A = C63088z.m96139A(bArr);
                        oxVar.copyOnWrite();
                        C88094oy oyVar = (C88094oy) oxVar.instance;
                        oyVar.f238176a |= 1;
                        oyVar.f238177b = A;
                        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
                        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
                        ((C107698i) joVar.f304539f.mo27525b()).mo96219b(jVar.mo82013a());
                    } else {
                        C80501d dVar2 = C80501d.LOCKED_SCREEN;
                        bArr.getClass();
                        try {
                            C62921ba a = C62921ba.m95368a();
                            C51805du duVar = C51805du.f135924e;
                            C80499b bVar = (C80499b) C80502e.f220990d.createBuilder();
                            bVar.copyOnWrite();
                            C80502e eVar = (C80502e) bVar.instance;
                            eVar.f220994c = dVar2.f220989h;
                            eVar.f220992a |= 4;
                            ((C107759j) joVar.f304536c.mo27525b()).mo96268d((C51805du) C62942bv.parseFrom((C62942bv) duVar, bArr, a), (C80502e) bVar.build());
                        } catch (C62974ct e) {
                            C59104x c = C109324jo.f304534a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "LockscreenQueryInjector");
                            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(22852)).mo56386p("Failed to parse ClientInput clientOp.");
                        }
                    }
                } else {
                    this.f303454s.mo96218a(F);
                }
            }
        }
        this.f303340bu = null;
        this.f303394cz.f296315b = true;
    }

    /* renamed from: aC */
    public final void mo97441aC(byte[] bArr) {
        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        oxVar.copyOnWrite();
        C88094oy oyVar = (C88094oy) oxVar.instance;
        oyVar.f238176a |= 1;
        oyVar.f238177b = A;
        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
        this.f303454s.mo96219b(jVar.mo82013a());
    }

    /* renamed from: aD */
    public final void mo97442aD(C107467af afVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_UI_RENDERING_STATUS;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107463ab.f299041a, afVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f303454s.mo96219b(jVar.mo82013a());
    }

    /* renamed from: aE */
    public final void mo97443aE(C51016dg dgVar) {
        C51803ds dsVar = (C51803ds) C109459e.m182156a(dgVar.f132830b).toBuilder();
        if ((dgVar.f132829a & 8) != 0) {
            C51805du duVar = dgVar.f132833e;
            if (duVar == null) {
                duVar = C51805du.f135924e;
            }
            java.util.Map unmodifiableMap = Collections.unmodifiableMap(duVar.f135929d);
            dsVar.copyOnWrite();
            ((C51805du) dsVar.instance).mo53730a().putAll(unmodifiableMap);
        }
        mo97441aC(((C51805du) dsVar.build()).toByteArray());
    }

    /* renamed from: aF */
    public final void mo97444aF(String str) {
        if (this.f303455t.mo79746e(C90014bt.f247609kQ) && m181378bx(this.f303450o)) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100894cp(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aG */
    public final void mo97445aG(C108237bh bhVar) {
        this.f303450o.mo95391ab(bhVar);
        this.f303238X.mo96126Y(bhVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r6 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r6 != false) goto L_0x002c;
     */
    /* renamed from: aH */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97446aH(boolean r6, boolean r7) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r5.f303450o
            boolean r0 = r0 instanceof com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g
            if (r0 != 0) goto L_0x0009
            if (r6 != 0) goto L_0x0053
            goto L_0x0057
        L_0x0009:
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r5.f303238X
            boolean r0 = r0.mo96131aD()
            if (r0 == 0) goto L_0x0019
            if (r6 == 0) goto L_0x0057
            com.google.android.apps.gsa.staticplugins.opa.ay.as r6 = r5.f303238X
            r6.mo96154af()
            goto L_0x002c
        L_0x0019:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r5.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            r0.mo100880cQ(r6)
            if (r6 == 0) goto L_0x0057
        L_0x002c:
            dagger.a r6 = r5.f303401dF
            java.lang.Object r6 = r6.mo27525b()
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6
            boolean r6 = r6.mo56113h()
            if (r6 == 0) goto L_0x0053
            dagger.a r6 = r5.f303401dF
            java.lang.Object r6 = r6.mo27525b()
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.apps.gsa.nga.shared.h.a.dm r6 = (com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81164dm) r6
            com.google.android.apps.gsa.search.core.i.t r0 = r5.f303455t
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251592li
            java.lang.String r0 = r0.mo79758x(r1)
            r6.mo74931b(r0)
        L_0x0053:
            r5.mo97447aI(r7)
            return
        L_0x0057:
            r6 = 0
            boolean r0 = r5.mo97493bC(r6)
            if (r0 == 0) goto L_0x0064
            com.google.android.apps.gsa.opa.ac r6 = com.google.android.apps.gsa.opa.C83572ac.OOBE
            r5.mo97448aJ(r6, r7)
            return
        L_0x0064:
            r0 = 2
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r0]
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248940G
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0126
            dagger.a r1 = r5.f303405dJ
            java.lang.Object r1 = r1.mo27525b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0126
            boolean r1 = r5.f303333bn
            if (r1 == 0) goto L_0x0085
            goto L_0x0126
        L_0x0085:
            com.google.android.apps.gsa.staticplugins.opa.ac.r r1 = r5.f303262aV
            boolean r1 = r1.mo95240v()
            if (r1 != 0) goto L_0x011d
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248599dq
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0099
            goto L_0x011d
        L_0x0099:
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248438aS
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x00b5
            com.google.android.apps.gsa.staticplugins.opa.chathead.a r1 = r5.f303329bj
            boolean r1 = r1.mo96476i()
            if (r1 != 0) goto L_0x00b5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x012e
        L_0x00b5:
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248437aR
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x00d0
            com.google.android.apps.gsa.assistant.settings.shared.ai r1 = r5.f303429dp
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x00d0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x012e
        L_0x00d0:
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r1 = r5.f303323bd
            boolean r1 = r1.mo97613e()
            if (r1 != 0) goto L_0x0114
            boolean r1 = r5.m181381cC(r6)
            if (r1 != 0) goto L_0x0114
            boolean r1 = r5.f303424dk
            if (r1 != 0) goto L_0x0114
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f303455t
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247689lr
            long r1 = r1.mo79743a(r2)
            int r2 = (int) r1
            if (r2 == 0) goto L_0x0114
            com.google.android.apps.gsa.staticplugins.opa.af.x r1 = r5.f303324be
            android.os.Bundle r2 = r5.f303442g
            boolean r1 = r1.mo95323d(r2)
            if (r1 != 0) goto L_0x0114
            dagger.a r1 = r5.f303405dJ
            java.lang.Object r1 = r1.mo27525b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.assistant.settings.features.ad.a.ae r1 = (com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae) r1
            com.google.common.util.concurrent.cx r1 = r1.mo18041a()
            com.google.android.libraries.gsa.k.g r2 = r5.f303415db
            java.lang.String r3 = "ChatUiController.aolIsStandby"
            com.google.android.apps.gsa.staticplugins.opa.az r4 = com.google.android.apps.gsa.staticplugins.opa.C107689az.f299688a
            com.google.common.util.concurrent.cx r1 = r2.mo28209i(r1, r3, r4)
            goto L_0x012e
        L_0x0114:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x012e
        L_0x011d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x012e
        L_0x0126:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x012e:
            r0[r6] = r1
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248599dq
            boolean r1 = r1.mo79746e(r2)
            r2 = 1
            if (r1 == 0) goto L_0x0146
            r5.f303335bp = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x0163
        L_0x0146:
            com.google.android.apps.gsa.search.core.i.t r1 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248947N
            boolean r1 = r1.mo79746e(r3)
            if (r1 == 0) goto L_0x0159
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x0163
        L_0x0159:
            r5.f303335bp = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
        L_0x0163:
            r0[r2] = r6
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92907p(r0)
            com.google.android.libraries.gsa.k.g r0 = r5.f303448m
            com.google.android.apps.gsa.staticplugins.opa.ar r1 = new com.google.android.apps.gsa.staticplugins.opa.ar
            r1.<init>(r5, r7)
            com.google.android.apps.gsa.shared.util.c.ag r2 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r3 = "ChatUiController.persistentFinishSetupBarFutures"
            r2.<init>(r6, r0, r3, r1)
            com.google.android.apps.gsa.staticplugins.opa.as r6 = new com.google.android.apps.gsa.staticplugins.opa.as
            r6.<init>(r5, r7)
            r2.mo85223a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109040fj.mo97446aH(boolean, boolean):void");
    }

    /* renamed from: aI */
    public final void mo97447aI(boolean z) {
        if (this.f303455t.mo79743a(C90014bt.f247689lr) == 2 && m181378bx(this.f303450o) && ((C113793bi) this.f303325bf.mo27525b()).f315157c.mo3842a() == C113792bh.SHOWN) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100877cN(false, z);
            return;
        }
        LinearLayout linearLayout = this.f303226L;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            mo97473ai(0);
            if (this.f303370cb && m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100901dB(((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100835aH());
            }
        }
    }

    /* renamed from: aJ */
    public final void mo97448aJ(C83572ac acVar, boolean z) {
        if (this.f303259aS && !this.f303455t.mo79746e(C90014bt.f247676le)) {
            return;
        }
        if (((int) this.f303455t.mo79743a(C90014bt.f247689lr)) != 2) {
            LinearLayout linearLayout = this.f303226L;
            if (linearLayout == null || this.f303332bm != acVar) {
                if (linearLayout == null) {
                    this.f303226L = (LinearLayout) this.f303357cO.inflate();
                    if (mo97528bv()) {
                        this.f303226L.setBackgroundResource(R.drawable.opa_rounded_corner_finish_setup_bar_background);
                        LinearLayout linearLayout2 = this.f303226L;
                        linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), 0, this.f303226L.getPaddingEnd(), 0);
                    }
                    this.f303226L.setVisibility(8);
                }
                TextView textView = (TextView) this.f303226L.findViewById(R.id.finish_setup_bar_description);
                TextView textView2 = (TextView) this.f303226L.findViewById(R.id.finish_setup_bar_button);
                if (acVar == C83572ac.OOBE) {
                    if (this.f303329bj.mo96478k()) {
                        this.f303329bj.mo96470c();
                    }
                    LinearLayout linearLayout3 = this.f303226L;
                    C28292j jVar = new C28292j(44770);
                    jVar.mo33795i(5);
                    C28295m.m52919e(linearLayout3, jVar);
                    C89949q.m146521e(C28285c.m52874a(this.f303226L, 1156), false);
                    LinearLayout linearLayout4 = this.f303226L;
                    linearLayout4.getClass();
                    linearLayout4.setOnClickListener(new C89943l(new C108103bo(this)));
                    if (!this.f303455t.mo79746e(C90044cw.f248748w)) {
                        if (textView != null) {
                            textView.setText(((C73841bf) this.f303395d.mo27525b()).mo65322a().getString(R.string.opa_persistent_finish_setup_bar_description));
                        }
                        if (textView2 != null) {
                            textView2.setText(((C73841bf) this.f303395d.mo27525b()).mo65322a().getString(R.string.opa_persistent_finish_setup_bar_button));
                        }
                    }
                } else if (acVar == C83572ac.AOL) {
                    this.f303226L.setOnClickListener(new C108105bq(this));
                } else if (acVar == C83572ac.TMF) {
                    if (textView != null) {
                        textView.setText(mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description_tmf));
                    }
                    this.f303226L.setOnClickListener(new C108106br(this));
                }
                this.f303332bm = acVar;
            }
            this.f303226L.setVisibility(0);
            if (this.f303370cb && m181378bx(this.f303450o) && !mo97528bv()) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100901dB(((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100835aH() - this.f303226L.getHeight());
            }
            this.f303226L.getViewTreeObserver().addOnGlobalLayoutListener(new C108787du(this));
        } else if (m181378bx(this.f303450o) && ((C113793bi) this.f303325bf.mo27525b()).f315157c.mo3842a() == C113792bh.SHOWN) {
            this.f303332bm = acVar;
            if (acVar == C83572ac.AOL) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100846bE(mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description_aol));
            }
            if (acVar == C83572ac.TMF) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100846bE(mo97534f().getString(R.string.opa_persistent_finish_setup_bar_description_tmf));
            }
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100877cN(true, z);
        }
    }

    /* renamed from: aK */
    public final void mo97449aK(int i) {
        if (this.f303254aN.mo56113h()) {
            ((C88522b) this.f303254aN.mo56107c()).mo82144f(i);
            return;
        }
        Window window = this.f303356cN;
        if (window != null) {
            window.setStatusBarColor(i);
        }
    }

    /* renamed from: aL */
    public final void mo97450aL(boolean z) {
        View findViewById = this.f303450o.mo95419h().findViewById(R.id.opa_main_view_inner);
        int i = true != z ? 8 : 0;
        findViewById.setVisibility(i);
        this.f303230P.setVisibility(i);
    }

    /* renamed from: aM */
    public final void mo97451aM(CharSequence charSequence, boolean z) {
        if (charSequence != null && charSequence.length() > 0) {
            C108262cf cfVar = new C108262cf();
            cfVar.f301174d = charSequence;
            cfVar.f301163D = z;
            this.f303450o.mo95430s(cfVar);
            this.f303450o.mo95411av();
            mo97490az(false);
            this.f303238X.mo96151ac(false);
            this.f303238X.mo96198z(e.c);
        }
    }

    /* renamed from: aN */
    public final void mo97452aN(boolean z) {
        C108262cf cfVar = new C108262cf(3, 4);
        C50870f fVar = this.f303289aw;
        if (fVar != null) {
            cfVar.f301045a = fVar.f132450c;
            cfVar.f301046b = (C91189au) this.f303288av.mo27525b();
        }
        cfVar.f301163D = z;
        if (!this.f303450o.mo95403an(cfVar)) {
            if (m181409cz() && z) {
                if (m181378bx(this.f303450o)) {
                    ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100864bq();
                }
                cfVar.f301163D = false;
                m181386cc();
            }
            this.f303450o.mo95430s(cfVar);
            this.f303450o.mo95411av();
        }
    }

    /* renamed from: aO */
    public final void mo97453aO() {
        View findViewById = this.f303450o.mo95419h().findViewById(R.id.valyrian_container);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    /* renamed from: aP */
    public final void mo97454aP(String str) {
        if (str.contains("assistant.google.com/services/a/")) {
            this.f303456u.mo65090b(this.f303358cP.d(str), new C91095e());
        } else {
            this.f303456u.mo65090b(C87566i.m142325x(str), new C91095e());
        }
    }

    /* renamed from: aQ */
    public final void mo97455aQ() {
        mo97461aW();
        this.f303333bn = true;
        mo97447aI(true);
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "lockscreen_consent";
        c.mo24023e("assistant_oobe");
        this.f303456u.mo65090b(c.mo24020b().mo24031a(), new C91095e());
    }

    /* renamed from: aR */
    public final void mo97456aR() {
        com.google.android.apps.gsa.assistant.shared.l.e eVar;
        this.f303459x.mo98098e();
        this.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        if (!this.f303455t.mo79746e(C90037cp.f248447ab) || !this.f303396dA.mo56113h()) {
            Intent intent = new Intent();
            intent.setPackage(this.f303441f.getPackageName());
            boolean z = true;
            intent.putExtra("opa_exit_signed_out_mode_and_relaunch", true);
            if (!this.f303455t.mo79746e(C90053de.f248941H)) {
                if (this.f303390cv != 2) {
                    z = false;
                }
                intent.putExtra("opa_start_zero_state", z);
            }
            if (this.f303298bE) {
                eVar = com.google.android.apps.gsa.assistant.shared.l.e.aE;
            } else {
                eVar = com.google.android.apps.gsa.assistant.shared.l.e.aD;
            }
            if (this.f303238X.mo96131aD()) {
                eVar = com.google.android.apps.gsa.assistant.shared.l.e.aC;
            }
            intent.putExtra("triggered_by", eVar.ca);
            this.f303456u.mo65089a(intent);
            return;
        }
        new C90873ag(((C108098d) this.f303396dA.mo56107c()).mo96434a(), this.f303448m, "ChatUiController.getTngOobeIntent", new C106175ai(this)).mo85223a(C107557at.f299215a);
    }

    /* renamed from: aS */
    public final void mo97457aS() {
        this.f303302bI = true;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f303302bI && this.f303301bH) {
            this.f303448m.mo28213m("showWarmerWelcomeAfterQueryComplete", this.f303455t.mo79743a(C90053de.f248953T), new C108089bj(this));
        }
    }

    /* renamed from: aT */
    public final void mo97458aT() {
        mo97461aW();
        this.f303336bq = true;
        mo97447aI(true);
        C113855cj k = C113858cm.m188476k();
        ((C113890u) k).f315322a = "tell my family";
        k.mo100706d(QueryTriggerType.OPA_TEXT_EDITOR);
        mo97548u(k.mo100703a());
    }

    /* renamed from: aU */
    public final void mo97459aU() {
        if (this.f303353cK != null) {
            this.f303238X.mo96115N(false);
            this.f303454s.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
            this.f303341bv = true;
            this.f303238X.mo96113L();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aV */
    public final void mo97460aV() {
        C109268ic icVar = this.f303351cE;
        if (icVar != null) {
            icVar.mo97734a();
        }
    }

    /* renamed from: aW */
    public final void mo97461aW() {
        this.f303454s.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
    }

    /* renamed from: aX */
    public final void mo97462aX(int i) {
        if (this.f303238X.mo96139aL(i)) {
            this.f303238X.mo96163ao(i);
            this.f303450o.mo95365G();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06e7, code lost:
        if (r1.f303455t.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90014bt.f247247dZ) != false) goto L_0x06e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r10 == com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142317p(r1.f303442g)) goto L_0x007e;
     */
    /* renamed from: aY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97463aY(com.google.android.apps.gsa.staticplugins.opa.C109026ey r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "ChatUiController"
            com.google.android.apps.gsa.staticplugins.opa.ey r3 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.UNINITIALIZED
            if (r0 != r3) goto L_0x000d
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x000d:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.ey r3 = r1.f303275ai
            if (r3 != r0) goto L_0x0014
            return
        L_0x0014:
            com.google.android.apps.gsa.staticplugins.opa.ey r3 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTING
            r4 = 0
            r5 = 1
            if (r0 != r3) goto L_0x0024
            android.os.Bundle r3 = r1.f303442g
            boolean r3 = r1.mo97491bA(r3)
            if (r3 == 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTING
            r7 = 3
            r8 = 0
            if (r0 != r6) goto L_0x00cd
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = r1.f303364cV
            com.google.android.apps.gsa.staticplugins.opa.ey r10 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_CONVERSATION
            if (r6 == r10) goto L_0x0036
            com.google.android.apps.gsa.staticplugins.opa.ey r10 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTED
            if (r6 != r10) goto L_0x00cd
        L_0x0036:
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247393gM
            boolean r6 = r6.mo79746e(r10)
            if (r6 != 0) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            android.os.Bundle r6 = r1.f303442g
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r6)
            if (r6 == 0) goto L_0x007e
            boolean r6 = r16.mo97519bk()
            if (r6 == 0) goto L_0x007e
            com.google.common.base.ax r6 = r1.f303247aG
            java.lang.Object r6 = r6.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ah.l r6 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r6
            boolean r6 = r6.mo95342f()
            if (r6 != 0) goto L_0x007e
            android.os.Bundle r6 = r1.f303442g
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142283ag(r6)
            if (r6 == 0) goto L_0x00cd
            android.os.Bundle r6 = r1.f303442g
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r6)
            if (r6 != 0) goto L_0x006e
            goto L_0x00cd
        L_0x006e:
            long r10 = r1.f303435dv
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x00cd
            android.os.Bundle r6 = r1.f303442g
            long r12 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142317p(r6)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x00cd
        L_0x007e:
            int r0 = r1.f303368cZ
            if (r0 != r5) goto L_0x0086
            r16.m181402cs()
            goto L_0x00c5
        L_0x0086:
            if (r3 == 0) goto L_0x0091
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r1.f303238X
            r0.mo96115N(r5)
            r16.mo97434V()
            goto L_0x00c5
        L_0x0091:
            com.google.android.apps.gsa.staticplugins.opa.oe r0 = r1.f303459x
            boolean r0 = r0.mo98101h()
            if (r0 != 0) goto L_0x00bb
            int r0 = r1.f303368cZ
            if (r0 != r7) goto L_0x00a3
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r1.f303238X
            r0.mo96115N(r5)
            goto L_0x00c5
        L_0x00a3:
            boolean r0 = r16.mo97524bq()
            if (r0 == 0) goto L_0x00b7
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247232dK
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x00b7
            r16.mo97427O()
            goto L_0x00c5
        L_0x00b7:
            r16.mo97503bM()
            goto L_0x00c5
        L_0x00bb:
            com.google.android.apps.gsa.staticplugins.opa.oe r0 = r1.f303459x
            int r2 = r1.f303368cZ
            if (r2 == r5) goto L_0x00c2
            r4 = 1
        L_0x00c2:
            r0.mo98099f(r4)
        L_0x00c5:
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = r1.f303364cV
            r1.f303275ai = r0
            r16.m181397cn()
            return
        L_0x00cd:
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTED
            if (r0 != r6) goto L_0x0101
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = r1.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r10 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_HIDDEN
            if (r6 != r10) goto L_0x0101
            com.google.android.apps.gsa.staticplugins.opa.oe r6 = r1.f303459x
            boolean r6 = r6.mo98101h()
            if (r6 == 0) goto L_0x00fe
            com.google.android.apps.gsa.staticplugins.opa.az.i r6 = r1.f303454s
            com.google.android.apps.gsa.search.shared.service.j r10 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.STOP_SPEAKING
            r10.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r11)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r10 = r10.mo82013a()
            r6.mo96219b(r10)
            r16.mo97459aU()
            com.google.android.apps.gsa.staticplugins.opa.oe r6 = r1.f303459x
            int r10 = r1.f303368cZ
            if (r10 == r5) goto L_0x00fa
            r10 = 1
            goto L_0x00fb
        L_0x00fa:
            r10 = 0
        L_0x00fb:
            r6.mo98099f(r10)
        L_0x00fe:
            r16.m181396cm()
        L_0x0101:
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_CONVERSATION
            r10 = 2
            if (r0 != r6) goto L_0x0119
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = r1.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r11 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_HIDDEN
            if (r6 != r11) goto L_0x0119
            int r6 = r1.f303368cZ
            if (r6 == r10) goto L_0x0113
            r11 = 5
            if (r6 != r11) goto L_0x0116
        L_0x0113:
            r16.mo97503bM()
        L_0x0116:
            r16.m181396cm()
        L_0x0119:
            boolean r6 = r1.f303370cb
            if (r6 == 0) goto L_0x014e
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = r1.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r11 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_HIDDEN
            if (r6 == r11) goto L_0x0127
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTING
            if (r0 != r6) goto L_0x014e
        L_0x0127:
            android.os.Bundle r6 = r1.f303442g
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142299aw(r6)
            if (r6 == 0) goto L_0x014e
            android.os.Bundle r6 = r1.f303442g
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142264aL(r6)
            if (r6 != 0) goto L_0x014e
            com.google.android.apps.gsa.staticplugins.opa.af.x r6 = r1.f303324be
            android.os.Bundle r11 = r1.f303442g
            boolean r6 = r6.mo95323d(r11)
            if (r6 != 0) goto L_0x014e
            dagger.a r6 = r1.f303325bf
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bi r6 = (com.google.android.apps.gsa.staticplugins.opa.util.C113793bi) r6
            android.view.ViewGroup r11 = r1.f303449n
            r6.mo100642b(r11)
        L_0x014e:
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_CONVERSATION
            if (r0 != r6) goto L_0x0162
            com.google.android.apps.gsa.staticplugins.opa.af.x r6 = r1.f303324be
            boolean r6 = r6.mo95321b()
            if (r6 == 0) goto L_0x0162
            com.google.android.apps.gsa.staticplugins.opa.af.x r6 = r1.f303324be
            r6.mo95320a()
            r16.mo97453aO()
        L_0x0162:
            com.google.android.apps.gsa.staticplugins.opa.ey r6 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTING
            r11 = 4
            if (r0 != r6) goto L_0x06fc
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            r0.mo95374P()
            boolean r0 = r16.mo97522bo()
            if (r0 != 0) goto L_0x0180
            boolean r0 = r1.f303242aB
            boolean r6 = r1.f303243aC
            if (r5 == r6) goto L_0x017b
            r6 = 10
            goto L_0x017d
        L_0x017b:
            r6 = 11
        L_0x017d:
            r1.mo97499bI(r0, r6)
        L_0x0180:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188691b(r0)
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r1.f303242aB
            if (r0 != 0) goto L_0x01b1
            boolean r0 = r16.mo97519bk()
            if (r0 != 0) goto L_0x01b1
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.af r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107467af.f299043c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.ac r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107464ac) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.af r6 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107467af) r6
            r6.f299046b = r5
            int r12 = r6.f299045a
            r12 = r12 | r5
            r6.f299045a = r12
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.af r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107467af) r0
            r1.mo97442aD(r0)
        L_0x01b1:
            boolean r0 = r1.f303242aB
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r1.f303294bA
            if (r0 == 0) goto L_0x01d2
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247131bP
            boolean r0 = r0.mo79746e(r6)
            if (r0 == 0) goto L_0x01d2
            android.animation.AnimatorSet r0 = r16.m181368bS()
            com.google.android.apps.gsa.staticplugins.opa.dc r6 = new com.google.android.apps.gsa.staticplugins.opa.dc
            r6.<init>(r1)
            r0.addListener(r6)
            r0.start()
        L_0x01d2:
            r1.f303292az = r4
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            r0.mo95435x()
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            r0.mo95407ar()
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            dagger.a r6 = r1.f303258aR
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bn r6 = (com.google.android.apps.gsa.staticplugins.opa.util.C113798bn) r6
            r6.mo24927i()
            r0.mo95407ar()
            android.view.ViewGroup r0 = r1.f303449n
            com.google.android.apps.gsa.staticplugins.opa.ak r6 = new com.google.android.apps.gsa.staticplugins.opa.ak
            r6.<init>(r1)
            r0.setOnClickListener(r6)
            android.view.View r0 = r1.f303220F
            if (r0 == 0) goto L_0x0204
            r0.setVisibility(r4)
            android.view.View r0 = r1.f303220F
            r0.setEnabled(r5)
        L_0x0204:
            com.google.android.apps.gsa.staticplugins.opa.ic r0 = r1.f303351cE
            if (r0 == 0) goto L_0x0213
            com.google.android.apps.gsa.assist.c.a.a r6 = r1.f303363cU
            boolean r6 = r6.mo17583e()
            if (r6 != 0) goto L_0x0213
            r0.mo97734a()
        L_0x0213:
            com.google.common.base.ax r0 = r1.f303431dr
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0225
            com.google.common.base.ax r0 = r1.f303431dr
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.jm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109322jm) r0
            r0.f304521g = r4
        L_0x0225:
            com.google.android.apps.gsa.staticplugins.opa.o.a r0 = r1.f303287au
            boolean r0 = r0.f305796a
            if (r0 != 0) goto L_0x0232
            com.google.android.apps.gsa.staticplugins.opa.ic r0 = r1.f303351cE
            if (r0 == 0) goto L_0x0232
            r0.mo97734a()
        L_0x0232:
            boolean r0 = r1.f303243aC
            if (r0 == 0) goto L_0x0289
            com.google.android.apps.gsa.opa.ak r0 = r1.f303253aM
            com.google.assistant.e.j.dy r0 = r0.mo76920a()
            if (r0 == 0) goto L_0x0289
            android.os.Bundle r6 = r1.f303442g
            boolean r6 = r1.mo97491bA(r6)
            if (r6 != 0) goto L_0x0289
            com.google.assistant.e.j.dw r0 = r0.f135938d     // Catch:{ ct -> 0x0276, a -> 0x0262 }
            if (r0 != 0) goto L_0x024c
            com.google.assistant.e.j.dw r0 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b     // Catch:{ ct -> 0x0276, a -> 0x0262 }
        L_0x024c:
            java.lang.String r6 = "third_party_start_indicator_args"
            com.google.assistant.e.j.e.ih r12 = com.google.assistant.p3897e.p3921j.p3926e.C52036ih.f136574g     // Catch:{ ct -> 0x0276, a -> 0x0262 }
            com.google.protobuf.eb r12 = r12.getParserForType()     // Catch:{ ct -> 0x0276, a -> 0x0262 }
            com.google.protobuf.MessageLite r0 = com.google.android.apps.gsa.staticplugins.opa.C109258hw.m181889b(r0, r6, r12)     // Catch:{ ct -> 0x0276, a -> 0x0262 }
            com.google.assistant.e.j.e.ih r0 = (com.google.assistant.p3897e.p3921j.p3926e.C52036ih) r0     // Catch:{ ct -> 0x0276, a -> 0x0262 }
            com.google.android.apps.gsa.staticplugins.opa.o r6 = r16.mo97537i()     // Catch:{ ct -> 0x0276, a -> 0x0262 }
            r6.mo98088t(r0, r4)     // Catch:{ ct -> 0x0276, a -> 0x0262 }
            goto L_0x0289
        L_0x0262:
            r0 = move-exception
            com.google.common.f.e r6 = f303210a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r12, r2)
            java.lang.String r2 = "Could not find argument"
            r12 = 22686(0x589e, float:3.179E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r12)).mo56386p(r2)
            goto L_0x0289
        L_0x0276:
            r0 = move-exception
            com.google.common.f.e r6 = f303210a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r12, r2)
            java.lang.String r2 = "Failed to parse ui.THIRD_PARTY_START_INDICATOR clientOp."
            r12 = 22685(0x589d, float:3.1788E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r12)).mo56386p(r2)
        L_0x0289:
            android.os.Bundle r0 = r1.f303442g
            long r12 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142317p(r0)
            r1.f303435dv = r12
            android.os.Bundle r0 = r1.f303442g
            android.os.Bundle r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142229D(r0)
            r2 = 8
            if (r0 != 0) goto L_0x0357
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247284eJ
            boolean r0 = r0.mo79746e(r6)
            if (r0 == 0) goto L_0x0357
            com.google.android.apps.gsa.staticplugins.opa.ia r0 = r1.f303403dH
            com.google.android.apps.gsa.search.core.i.t r6 = r0.f304373b
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247188cT
            boolean r6 = r6.mo79746e(r12)
            if (r6 != 0) goto L_0x02b3
            goto L_0x0357
        L_0x02b3:
            com.google.android.apps.gsa.search.shared.service.b.ae r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae.f237132p
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ad r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.android.apps.gsa.search.shared.service.b.ae r12 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r12
            int r13 = r12.f237134a
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r12.f237134a = r13
            r12.f237144k = r4
            if (r3 != 0) goto L_0x02d2
            boolean r12 = r0.mo97732c()
            if (r12 != 0) goto L_0x02d5
        L_0x02d2:
            r0.mo97731b(r6, r3)
        L_0x02d5:
            com.google.assistant.n.d.a.b r12 = com.google.assistant.p3980n.p3986d.p3987a.C53028b.f138990a
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.android.apps.gsa.search.shared.service.b.ae r13 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r13
            r12.getClass()
            r13.f237137d = r12
            int r12 = r13.f237134a
            r12 = r12 | r11
            r13.f237134a = r12
            com.google.common.base.ax r12 = r0.f304374c
            boolean r12 = r12.mo56113h()
            if (r12 == 0) goto L_0x031d
            com.google.common.base.ax r12 = r0.f304374c
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.oe r12 = (com.google.android.apps.gsa.staticplugins.opa.C109759oe) r12
            com.google.android.apps.gsa.search.core.i.t r12 = r12.f305812d
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247337fJ
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x031d
            com.google.common.base.ax r12 = r0.f304374c
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.oe r12 = (com.google.android.apps.gsa.staticplugins.opa.C109759oe) r12
            com.google.assistant.y.b.c r12 = com.google.assistant.p4008y.p4010b.C53621c.f140738c
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.android.apps.gsa.search.shared.service.b.ae r13 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r13
            r12.getClass()
            r13.f237138e = r12
            int r12 = r13.f237134a
            r12 = r12 | r2
            r13.f237134a = r12
        L_0x031d:
            com.google.android.apps.gsa.search.core.i.t r12 = r0.f304373b
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247461hb
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0354
            com.google.android.apps.gsa.search.core.i.t r12 = r0.f304373b
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247059X
            boolean r12 = r12.mo79746e(r13)
            if (r12 != 0) goto L_0x0354
            dagger.a r12 = r0.f304375d
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.aa.bf r12 = (com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf) r12
            com.google.common.util.concurrent.cx r12 = r12.mo95189b()
            com.google.android.libraries.gsa.k.g r13 = r0.f304376e
            com.google.android.apps.gsa.staticplugins.opa.hy r14 = new com.google.android.apps.gsa.staticplugins.opa.hy
            r14.<init>(r0, r6)
            com.google.android.apps.gsa.shared.util.c.ag r15 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r11 = "startClientSync"
            r15.<init>(r12, r13, r11, r14)
            com.google.android.apps.gsa.staticplugins.opa.hz r11 = new com.google.android.apps.gsa.staticplugins.opa.hz
            r11.<init>(r0, r6)
            r15.mo85223a(r11)
            goto L_0x0357
        L_0x0354:
            r0.mo97730a(r6)
        L_0x0357:
            dagger.a r0 = r1.f303325bf
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bi r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113793bi) r0
            android.view.ViewGroup r6 = r1.f303449n
            r0.mo100642b(r6)
            boolean r0 = r16.m181380cB()
            if (r0 == 0) goto L_0x0377
            com.google.android.apps.gsa.staticplugins.opa.samson.a.b.a r0 = r1.f303265aY
            r0.getClass()
            r0.mo98292d()
            r16.mo97427O()
            goto L_0x06f5
        L_0x0377:
            if (r3 == 0) goto L_0x03a9
            r16.m181387cd()
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r1.f303238X
            r0.mo96115N(r5)
            r16.m181395cl()
            r16.mo97437Y()
            dagger.a r0 = r1.f303252aL
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.ci r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113854ci) r0
            r2 = 4
            r0.mo100701b(r2)
            boolean r0 = r16.mo97526bt()
            if (r0 == 0) goto L_0x039f
            r16.mo97434V()
            goto L_0x06f5
        L_0x039f:
            com.google.android.apps.gsa.staticplugins.opa.bu r0 = new com.google.android.apps.gsa.staticplugins.opa.bu
            r0.<init>(r1)
            r1.mo97416D(r0)
            goto L_0x06f5
        L_0x03a9:
            android.os.Bundle r0 = r1.f303442g
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142269aQ(r0)
            if (r0 == 0) goto L_0x03c7
            android.os.Bundle r0 = r1.f303442g
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r0)
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.q
            if (r0 != r3) goto L_0x03c7
            r0 = 14
            r1.mo97498bH(r4, r5, r4, r0)
            r0 = 15
            r1.mo97506bP(r0)
            goto L_0x06f5
        L_0x03c7:
            com.google.android.apps.gsa.staticplugins.opa.af.x r0 = r1.f303324be
            android.os.Bundle r3 = r1.f303442g
            boolean r0 = r0.mo95323d(r3)
            if (r0 == 0) goto L_0x044a
            com.google.android.apps.gsa.staticplugins.opa.af.x r0 = r1.f303324be
            boolean r0 = r0.mo95322c()
            if (r0 == 0) goto L_0x03de
            r16.mo97427O()
            r0 = 0
            goto L_0x03e9
        L_0x03de:
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r1.f303238X
            r0.mo96196x()
            android.view.View r0 = r1.f303256aP
            r0.setVisibility(r2)
            r0 = 1
        L_0x03e9:
            r1.mo97498bH(r4, r0, r4, r10)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            android.view.ViewGroup r0 = r0.mo95419h()
            r3 = 2131436854(0x7f0b2536, float:1.849559E38)
            android.view.View r0 = r0.findViewById(r3)
            if (r0 == 0) goto L_0x03fe
            r0.setVisibility(r2)
        L_0x03fe:
            com.google.common.base.ax r0 = r1.f303431dr
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0410
            com.google.common.base.ax r0 = r1.f303431dr
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.jm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109322jm) r0
            r0.f304521g = r5
        L_0x0410:
            com.google.android.apps.gsa.staticplugins.opa.af.x r0 = r1.f303324be
            android.os.Bundle r2 = r1.f303442g
            com.google.android.apps.gsa.staticplugins.opa.af.a r3 = r0.f296236d
            r3.getClass()
            int r2 = r0.mo95324e(r2)
            r3.mo95292d(r2)
            boolean r2 = r0.mo95322c()
            if (r2 == 0) goto L_0x06f5
            dagger.a r2 = r0.f296235c
            java.lang.Object r2 = r2.mo27525b()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r3 = "opa_blocking_language_picker_impression_count"
            int r2 = r2.getInt(r3, r4)
            dagger.a r0 = r0.f296235c
            java.lang.Object r0 = r0.mo27525b()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            int r2 = r2 + r5
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r2)
            r0.apply()
            goto L_0x06f5
        L_0x044a:
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r1.f303323bd
            boolean r0 = r0.mo97612d()
            if (r0 == 0) goto L_0x0524
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            boolean r0 = m181378bx(r0)
            if (r0 == 0) goto L_0x046f
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r2 = r1.f303323bd
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r2 = r2.f303833j
            r0.mo100887cb(r2)
        L_0x046f:
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r1.f303323bd
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            com.google.android.apps.gsa.opa.ac r2 = com.google.android.apps.gsa.opa.C83572ac.UNINITIALIZED
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r2 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            com.google.android.apps.gsa.staticplugins.opa.chatui.az r2 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az.UNINITIALIZED
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r2 = r1.f303323bd
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r2 = r2.f303833j
            int r2 = r2.ordinal()
            r3 = 0
            switch(r2) {
                case 1: goto L_0x048d;
                case 2: goto L_0x0487;
                case 3: goto L_0x0485;
                case 4: goto L_0x0487;
                case 5: goto L_0x0487;
                case 6: goto L_0x0487;
                case 7: goto L_0x0487;
                case 8: goto L_0x0487;
                case 9: goto L_0x0487;
                case 10: goto L_0x0487;
                default: goto L_0x0485;
            }
        L_0x0485:
            r2 = r3
            goto L_0x0492
        L_0x0487:
            com.google.android.apps.gsa.staticplugins.opa.di r2 = new com.google.android.apps.gsa.staticplugins.opa.di
            r2.<init>(r1)
            goto L_0x0492
        L_0x048d:
            com.google.android.apps.gsa.staticplugins.opa.de r2 = new com.google.android.apps.gsa.staticplugins.opa.de
            r2.<init>(r1)
        L_0x0492:
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r6 = r1.f303323bd
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r6 = r6.f303833j
            int r6 = r6.ordinal()
            switch(r6) {
                case 1: goto L_0x04c2;
                case 2: goto L_0x04a4;
                case 3: goto L_0x049d;
                case 4: goto L_0x049e;
                case 5: goto L_0x04a4;
                case 6: goto L_0x04a4;
                case 7: goto L_0x04a4;
                case 8: goto L_0x04a4;
                case 9: goto L_0x04a4;
                case 10: goto L_0x04a4;
                default: goto L_0x049d;
            }
        L_0x049d:
            goto L_0x04c7
        L_0x049e:
            com.google.android.apps.gsa.staticplugins.opa.dl r3 = new com.google.android.apps.gsa.staticplugins.opa.dl
            r3.<init>(r1)
            goto L_0x04c7
        L_0x04a4:
            dagger.a r6 = r1.f303398dC
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.cx r6 = (com.google.android.apps.gsa.staticplugins.opa.util.C113869cx) r6
            com.google.android.apps.gsa.search.core.i.t r8 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247736ml
            boolean r9 = r8.mo79746e(r9)
            if (r9 == 0) goto L_0x04bc
            boolean r6 = r6.mo100732e(r8)
            if (r6 == 0) goto L_0x04c7
        L_0x04bc:
            com.google.android.apps.gsa.staticplugins.opa.dk r3 = new com.google.android.apps.gsa.staticplugins.opa.dk
            r3.<init>(r1)
            goto L_0x04c7
        L_0x04c2:
            com.google.android.apps.gsa.staticplugins.opa.dj r3 = new com.google.android.apps.gsa.staticplugins.opa.dj
            r3.<init>(r1)
        L_0x04c7:
            int r6 = r0.f303836m
            if (r6 != r10) goto L_0x06f5
            if (r2 == 0) goto L_0x06f5
            r0.f303836m = r7
            r2.run()
            com.google.android.apps.gsa.staticplugins.opa.greeting.ar r2 = r0.f303830g
            if (r2 == 0) goto L_0x04dd
            android.widget.LinearLayout r6 = r2.f303770c
            r6.setVisibility(r4)
            r2.f303747L = r5
        L_0x04dd:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303827d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247156bo
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x04f1
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r2 = r0.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_VIDEO
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x06f5
        L_0x04f1:
            r0.f303831h = r3
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303827d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247439hF
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0507
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r2 = r0.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_VIDEO
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x06f5
        L_0x0507:
            if (r3 == 0) goto L_0x06f5
            com.google.android.libraries.gsa.k.g r2 = r0.f303826c
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f303827d
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247678lg
            long r3 = r3.mo79743a(r4)
            com.google.android.apps.gsa.staticplugins.opa.greeting.a r6 = new com.google.android.apps.gsa.staticplugins.opa.greeting.a
            r6.<init>(r0)
            int r4 = (int) r3
            long r3 = (long) r4
            java.lang.String r7 = "startSecondGreetingPhase"
            com.google.common.util.concurrent.cx r2 = r2.mo28208h(r7, r3, r6)
            r0.f303829f = r2
            goto L_0x06f5
        L_0x0524:
            android.os.Bundle r0 = r1.f303442g
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142269aQ(r0)
            if (r0 == 0) goto L_0x055a
            android.os.Bundle r0 = r1.f303442g
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r0)
            com.google.android.apps.gsa.assistant.shared.l.e r2 = com.google.android.apps.gsa.assistant.shared.l.e.ba
            if (r0 != r2) goto L_0x0538
            r10 = 13
        L_0x0538:
            r16.mo97542o()
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248541cP
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x0555
            r16.mo97459aU()
            com.google.android.apps.gsa.staticplugins.opa.fi r0 = r1.f303457v
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f303455t
            android.content.Intent r2 = com.google.android.apps.gsa.shared.util.p7176n.C91067j.m148771c(r2)
            r0.mo65089a(r2)
            goto L_0x06f5
        L_0x0555:
            r1.mo97506bP(r10)
            goto L_0x06f5
        L_0x055a:
            com.google.android.apps.gsa.staticplugins.opa.oe r0 = r1.f303459x
            boolean r0 = r0.mo98101h()
            if (r0 == 0) goto L_0x0579
            com.google.android.apps.gsa.staticplugins.opa.oe r0 = r1.f303459x
            int r2 = r1.f303368cZ
            if (r2 == r5) goto L_0x0569
            r4 = 1
        L_0x0569:
            r0.mo98099f(r4)
            dagger.a r0 = r1.f303252aL
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.ci r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113854ci) r0
            r0.mo100701b(r8)
            goto L_0x06f5
        L_0x0579:
            android.os.Bundle r0 = r1.f303442g
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142299aw(r0)
            if (r0 == 0) goto L_0x05ac
            boolean r0 = r1.f303370cb
            if (r0 == 0) goto L_0x0591
            android.os.Bundle r0 = r1.f303442g
            int r0 = com.google.android.apps.gsa.search.shared.p6930h.C87567j.m142328a(r0)
            if (r0 != r7) goto L_0x0591
            r1.mo97462aX(r4)
            goto L_0x0594
        L_0x0591:
            r1.mo97462aX(r5)
        L_0x0594:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r2 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cf
            r3 = 4
            r2.<init>(r7, r3)
            r0.mo95430s(r2)
            dagger.a r0 = r1.f303252aL
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.ci r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113854ci) r0
            r0.mo100701b(r8)
            goto L_0x06f5
        L_0x05ac:
            com.google.android.apps.gsa.staticplugins.opa.au.q r0 = r1.f303239Y
            if (r0 == 0) goto L_0x05e1
            boolean r0 = r1.f303242aB
            if (r0 != 0) goto L_0x05e1
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247611kS
            boolean r0 = r0.mo79746e(r3)
            if (r0 != 0) goto L_0x05e1
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90024cc.f248136g
            long r10 = r0.mo79743a(r3)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x05d7
            com.google.android.libraries.gsa.k.g r0 = r1.f303448m
            com.google.android.apps.gsa.staticplugins.opa.bv r3 = new com.google.android.apps.gsa.staticplugins.opa.bv
            r3.<init>(r1)
            java.lang.String r6 = "showRichInputAfterDelay"
            r0.mo28213m(r6, r10, r3)
            goto L_0x05e1
        L_0x05d7:
            com.google.android.apps.gsa.staticplugins.opa.au.q r0 = r1.f303239Y
            r0.getClass()
            android.view.ViewGroup r3 = r1.f303449n
            r0.mo96066a(r3)
        L_0x05e1:
            boolean r0 = r1.f303242aB
            if (r0 == 0) goto L_0x05e9
            boolean r0 = r1.f303243aC
            if (r0 != 0) goto L_0x05f4
        L_0x05e9:
            android.os.Bundle r0 = r1.f303442g
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142256aD(r0)
            if (r0 != 0) goto L_0x05f4
            r16.mo97541n()
        L_0x05f4:
            r16.mo97427O()
            boolean r0 = r1.f303371cc
            if (r0 != 0) goto L_0x0672
            boolean r0 = r1.f303370cb
            if (r0 == 0) goto L_0x062c
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247617kY
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x062c
            boolean r0 = r1.f303371cc
            if (r0 != 0) goto L_0x062c
            boolean r0 = r16.mo97519bk()
            if (r0 != 0) goto L_0x062c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            dagger.a r3 = r1.f303321bb
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bu r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu) r3
            com.google.android.apps.gsa.staticplugins.opa.chatui.bs r6 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs.CHAT_HISTORY
            java.lang.Object[] r10 = new java.lang.Object[r4]
            com.google.android.apps.gsa.staticplugins.opa.chatui.bt r3 = r3.mo96700a(r6, r10)
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r3)
            r0.mo95361C(r3)
        L_0x062c:
            r16.mo97438Z()
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90061dm.f249194b
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0656
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            com.google.android.apps.gsa.staticplugins.opa.chatui.ik[] r3 = new com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik[r5]
            dagger.a r6 = r1.f303321bb
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.bu r6 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu) r6
            com.google.android.apps.gsa.staticplugins.opa.chatui.bs r10 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs.MUSIC_SEARCH
            java.lang.Object[] r11 = new java.lang.Object[r4]
            com.google.android.apps.gsa.staticplugins.opa.chatui.bt r6 = r6.mo96700a(r10, r11)
            r3[r4] = r6
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.mo95361C(r3)
        L_0x0656:
            r16.mo97437Y()
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248585dc
            boolean r0 = r0.mo79746e(r3)
            if (r0 != 0) goto L_0x066d
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248546cU
            boolean r0 = r0.mo79746e(r3)
            if (r0 == 0) goto L_0x0672
        L_0x066d:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r1.f303450o
            r0.mo95395af()
        L_0x0672:
            int r0 = r1.f303368cZ
            if (r0 == r7) goto L_0x067f
            if (r0 == r5) goto L_0x067f
            r3 = 4
            if (r0 == r3) goto L_0x067f
            if (r0 == r2) goto L_0x067f
            r8 = 1
        L_0x067f:
            com.google.common.base.ax r0 = r1.f303431dr
            boolean r0 = r0.mo56113h()
            r2 = 8
            if (r0 == 0) goto L_0x06df
            boolean r0 = r1.f303371cc
            if (r0 != 0) goto L_0x06df
            com.google.android.apps.gsa.staticplugins.opa.af.x r0 = r1.f303324be
            android.os.Bundle r4 = r1.f303442g
            boolean r0 = r0.mo95323d(r4)
            if (r0 != 0) goto L_0x06df
            com.google.common.base.ax r0 = r1.f303431dr
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.jm r0 = (com.google.android.apps.gsa.staticplugins.opa.C109322jm) r0
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f304520f
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90069du.f249731i
            boolean r4 = r4.mo79746e(r6)
            if (r4 == 0) goto L_0x06c4
            dagger.a r4 = r0.f304518d
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.jh r4 = (com.google.android.apps.gsa.staticplugins.opa.C109317jh) r4
            com.google.android.apps.search.assistant.platform.pcp.f.f r6 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f.f341922a
            com.google.common.util.concurrent.cx r4 = r4.mo97761d(r6)
            com.google.android.libraries.gsa.k.g r6 = r0.f304519e
            com.google.android.apps.gsa.staticplugins.opa.jk r7 = new com.google.android.apps.gsa.staticplugins.opa.jk
            r7.<init>(r0)
            java.lang.String r0 = "CachedPcp"
            r6.mo28211k(r4, r0, r7)
            goto L_0x06e9
        L_0x06c4:
            dagger.a r4 = r0.f304516b
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.be.bm r4 = (com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm) r4
            com.google.assistant.s.a.j r6 = com.google.assistant.p3994s.p3995a.C53306j.MAIN_APP
            com.google.common.util.concurrent.cx r4 = r4.mo76936k(r6)
            com.google.android.libraries.gsa.k.g r6 = r0.f304519e
            com.google.android.apps.gsa.staticplugins.opa.jl r7 = new com.google.android.apps.gsa.staticplugins.opa.jl
            r7.<init>(r0)
            java.lang.String r0 = "CachedZeroState"
            r6.mo28211k(r4, r0, r7)
            goto L_0x06e9
        L_0x06df:
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247247dZ
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x06ea
        L_0x06e9:
            long r8 = r8 | r2
        L_0x06ea:
            dagger.a r0 = r1.f303252aL
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.ci r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113854ci) r0
            r0.mo100701b(r8)
        L_0x06f5:
            com.google.android.apps.gsa.staticplugins.opa.af.x r0 = r1.f303324be
            r0.f296237e = r5
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTED
            goto L_0x074f
        L_0x06fc:
            com.google.android.apps.gsa.staticplugins.opa.ey r2 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_CONVERSATION
            if (r0 != r2) goto L_0x0730
            boolean r2 = r1.f303370cb
            if (r2 == 0) goto L_0x0714
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f303455t
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247420gn
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0714
            boolean r2 = r16.mo97494bD()
            if (r2 == 0) goto L_0x071a
        L_0x0714:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r1.f303450o
            r3 = 4
            r2.mo95434w(r3)
        L_0x071a:
            r1.mo97490az(r4)
            boolean r2 = r1.f303370cb
            if (r2 == 0) goto L_0x0724
            r1.mo97431S(r5)
        L_0x0724:
            com.google.android.apps.gsa.staticplugins.opa.aw.a r2 = r1.f303234T
            int r2 = r2.mo95358d()
            if (r2 != r5) goto L_0x074f
            r1.mo97498bH(r4, r4, r4, r10)
            goto L_0x074f
        L_0x0730:
            com.google.android.apps.gsa.staticplugins.opa.ey r2 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_HIDDEN
            if (r0 != r2) goto L_0x074f
            r1.mo97497bG(r5)
            android.widget.PopupMenu r2 = r1.f303222H
            if (r2 == 0) goto L_0x073e
            r2.dismiss()
        L_0x073e:
            com.google.android.apps.gsa.staticplugins.opa.av.a r2 = r1.f303274ah
            android.os.Bundle r3 = r1.f303442g
            boolean r2 = r2.mo96078e(r3)
            if (r2 == 0) goto L_0x074f
            com.google.android.apps.gsa.staticplugins.opa.fl r2 = r1.f303444i
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_OTHER
            r2.mo95167z(r3)
        L_0x074f:
            r1.f303275ai = r0
            r16.m181397cn()
            com.google.android.apps.gsa.staticplugins.opa.ey r2 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_HIDDEN
            if (r0 == r2) goto L_0x075c
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = r1.f303275ai
            r1.f303364cV = r0
        L_0x075c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109040fj.mo97463aY(com.google.android.apps.gsa.staticplugins.opa.ey):void");
    }

    /* renamed from: aZ */
    public final void mo97464aZ() {
        mo97463aY(C109026ey.MODE_CONVERSATION);
    }

    /* renamed from: aa */
    public final void mo97465aa(Configuration configuration) {
        if (mo97528bv()) {
            C58976aa aaVar = C58975e.f156826a;
            if (m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100852bT(configuration);
                if (configuration.orientation == 2) {
                    m181382cD(4);
                } else {
                    m181382cD(1);
                }
            }
        } else if (this.f303455t.mo79746e(C90029ch.f248258as) && this.f303370cb) {
            int width = C91115n.m148871c(this.f303441f).width();
            int b = (int) C91115n.m148870b((float) ((int) this.f303455t.mo79743a(C90029ch.f248228aO)), this.f303346c);
            if (width > b) {
                int i = (width - b) / 2;
                mo97536h().setPaddingRelative(i % 2 == 0 ? i : i + 1, 0, i, 0);
                return;
            }
            mo97536h().setPaddingRelative(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ab */
    public final void mo97466ab(String str, List list) {
        C51016dg dgVar;
        if (!mo97519bk()) {
            if (m181378bx(this.f303450o) && this.f303455t.mo79746e(C90042cu.f248716q) && list.size() == 1) {
                WebImageView ba = ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100859ba();
                if (ba == null) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    C52533vg vgVar = (C52533vg) list.get(0);
                    if (vgVar.f137893b == 2) {
                        dgVar = (C51016dg) vgVar.f137894c;
                    } else {
                        dgVar = C51016dg.f132827g;
                    }
                    C51012dc dcVar = dgVar.f132834f;
                    if (dcVar == null) {
                        dcVar = C51012dc.f132813k;
                    }
                    int i = dcVar.f132815a;
                    if ((i & 2) == 0) {
                        C58976aa aaVar2 = C58975e.f156826a;
                    } else if ((i & 64) != 0) {
                        ba.mo76738i(dcVar.f132817c, (C91189au) this.f303288av.mo27525b());
                        ba.setContentDescription(dcVar.f132822h);
                        ba.setOnClickListener(new C89943l(new C108814er(this, vgVar)));
                        if ((vgVar.f137892a & 8) != 0) {
                            C58976aa aaVar3 = C58975e.f156826a;
                            C28292j jVar = new C28292j(vgVar.f137896e);
                            jVar.mo33795i(5);
                            C28295m.m52919e(ba, jVar);
                            C89949q.m146521e(C28285c.m52874a(ba, vgVar.f137896e), false);
                        }
                        ba.setVisibility(0);
                    } else {
                        C58976aa aaVar4 = C58975e.f156826a;
                    }
                }
            }
            if (this.f303225K.mo95249a() != 8) {
                this.f303225K.mo95258j(str);
                m181403ct(list);
                m181404cu(list);
                return;
            }
            this.f303280an = new AnimatorSet();
            AnimatorSet b = this.f303225K.mo95250b(list != null && !list.isEmpty() && !m181378bx(this.f303450o));
            if (m181378bx(this.f303450o)) {
                AnimatorSet aQ = ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100837aQ();
                b.addListener(new C108493cj(this, list));
                aQ.addListener(new C108494ck(this, str));
                this.f303280an.playSequentially(new Animator[]{aQ, b});
                this.f303280an.start();
            } else if (this.f303259aS) {
                b.addListener(new C108495cl(this, str));
                b.start();
            } else {
                ValueAnimator bT = m181369bT(this.f303309bP.mo96667j(), this.f303309bP.mo96675r());
                bT.setDuration(100);
                b.addListener(new C108496cm(this, str, list));
                this.f303280an.playTogether(new Animator[]{b, bT});
                this.f303280an.start();
            }
            C108436iq iqVar = this.f303225K;
            C50870f fVar = this.f303289aw;
            fVar.getClass();
            iqVar.mo95256h(fVar.f132450c, (C91189au) this.f303288av.mo27525b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ac */
    public final void mo97467ac() {
        C50870f fVar = this.f303289aw;
        if (fVar != null) {
            int a = C50869e.m85974a(fVar.f132452e);
            if ((a == 0 || a == 2) && (fVar.f132448a & 1) != 0) {
                mo97468ad(fVar.f132449b, (String) null, mo97539l(fVar, (List) null));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ad */
    public final void mo97468ad(String str, String str2, List list) {
        if (!mo97519bk()) {
            this.f303315bV.f300678a = true;
            if (m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100855bW();
            }
            C107698i iVar = this.f303454s;
            C88489j jVar = new C88489j(C87739bu.OPA_DISPLAY_CONTEXT_UPDATED);
            C62940bt btVar = C88105pi.f238198a;
            C88106pj pjVar = (C88106pj) C88107pk.f238199h.createBuilder();
            pjVar.copyOnWrite();
            C88107pk pkVar = (C88107pk) pjVar.instance;
            pkVar.f238201a |= 4;
            pkVar.f238204d = true;
            jVar.mo82014b(btVar, (C88107pk) pjVar.build());
            iVar.mo96219b(jVar.mo82013a());
            if (!C58837ba.m90859h(str)) {
                this.f303225K.mo95255g().setContentDescription(this.f303346c.getString(R.string.opa_third_party_menu_content_description, new Object[]{str}));
            } else {
                this.f303225K.mo95255g().setContentDescription(this.f303346c.getString(R.string.opa_agent_menu_content_description));
            }
            mo97466ab(str, list);
            this.f303225K.mo95252d().setOnClickListener(new C105918aa(this, str2));
        }
    }

    /* renamed from: ae */
    public final void mo97469ae(long j) {
        if (mo97528bv() && this.f303455t.mo79746e(C90029ch.f248282bp) && this.f303337br.mo56113h() && ((C109735ni) this.f303337br.mo56107c()).mo98055a() != j) {
            C58976aa aaVar = C58975e.f156826a;
            this.f303337br = C58833ax.m90833j((Object) null);
        }
    }

    /* renamed from: af */
    public final void mo97470af() {
        boolean z = mo97528bv() && this.f303455t.mo79746e(C90029ch.f248282bp) && this.f303337br.mo56113h() && ((C109735ni) this.f303337br.mo56107c()).mo98056b().f136121a;
        if (this.f303371cc && !z && this.f303275ai != C109026ey.MODE_HIDDEN) {
            C59104x b = f303210a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ChatUiController");
            ((C59052c) ((C59052c) b).mo56372aa(22668)).mo56357J("shouldNotRestoreForSidePanel=%b uiMode=%s", false, this.f303275ai);
            ((C113793bi) this.f303325bf.mo27525b()).mo100643c(this.f303449n, false);
            if (mo97528bv() && this.f303455t.mo79746e(C90029ch.f248282bp) && this.f303248aH.mo56113h()) {
                ((C108100a) this.f303248aH.mo56107c()).mo96445j(true);
            }
        }
    }

    /* renamed from: ag */
    public final void mo97471ag(boolean z) {
        int i;
        if (this.f303356cN != null) {
            if (z) {
                i = C1878d.m5128a(this.f303346c, 17170445);
            } else {
                i = this.f303458w;
            }
            if (this.f303356cN.getNavigationBarColor() != i) {
                this.f303356cN.setNavigationBarColor(i);
            }
        }
    }

    /* renamed from: ah */
    public final void mo97472ah() {
        View aW;
        C28292j jVar;
        ViewGroup viewGroup;
        if (m181378bx(this.f303450o) && (aW = ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100840aW()) != null) {
            C28292j a = C28295m.m52915a(aW);
            if (a != null) {
                C89949q.m146521e(C28285c.m52879f(a, false), false);
            }
            if (this.f303390cv == 2 || this.f303275ai == C109026ey.MODE_HIDDEN) {
                C28295m.m52918d(aW);
                return;
            }
            if (this.f303275ai == C109026ey.MODE_CONVERSATION) {
                jVar = new C28292j(111938);
                jVar.mo33795i(5);
            } else {
                jVar = new C28292j(111595);
                jVar.mo33795i(5);
            }
            C28295m.m52919e(aW, jVar);
            C28293k e = C28293k.m52908e(jVar, new C28293k[0]);
            if (e != null && (viewGroup = this.f303449n) != null) {
                C89949q.m146521e(C28285c.m52876c(e, viewGroup), false);
            }
        }
    }

    /* renamed from: ai */
    public final void mo97473ai(int i) {
        if (!mo97528bv()) {
            m181400cq(this.f303450o.mo95420i(), i);
            m181400cq(this.f303230P, i);
            m181400cq(this.f303228N, i);
            if (m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100850bQ(i);
            }
            if (!m181378bx(this.f303450o)) {
                m181400cq(this.f303229O, i);
            }
        }
    }

    /* renamed from: aj */
    public final void mo97474aj() {
        if (this.f303259aS) {
            this.f303444i.mo95151b();
        }
    }

    /* renamed from: ak */
    public final void mo97475ak(boolean z) {
        View view;
        m181390cg();
        this.f303245aE = false;
        if (!this.f303268ab.mo56113h() && (view = this.f303220F) != null) {
            view.setVisibility(0);
        }
        if (z && this.f303247aG.mo56113h()) {
            ((C106171l) this.f303247aG.mo56107c()).mo95335b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: al */
    public final void mo97476al(List list) {
        mo97497bG(4);
        m181403ct(list);
        m181404cu(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: am */
    public final void mo97477am(String str) {
        this.f303232R.f301323c = false;
        if (this.f303220F != null && !m181378bx(this.f303450o)) {
            View view = this.f303220F;
            view.getClass();
            view.setVisibility(8);
            this.f303225K.mo95259k(0);
        }
        this.f303225K.mo95258j(str);
    }

    /* renamed from: an */
    public final void mo97478an() {
        this.f303246aF.mo103752c(C118522by.SEND_LEARN_OPA_NOTIFICATION);
        C118561t tVar = this.f303246aF;
        C118522by byVar = C118522by.SEND_LEARN_OPA_NOTIFICATION;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        C72210d c = new C72210d().mo63545c(3);
        C72210d dVar = new C72210d();
        C72132a aVar = dVar.f191963b;
        C72210d d = dVar.mo63546d(aVar.mo63360q().mo63454q(aVar.mo63366v().mo63454q(aVar.mo63362s().mo63454q(aVar.mo63357n().mo63454q(dVar.f191962a, 20), 0), 0), 0));
        if (c.mo63388s(C72285i.m106773a(d))) {
            d = d.mo63550h();
        }
        long j = d.f191962a;
        long j2 = new C72210d().f191962a;
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = j - j2;
        long j3 = C72290n.m106814e(60).f191964b;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = j3;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
        this.f303448m.mo28212l("Remind learn opa later", new C107715ba(this));
        this.f303448m.mo28213m("finish opa activity", TimeUnit.SECONDS.toMillis(2), new C107720bb(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ao */
    public final void mo97479ao(long j) {
        this.f303320ba.mo100762f();
        mo97469ae(j);
        this.f303304bK = true;
        if (this.f303455t.mo79746e(C90037cp.f248561cj)) {
            mo97486av();
        }
        mo97553z();
        this.f303238X.mo96171aw(false);
        if (this.f303326bg && this.f303234T.mo95358d() != 3) {
            mo97498bH(true, false, false, 2);
            this.f303326bg = false;
        } else if (this.f303234T.mo95358d() == 2) {
            mo97498bH(false, false, false, 2);
        } else if (this.f303371cc) {
            mo97470af();
        }
        this.f303394cz.f296315b = false;
        if (this.f303455t.mo79746e(C90014bt.f247522ij) && this.f303450o.mo95424m().getItemCount() > 0) {
            this.f303450o.mo95432u(((C108250bu) this.f303321bb.mo27525b()).mo96700a(C108248bs.DEBUG_TRACE, new Object[0]));
        }
        this.f303218D.mo96344a(16);
        this.f303416dc.mo28212l("[NGA] ChatUiController.refreshSearchHistory", new C108094bl(this));
        if (this.f303371cc) {
            this.f303376ch.mo83145s(C58833ax.m90834k(Long.valueOf(j)), 5);
        }
    }

    /* JADX WARNING: type inference failed for: r11v22, types: [com.google.android.apps.gsa.staticplugins.opa.af.a] */
    /* JADX WARNING: type inference failed for: r20v2, types: [com.google.android.apps.gsa.staticplugins.opa.af.v] */
    /* JADX WARNING: type inference failed for: r20v3, types: [com.google.android.apps.gsa.staticplugins.opa.af.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06bc  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x073b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x07ae A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x07e1  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0804  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x083d  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0882 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0937  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0a73  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0a89  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0b1b  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0ba2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0198  */
    /* renamed from: ap */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97480ap(android.os.Bundle r32) {
        /*
            r31 = this;
            r7 = r31
            r8 = r32
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r0 = r7.f303313bT
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.mf r0 = (com.google.android.apps.gsa.staticplugins.opa.C109467mf) r0
            java.lang.String r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142238M(r32)
            boolean r2 = r0.f304911a
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0023
            r0.f304911a = r9
            r0.f304912b = r10
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_INPUT_PLATE_SHOWN
            r0.mo97846a(r2, r9)
            r0.f304913c = r1
        L_0x0023:
            r7.f303442g = r8
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            boolean r0 = m181378bx(r0)
            if (r0 == 0) goto L_0x0073
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247688lq
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0073
            boolean r0 = r31.mo97527bu()
            if (r0 != 0) goto L_0x0073
            boolean r0 = r7.f303371cc
            if (r0 != 0) goto L_0x0073
            boolean r0 = r31.m181407cx()
            if (r0 != 0) goto L_0x0073
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247287eM
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x005c
            android.os.Bundle r0 = r7.f303442g
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r0)
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.assistant.shared.l.e.ab
            if (r0 != r1) goto L_0x005c
            goto L_0x0073
        L_0x005c:
            boolean r0 = r31.mo97495bE(r32)
            if (r0 != 0) goto L_0x0073
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            r0.mo100845bD()
        L_0x0073:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            boolean r0 = m181378bx(r0)
            if (r0 == 0) goto L_0x008c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            r0.mo100851bR()
        L_0x008c:
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = r7.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r1 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.UNINITIALIZED
            if (r0 != r1) goto L_0x0116
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247777nZ
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00a3
            boolean r0 = m181376bn(r32)
            if (r0 == 0) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            boolean r0 = r31.mo97495bE(r32)
            if (r0 != 0) goto L_0x00aa
            goto L_0x0116
        L_0x00aa:
            dagger.a r0 = r7.f303423dj
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.nr r0 = (com.google.android.apps.gsa.staticplugins.opa.C109744nr) r0
            android.content.Context r14 = r7.f303346c
            android.view.View r15 = r31.mo97536h()
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r32)
            com.google.android.apps.gsa.search.shared.ui.c r2 = r7.f303392cx
            com.google.android.apps.gsa.staticplugins.opa.audio.d r3 = r7.f303422di
            com.google.android.apps.gsa.staticplugins.opa.nq r4 = new com.google.android.apps.gsa.staticplugins.opa.nq
            g.a.a r5 = r0.f305745a
            java.lang.Object r5 = r5.mo17428b()
            r12 = r5
            com.google.android.apps.gsa.staticplugins.opa.mq r12 = (com.google.android.apps.gsa.staticplugins.opa.C109712mq) r12
            r12.getClass()
            g.a.a r5 = r0.f305746b
            dagger.a.l r5 = (dagger.p5294a.C68226l) r5
            g.a.a r5 = r5.f184585a
            dagger.a r5 = dagger.p5294a.C68219e.m98518a(r5)
            r5.getClass()
            g.a.a r5 = r0.f305747c
            java.lang.Object r5 = r5.mo17428b()
            r13 = r5
            com.google.android.apps.gsa.search.core.i.t r13 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r13
            r13.getClass()
            g.a.a r0 = r0.f305748d
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.gsa.k.g r0 = (com.google.android.libraries.gsa.p1876k.C22871g) r0
            r0.getClass()
            r14.getClass()
            r15.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r11 = r4
            r16 = r2
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.f303227M = r4
            com.google.android.apps.gsa.staticplugins.opa.ui.VoiceSearchUi r0 = r4.f305741b
            r0.setVisibility(r9)
            com.google.android.apps.gsa.shared.ah.g r0 = r7.f303376ch
            r0.mo83142p(r10)
            goto L_0x0119
        L_0x0116:
            r31.mo97487aw()
        L_0x0119:
            com.google.android.apps.gsa.shared.ah.g r0 = r7.f303376ch
            boolean r1 = r31.mo97523bp()
            r0.mo83140n(r1)
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248437aR
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0137
            com.google.android.apps.gsa.assistant.settings.shared.ai r0 = r7.f303429dp
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0137
            r7.mo97447aI(r10)
        L_0x0137:
            com.google.android.apps.gsa.staticplugins.opa.v.t r0 = r7.f303320ba
            long r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142314m(r32)
            r0.f315400j = r10
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142283ag(r32)
            r0.f315401k = r3
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142257aE(r32)
            if (r3 == 0) goto L_0x014d
            goto L_0x022b
        L_0x014d:
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142282af(r32)
            if (r3 == 0) goto L_0x015b
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_LPH
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
        L_0x0157:
            r0.mo100764h(r3, r4, r4, r4)
            goto L_0x017f
        L_0x015b:
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142294ar(r32)
            if (r3 == 0) goto L_0x0166
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_SQUEEZE
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            goto L_0x0157
        L_0x0166:
            java.util.Map r3 = r0.f315394d
            com.google.android.apps.gsa.staticplugins.opa.v.q r4 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113913q.TTS_RECEIVED
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L_0x022b
            java.lang.Boolean r3 = r0.mo100759a()
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x017f
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            goto L_0x0157
        L_0x017f:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0188
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x0190
        L_0x0188:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
        L_0x0190:
            r0.f315396f = r1
            com.google.android.apps.gsa.shared.search.Query r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142230E(r32)
            if (r1 == 0) goto L_0x022b
            com.google.common.base.ax r2 = r0.f315395e
            boolean r2 = r2.mo56113h()
            java.lang.String r3 = "QueryEndStateTracker"
            if (r2 == 0) goto L_0x01e9
            com.google.common.base.ax r2 = r0.f315395e
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r2 = (com.google.android.apps.gsa.shared.search.Query) r2
            long r4 = r2.f252749G
            long r11 = r1.f252749G
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x01c5
            com.google.android.apps.gsa.nga.shared.v.c.jz r1 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka.m131549c()
            r2 = r1
            com.google.android.apps.gsa.nga.shared.v.c.bm r2 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm) r2
            java.lang.String r3 = "handover_repeat"
            r2.f224930b = r3
            com.google.android.apps.gsa.nga.shared.v.c.ka r1 = r1.mo75772a()
            r0.mo100768l(r1)
            goto L_0x022b
        L_0x01c5:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t.f315389a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r3)
            java.lang.String r4 = "Unexpected cloud handover query"
            r5 = 24314(0x5efa, float:3.4071E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.nga.shared.v.c.jz r2 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka.m131549c()
            r4 = r2
            com.google.android.apps.gsa.nga.shared.v.c.bm r4 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm) r4
            java.lang.String r5 = "handover_not_new"
            r4.f224930b = r5
            com.google.android.apps.gsa.nga.shared.v.c.ka r2 = r2.mo75772a()
            r0.mo100768l(r2)
        L_0x01e9:
            com.google.common.base.ax r2 = r0.f315399i
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x0215
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t.f315389a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r3)
            java.lang.String r3 = "Handover with a queued query"
            r4 = 24313(0x5ef9, float:3.407E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.nga.shared.v.c.jz r2 = com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82569ka.m131549c()
            r3 = r2
            com.google.android.apps.gsa.nga.shared.v.c.bm r3 = (com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82338bm) r3
            java.lang.String r4 = "handover_queued_query"
            r3.f224930b = r4
            com.google.android.apps.gsa.nga.shared.v.c.ka r2 = r2.mo75772a()
            r0.mo100768l(r2)
        L_0x0215:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            r0.f315395e = r1
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            r0.f315399i = r1
            r0.mo100763g()
            java.util.Map r0 = r0.f315394d
            com.google.android.apps.gsa.staticplugins.opa.v.q r1 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113913q.QUERY_TRACKING_STARTED
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            r0.put(r1, r2)
        L_0x022b:
            com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController r0 = r7.f303460y
            if (r0 == 0) goto L_0x0238
            r0.mo97746b()
            long r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142315n(r32)
            r0.f304452m = r1
        L_0x0238:
            android.widget.FrameLayout r0 = r7.f303230P
            r11 = 0
            r0.setTransitionName(r11)
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142282af(r32)
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142287ak(r32)
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142294ar(r32)
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142260aH(r32)
            if (r3 != 0) goto L_0x0259
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142298av(r32)
            if (r3 == 0) goto L_0x0257
            goto L_0x0259
        L_0x0257:
            r3 = 0
            goto L_0x025a
        L_0x0259:
            r3 = 1
        L_0x025a:
            r7.f303284ar = r3
            boolean r3 = r7.f303371cc
            if (r3 == 0) goto L_0x0266
            boolean r3 = r31.mo97519bk()
            if (r3 != 0) goto L_0x0268
        L_0x0266:
            r7.f303340bu = r11
        L_0x0268:
            r7.f303341bv = r9
            com.google.android.apps.gsa.staticplugins.opa.ah.o r3 = r7.f303394cz
            r3.f296315b = r9
            com.google.android.apps.gsa.staticplugins.opa.ag.g r12 = r7.f303269ac
            java.lang.String r13 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142241P(r32)
            r14 = 8
            if (r13 == 0) goto L_0x02ac
            com.google.android.apps.gsa.staticplugins.opa.util.ca r3 = r7.f303393cy
            r3.f315214a = r13
            java.lang.String r3 = "hubmode_voice_place"
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x028f
            boolean r3 = r31.mo97528bv()
            if (r3 == 0) goto L_0x028f
            android.view.ViewGroup r3 = r7.f303449n
            r3.setVisibility(r14)
        L_0x028f:
            java.lang.String r3 = "and.opa.appinteg.youtube"
            boolean r3 = r13.startsWith(r3)
            if (r3 == 0) goto L_0x02ac
            com.google.android.apps.gsa.search.core.i.t r3 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248240aa
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x02ac
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142250Y(r32)
            if (r3 == 0) goto L_0x02ac
            java.lang.String r3 = "requested_mic_state"
            r8.putInt(r3, r10)
        L_0x02ac:
            com.google.android.apps.gsa.staticplugins.opa.util.ca r3 = r7.f303393cy
            java.lang.String r3 = r3.f315214a
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142250Y(r32)
            r7.f303282ap = r3
            byte[] r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142276aX(r32)
            r7.f303283aq = r3
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142297au(r32)
            r7.f303365cW = r3
            r4 = 2
            if (r3 == 0) goto L_0x02dc
            com.google.android.apps.gsa.shared.speech.HotwordResultMetadata r3 = com.google.android.apps.gsa.shared.speech.HotwordResultMetadata.m147625s(r32)
            r7.f303354cL = r3
            com.google.android.apps.gsa.search.core.i.t r3 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90060dl.f249192d
            boolean r3 = r3.mo79746e(r5)
            if (r3 == 0) goto L_0x02dc
            r7.f303306bM = r4
            com.google.android.apps.gsa.staticplugins.opa.ay.as r3 = r7.f303238X
            r3.mo96157ai(r4)
        L_0x02dc:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r32)
            com.google.android.apps.gsa.assistant.shared.l.e r5 = com.google.android.apps.gsa.assistant.shared.l.e.bL
            if (r3 != r5) goto L_0x02e6
        L_0x02e4:
            r3 = 1
            goto L_0x02f0
        L_0x02e6:
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r32)
            com.google.android.apps.gsa.assistant.shared.l.e r5 = com.google.android.apps.gsa.assistant.shared.l.e.ak
            if (r3 != r5) goto L_0x02ef
            goto L_0x02e4
        L_0x02ef:
            r3 = 0
        L_0x02f0:
            r7.f303366cX = r3
            int r3 = com.google.android.apps.gsa.search.shared.p6930h.C87567j.m142328a(r32)
            r7.f303368cZ = r3
            int r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142310i(r32)
            r7.f303432ds = r3
            r7.f303297bD = r9
            long r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142318q(r32)
            r7.f303434du = r5
            com.google.android.apps.gsa.staticplugins.opa.ic r3 = r7.f303351cE
            if (r3 == 0) goto L_0x030c
            r3.f304389e = r1
        L_0x030c:
            long r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142315n(r32)
            r7.f303235U = r5
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r5 = "android.opa.extra.QUERY_FROM_LONG_PRESS_HOME"
            r3.putBoolean(r5, r0)
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r5 = "android.opa.extra.QUERY_FROM_ELMYRA"
            r3.putBoolean(r5, r2)
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r5 = "android.opa.extra.QUERY_FROM_HOMESCREEN"
            r3.putBoolean(r5, r1)
            android.os.Bundle r3 = r7.f303281ao
            com.google.android.apps.gsa.assistant.shared.l.e r5 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r32)
            int r5 = r5.ca
            java.lang.String r6 = "android.opa.extra.TRIGGERED_BY"
            r3.putInt(r6, r5)
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142286aj(r32)
            java.lang.String r5 = "android.opa.extra.LAUNCHED_ON"
            if (r3 == 0) goto L_0x0345
            android.os.Bundle r3 = r7.f303281ao
            int r15 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142309h(r32)
            r3.putInt(r5, r15)
        L_0x0345:
            android.net.Uri r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142327z(r32)
            int r15 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142305d(r32)
            int r14 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142306e(r32)
            boolean r17 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142289am(r32)
            if (r17 == 0) goto L_0x0373
            dagger.a r11 = r7.f303428do
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.audio.c r11 = (com.google.android.apps.gsa.staticplugins.opa.audio.C107618c) r11
            com.google.common.f.e r11 = com.google.android.apps.gsa.staticplugins.opa.audio.C107618c.f299386a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "OpaAudioControllerImpl"
            r11.mo56378ag(r10, r4)
            java.lang.String r4 = "Returning null URI"
            r10 = 23836(0x5d1c, float:3.3401E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r10)).mo56386p(r4)
        L_0x0373:
            android.os.Bundle r4 = r7.f303281ao
            java.lang.String r10 = "android.speech.extra.AUDIO_CONTENT_URI"
            r4.putParcelable(r10, r3)
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r4 = "android.speech.extra.AUDIO_FREQUENCY"
            r3.putInt(r4, r15)
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r4 = "audio_uri_source"
            r3.putInt(r4, r14)
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r4 = "android.opa.extra.DEVICE_MODEL_ID"
            java.lang.String r10 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142235J(r32)
            r3.putString(r4, r10)
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r4 = "android.opa.extra.HINTED_PHRASES"
            java.util.ArrayList r10 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142247V(r32)
            r3.putStringArrayList(r4, r10)
            android.os.Bundle r3 = r7.f303281ao
            java.lang.String r4 = "android.opa.extra.AUDIO_SESSION_ID"
            int r10 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142252a(r32)
            r3.putInt(r4, r10)
            com.google.android.apps.gsa.staticplugins.opa.chatui.dt r3 = r7.f303231Q
            if (r3 == 0) goto L_0x03cd
            com.google.android.apps.gsa.opa.ak r3 = r7.f303253aM
            boolean r3 = r3.mo76924e()
            if (r3 == 0) goto L_0x03bb
            boolean r3 = r31.mo97491bA(r32)
            if (r3 == 0) goto L_0x03c1
        L_0x03bb:
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142264aL(r32)
            if (r3 == 0) goto L_0x03cd
        L_0x03c1:
            boolean r3 = r31.mo97519bk()
            if (r3 != 0) goto L_0x03cd
            boolean r3 = r7.f303259aS
            if (r3 != 0) goto L_0x03cd
            r3 = 1
            goto L_0x03ce
        L_0x03cd:
            r3 = 0
        L_0x03ce:
            r7.f303243aC = r3
            com.google.android.apps.gsa.staticplugins.opa.af.x r3 = r7.f303324be
            boolean r3 = r3.mo95323d(r8)
            if (r3 == 0) goto L_0x03e2
            com.google.android.apps.gsa.staticplugins.opa.af.x r3 = r7.f303324be
            boolean r3 = r3.mo95322c()
            if (r3 != 0) goto L_0x03e2
            r7.f303243aC = r9
        L_0x03e2:
            boolean r3 = r7.f303243aC
            if (r3 == 0) goto L_0x041b
            com.google.android.apps.gsa.staticplugins.opa.az.i r3 = r7.f303454s
            com.google.android.apps.gsa.search.shared.service.j r4 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_DISPLAY_CONTEXT_UPDATED
            r4.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r10)
            com.google.protobuf.bt r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi.f238198a
            com.google.android.apps.gsa.search.shared.service.b.pk r11 = com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk.f238199h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.pj r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88106pj) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.android.apps.gsa.search.shared.service.b.pk r14 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk) r14
            int r15 = r14.f238201a
            r19 = 2
            r15 = r15 | 2
            r14.f238201a = r15
            r15 = 1
            r14.f238203c = r15
            com.google.protobuf.bv r11 = r11.build()
            com.google.android.apps.gsa.search.shared.service.b.pk r11 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk) r11
            r4.mo82014b(r10, r11)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r4 = r4.mo82013a()
            r3.mo96219b(r4)
        L_0x041b:
            boolean r3 = r31.mo97524bq()
            if (r3 == 0) goto L_0x0430
            boolean r3 = r31.mo97526bt()
            if (r3 == 0) goto L_0x042e
            boolean r3 = r31.mo97491bA(r32)
            if (r3 == 0) goto L_0x042e
            goto L_0x0434
        L_0x042e:
            r3 = 0
            goto L_0x0441
        L_0x0430:
            boolean r3 = r7.f303243aC
            if (r3 == 0) goto L_0x0436
        L_0x0434:
            r3 = 1
            goto L_0x0441
        L_0x0436:
            boolean r3 = r31.mo97491bA(r32)
            if (r3 == 0) goto L_0x043d
            goto L_0x0434
        L_0x043d:
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142264aL(r32)
        L_0x0441:
            r7.f303242aB = r3
            com.google.android.apps.gsa.staticplugins.opa.af.x r3 = r7.f303324be
            boolean r3 = r3.mo95323d(r8)
            if (r3 == 0) goto L_0x0556
            com.google.android.apps.gsa.staticplugins.opa.af.x r3 = r7.f303324be
            com.google.android.apps.gsa.staticplugins.opa.af.a r4 = r3.f296236d
            if (r4 != 0) goto L_0x052b
            boolean r4 = r3.mo95322c()
            if (r4 == 0) goto L_0x04a7
            com.google.android.apps.gsa.staticplugins.opa.af.d r4 = r3.f296234b
            com.google.android.apps.gsa.staticplugins.opa.dq r10 = r3.f296238f
            com.google.android.apps.gsa.staticplugins.opa.af.c r11 = new com.google.android.apps.gsa.staticplugins.opa.af.c
            g.a.a r14 = r4.f296171a
            java.lang.Object r14 = r14.mo17428b()
            r22 = r14
            android.content.Context r22 = (android.content.Context) r22
            r22.getClass()
            g.a.a r14 = r4.f296172b
            java.lang.Object r14 = r14.mo17428b()
            r23 = r14
            com.google.android.apps.gsa.search.core.i.t r23 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r23
            r23.getClass()
            g.a.a r14 = r4.f296173c
            java.lang.Object r14 = r14.mo17428b()
            r24 = r14
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r24 = (com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a) r24
            r24.getClass()
            g.a.a r14 = r4.f296174d
            java.lang.Object r14 = r14.mo17428b()
            r25 = r14
            com.google.android.apps.gsa.staticplugins.opa.af.ae r25 = (com.google.android.apps.gsa.staticplugins.opa.p8182af.C106123ae) r25
            r25.getClass()
            g.a.a r4 = r4.f296175e
            java.lang.Object r4 = r4.mo17428b()
            r26 = r4
            com.google.android.apps.gsa.staticplugins.opa.af.e r26 = (com.google.android.apps.gsa.staticplugins.opa.p8182af.C106128e) r26
            r26.getClass()
            r20 = r11
            r21 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26)
            goto L_0x0529
        L_0x04a7:
            com.google.android.apps.gsa.staticplugins.opa.af.w r4 = r3.f296233a
            com.google.android.apps.gsa.staticplugins.opa.dp r10 = r3.f296239g
            com.google.android.apps.gsa.staticplugins.opa.af.v r11 = new com.google.android.apps.gsa.staticplugins.opa.af.v
            g.a.a r14 = r4.f296224a
            java.lang.Object r14 = r14.mo17428b()
            r22 = r14
            com.google.android.apps.gsa.search.core.google.gaia.o r22 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r22
            r22.getClass()
            g.a.a r14 = r4.f296225b
            java.lang.Object r14 = r14.mo17428b()
            r23 = r14
            android.content.Context r23 = (android.content.Context) r23
            r23.getClass()
            g.a.a r14 = r4.f296226c
            java.lang.Object r14 = r14.mo17428b()
            r24 = r14
            com.google.android.apps.gsa.search.core.i.t r24 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r24
            r24.getClass()
            g.a.a r14 = r4.f296227d
            java.lang.Object r14 = r14.mo17428b()
            r25 = r14
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r25 = (com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a) r25
            r25.getClass()
            g.a.a r14 = r4.f296228e
            java.lang.Object r14 = r14.mo17428b()
            r26 = r14
            com.google.android.apps.gsa.assistant.settings.shared.ae r26 = (com.google.android.apps.gsa.assistant.settings.shared.ae) r26
            r26.getClass()
            g.a.a r14 = r4.f296229f
            java.lang.Object r14 = r14.mo17428b()
            r27 = r14
            com.google.android.apps.gsa.assistant.settings.shared.ab r27 = (com.google.android.apps.gsa.assistant.settings.shared.ab) r27
            r27.getClass()
            g.a.a r14 = r4.f296230g
            dagger.a.l r14 = (dagger.p5294a.C68226l) r14
            g.a.a r14 = r14.f184585a
            dagger.a r28 = dagger.p5294a.C68219e.m98518a(r14)
            r28.getClass()
            g.a.a r14 = r4.f296231h
            java.lang.Object r14 = r14.mo17428b()
            r29 = r14
            com.google.android.apps.gsa.assistant.shared.n.l r29 = (com.google.android.apps.gsa.assistant.shared.n.l) r29
            r29.getClass()
            g.a.a r4 = r4.f296232i
            java.lang.Object r4 = r4.mo17428b()
            r30 = r4
            android.app.Activity r30 = (android.app.Activity) r30
            r30.getClass()
            r20 = r11
            r21 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0529:
            r3.f296236d = r11
        L_0x052b:
            android.view.ViewGroup r3 = r7.f303449n
            r4 = 2131432669(0x7f0b14dd, float:1.8487102E38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.google.android.apps.gsa.staticplugins.opa.af.x r4 = r7.f303324be
            com.google.android.apps.gsa.staticplugins.opa.af.a r4 = r4.f296236d
            if (r4 == 0) goto L_0x061a
            if (r3 == 0) goto L_0x061a
            android.view.ViewGroup r4 = r4.mo95289a()
            android.view.ViewParent r10 = r4.getParent()
            if (r10 == 0) goto L_0x0551
            android.view.ViewParent r10 = r4.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r10.removeView(r4)
        L_0x0551:
            r3.addView(r4, r9)
            goto L_0x061a
        L_0x0556:
            boolean r3 = r7.f303259aS
            if (r3 != 0) goto L_0x061a
            boolean r3 = r31.mo97491bA(r32)
            if (r3 != 0) goto L_0x061a
            boolean r3 = r31.m181380cB()
            if (r3 != 0) goto L_0x061a
            com.google.common.base.ax r3 = r7.f303247aG
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x057e
            com.google.common.base.ax r3 = r7.f303247aG
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ah.l r3 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r3
            com.google.android.apps.gsa.search.core.aj.aa r3 = r3.f296304b
            boolean r3 = r3.mo78228b()
            if (r3 != 0) goto L_0x061a
        L_0x057e:
            boolean r3 = r7.f303439dz
            if (r3 != 0) goto L_0x061a
            boolean r3 = r7.f303242aB
            if (r3 == 0) goto L_0x058c
            boolean r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142269aQ(r32)
            if (r3 == 0) goto L_0x061a
        L_0x058c:
            java.lang.String r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142240O(r32)
            if (r3 != 0) goto L_0x061a
            byte[] r3 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142275aW(r32)
            if (r3 != 0) goto L_0x061a
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r3 = r7.f303323bd
            r3.mo97610b(r8)
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r3 = r7.f303323bd
            boolean r3 = r3.mo97612d()
            if (r3 == 0) goto L_0x061a
            r7.f303242aB = r9
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r3 = r7.f303323bd
            com.google.android.apps.gsa.staticplugins.opa.ay.as r4 = r7.f303238X
            android.view.ViewGroup r4 = r4.mo96181i()
            com.google.android.apps.gsa.staticplugins.opa.greeting.ar r10 = r3.f303830g
            if (r10 == 0) goto L_0x061a
            if (r4 == 0) goto L_0x061a
            android.widget.LinearLayout r10 = r10.f303770c
            android.view.ViewParent r11 = r10.getParent()
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            if (r11 == 0) goto L_0x05c2
            r11.removeView(r10)
        L_0x05c2:
            r11 = 2131435602(0x7f0b2052, float:1.849305E38)
            android.view.View r14 = r4.findViewById(r11)
            int r14 = r4.indexOfChild(r14)
            r15 = 1
            int r14 = r14 + r15
            r4.addView(r10, r14)
            com.google.android.apps.gsa.staticplugins.opa.greeting.ar r3 = r3.f303830g
            android.view.View r4 = r4.findViewById(r11)
            r4.getClass()
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            r11 = 2
            android.animation.Animator[] r14 = new android.animation.Animator[r11]
            android.animation.Animator r15 = r3.f303737B
            r14[r9] = r15
            android.animation.ObjectAnimator r15 = r3.mo97586b(r4)
            r18 = 1
            r14[r18] = r15
            r10.playTogether(r14)
            com.google.android.apps.gsa.staticplugins.opa.greeting.af r14 = new com.google.android.apps.gsa.staticplugins.opa.greeting.af
            r14.<init>(r4)
            r10.addListener(r14)
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            android.animation.Animator[] r15 = new android.animation.Animator[r11]
            android.animation.Animator r11 = r3.f303738C
            r15[r9] = r11
            android.animation.ObjectAnimator r11 = r3.mo97585a(r4)
            r15[r18] = r11
            r14.playTogether(r15)
            com.google.android.apps.gsa.staticplugins.opa.greeting.ag r11 = new com.google.android.apps.gsa.staticplugins.opa.greeting.ag
            r11.<init>(r4)
            r14.addListener(r11)
            r3.f303737B = r10
            r3.f303738C = r14
        L_0x061a:
            dagger.a r3 = r7.f303397dB
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.k r3 = (com.google.android.apps.gsa.staticplugins.opa.util.C113880k) r3
            boolean r3 = r3.mo100740f()
            if (r3 != 0) goto L_0x068a
            boolean r3 = r31.mo97491bA(r32)
            if (r3 != 0) goto L_0x068a
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r10 = r4.f164093a
            r11 = 2
            r10 = r10 | r11
            r4.f164093a = r10
            r10 = 1423(0x58f, float:1.994E-42)
            r4.f164258m = r10
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            r4 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r3, r4, r4, r4)
            dagger.a r3 = r7.f303397dB
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.k r3 = (com.google.android.apps.gsa.staticplugins.opa.util.C113880k) r3
            android.content.SharedPreferences r3 = r3.f315307b
            java.lang.String r4 = "assistant_latest_interaction_timestamp_millis"
            r10 = -1
            long r3 = r3.getLong(r4, r10)
            int r14 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x068a
            com.google.common.o.uf r3 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.tz r3 = (com.google.common.p4552o.C60548tz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            int r10 = r4.f164093a
            r11 = 2
            r10 = r10 | r11
            r4.f164093a = r10
            r10 = 1437(0x59d, float:2.014E-42)
            r4.f164258m = r10
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            r4 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r3, r4, r4, r4)
        L_0x068a:
            boolean r3 = r31.mo97491bA(r32)
            if (r3 != 0) goto L_0x06b3
            dagger.a r3 = r7.f303251aK
            java.lang.Object r3 = r3.mo27525b()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            dagger.a r4 = r7.f303251aK
            java.lang.Object r4 = r4.mo27525b()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r10 = "opa_input_plate_impression_count"
            int r4 = r4.getInt(r10, r9)
            r11 = 1
            int r4 = r4 + r11
            android.content.SharedPreferences$Editor r3 = r3.putInt(r10, r4)
            r3.apply()
        L_0x06b3:
            boolean r3 = r7.f303243aC
            r10 = 4
            if (r3 != 0) goto L_0x06bc
            r31.mo97545r()
            goto L_0x0729
        L_0x06bc:
            dagger.a r3 = r7.f303251aK
            java.lang.Object r3 = r3.mo27525b()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r4 = r7.f303419df
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r11 = "opa_auto_trigger_url_"
            java.lang.String r4 = r11.concat(r4)
            java.lang.String r11 = ""
            java.lang.String r3 = r3.getString(r4, r11)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0729
            com.google.android.apps.gsa.search.core.i.t r4 = r7.f303455t
            com.google.android.apps.gsa.shared.m.f r11 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247525im
            long r14 = r4.mo79743a(r11)
            int r4 = (int) r14
            dagger.a r11 = r7.f303251aK
            java.lang.Object r11 = r11.mo27525b()
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11
            java.lang.String r14 = r7.f303419df
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = "opa_auto_trigger_url_attempt_count_"
            java.lang.String r14 = r15.concat(r14)
            int r9 = r4 + 1
            int r9 = r11.getInt(r14, r9)
            if (r9 > r4) goto L_0x0726
            r7.mo97420H(r3)
            dagger.a r3 = r7.f303251aK
            java.lang.Object r3 = r3.mo27525b()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = r7.f303419df
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r15.concat(r4)
            r11 = 1
            int r9 = r9 + r11
            android.content.SharedPreferences$Editor r3 = r3.putInt(r4, r9)
            r3.apply()
            r7.f303368cZ = r10
            goto L_0x0729
        L_0x0726:
            r31.mo97545r()
        L_0x0729:
            dagger.a r3 = r7.f303258aR
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bn r3 = (com.google.android.apps.gsa.staticplugins.opa.util.C113798bn) r3
            android.view.ViewGroup r4 = r7.f303449n
            r3.mo100647a(r4)
            int r3 = r7.f303390cv
            r4 = 2
            if (r3 != r4) goto L_0x0747
            dagger.a r3 = r7.f303316bW
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.f.g r3 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114737g) r3
            r3.mo101565d()
            goto L_0x0769
        L_0x0747:
            dagger.a r3 = r7.f303258aR
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bn r3 = (com.google.android.apps.gsa.staticplugins.opa.util.C113798bn) r3
            com.google.android.libraries.b.d.a r4 = new com.google.android.libraries.b.d.a
            r9 = 5
            r4.<init>(r9)
            com.google.android.libraries.b.f.f r9 = new com.google.android.libraries.b.f.f
            android.view.ViewGroup r11 = r7.f303449n
            int r11 = r11.getWidth()
            android.view.ViewGroup r14 = r7.f303449n
            int r14 = r14.getHeight()
            r9.<init>(r11, r14)
            r3.mo24921c(r4, r9)
        L_0x0769:
            dagger.a r3 = r7.f303325bf
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bi r3 = (com.google.android.apps.gsa.staticplugins.opa.util.C113793bi) r3
            androidx.lifecycle.ag r3 = r3.f315157c
            androidx.lifecycle.ah r4 = r7.f303377ci
            r3.mo5705f(r4)
            r3 = 0
            r7.mo97512bd(r3)
            boolean r4 = r7.f303424dk
            if (r4 != 0) goto L_0x079c
            dagger.a r4 = r7.f303420dg
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.bc r4 = (com.google.android.apps.gsa.staticplugins.opa.util.C113787bc) r4
            boolean r4 = r4.mo100629i(r3)
            if (r4 == 0) goto L_0x07a8
            dagger.a r3 = r7.f303421dh
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r3 = (com.google.android.apps.gsa.assistant.shared.bm) r3
            boolean r3 = r3.v()
            if (r3 != 0) goto L_0x07a8
        L_0x079c:
            android.view.View r3 = r7.f303220F
            if (r3 == 0) goto L_0x07a8
            r4 = 8
            r3.setVisibility(r4)
            r3 = 0
            r7.f303220F = r3
        L_0x07a8:
            boolean r3 = r7.f303365cW
            boolean r4 = r7.f303284ar
            if (r1 != 0) goto L_0x07b8
            if (r4 != 0) goto L_0x07b8
            if (r0 != 0) goto L_0x07b6
            if (r2 != 0) goto L_0x07b6
            if (r3 == 0) goto L_0x07b8
        L_0x07b6:
            r0 = 1
            goto L_0x07b9
        L_0x07b8:
            r0 = 0
        L_0x07b9:
            r7.f303367cY = r0
            boolean r0 = r31.mo97521bm()
            if (r0 == 0) goto L_0x07d6
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248275bi
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x07d6
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142257aE(r32)
            if (r0 == 0) goto L_0x07d6
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            r0.mo95370L()
        L_0x07d6:
            int r0 = r7.f303368cZ
            r1 = 6
            if (r0 != r1) goto L_0x0804
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = r7.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r1 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.UNINITIALIZED
            if (r0 == r1) goto L_0x0804
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            r0.mo95387aC()
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r7.f303238X
            r1 = 0
            r0.mo96115N(r1)
            com.google.android.apps.gsa.staticplugins.opa.az.i r0 = r7.f303454s
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.STOP_LISTENING
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r2)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r1 = r1.mo82013a()
            r0.mo96219b(r1)
            com.google.android.apps.gsa.staticplugins.opa.bc.f r0 = r7.f303218D
            r1 = 4
            r0.mo96344a(r1)
            goto L_0x0827
        L_0x0804:
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142257aE(r32)
            if (r0 != 0) goto L_0x0813
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_STARTING
            r7.mo97463aY(r0)
            r31.m181388ce()
            goto L_0x0827
        L_0x0813:
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = r7.f303364cV
            r7.mo97463aY(r0)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            boolean r0 = r0.mo95399aj()
            if (r0 == 0) goto L_0x0824
            r0 = 2
            r7.mo97497bG(r0)
        L_0x0824:
            r31.m181388ce()
        L_0x0827:
            boolean r0 = r7.f303367cY
            if (r0 != 0) goto L_0x0832
            com.google.android.apps.gsa.staticplugins.opa.ic r0 = r7.f303351cE
            if (r0 == 0) goto L_0x0832
            r0.mo97734a()
        L_0x0832:
            com.google.android.apps.gsa.staticplugins.opa.js r0 = r7.f303216B
            r0.f304541a = r8
            android.content.Intent r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142324w(r32)
            if (r0 != 0) goto L_0x083d
            goto L_0x086a
        L_0x083d:
            java.lang.Class<com.google.android.apps.gsa.staticplugins.opa.fj> r1 = com.google.android.apps.gsa.staticplugins.opa.C109040fj.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r8.setClassLoader(r1)
            java.lang.String r1 = "com.google.opa.QUERY"
            java.lang.String r1 = r0.getStringExtra(r1)
            if (r1 != 0) goto L_0x085d
            java.lang.String r1 = "android.intent.action.DRL_HISTORY"
            java.lang.String r2 = r0.getAction()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x085b
            goto L_0x085d
        L_0x085b:
            r1 = 0
            goto L_0x085e
        L_0x085d:
            r1 = 1
        L_0x085e:
            com.google.android.apps.gsa.staticplugins.opa.gb r2 = r7.f303456u
            r2.mo65089a(r0)
            if (r1 != 0) goto L_0x086a
            android.app.Activity r0 = r7.f303441f
            r0.finish()
        L_0x086a:
            java.lang.String r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142240O(r32)
            byte[] r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142275aW(r32)
            if (r1 == 0) goto L_0x0935
            boolean r2 = com.google.common.base.C58879cp.m90962d(r1)
            if (r2 == 0) goto L_0x087c
            goto L_0x0935
        L_0x087c:
            int r2 = r7.f303368cZ
            r3 = 3
            r4 = 1
            if (r2 == r4) goto L_0x08a4
            if (r2 == r3) goto L_0x08a4
            com.google.common.f.e r0 = f303210a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ChatUiController"
            r0.mo56378ag(r1, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 22666(0x588a, float:3.1762E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Text queries cannot be committed in mic state: %d"
            int r2 = r7.f303368cZ
            r0.mo56387q(r1, r2)
            goto L_0x0935
        L_0x08a4:
            com.google.android.apps.gsa.shared.search.QueryTriggerType r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142232G(r32)
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r32)
            com.google.android.apps.gsa.shared.search.QueryTriggerType r9 = com.google.android.apps.gsa.shared.search.QueryTriggerType.OPA_PROACTIVE_NOTIFICATION
            if (r2 == r9) goto L_0x0935
            if (r2 != 0) goto L_0x08b4
            com.google.android.apps.gsa.shared.search.QueryTriggerType r2 = com.google.android.apps.gsa.shared.search.QueryTriggerType.USER
        L_0x08b4:
            android.os.Bundle r9 = r31.mo97535g()
            if (r0 == 0) goto L_0x08bf
            java.lang.String r11 = "android.opa.extra.CONVERSATION_DELTA"
            r9.putByteArray(r11, r0)
        L_0x08bf:
            java.lang.String r0 = "android.opa.extra.INITIAL_QUERY"
            r11 = 1
            r9.putBoolean(r0, r11)
            int r0 = r4.ca
            r9.putInt(r6, r0)
            java.lang.String r0 = "android.search.extra.AOG_DISCOVERY_INFO"
            byte[] r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142272aT(r32)
            r9.putByteArray(r0, r4)
            java.lang.String r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142239N(r32)
            if (r0 == 0) goto L_0x08de
            java.lang.String r4 = "android.search.extra.PARENT_EVENT_ID"
            r9.putString(r4, r0)
        L_0x08de:
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142286aj(r32)
            if (r0 == 0) goto L_0x08ed
            android.os.Bundle r0 = r7.f303281ao
            int r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142309h(r32)
            r0.putInt(r5, r4)
        L_0x08ed:
            com.google.android.apps.gsa.staticplugins.opa.aw.a r0 = r7.f303234T
            int r0 = r0.mo95358d()
            if (r0 == r3) goto L_0x0901
            boolean r0 = r31.mo97522bo()
            if (r0 != 0) goto L_0x0901
            r0 = 2
            r3 = 1
            r7.mo97499bI(r3, r0)
            goto L_0x0902
        L_0x0901:
            r3 = 1
        L_0x0902:
            java.lang.String r4 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142245T(r32)
            boolean r6 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142271aS(r32)
            r7.mo97543p(r1, r3, r3)
            r5 = 0
            r0 = r31
            r3 = r9
            r0.mo97501bK(r1, r2, r3, r4, r5, r6)
            int r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142303b(r32)
            r1 = -1
            if (r0 == r1) goto L_0x0935
            dagger.a r0 = r7.f303399dD
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bm r0 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114816bm) r0
            int r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142303b(r32)
            com.google.android.libraries.storage.protostore.ab r2 = r0.mo101623a()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bl r3 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bl
            r3.<init>(r0, r1)
            java.util.concurrent.Executor r0 = r0.f318580b
            r2.mo46039a(r3, r0)
        L_0x0935:
            if (r12 == 0) goto L_0x094d
            android.widget.ImageView r0 = r12.mo95329b()
            com.google.android.apps.gsa.staticplugins.opa.ag.f r1 = new com.google.android.apps.gsa.staticplugins.opa.ag.f
            r1.<init>(r12)
            r0.setOnClickListener(r1)
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142291ao(r32)
            if (r0 == 0) goto L_0x094d
            r0 = 1
            r12.mo95330c(r0)
        L_0x094d:
            boolean r0 = r31.mo97519bk()
            if (r0 == 0) goto L_0x09d8
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            boolean r1 = r0 instanceof com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113986e
            if (r1 != 0) goto L_0x09d8
            boolean r0 = m181378bx(r0)
            if (r0 == 0) goto L_0x0981
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.mo100871cA(r2)
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r7.f303323bd
            com.google.android.apps.gsa.staticplugins.opa.greeting.ar r0 = r0.f303830g
            if (r0 == 0) goto L_0x0994
            android.widget.ImageView r0 = r0.f303774g
            r0.setVisibility(r10)
            goto L_0x0994
        L_0x0981:
            android.widget.ImageView r0 = r7.f303229O
            com.google.android.apps.gsa.staticplugins.opa.aw.a r1 = r7.f303234T
            int r1 = r1.mo95356b()
            int r1 = -r1
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.widget.ImageView r0 = r7.f303229O
            r1 = 0
            r0.setVisibility(r1)
        L_0x0994:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            r0.mo95414ay()
            java.util.concurrent.atomic.AtomicReference r0 = r7.f303233S
            com.google.android.apps.gsa.staticplugins.opa.cd r1 = new com.google.android.apps.gsa.staticplugins.opa.cd
            r1.<init>(r7)
            r2 = 0
        L_0x09a1:
            boolean r3 = r0.compareAndSet(r2, r1)
            if (r3 == 0) goto L_0x09c0
            com.google.android.apps.gsa.shared.util.c.ca r0 = r7.f303447l
            java.util.concurrent.atomic.AtomicReference r1 = r7.f303233S
            java.lang.Object r1 = r1.get()
            com.google.android.apps.gsa.shared.util.c.av r1 = (com.google.android.apps.gsa.shared.util.p7159c.C90888av) r1
            r1.getClass()
            com.google.android.apps.gsa.search.core.i.t r2 = r7.f303455t
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247426gt
            long r2 = r2.mo79743a(r3)
            r0.mo85137b(r1, r2)
            goto L_0x09c6
        L_0x09c0:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x09a1
        L_0x09c6:
            com.google.common.base.ax r0 = r7.f303268ab
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x09db
            android.view.View r0 = r7.f303220F
            if (r0 == 0) goto L_0x09db
            r3 = 8
            r0.setVisibility(r3)
            goto L_0x09db
        L_0x09d8:
            r31.m181390cg()
        L_0x09db:
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247206cl
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x09fe
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            boolean r0 = m181378bx(r0)
            if (r0 == 0) goto L_0x09fe
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            r0.mo100869bx()
        L_0x09fe:
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247206cl
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0a15
            com.google.android.apps.gsa.staticplugins.opa.ac.r r0 = r7.f303262aV
            boolean r0 = r0.mo95240v()
            if (r0 == 0) goto L_0x0a15
            com.google.android.apps.gsa.staticplugins.opa.ac.r r0 = r7.f303262aV
            r0.mo95227i()
        L_0x0a15:
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.g r0 = r7.f303270ad
            dagger.a r1 = r0.f314639f
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.aa.bh r1 = (com.google.android.apps.gsa.shared.p6968aa.C89037bh) r1
            com.google.common.util.concurrent.cx r1 = r1.mo27378c()
            com.google.android.libraries.gsa.k.g r2 = r0.f314635b
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.d r3 = new com.google.android.apps.gsa.staticplugins.opa.translator.offline.d
            r3.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r0 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r4 = "check network availability callback"
            r0.<init>(r1, r2, r4, r3)
            com.google.android.apps.gsa.staticplugins.opa.translator.offline.e r1 = com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113626e.f314630a
            r0.mo85223a(r1)
            dagger.a r0 = r7.f303285as
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0a5d
            dagger.a r0 = r7.f303285as
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.assistant.shared.e r0 = (com.google.android.apps.gsa.assistant.shared.e) r0
            android.content.Context r1 = r7.f303346c
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r13)
            boolean r3 = r7.f303259aS
            r0.b(r1, r2, r3)
        L_0x0a5d:
            com.google.android.apps.gsa.staticplugins.opa.u.a r0 = r7.f303362cT
            boolean r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142294ar(r32)
            r0.f314914a = r1
            long r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142316o(r32)
            r0.f314915b = r1
            com.google.android.apps.gsa.staticplugins.opa.ac.r r0 = r7.f303262aV
            boolean r0 = r0.mo95240v()
            if (r0 == 0) goto L_0x0a78
            com.google.android.apps.gsa.staticplugins.opa.ac.r r0 = r7.f303262aV
            r0.mo95236r()
        L_0x0a78:
            com.google.android.apps.gsa.shared.ah.g r0 = r7.f303376ch
            com.google.android.apps.gsa.staticplugins.opa.ac.r r1 = r7.f303262aV
            boolean r1 = r1.mo95240v()
            r0.mo83137k(r1)
            boolean r0 = r31.mo97527bu()
            if (r0 == 0) goto L_0x0a96
            com.google.common.base.ax r0 = r7.f303319bZ
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.aq.g r0 = (com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107383g) r0
            com.google.android.apps.gsa.staticplugins.opa.ui.ThinkingIndicator r0 = r0.f298867d
            r0.mo100562a()
        L_0x0a96:
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            boolean r0 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188690a(r0)
            if (r0 == 0) goto L_0x0aab
            android.os.Bundle r0 = r7.f303442g
            boolean r0 = r7.mo97491bA(r0)
            if (r0 == 0) goto L_0x0aab
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r7.f303238X
            r0.mo96168at()
        L_0x0aab:
            dagger.a r0 = r7.f303400dE
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.samson.shared.b r0 = (com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b) r0
            boolean r0 = r0.mo98629a()
            if (r0 == 0) goto L_0x0b17
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142263aK(r32)
            if (r0 == 0) goto L_0x0b17
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.d r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107478d.f299062c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.c r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107477c) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.d r1 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107478d) r1
            int r2 = r1.f299064a
            r3 = 1
            r2 = r2 | r3
            r1.f299064a = r2
            r1.f299065b = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.staticplugins.opa.as.a.a.d r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107478d) r0
            com.google.android.apps.gsa.staticplugins.opa.as.a.e r1 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e.f299115c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.as.a.d r1 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d) r1
            com.google.android.apps.gsa.staticplugins.opa.as.a.c r2 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c.OPA_CHARGING_AMBIENT_STATE
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.staticplugins.opa.as.a.e r3 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e) r3
            int r2 = r2.f299114n
            r3.f299118b = r2
            int r2 = r3.f299117a
            r4 = 1
            r2 = r2 | r4
            r3.f299117a = r2
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107476b.f299061a
            r1.mo58885m(r2, r0)
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.as.a.e r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e) r0
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_SESSION_CLIENT_EVENT
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a.f299029a
            r1.mo82014b(r2, r0)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r1.mo82013a()
            com.google.android.apps.gsa.staticplugins.opa.az.i r1 = r7.f303454s
            r1.mo96219b(r0)
        L_0x0b17:
            boolean r0 = r7.f303371cc
            if (r0 == 0) goto L_0x0b86
            android.os.Bundle r0 = r7.f303442g
            java.lang.String r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142244S(r0)
            boolean r1 = com.google.common.base.C58837ba.m90859h(r0)
            if (r1 != 0) goto L_0x0b50
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r1 = new com.google.android.apps.gsa.staticplugins.opa.chatui.je
            r1.<init>()
            r1.f301663e = r0
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r7.f303450o
            r2.mo95430s(r1)
            r7.mo97444aF(r0)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            boolean r0 = m181378bx(r0)
            if (r0 == 0) goto L_0x0b50
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r7.f303450o
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r0
            com.google.common.base.ax r0 = r0.mo100833bf()
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r0 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r0
            r1 = 1
            r0.mo100848bJ(r1)
        L_0x0b50:
            com.google.android.apps.gsa.staticplugins.opa.as.a.e r0 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e.f299115c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.as.a.d r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d) r0
            com.google.android.apps.gsa.staticplugins.opa.as.a.c r1 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c.OPA_UI_READY_FOR_NGA
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.staticplugins.opa.as.a.e r2 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e) r2
            int r1 = r1.f299114n
            r2.f299118b = r1
            int r1 = r2.f299117a
            r3 = 1
            r1 = r1 | r3
            r2.f299117a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.staticplugins.opa.as.a.e r0 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e) r0
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_SESSION_CLIENT_EVENT
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a.f299029a
            r1.mo82014b(r2, r0)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r1.mo82013a()
            com.google.android.apps.gsa.staticplugins.opa.az.i r1 = r7.f303454s
            r1.mo96219b(r0)
        L_0x0b86:
            android.os.Bundle r0 = r7.f303442g
            boolean r0 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142290an(r0)
            if (r0 == 0) goto L_0x0bb8
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248414V
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0bb8
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248560ci
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0bb3
            dagger.a r0 = r7.f303397dB
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.util.k r0 = (com.google.android.apps.gsa.staticplugins.opa.util.C113880k) r0
            android.os.Bundle r1 = r7.f303442g
            com.google.android.apps.gsa.assistant.shared.l.e r1 = com.google.android.apps.gsa.search.shared.p6930h.C87564g.m142223a(r1)
            r0.mo65345b(r1)
        L_0x0bb3:
            com.google.android.apps.gsa.staticplugins.opa.promo.l r0 = r7.f303330bk
            r0.mo98260b()
        L_0x0bb8:
            com.google.android.apps.gsa.staticplugins.opa.chathead.a r0 = r7.f303329bj
            r0.mo96472e()
            android.app.Activity r0 = r7.f303441f
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r7.mo97465aa(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109040fj.mo97480ap(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aq */
    public final void mo97481aq() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f303455t.mo79746e(C90063do.f249297aq) && m181407cx()) {
            this.f303238X.mo96198z(e.i);
            if (this.f303455t.mo79746e(C90063do.f249296ap)) {
                this.f303238X.mo96151ac(false);
            }
        } else if (m181408cy()) {
            this.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_CLICK_OUT);
        }
    }

    /* renamed from: ar */
    public final void mo97482ar(List<C108430ik> list) {
        if (this.f303371cc) {
            C58976aa aaVar = C58975e.f156826a;
            C107759j jVar = (C107759j) this.f303375cg.mo27525b();
            if (!this.f303304bK) {
                list = C58485gu.m89845m();
            }
            C58480gp e = C58485gu.m89837e();
            for (C108430ik ikVar : list) {
                String f = ikVar.mo96708f();
                if (!f.isEmpty()) {
                    C83634aw awVar = (C83634aw) C83635ax.f227995e.createBuilder();
                    awVar.copyOnWrite();
                    C83635ax axVar = (C83635ax) awVar.instance;
                    f.getClass();
                    axVar.f227997a |= 1;
                    axVar.f227998b = f;
                    C51994gt gtVar = ikVar.f301606m;
                    if (gtVar != null) {
                        awVar.copyOnWrite();
                        C83635ax axVar2 = (C83635ax) awVar.instance;
                        axVar2.f227999c = gtVar;
                        axVar2.f227997a |= 2;
                    }
                    if (ikVar instanceof C108229b) {
                        String uri = ((C108229b) ikVar).mo96600a().toUri(0);
                        awVar.copyOnWrite();
                        C83635ax axVar3 = (C83635ax) awVar.instance;
                        uri.getClass();
                        axVar3.f227997a |= 4;
                        axVar3.f228000d = uri;
                    }
                    e.mo55395g((C83635ax) awVar.build());
                }
            }
            C58485gu f2 = e.mo55394f();
            C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
            C83649bk bkVar = (C83649bk) C83650bl.f228018b.createBuilder();
            bkVar.copyOnWrite();
            C83650bl blVar = (C83650bl) bkVar.instance;
            C62971cq cqVar = blVar.f228020a;
            if (!cqVar.mo58948c()) {
                blVar.f228020a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) f2, (List) blVar.f228020a);
            wVar.copyOnWrite();
            C83673y yVar = (C83673y) wVar.instance;
            C83650bl blVar2 = (C83650bl) bkVar.build();
            blVar2.getClass();
            yVar.f228084c = blVar2;
            yVar.f228083b = 7;
            jVar.mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
        }
    }

    /* renamed from: as */
    public final void mo97483as() {
        C58976aa aaVar = C58975e.f156826a;
        this.f303238X.mo96112K();
        this.f303453r.mo96203e();
        mo97511bc();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: at */
    public final void mo97484at() {
        int i;
        AnimatorSet animatorSet;
        if ((this.f303225K.mo95249a() != 8 || ((animatorSet = this.f303280an) != null && animatorSet.isRunning())) && !this.f303343bx) {
            this.f303343bx = true;
            this.f303279am = new AnimatorSet();
            AnimatorSet c = this.f303225K.mo95251c();
            if (m181378bx(this.f303450o)) {
                AnimatorSet aP = ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100836aP();
                c.addListener(new C108510cq(this));
                aP.addListener(new C108511cr(this));
                this.f303279am.playSequentially(new Animator[]{c, aP});
                AnimatorSet animatorSet2 = this.f303280an;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    this.f303279am.start();
                } else {
                    this.f303280an.addListener(new C108512cs(this));
                }
            } else if (!this.f303259aS) {
                if (this.f303254aN.mo56113h()) {
                    i = ((C88522b) this.f303254aN.mo56107c()).mo82139a();
                } else {
                    Window window = this.f303356cN;
                    window.getClass();
                    i = window.getStatusBarColor();
                }
                ValueAnimator bT = m181369bT(i, this.f303309bP.mo96667j());
                bT.setDuration(100);
                bT.setStartDelay(200);
                c.addListener(new C108514cu(this));
                this.f303279am.playTogether(new Animator[]{c, bT});
                this.f303279am.start();
            } else {
                c.addListener(new C108513ct(this));
                c.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: au */
    public final void mo97485au() {
        C107698i iVar = this.f303454s;
        C88489j jVar = new C88489j(C87739bu.OPA_DISPLAY_CONTEXT_UPDATED);
        C62940bt btVar = C88105pi.f238198a;
        C88106pj pjVar = (C88106pj) C88107pk.f238199h.createBuilder();
        pjVar.copyOnWrite();
        C88107pk pkVar = (C88107pk) pjVar.instance;
        pkVar.f238201a |= 4;
        pkVar.f238204d = false;
        jVar.mo82014b(btVar, (C88107pk) pjVar.build());
        iVar.mo96219b(jVar.mo82013a());
        mo97484at();
        this.f303289aw = null;
        this.f303315bV.f300678a = false;
        if (m181378bx(this.f303450o)) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100856bX();
        }
    }

    /* renamed from: av */
    public final void mo97486av() {
        if (this.f303386cr) {
            this.f303386cr = false;
        } else if (!this.f303455t.mo79746e(C90037cp.f248440aU) || !this.f303406dK) {
            ((C113880k) this.f303397dB.mo27525b()).mo65345b(C87564g.m142223a(this.f303442g));
            this.f303406dK = true;
        }
    }

    /* renamed from: aw */
    public final void mo97487aw() {
        C109743nq nqVar = this.f303227M;
        if (nqVar != null) {
            ((ViewGroup) nqVar.f305741b.getParent()).removeView(nqVar.f305741b);
            this.f303227M = null;
            this.f303376ch.mo83142p(false);
        }
        if (this.f303371cc) {
            mo97511bc();
        }
    }

    /* renamed from: ax */
    public final void mo97488ax(TtsRequest ttsRequest) {
        m181398co(ttsRequest, true);
    }

    /* renamed from: ay */
    public final void mo97489ay(TtsRequest ttsRequest) {
        m181398co(ttsRequest, false);
    }

    /* renamed from: az */
    public final void mo97490az(boolean z) {
        if (this.f303323bd.mo97613e()) {
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            C109026ey eyVar = C109026ey.UNINITIALIZED;
            C83572ac acVar = C83572ac.UNINITIALIZED;
            C113984c cVar = C113984c.UNKNOWN;
            C108228az azVar = C108228az.UNINITIALIZED;
            switch (this.f303323bd.f303833j.ordinal()) {
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    View view = this.f303221G;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    this.f303238X.mo96143aP();
                    break;
            }
            this.f303323bd.mo97611c();
            if (this.f303370cb && !mo97522bo()) {
                this.f303450o.mo95420i().getLayoutParams().height = -2;
            }
            mo97512bd(false);
            if (m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100888cc(this.f303323bd.f303833j, z);
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public final void mo82168b(CharSequence charSequence, C28292j jVar) {
        mo97549v(charSequence, QueryTriggerType.USER, mo97535g(), C113861cp.m188491a(jVar));
    }

    /* renamed from: bA */
    public final boolean mo97491bA(Bundle bundle) {
        if (!this.f303455t.mo79746e(C90014bt.f247760nI) || !mo97530by()) {
            return false;
        }
        if (C87566i.m142292ap(bundle) || C87566i.m142270aR(bundle)) {
            return true;
        }
        return false;
    }

    /* renamed from: bB */
    public final boolean mo97492bB() {
        if (this.f303455t.mo79746e(C90014bt.f247724mZ)) {
            return true;
        }
        if (!this.f303455t.mo79746e(C90037cp.f248601ds) || this.f303323bd.f303833j != C113984c.UPGRADED_USER_WITH_TIMEOUT_TO_QUERY_SUGGESTION) {
            return false;
        }
        return true;
    }

    /* renamed from: bC */
    public final boolean mo97493bC(boolean z) {
        if (this.f303455t.mo79746e(C90053de.f248982o)) {
            C58976aa aaVar = C58975e.f156826a;
            ((C113787bc) this.f303420dg.mo27525b()).mo100626f();
        }
        if (this.f303262aV.mo95240v() || this.f303455t.mo79746e(C90037cp.f248599dq) || (this.f303455t.mo79746e(C90037cp.f248438aS) && !this.f303329bj.mo96476i())) {
            return false;
        }
        if (this.f303455t.mo79746e(C90037cp.f248437aR) && this.f303429dp.c()) {
            return false;
        }
        boolean z2 = this.f303455t.mo79746e(C90014bt.f247148bg) && mo97517bi();
        if (!((C113787bc) this.f303420dg.mo27525b()).mo100629i(this.f303455t.mo79746e(C90053de.f248952S)) || ((this.f303323bd.mo97613e() && !z2) || m181381cC(z) || this.f303424dk || ((int) this.f303455t.mo79743a(C90014bt.f247689lr)) == 0 || this.f303324be.mo95323d(this.f303442g))) {
            return false;
        }
        return true;
    }

    /* renamed from: bD */
    public final boolean mo97494bD() {
        com.google.android.apps.gsa.assistant.shared.l.e eVar;
        if (!C87566i.m142290an(this.f303442g) && !this.f303297bD) {
            if (C87566i.m142240O(this.f303442g) != null || C87566i.m142244S(this.f303442g) != null) {
                return true;
            }
            C113916t tVar = this.f303320ba;
            if (tVar.f315402l == com.google.android.apps.gsa.assistant.shared.l.e.O || (eVar = tVar.f315402l) == com.google.android.apps.gsa.assistant.shared.l.e.Q || eVar == com.google.android.apps.gsa.assistant.shared.l.e.P) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bE */
    public final boolean mo97495bE(Bundle bundle) {
        return (this.f303455t.mo79746e(C90014bt.f247669lX) && C87566i.m142285ai(C87564g.m142223a(bundle))) || this.f303274ah.mo96078e(bundle);
    }

    /* renamed from: bF */
    public final boolean mo97496bF() {
        if (m181407cx() || m181409cz()) {
            return false;
        }
        if (this.f303455t.mo79743a(C90014bt.f247689lr) != 2 || !m181378bx(this.f303450o) || !((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100860bh().booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0159  */
    /* renamed from: bG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97497bG(int r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.opa.ey r0 = r5.f303275ai
            com.google.android.apps.gsa.staticplugins.opa.ey r1 = com.google.android.apps.gsa.staticplugins.opa.C109026ey.MODE_HIDDEN
            if (r0 == r1) goto L_0x0161
            boolean r0 = r5.f303259aS
            if (r0 == 0) goto L_0x000c
            goto L_0x0161
        L_0x000c:
            android.view.Window r0 = r5.f303356cN
            r0.getClass()
            com.google.android.apps.gsa.staticplugins.opa.chatui.iq r0 = r5.f303225K
            int r0 = r0.mo95249a()
            if (r0 != 0) goto L_0x001f
            com.google.android.apps.gsa.staticplugins.opa.chatui.iq r6 = r5.f303225K
            int r6 = r6.mo95260l()
        L_0x001f:
            boolean r0 = r5.mo97521bm()
            r1 = 1
            if (r0 != 0) goto L_0x002e
            android.app.Activity r0 = r5.f303441f
            boolean r0 = com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a.m130503a(r0)
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r6 = 1
        L_0x002f:
            int r0 = r5.f303390cv
            r2 = 3
            r3 = 2
            if (r0 != r3) goto L_0x0042
            com.google.android.apps.gsa.search.core.i.t r6 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247289eO
            boolean r6 = r6.mo79746e(r0)
            if (r6 == 0) goto L_0x0041
            r6 = 3
            goto L_0x0042
        L_0x0041:
            r6 = 2
        L_0x0042:
            if (r6 == r3) goto L_0x0051
            r0 = 0
            if (r6 != r2) goto L_0x0052
            boolean r6 = r5.mo97518bj()
            if (r6 != 0) goto L_0x004f
            r6 = 3
            goto L_0x0051
        L_0x004f:
            r6 = 3
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            com.google.common.base.ax r4 = r5.f303254aN
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x005b
            goto L_0x0081
        L_0x005b:
            android.view.Window r4 = r5.f303356cN
            r4.getClass()
            android.view.View r4 = r4.getDecorView()
            int r4 = r4.getSystemUiVisibility()
            if (r0 == 0) goto L_0x0076
            android.view.Window r0 = r5.f303356cN
            android.view.View r0 = r0.getDecorView()
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r0.setSystemUiVisibility(r4)
            goto L_0x0081
        L_0x0076:
            android.view.Window r0 = r5.f303356cN
            android.view.View r0 = r0.getDecorView()
            r4 = r4 & -8193(0xffffffffffffdfff, float:NaN)
            r0.setSystemUiVisibility(r4)
        L_0x0081:
            android.view.Window r0 = r5.f303356cN
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r0.clearFlags(r4)
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r5.f303238X
            j$.util.OptionalInt r0 = r0.mo96188p()
            com.google.android.apps.gsa.staticplugins.opa.ay.as r4 = r5.f303238X
            boolean r4 = r4.mo96133aF()
            if (r4 == 0) goto L_0x00cb
            boolean r4 = r0.isPresent()
            if (r4 == 0) goto L_0x00cb
            dagger.a r4 = r5.f303380cl
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.cv r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv) r4
            boolean r4 = r4.mo99906b()
            if (r4 != 0) goto L_0x00b8
            dagger.a r4 = r5.f303380cl
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.cv r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv) r4
            boolean r4 = r4.mo99909e()
            if (r4 == 0) goto L_0x00c0
        L_0x00b8:
            com.google.android.apps.gsa.staticplugins.opa.ay.as r4 = r5.f303238X
            boolean r4 = r4.mo96132aE()
            if (r4 == 0) goto L_0x00cb
        L_0x00c0:
            int r0 = r0.getAsInt()
            r5.mo97449aK(r0)
            r5.f303391cw = r6
            goto L_0x0145
        L_0x00cb:
            int r0 = r6 + -1
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            com.google.android.apps.gsa.opa.ac r4 = com.google.android.apps.gsa.opa.C83572ac.UNINITIALIZED
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r4 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.UNKNOWN
            com.google.android.apps.gsa.staticplugins.opa.chatui.az r4 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az.UNINITIALIZED
            if (r6 == 0) goto L_0x015f
            if (r0 == 0) goto L_0x013c
            if (r0 == r1) goto L_0x00f4
            if (r0 == r3) goto L_0x00ea
            if (r0 == r2) goto L_0x00e0
            goto L_0x0145
        L_0x00e0:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r5.f303309bP
            int r6 = r6.mo96675r()
            r5.mo97449aK(r6)
            goto L_0x0145
        L_0x00ea:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r5.f303309bP
            int r6 = r6.mo96649V()
            r5.mo97449aK(r6)
            goto L_0x0145
        L_0x00f4:
            boolean r6 = r5.f303370cb
            if (r6 == 0) goto L_0x0120
            com.google.android.apps.gsa.search.core.i.t r6 = r5.f303455t
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248203Q
            boolean r6 = r6.mo79746e(r0)
            if (r6 == 0) goto L_0x0120
            android.app.Activity r6 = r5.f303441f
            boolean r6 = com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a.m130503a(r6)
            if (r6 != 0) goto L_0x0120
            int r6 = r5.f303390cv
            if (r6 == r3) goto L_0x0120
            com.google.android.apps.gsa.staticplugins.opa.chatui.iq r6 = r5.f303225K
            int r6 = r6.mo95249a()
            if (r6 != 0) goto L_0x0120
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r5.f303309bP
            int r6 = r6.mo96675r()
            r5.mo97449aK(r6)
            goto L_0x0145
        L_0x0120:
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r6 = r5.f303409dN
            boolean r6 = r6.mo93971b()
            if (r6 == 0) goto L_0x0132
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r5.f303309bP
            int r6 = r6.mo96644Q()
            r5.mo97449aK(r6)
            goto L_0x0145
        L_0x0132:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r5.f303309bP
            int r6 = r6.mo96667j()
            r5.mo97449aK(r6)
            goto L_0x0145
        L_0x013c:
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r5.f303309bP
            int r6 = r6.mo96644Q()
            r5.mo97449aK(r6)
        L_0x0145:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r6 = r5.f303450o
            com.google.android.apps.gsa.staticplugins.opa.chatui.bh r6 = r6.mo95422k()
            boolean r6 = r6.mo96658ad()
            r0 = 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0159
            android.view.Window r6 = r5.f303356cN
            r6.clearFlags(r0)
            return
        L_0x0159:
            android.view.Window r6 = r5.f303356cN
            r6.setFlags(r0, r0)
            return
        L_0x015f:
            r6 = 0
            throw r6
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109040fj.mo97497bG(int):void");
    }

    /* renamed from: bH */
    public final void mo97498bH(boolean z, boolean z2, boolean z3, int i) {
        C109100ar arVar;
        if (z3) {
            ((C109467mf) this.f303313bT.mo27525b()).mo97847b(C89849ae.OPA_INPUT_PLATE_SWIPE_UP);
        }
        if (!this.f303295bB) {
            C110014a aVar = this.f303265aY;
            if (aVar != null && aVar.mo98293e() && aVar.mo98294f()) {
                return;
            }
            if (z || z3 || !mo97519bk() || mo97526bt() || ((((Boolean) this.f303426dm.mo27525b()).booleanValue() && i == 2) || i == 14)) {
                this.f303450o.mo95420i().setClipToOutline(false);
                C110014a aVar2 = this.f303265aY;
                if (aVar2 != null) {
                    aVar2.mo98291a();
                }
                C107606q qVar = this.f303239Y;
                if (qVar != null) {
                    qVar.mo96068c();
                }
                if ((i == 7 || i == 13) && this.f303403dH.mo97732c() && this.f303455t.mo79746e(C90014bt.f247188cT)) {
                    C109266ia iaVar = this.f303403dH;
                    C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
                    adVar.copyOnWrite();
                    C87696ae aeVar = (C87696ae) adVar.instance;
                    aeVar.f237134a |= 1024;
                    aeVar.f237144k = false;
                    iaVar.mo97731b(adVar, true);
                    iaVar.mo97730a(adVar);
                }
                if (z3 && (arVar = this.f303323bd.f303830g) != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    arVar.mo97594j(C89849ae.OPA_FRE_INPUT_PLATE_SWIPE_UP);
                }
                mo97490az(false);
                mo97414B();
                if (z2) {
                    mo97459aU();
                }
                if (!this.f303450o.mo95399aj()) {
                    if (m181378bx(this.f303450o)) {
                        ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100916dy(i);
                    }
                    this.f303450o.mo95380V(true);
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f303450o.mo95420i().getLayoutParams().height, mo97533e()});
                    ofInt.addUpdateListener(new C108099bm(this));
                    ofInt.addListener(new C108784dr(this, z));
                    ofInt.setDuration(300);
                    ofInt.setInterpolator(this.f303241aA);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (!this.f303294bA || !this.f303455t.mo79746e(C90014bt.f247131bP)) {
                        animatorSet.play(ofInt);
                    } else {
                        animatorSet.playTogether(new Animator[]{ofInt, m181368bS()});
                    }
                    if (this.f303254aN.mo56113h()) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.setDuration(300);
                        animatorSet2.setInterpolator(this.f303241aA);
                        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{C1878d.m5128a(this.f303441f, R.color.chatui_scrim_background_translucent), C1878d.m5128a(this.f303441f, R.color.chatui_scrim_background_opaque)});
                        ofArgb.addUpdateListener(new C108101bn(this));
                        ofArgb.addListener(new C108785ds(this));
                        animatorSet2.playTogether(new Animator[]{animatorSet, ofArgb});
                        animatorSet = animatorSet2;
                    }
                    this.f303276aj = animatorSet;
                    animatorSet.start();
                    mo97471ag(false);
                } else if (this.f303450o.mo95399aj()) {
                    mo97552y();
                    if (this.f303238X.mo96134aG() && z) {
                        this.f303238X.mo96151ac(true);
                    }
                }
            }
        }
    }

    /* renamed from: bI */
    public final void mo97499bI(boolean z, int i) {
        View findViewById;
        C1773f fVar = (C1773f) this.f303450o.mo95420i().getLayoutParams();
        if (z) {
            if (m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100916dy(i);
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100858bZ();
            }
            mo97471ag(false);
            fVar.height = -1;
            if (!mo97528bv()) {
                mo97552y();
                return;
            }
            return;
        }
        int i2 = this.f303355cM;
        if (mo97519bk()) {
            i2 = this.f303355cM + this.f303346c.getResources().getDimensionPixelSize(R.dimen.chatui_header_with_lock_icon_container_height_v2);
        }
        if (!mo97522bo()) {
            boolean bB = mo97492bB();
            if (!this.f303370cb || bB) {
                fVar.height = i2;
            } else {
                fVar.height = -2;
            }
            if (this.f303370cb && bB && (findViewById = this.f303450o.mo95419h().findViewById(R.id.valyrian_container)) != null) {
                findViewById.getLayoutParams().height = -1;
            }
        }
        if (this.f303455t.mo79746e(C90014bt.f247341fN) || this.f303455t.mo79746e(C90014bt.f247762nK)) {
            if (!this.f303455t.mo79746e(C90014bt.f247340fM)) {
                m181382cD(1);
            } else if (this.f303455t.mo79746e(C90014bt.f247343fP)) {
                m181382cD(3);
            } else {
                m181382cD(2);
            }
        }
        this.f303228N.setTranslationY((float) (-this.f303355cM));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bJ */
    public final C108492ci mo97500bJ() {
        if (this.f303410dO == null) {
            this.f303410dO = new C108492ci(this);
        }
        return this.f303410dO;
    }

    @Deprecated
    /* renamed from: bK */
    public final void mo97501bK(CharSequence charSequence, QueryTriggerType queryTriggerType, Bundle bundle, String str, C51994gt gtVar, boolean z) {
        C113855cj k = C113858cm.m188476k();
        k.mo100705c(charSequence);
        k.mo100706d(queryTriggerType);
        C113890u uVar = (C113890u) k;
        uVar.f315323b = bundle;
        k.mo100707e(z);
        if (str != null) {
            uVar.f315324c = C58833ax.m90834k(C113889t.m188535a(str));
        }
        if (gtVar != null) {
            uVar.f315326e = C58833ax.m90834k(gtVar);
        }
        mo97548u(k.mo100703a());
    }

    /* renamed from: bL */
    public final void mo97502bL() {
        this.f303450o.mo95377S();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bM */
    public final void mo97503bM() {
        this.f303314bU.mo101383a();
        if (!this.f303284ar || !this.f303394cz.f296314a || !this.f303450o.mo95402am()) {
            this.f303314bU.mo101383a();
            long j = this.f303434du;
            if (j != 0) {
                mo97551x(C58833ax.m90834k(Long.valueOf(j)));
            } else {
                mo97551x(C58836b.f156633a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bN */
    public final void mo97504bN(boolean z) {
        if (!m181378bx(this.f303450o)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        WebImageView ba = ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100859ba();
        if (ba == null) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else if (!z) {
            ba.setVisibility(8);
        } else if (C58837ba.m90859h(ba.mo76734e()) || ba.getContentDescription().length() == 0) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else if (!mo97523bp() || !this.f303455t.mo79746e(C90042cu.f248716q)) {
            C58976aa aaVar4 = C58975e.f156826a;
        } else {
            ba.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bO */
    public final void mo97505bO(boolean z, int i, C22869e eVar) {
        ((C106171l) this.f303247aG.mo56107c()).mo95343g(i, this.f303441f, new C108808el(this, z, eVar), this.f303456u);
    }

    /* renamed from: bP */
    public final void mo97506bP(int i) {
        C60870cx cxVar;
        this.f303301bH = false;
        this.f303303bJ = true;
        ((C113854ci) this.f303252aL.mo27525b()).mo100701b(16);
        C109258hw hwVar = (C109258hw) this.f303236V.f303912g.mo6453a();
        C109759oe oeVar = this.f303459x;
        C107698i iVar = this.f303454s;
        C60870cx cb = m181385cb();
        if ((!oeVar.f305812d.mo79746e(C90053de.f248939F) && !oeVar.f305812d.mo79746e(C90037cp.f248400H)) || hwVar == null) {
            cxVar = oeVar.mo98102i(this, i, iVar);
        } else if (oeVar.f305812d.mo79746e(C90037cp.f248400H)) {
            cxVar = oeVar.f305815g.mo28210j(cb, "cardRendererFuture", new C109748nv(oeVar, this, hwVar, i, iVar));
        } else {
            cxVar = oeVar.f305815g.mo28210j(cb, "cardRendererFuture", new C109749nw(oeVar, this, hwVar, i, iVar));
        }
        new C90873ag(cxVar, this.f303448m, "startOrResumeWarmerWelcome", new C107956bd(this, i)).mo85223a(new C108045bf(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bQ */
    public final void mo97507bQ() {
        C108262cf cfVar = new C108262cf(6, 4);
        C50870f fVar = this.f303289aw;
        if (fVar != null) {
            cfVar.f301045a = fVar.f132450c;
            cfVar.f301046b = (C91189au) this.f303288av.mo27525b();
            this.f303289aw.getClass();
        }
        this.f303450o.mo95377S();
        this.f303450o.mo95430s(cfVar);
        this.f303450o.mo95412aw();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bR */
    public final C108802ef mo97508bR() {
        if (this.f303413dR == null) {
            this.f303413dR = new C108802ef(this);
        }
        return this.f303413dR;
    }

    /* renamed from: ba */
    public final void mo97509ba() {
        C109732nf nfVar = (C109732nf) this.f303437dx.mo27525b();
        View h = mo97536h();
        C58976aa aaVar = C58975e.f156826a;
        nfVar.f305706b.mo74719a(h, new C109731ne(nfVar), nfVar.f305708d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bb */
    public final void mo97510bb(boolean z, boolean z2) {
        if (z) {
            if (m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100864bq();
            }
            if (this.f303455t.mo79746e(C90014bt.f247779nb)) {
                ((C113793bi) this.f303325bf.mo27525b()).mo100643c(this.f303449n, false);
            }
            mo97431S(true);
            this.f303262aV.mo95228j();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f303450o.mo95419h().findViewById(R.id.opa_main_view_inner), View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat.setDuration(80);
            ofFloat.setInterpolator(C106056l.f296094a);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f303230P, View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat2.setDuration(80);
            ofFloat2.setInterpolator(C106056l.f296094a);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            View findViewById = this.f303450o.mo95419h().findViewById(R.id.immersive_view_container);
            int dimensionPixelSize = this.f303346c.getResources().getDimensionPixelSize(R.dimen.canvas_slide_in_distance);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById, View.TRANSLATION_Y, new float[]{(float) dimensionPixelSize, 0.0f});
            ofFloat3.setDuration(320);
            ofFloat3.setInterpolator(C106056l.f296095b);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById, View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat4.setDuration(160);
            ofFloat4.setInterpolator(C106056l.f296094a);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f303263aW = animatorSet3;
            animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
            this.f303263aW.addListener(new C108811eo(this, findViewById));
            this.f303263aW.start();
            this.f303376ch.mo83137k(this.f303262aV.mo95240v());
            mo97512bd(false);
        } else {
            this.f303262aV.mo95229k();
            View findViewById2 = this.f303450o.mo95419h().findViewById(R.id.immersive_view_container);
            int dimensionPixelSize2 = this.f303346c.getResources().getDimensionPixelSize(R.dimen.canvas_slide_out_distance);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById2, View.TRANSLATION_Y, new float[]{0.0f, (float) dimensionPixelSize2});
            ofFloat5.setDuration(240);
            ofFloat5.setInterpolator(C106056l.f296096c);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(findViewById2, View.ALPHA, new float[]{1.0f, 0.0f});
            ofFloat6.setDuration(130);
            ofFloat6.setInterpolator(C106056l.f296094a);
            ofFloat6.setStartDelay(90);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(new Animator[]{ofFloat5, ofFloat6});
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f303450o.mo95419h().findViewById(R.id.opa_main_view_inner), View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat7.setDuration(160);
            ofFloat7.setInterpolator(C106056l.f296094a);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f303230P, View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat8.setDuration(160);
            ofFloat8.setInterpolator(C106056l.f296094a);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(new Animator[]{ofFloat7, ofFloat8});
            AnimatorSet animatorSet6 = new AnimatorSet();
            this.f303264aX = animatorSet6;
            animatorSet6.playSequentially(new Animator[]{animatorSet4, animatorSet5});
            this.f303264aX.addListener(new C108813eq(this, findViewById2, z2));
            this.f303264aX.start();
            if (m181378bx(this.f303450o)) {
                ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100874cK(true);
            }
        }
        if (m181378bx(this.f303450o)) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100862bo(!z);
        }
    }

    /* renamed from: bc */
    public final void mo97511bc() {
        if (m181378bx(this.f303450o)) {
            int c = mo97532c();
            C58976aa aaVar = C58975e.f156826a;
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100895cr(c);
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100896cs(c != 0);
        }
    }

    /* renamed from: bd */
    public final void mo97512bd(boolean z) {
        C60870cx cxVar;
        if (!mo97529bw()) {
            if (!((C58833ax) this.f303401dF.mo27525b()).mo56113h()) {
                mo97446aH(false, z);
                return;
            }
            C81164dm dmVar = (C81164dm) ((C58833ax) this.f303401dF.mo27525b()).mo56107c();
            C22871g gVar = this.f303415db;
            String str = this.f303379ck;
            if (str != null) {
                cxVar = C60856cj.m92900i(str);
            } else {
                cxVar = dmVar.mo74930a();
                new C90873ag(cxVar, this.f303448m, "ChatUiController.cacheLegalNotice", new C108065bh(this)).mo85223a(C108071bi.f300645a);
            }
            new C90873ag(gVar.mo28209i(cxVar, "ChatUiController.getLegalNotice", new C108113by(this)), this.f303448m, "ChatUiController.showLegalNotice", new C108114bz(this, z)).mo85223a(new C108127ca(this, z));
        }
    }

    /* renamed from: be */
    public final void mo97513be(int i) {
        if (this.f303262aV.mo95240v()) {
            this.f303262aV.mo95219a().f54393b = (float) i;
            return;
        }
        this.f303422di.f299387a = i;
    }

    /* renamed from: bf */
    public final void mo97514bf(View view) {
        if (view != null && this.f303323bd.mo97613e()) {
            LinearLayout linearLayout = this.f303323bd.f303830g.f303770c;
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = linearLayout.getMeasuredHeight();
            int height = view.getHeight() + measuredHeight;
            if (height != 0) {
                if (mo97529bw()) {
                    this.f303307bN = be.b;
                } else {
                    ((C1773f) this.f303450o.mo95420i().getLayoutParams()).height = height;
                }
                this.f303228N.setTranslationY((float) (-height));
                if (m181378bx(this.f303450o) && mo97496bF()) {
                    ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100883cX(height);
                }
                linearLayout.getLayoutParams().height = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bg */
    public final void mo97515bg(Runnable runnable) {
        if (this.f303338bs) {
            C59104x b = f303210a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ChatUiController");
            ((C59052c) ((C59052c) b).mo56372aa(22703)).mo56386p("Waiting for unlock before finishing the activity");
            this.f303339bt = runnable;
            return;
        }
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bh */
    public final boolean mo97516bh() {
        return this.f303310bQ != null;
    }

    /* renamed from: bi */
    public final boolean mo97517bi() {
        return this.f303368cZ == 6 && C87564g.m142223a(this.f303442g) == com.google.android.apps.gsa.assistant.shared.l.e.bg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bj */
    public final boolean mo97518bj() {
        return ((Boolean) this.f303402dG.mo27525b()).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bk */
    public final boolean mo97519bk() {
        if (!this.f303284ar || !this.f303247aG.mo56113h()) {
            return false;
        }
        boolean isDeviceLocked = ((C106171l) this.f303247aG.mo56107c()).f296304b.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        return isDeviceLocked;
    }

    /* renamed from: bl */
    public final boolean mo97520bl() {
        return this.f303371cc && this.f303455t.mo79746e(C90014bt.f247781nd) && m181378bx(this.f303450o);
    }

    /* renamed from: bm */
    public final boolean mo97521bm() {
        return this.f303450o.mo95420i().getLayoutParams().height == -2 || mo97522bo();
    }

    /* renamed from: bo */
    public final boolean mo97522bo() {
        return mo97528bv() && mo97525br();
    }

    /* renamed from: bp */
    public final boolean mo97523bp() {
        C11300h hVar = this.f303310bQ;
        return hVar != null && hVar.mo19707K() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bq */
    public final boolean mo97524bq() {
        return this.f303284ar && this.f303247aG.mo56113h() && ((C106171l) this.f303247aG.mo56107c()).f296304b.mo78228b();
    }

    /* renamed from: br */
    public final boolean mo97525br() {
        return this.f303346c.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: bt */
    public final boolean mo97526bt() {
        return this.f303427dn.mo56113h() && ((C73798aa) this.f303427dn.mo56107c()).mo65282f();
    }

    /* renamed from: bu */
    public final boolean mo97527bu() {
        return (!this.f303319bZ.mo56113h() || ((C107383g) this.f303319bZ.mo56107c()).mo95997a() == C107382f.DISMISSED || ((C107383g) this.f303319bZ.mo56107c()).mo95997a() == C107382f.DISMISSING) ? false : true;
    }

    /* renamed from: bv */
    public final boolean mo97528bv() {
        return this.f303408dM.mo75125b() == 2 || this.f303455t.mo79746e(C90029ch.f248283bq);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f303323bd;
     */
    /* renamed from: bw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97529bw() {
        /*
            r2 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f303455t
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251208eV
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0025
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r2.f303323bd
            if (r0 == 0) goto L_0x0025
            boolean r1 = r2.f303371cc
            if (r1 == 0) goto L_0x0025
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r0 = r0.f303833j
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.c r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c.TRY_BEFORE_YOU_BUY_SUGGESTION
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            com.google.android.apps.gsa.staticplugins.opa.greeting.b r0 = r2.f303323bd
            int r0 = r0.f303836m
            r1 = 5
            if (r0 == r1) goto L_0x0025
            r0 = 1
            return r0
        L_0x0025:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109040fj.mo97529bw():boolean");
    }

    /* renamed from: by */
    public final boolean mo97530by() {
        C108230ba baVar = this.f303450o;
        return (baVar instanceof C113988g) && ((C113988g) baVar).mo100834bg().mo56113h();
    }

    /* renamed from: bz */
    public final boolean mo97531bz() {
        return this.f303455t.mo79746e(C90063do.f249516ex) && this.f303308bO;
    }

    /* renamed from: c */
    public final int mo97532c() {
        if (this.f303455t.mo79746e(C90090eo.f250537b)) {
            return 0;
        }
        if (mo97529bw() && !this.f303300bG) {
            return 7;
        }
        if (!mo97520bl()) {
            return 0;
        }
        boolean e = this.f303455t.mo79746e(C90014bt.f247780nc);
        if (mo97523bp() || this.f303238X.mo96134aG() || this.f303238X.mo96177e() != 0 || m181377bs(this.f303306bM) || this.f303307bN.equals(be.a)) {
            return 0;
        }
        if (e && this.f303305bL.equals(C108228az.IS_THINKING)) {
            return 4;
        }
        if (this.f303307bN.equals(be.c)) {
            return 10;
        }
        if (this.f303307bN.equals(be.b)) {
            return 7;
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo97533e() {
        if (this.f303294bA) {
            return C90686c.m148058d(this.f303346c).y;
        }
        return this.f303449n.getHeight();
    }

    /* renamed from: f */
    public final Resources mo97534f() {
        return ((C73841bf) this.f303395d.mo27525b()).mo65322a();
    }

    /* renamed from: g */
    public final Bundle mo97535g() {
        Bundle bundle = new Bundle();
        bundle.putInt("android.opa.extra.CLIENT_MODALITY", this.f303238X.mo96177e());
        return bundle;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ChatUiController");
        C91005e c = fVar.mo85279c("ChatUiMode");
        C109026ey eyVar = this.f303275ai;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C109026ey eyVar2 = C109026ey.UNINITIALIZED;
        C83572ac acVar = C83572ac.UNINITIALIZED;
        C113984c cVar = C113984c.UNKNOWN;
        C108228az azVar = C108228az.UNINITIALIZED;
        int ordinal = eyVar.ordinal();
        c.mo85276a(C90752i.m148229c(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "HIDDEN" : "CONVERSATION" : "STARTED" : "STARTING" : "UNINITIALIZED"));
        fVar.mo85286m(this.f303286at);
        fVar.mo85286m(this.f303351cE);
        fVar.mo85286m(this.f303287au);
        C108303dt dtVar = this.f303231Q;
        if (dtVar != null) {
            fVar.mo85286m(dtVar);
        }
        fVar.mo85286m(this.f303320ba);
    }

    /* renamed from: h */
    public final View mo97536h() {
        return this.f303450o.mo95419h();
    }

    /* renamed from: hX */
    public final /* synthetic */ void mo774hX(Object obj) {
        C128659a aVar;
        C108228az azVar = (C108228az) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f303305bL != azVar) {
            this.f303305bL = azVar;
            mo97511bc();
            if (this.f303371cc) {
                C128660a aVar2 = (C128660a) this.f303407dL.mo27525b();
                C88244um umVar = C88244um.ATTACH_WEBVIEW;
                C109026ey eyVar = C109026ey.UNINITIALIZED;
                C83572ac acVar = C83572ac.UNINITIALIZED;
                C113984c cVar = C113984c.UNKNOWN;
                C108228az azVar2 = C108228az.UNINITIALIZED;
                int ordinal = azVar.ordinal();
                if (ordinal == 1) {
                    aVar = C128659a.IS_THINKING;
                } else if (ordinal != 2) {
                    aVar = C128659a.UNINITIALIZED;
                } else {
                    aVar = C128659a.IS_NOT_THINKING;
                }
                C69664n.m101061g(aVar, "state");
                for (C128666e eVar : aVar2.f353685a) {
                    C69664n.m101061g(aVar, "state");
                    C128667f fVar = eVar.f353701a;
                    fVar.f353702a = aVar;
                    fVar.mo108608a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C109753o mo97537i() {
        C109040fj fjVar;
        if (this.f303360cR == null) {
            Context context = this.f303346c;
            ViewGroup viewGroup = this.f303449n;
            String str = this.f303419df;
            C86124t tVar = this.f303455t;
            C22871g gVar = this.f303448m;
            C109042fl flVar = this.f303444i;
            C108230ba baVar = this.f303450o;
            C107698i iVar = this.f303454s;
            C109065gb gbVar = this.f303456u;
            C108436iq iqVar = this.f303225K;
            C108303dt dtVar = this.f303231Q;
            C107623a aVar = this.f303234T;
            C107659as asVar = this.f303238X;
            C91189au auVar = (C91189au) this.f303288av.mo27525b();
            C109753o oVar = r0;
            C89150g gVar2 = this.f303376ch;
            C108429ij ijVar = this.f303404dI;
            C109753o oVar2 = new C109753o(this, context, viewGroup, str, tVar, gVar, flVar, baVar, iVar, gbVar, iqVar, dtVar, aVar, asVar, (SharedPreferences) this.f303251aK.mo27525b(), this.f303255aO, this.f303259aS, this.f303262aV, this.f303320ba, (C113793bi) this.f303325bf.mo27525b(), gVar2, ijVar);
            fjVar = this;
            fjVar.f303360cR = oVar;
        } else {
            fjVar = this;
        }
        return fjVar.f303360cR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo97538k() {
        String L = C87566i.m142237L(this.f303441f.getIntent().getExtras());
        if (!TextUtils.isEmpty(L)) {
            return L;
        }
        return C90685b.m148054b(this.f303441f, this.f303455t) ? (!this.f303455t.mo79746e(C90014bt.f247382gB) || TextUtils.isEmpty(this.f303455t.mo79758x(C90014bt.f247383gC))) ? "com.google.android.googlequicksearchbox.ANDROID_TABLET_OPA_FEEDBACK" : this.f303455t.mo79758x(C90014bt.f247383gC) : "com.google.android.googlequicksearchbox.NEXUS_OPA_FEEDBACK";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo97539l(com.google.assistant.p3897e.p3898a.C50870f r9, java.util.List r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 3
            if (r10 == 0) goto L_0x00c6
            java.util.Iterator r9 = r10.iterator()
        L_0x000c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x011a
            java.lang.Object r10 = r9.next()
            com.google.assistant.e.j.e.ig r10 = (com.google.assistant.p3897e.p3921j.p3926e.C52035ig) r10
            int r2 = r10.f136570a
            r2 = r2 & 1
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0082
            int r4 = r10.f136571b
            r5 = 2
            if (r4 != r5) goto L_0x0082
            com.google.assistant.e.j.vg r2 = com.google.assistant.p3897e.p3921j.C52533vg.f137890f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.vf r2 = (com.google.assistant.p3897e.p3921j.C52532vf) r2
            java.lang.String r4 = r10.f136573d
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.vg r6 = (com.google.assistant.p3897e.p3921j.C52533vg) r6
            r4.getClass()
            int r7 = r6.f137892a
            r7 = r7 | 1
            r6.f137892a = r7
            r6.f137895d = r4
            com.google.assistant.e.c.c.dg r4 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.c.c.df r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51015df) r4
            int r6 = r10.f136571b
            if (r6 != r5) goto L_0x0052
            java.lang.Object r10 = r10.f136572c
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
        L_0x0052:
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.assistant.e.c.c.dg r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r10
            r3.getClass()
            int r6 = r10.f132829a
            r6 = r6 | 1
            r10.f132829a = r6
            r10.f132830b = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.j.vg r10 = (com.google.assistant.p3897e.p3921j.C52533vg) r10
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.c.c.dg r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r3
            r3.getClass()
            r10.f137894c = r3
            r10.f137893b = r5
            com.google.protobuf.bv r10 = r2.build()
            com.google.assistant.e.j.vg r10 = (com.google.assistant.p3897e.p3921j.C52533vg) r10
            r0.add(r10)
            goto L_0x000c
        L_0x0082:
            if (r2 == 0) goto L_0x000c
            int r2 = r10.f136571b
            if (r2 != r1) goto L_0x000c
            com.google.assistant.e.j.vg r2 = com.google.assistant.p3897e.p3921j.C52533vg.f137890f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.vf r2 = (com.google.assistant.p3897e.p3921j.C52532vf) r2
            java.lang.String r4 = r10.f136573d
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.vg r5 = (com.google.assistant.p3897e.p3921j.C52533vg) r5
            r4.getClass()
            int r6 = r5.f137892a
            r6 = r6 | 1
            r5.f137892a = r6
            r5.f137895d = r4
            int r4 = r10.f136571b
            if (r4 != r1) goto L_0x00ad
            java.lang.Object r10 = r10.f136572c
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3
        L_0x00ad:
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.assistant.e.j.vg r10 = (com.google.assistant.p3897e.p3921j.C52533vg) r10
            r3.getClass()
            r10.f137893b = r1
            r10.f137894c = r3
            com.google.protobuf.bv r10 = r2.build()
            com.google.assistant.e.j.vg r10 = (com.google.assistant.p3897e.p3921j.C52533vg) r10
            r0.add(r10)
            goto L_0x000c
        L_0x00c6:
            if (r9 == 0) goto L_0x011a
            com.google.protobuf.cq r9 = r9.f132451d
            java.util.Iterator r9 = r9.iterator()
        L_0x00ce:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x011a
            java.lang.Object r10 = r9.next()
            com.google.assistant.e.a.c r10 = (com.google.assistant.p3897e.p3898a.C50867c) r10
            int r2 = r10.f132442a
            r3 = r2 & 1
            if (r3 == 0) goto L_0x00ce
            r2 = r2 & 2
            if (r2 == 0) goto L_0x00ce
            com.google.assistant.e.j.vg r2 = com.google.assistant.p3897e.p3921j.C52533vg.f137890f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.vf r2 = (com.google.assistant.p3897e.p3921j.C52532vf) r2
            java.lang.String r3 = r10.f132443b
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.vg r4 = (com.google.assistant.p3897e.p3921j.C52533vg) r4
            r3.getClass()
            int r5 = r4.f137892a
            r5 = r5 | 1
            r4.f137892a = r5
            r4.f137895d = r3
            java.lang.String r10 = r10.f132444c
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.vg r3 = (com.google.assistant.p3897e.p3921j.C52533vg) r3
            r10.getClass()
            r3.f137893b = r1
            r3.f137894c = r10
            com.google.protobuf.bv r10 = r2.build()
            com.google.assistant.e.j.vg r10 = (com.google.assistant.p3897e.p3921j.C52533vg) r10
            r0.add(r10)
            goto L_0x00ce
        L_0x011a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109040fj.mo97539l(com.google.assistant.e.a.f, java.util.List):java.util.List");
    }

    /* renamed from: m */
    public final void mo97540m(C89849ae aeVar, Long l) {
        C87968kg kgVar = (C87968kg) C87969kh.f237914d.createBuilder();
        int i = aeVar.f245884YW;
        kgVar.copyOnWrite();
        C87969kh khVar = (C87969kh) kgVar.instance;
        khVar.f237916a |= 1;
        khVar.f237917b = i;
        if (l != null) {
            long longValue = l.longValue();
            kgVar.copyOnWrite();
            C87969kh khVar2 = (C87969kh) kgVar.instance;
            khVar2.f237916a |= 2;
            khVar2.f237918c = longValue;
        }
        C107698i iVar = this.f303454s;
        C88489j jVar = new C88489j(C87739bu.LOG_APP_FLOW_EVENT);
        jVar.mo82014b(C87967kf.f237913a, (C87969kh) kgVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: n */
    public final void mo97541n() {
        if (this.f303455t.mo79746e(C90014bt.f247335fH)) {
            m181387cd();
        } else {
            this.f303450o.mo95430s(C108263cg.m179950B(this.f303455t));
        }
    }

    /* renamed from: o */
    public final void mo97542o() {
        if (this.f303370cb && this.f303455t.mo79746e(C90029ch.f248213a)) {
            m181386cc();
        }
    }

    /* renamed from: p */
    public final void mo97543p(CharSequence charSequence, boolean z, boolean z2) {
        if (m181378bx(this.f303450o) && ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100907df() && m181378bx(this.f303450o)) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100882cV(charSequence.toString());
        }
        boolean z3 = !this.f303450o.mo95404ao() && !this.f303262aV.mo95240v() && z;
        mo97463aY(C109026ey.MODE_CONVERSATION);
        this.f303450o.mo95385aA();
        if (this.f303455t.mo79746e(C90014bt.f247206cl) && mo97521bm() && m181378bx(this.f303450o)) {
            ((C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c()).mo100867bv();
        }
        this.f303255aO.mo98058b(0, this.f303455t.mo79743a(C90014bt.f247511iY));
        if (z3) {
            C108451je jeVar = new C108451je();
            jeVar.f301663e = charSequence.toString();
            if (this.f303231Q == null) {
                jeVar.f301029k.mo85049c(0, 4);
            }
            this.f303450o.mo95430s(jeVar);
            if (m181378bx(this.f303450o) && jeVar.f301043y) {
                C113989h hVar = (C113989h) ((C113988g) this.f303450o).mo100833bf().mo56107c();
                if (hVar.mo100909dl()) {
                    hVar.mo100878cO(false);
                }
            }
            this.f303261aU.mo98053a(!mo97527bu());
            if (z2 && !this.f303455t.mo79746e(C90014bt.f247760nI)) {
                this.f303450o.mo95377S();
            }
        } else {
            this.f303450o.mo95377S();
        }
        this.f303450o.mo95378T();
        if (this.f303455t.mo79746e(C90014bt.f247463hd) && this.f303455t.mo79746e(C90014bt.f247464he) && this.f303238X.mo96129aB()) {
            this.f303238X.mo96171aw(true);
        } else if ((!this.f303238X.mo96130aC() || !this.f303455t.mo79746e(C90063do.f249509eq)) && !m181409cz()) {
            mo97452aN(false);
        }
        this.f303450o.mo95392ac(C108228az.IS_THINKING);
        if (this.f303371cc) {
            this.f303376ch.mo83145s(C58836b.f156633a, 2);
        }
    }

    /* renamed from: q */
    public final void mo97544q() {
        if (this.f303267aa.mo82125f()) {
            this.f303267aa.mo82121a();
            return;
        }
        this.f303454s.mo96218a(this.f303425dl.mo84259V().mo84244G(true));
        mo97439aA();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo97545r() {
        ((SharedPreferences) this.f303251aK.mo27525b()).edit().remove("opa_auto_trigger_url_".concat(String.valueOf(this.f303419df))).remove("opa_auto_trigger_url_attempt_count_".concat(String.valueOf(this.f303419df))).apply();
    }

    /* renamed from: s */
    public final void mo97546s() {
        this.f303453r.mo96199a();
    }

    /* renamed from: t */
    public final void mo97547t() {
        mo97498bH(false, true, false, 14);
        mo97506bP(8);
    }

    /* renamed from: u */
    public final void mo97548u(C113858cm cmVar) {
        C63088z q;
        ((C109467mf) this.f303313bT.mo27525b()).mo97847b(C89849ae.OPA_INPUT_PLATE_TEXT_QUERY_COMMITTED);
        this.f303304bK = false;
        if (cmVar.mo100719i()) {
            mo97543p(cmVar.mo100718h(), true, true);
        }
        this.f303342bw = false;
        this.f303450o.mo95387aC();
        Bundle bundle = new Bundle(cmVar.mo100711a());
        bundle.putInt("android.opa.extra.CLIENT_MODALITY", this.f303238X.mo96177e());
        if (!bundle.containsKey("android.opa.extra.INITIAL_QUERY")) {
            bundle.putBoolean("android.opa.extra.INITIAL_QUERY", !this.f303244aD);
        }
        m181393cj(bundle);
        Query aA = this.f303425dl.mo84268aE(cmVar.mo100718h().toString(), false).mo84245H(0, m181379cA(), cmVar.mo100712b()).mo84264aA(this.f303393cy.f315214a, bundle);
        C58976aa aaVar = C58975e.f156826a;
        cmVar.mo100718h();
        if (!TextUtils.isEmpty(this.f303318bY)) {
            aA = aA.mo84312ax(this.f303318bY);
        }
        String str = null;
        if (cmVar.mo100715e().mo56113h()) {
            C113857cl clVar = (C113857cl) cmVar.mo100715e().mo56107c();
            C88244um umVar = C88244um.ATTACH_WEBVIEW;
            C109026ey eyVar = C109026ey.UNINITIALIZED;
            C83572ac acVar = C83572ac.UNINITIALIZED;
            C113984c cVar = C113984c.UNKNOWN;
            C108228az azVar = C108228az.UNINITIALIZED;
            int b = clVar.mo100709b();
            int i = b - 1;
            if (b == 0) {
                throw null;
            } else if (i == 0) {
                str = C113861cp.m188491a(clVar.mo100710c());
            } else if (i == 1) {
                str = clVar.mo100708a();
            }
        }
        if (str != null) {
            aA = aA.mo84344bc(str);
        }
        if (cmVar.mo100714d().mo56113h()) {
            aA = aA.mo84289aZ(((C60456qs) cmVar.mo100714d().mo56107c()).toByteArray());
        }
        if (cmVar.mo100716f().mo56113h() && (((C51994gt) cmVar.mo100716f().mo56107c()).f136467a & 8) != 0) {
            C51569mo moVar = (C51569mo) C51570mp.f134408e.createBuilder();
            C63088z zVar = ((C51994gt) cmVar.mo100716f().mo56107c()).f136470d;
            moVar.copyOnWrite();
            C51570mp mpVar = (C51570mp) moVar.instance;
            zVar.getClass();
            mpVar.f134410a |= 2;
            mpVar.f134412c = zVar;
            byte[] byteArray = ((C51570mp) moVar.build()).toByteArray();
            C90498f i2 = aA.mo84480i();
            i2.mo84581m("android.opa.extra.SUGGESTIONS_PARAMS", byteArray);
            aA = i2.mo84568a();
        }
        if (cmVar.mo100713c().mo56113h()) {
            byte[] byteArray2 = ((C59569y) cmVar.mo100713c().mo56107c()).toByteArray();
            C90498f i3 = aA.mo84480i();
            i3.mo84581m("android.opa.extra.ASSISTANT_TEXT_QUERY_INFO_PARAMS", byteArray2);
            aA = i3.mo84568a();
        }
        if (cmVar.mo100717g().mo56113h()) {
            byte[] byteArray3 = ((C59529cz) cmVar.mo100717g().mo56107c()).toByteArray();
            C90498f i4 = aA.mo84480i();
            i4.mo84581m("android.opa.extra.TAPAS_CLIENT_SESSION", byteArray3);
            aA = i4.mo84568a();
        }
        if (mo97524bq()) {
            if (((Boolean) this.f303426dm.mo27525b()).booleanValue()) {
                aA = aA.mo84302an("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN", true);
            }
            if (mo97519bk() && (!cmVar.mo100720j() || !mo97526bt())) {
                aA = aA.mo84291ab();
            }
        }
        if (mo97526bt()) {
            aA = aA.mo84287aX();
        }
        Query bX = m181373bX(aA);
        if (this.f303259aS) {
            bX = bX.mo84260X(true).mo84302an("android.opa.extra.MINI_PLATE_ENABLED", true);
        }
        if (m181406cw()) {
            bX = bX.mo84302an("android.opa.extra.PROACTIVE_ENABLED", true);
        }
        if (this.f303345bz) {
            C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
            C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
            C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a = 1 | duVar.f135926a;
            duVar.f135927b = "action_hijack.HIJACK_INPUT";
            ejVar.copyOnWrite();
            C52078ek ekVar = (C52078ek) ejVar.instance;
            C51805du duVar2 = (C51805du) dsVar.build();
            duVar2.getClass();
            ekVar.f136675c = duVar2;
            ekVar.f136674b = 5;
            eoVar.copyOnWrite();
            C52083ep epVar = (C52083ep) eoVar.instance;
            C52078ek ekVar2 = (C52078ek) ejVar.build();
            ekVar2.getClass();
            epVar.f136693c = ekVar2;
            epVar.f136692b = 3;
            elVar.mo53785b(eoVar);
            bX = bX.mo84304ap(((C52081en) elVar.build()).toByteArray());
            this.f303345bz = false;
        }
        Query bY = m181374bY(m181375bZ(bX));
        if (this.f303455t.mo79746e(C90014bt.f247244dW) || this.f303455t.mo79746e(C90014bt.f247710mL)) {
            bY = bY.mo84271aH(C90719ac.f253778a.f253779b.nextLong());
        }
        if (this.f303455t.mo79746e(C90029ch.f248264ay) && (q = this.f303450o.mo95428q()) != null) {
            bY = bY.mo84303ao("android.opa.extra.BACK_NAVIGATION_QUERY_OPAQUE_TOKEN", q.mo59174N());
        }
        this.f303320ba.mo100766j(bY);
        mo97439aA();
        this.f303454s.mo96218a(bY);
        this.f303238X.mo96142aO();
        this.f303341bv = false;
        mo97415C();
    }

    @Deprecated
    /* renamed from: v */
    public final void mo97549v(CharSequence charSequence, QueryTriggerType queryTriggerType, Bundle bundle, String str) {
        mo97543p(charSequence, true, true);
        mo97501bK(charSequence, queryTriggerType, bundle, str, (C51994gt) null, false);
    }

    /* renamed from: x */
    public final void mo97551x(C58833ax axVar) {
        HotwordResultMetadata hotwordResultMetadata;
        this.f303344by = true;
        this.f303433dt = true;
        this.f303282ap = false;
        this.f303450o.mo95387aC();
        this.f303450o.mo95434w(514);
        this.f303342bw = false;
        this.f303459x.mo98098e();
        this.f303281ao.putBoolean("android.opa.extra.INITIAL_QUERY", !this.f303244aD);
        m181393cj(this.f303281ao);
        Query aU = this.f303425dl.mo84245H(1, true, (QueryTriggerType) null).mo84264aA(this.f303393cy.f315214a, this.f303281ao).mo84284aU(C90685b.m148054b(this.f303346c, this.f303455t));
        if (this.f303432ds > 1) {
            C58976aa aaVar = C58975e.f156826a;
            aU = aU.mo84300al(this.f303432ds);
        }
        if (this.f303365cW) {
            Query aW = aU.mo84286aW(QueryTriggerType.HOTWORD);
            HotwordResultMetadata hotwordResultMetadata2 = this.f303354cL;
            if (hotwordResultMetadata2 != null) {
                aW = aW.mo84310av(hotwordResultMetadata2);
                if (this.f303354cL.mo84613o()) {
                    C90498f i = aW.mo84480i();
                    i.mo84572d(0, 256);
                    i.mo84543B(aW.f252772k);
                    aW = i.mo84568a();
                }
                C58976aa aaVar2 = C58975e.f156826a;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            aU = aW.mo84314az();
        }
        if (axVar.mo56113h()) {
            aU = aU.mo84271aH(((Long) axVar.mo56107c()).longValue());
        }
        if (mo97524bq()) {
            if (((Boolean) this.f303426dm.mo27525b()).booleanValue()) {
                aU = aU.mo84302an("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN", true);
            }
            if (mo97519bk() && (!((Boolean) this.f303426dm.mo27525b()).booleanValue() || (hotwordResultMetadata = this.f303354cL) == null || !hotwordResultMetadata.mo84612n())) {
                aU = aU.mo84291ab();
            }
        }
        if (mo97526bt()) {
            aU = aU.mo84287aX();
        }
        if (this.f303368cZ == 5) {
            aU = aU.mo84261Y(false);
        }
        if (C87564g.m142223a(this.f303442g) == com.google.android.apps.gsa.assistant.shared.l.e.aG || C87566i.m142309h(this.f303442g) == 6) {
            aU = aU.mo84246I();
        }
        Query bX = m181373bX(aU);
        if (this.f303259aS) {
            bX = bX.mo84260X(true).mo84302an("android.opa.extra.MINI_PLATE_ENABLED", true);
        }
        if (m181406cw()) {
            bX = bX.mo84302an("android.opa.extra.PROACTIVE_ENABLED", true);
        }
        if (this.f303238X.mo96177e() == 2) {
            this.f303238X.mo96144aQ(1);
        }
        if (!TextUtils.isEmpty(this.f303318bY)) {
            C58976aa aaVar4 = C58975e.f156826a;
            bX = bX.mo84312ax(this.f303318bY);
        }
        this.f303454s.mo96218a(bX);
        if (!this.f303244aD && C87566i.m142306e(this.f303281ao) == 2) {
            C107698i iVar = this.f303454s;
            C88489j jVar = new C88489j(C87739bu.SET_HOTWORD_DETECTION_ENABLED);
            C62940bt btVar = C88263ve.f238733a;
            C88264vf vfVar = (C88264vf) C88265vg.f238734c.createBuilder();
            vfVar.copyOnWrite();
            C88265vg vgVar = (C88265vg) vfVar.instance;
            vgVar.f238736a |= 1;
            vgVar.f238737b = true;
            jVar.mo82014b(btVar, (C88265vg) vfVar.build());
            iVar.mo96219b(jVar.mo82013a());
        }
        this.f303281ao = new Bundle();
        this.f303365cW = false;
        this.f303354cL = null;
        this.f303368cZ = 0;
        this.f303341bv = false;
        this.f303434du = 0;
    }

    /* renamed from: y */
    public final void mo97552y() {
        mo97497bG(2);
        this.f303449n.setOnClickListener((View.OnClickListener) null);
        this.f303228N.setVisibility(8);
        mo97431S(true);
        boolean z = false;
        this.f303450o.mo95380V(false);
        if (this.f303243aC && !C87566i.m142299aw(this.f303442g)) {
            z = true;
        }
        if (this.f303231Q != null && !mo97519bk()) {
            this.f303450o.mo95364F(z);
        }
        this.f303450o.mo95386aB();
        this.f303228N.setVisibility(8);
        mo97431S(true);
        this.f303448m.mo28213m("ConvertToOpaque", 500, new C106319al(this));
        if (this.f303409dN.mo93971b()) {
            ((View) this.f303449n.getParent()).setBackgroundColor(C19391a.m36980a(this.f303441f, 16842801));
        } else {
            ((View) this.f303449n.getParent()).setBackgroundColor(this.f303309bP.mo96661d());
        }
        if (this.f303254aN.mo56113h()) {
            ((C88522b) this.f303254aN.mo56107c()).mo82143e(C1878d.m5128a(this.f303441f, R.color.chatui_scrim_background_opaque));
        }
    }

    /* renamed from: z */
    public final void mo97553z() {
        C58976aa aaVar = C58975e.f156826a;
        if (mo97528bv() && this.f303455t.mo79746e(C90029ch.f248282bp) && !this.f303298bE && this.f303337br.mo56113h() && ((C109735ni) this.f303337br.mo56107c()).mo98056b().f136122b) {
            this.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_OTHER);
        }
    }

    @Deprecated
    /* renamed from: w */
    public final void mo97550w(C108430ik ikVar) {
        C51994gt gtVar = ikVar.f301606m;
        if (gtVar == null || !gtVar.f136472f) {
            mo97543p(ikVar.mo96708f(), true, true);
        } else {
            mo97543p(ikVar.mo96877h(), true, true);
        }
        Bundle g = mo97535g();
        g.putInt("android.opa.extra.TRIGGERED_BY", ikVar.f301604k.ca);
        m181394ck();
        if (this.f303248aH.mo56113h()) {
            ((C108100a) this.f303248aH.mo56107c()).f300689c = C51211f.SUGGESTION_CHIP;
        }
        mo97501bK(ikVar.mo96877h(), ikVar.f301605l, g, C113861cp.m188491a(ikVar.f301597d), ikVar.f301606m, ikVar.f301613t);
    }
}

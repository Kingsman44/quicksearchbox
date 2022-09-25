package com.google.android.apps.gsa.staticplugins.opa;

import android.app.FragmentManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p506e.C9409b;
import com.google.android.apps.gsa.assistant.handoff.p512a.C9443a;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.assistant.shared.l.f;
import com.google.android.apps.gsa.assistant.shared.l.g;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6405b.C82193a;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83630as;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83631at;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89108b;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89110d;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7195y.C91183ao;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91191aw;
import com.google.android.apps.gsa.shared.p7195y.C91192ax;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.apa.migration.C107222i;
import com.google.android.apps.gsa.staticplugins.opa.apa.migration.C107223j;
import com.google.android.apps.gsa.staticplugins.opa.apa.migration.C107224k;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108204ab;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108211ai;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108235bf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108244bo;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108245bp;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108307dx;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108339fa;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108353fo;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108354fp;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108358ft;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108365g;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108375gj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108380go;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108381gp;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108387gv;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108435ip;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108478m;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108479n;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108480o;
import com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsServiceCard;
import com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsSliceCard;
import com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppWidgetCard;
import com.google.android.apps.gsa.staticplugins.opa.chatui.OpaSwipeViewListCard;
import com.google.android.apps.gsa.staticplugins.opa.chatui.OpaToggleCard;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.p8281ao.C107129a;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107139f;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107144k;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107462aa;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107488n;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107494t;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107495u;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107496v;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107558a;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107561d;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107572o;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107578u;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.p8400n.C109725c;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113713a;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113719g;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113727n;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.C113731r;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.util.C113892w;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120920ap;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120921aq;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120928ax;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.p640a.C11292a;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21672b;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21682l;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21683m;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21686p;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.home.p1940a.p1943c.C23541do;
import com.google.android.libraries.home.p1940a.p1943c.C23542dp;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.material.featurehighlight.C28521c;
import com.google.android.libraries.material.featurehighlight.C28522d;
import com.google.android.libraries.material.p2206b.C28505a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40062d;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40061z;
import com.google.android.material.p3505b.C44534d;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3897e.p3910e.p3911a.C51205t;
import com.google.assistant.p3897e.p3912f.C51211f;
import com.google.assistant.p3897e.p3917i.p3918a.C51381fp;
import com.google.assistant.p3897e.p3917i.p3918a.C51383fr;
import com.google.assistant.p3897e.p3917i.p3918a.C51384fs;
import com.google.assistant.p3897e.p3917i.p3918a.C51386fu;
import com.google.assistant.p3897e.p3917i.p3918a.C51387fv;
import com.google.assistant.p3897e.p3921j.C51686apa;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52089ev;
import com.google.assistant.p3897e.p3921j.C52118fx;
import com.google.assistant.p3897e.p3921j.C52119fy;
import com.google.assistant.p3897e.p3921j.C52130gi;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.assistant.p3897e.p3921j.C52227jy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.assistant.p3897e.p3921j.aeo;
import com.google.assistant.p3897e.p3921j.afb;
import com.google.assistant.p3897e.p3921j.afd;
import com.google.assistant.p3897e.p3921j.aff;
import com.google.assistant.p3897e.p3921j.agj;
import com.google.assistant.p3897e.p3921j.ajo;
import com.google.assistant.p3897e.p3921j.ajr;
import com.google.assistant.p3897e.p3921j.ajt;
import com.google.assistant.p3897e.p3921j.aju;
import com.google.assistant.p3897e.p3921j.akp;
import com.google.assistant.p3897e.p3921j.anf;
import com.google.assistant.p3897e.p3921j.anh;
import com.google.assistant.p3897e.p3921j.anj;
import com.google.assistant.p3897e.p3921j.anl;
import com.google.assistant.p3897e.p3921j.anq;
import com.google.assistant.p3897e.p3921j.ans;
import com.google.assistant.p3897e.p3921j.aop;
import com.google.assistant.p3897e.p3921j.aoq;
import com.google.assistant.p3897e.p3921j.aoz;
import com.google.assistant.p3897e.p3921j.p3922a.C51644b;
import com.google.assistant.p3897e.p3921j.p3922a.C51656n;
import com.google.assistant.p3897e.p3921j.p3922a.C51660r;
import com.google.assistant.p3897e.p3921j.p3922a.C51663u;
import com.google.assistant.p3897e.p3921j.p3922a.C51665w;
import com.google.assistant.p3897e.p3921j.p3922a.C51666x;
import com.google.assistant.p3897e.p3921j.p3926e.C51822aj;
import com.google.assistant.p3897e.p3921j.p3926e.C51823ak;
import com.google.assistant.p3897e.p3921j.p3926e.C51825am;
import com.google.assistant.p3897e.p3921j.p3926e.C51839b;
import com.google.assistant.p3897e.p3921j.p3926e.C51840ba;
import com.google.assistant.p3897e.p3921j.p3926e.C51888cv;
import com.google.assistant.p3897e.p3921j.p3926e.C51889cw;
import com.google.assistant.p3897e.p3921j.p3926e.C51893d;
import com.google.assistant.p3897e.p3921j.p3926e.C51918dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C51964fq;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.assistant.p3897e.p3921j.p3926e.C51978gd;
import com.google.assistant.p3897e.p3921j.p3926e.C51985gk;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.assistant.p3897e.p3921j.p3926e.C52005hd;
import com.google.assistant.p3897e.p3921j.p3926e.C52011hj;
import com.google.assistant.p3897e.p3921j.p3926e.C52019hr;
import com.google.assistant.p3897e.p3921j.p3926e.C52023hv;
import com.google.assistant.p3897e.p3921j.p3926e.C52026hy;
import com.google.assistant.p3897e.p3921j.p3926e.C52027hz;
import com.google.assistant.p3897e.p3921j.p3926e.C52066y;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54192i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54200q;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57783o;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.C66136bo;
import com.google.protos.youtube.elements.C66142bu;
import com.google.protos.youtube.elements.C66143bv;
import com.google.protos.youtube.elements.C66144bw;
import com.google.protos.youtube.elements.C66145bx;
import com.google.protos.youtube.elements.C66148c;
import com.google.protos.youtube.elements.C66165cj;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.C66182d;
import com.google.protos.youtube.elements.C66188db;
import com.google.protos.youtube.elements.C66189dc;
import com.google.protos.youtube.elements.C66207du;
import com.google.protos.youtube.elements.C66208dv;
import com.google.protos.youtube.elements.C66227en;
import com.google.protos.youtube.elements.C66228eo;
import com.google.protos.youtube.elements.C66233et;
import com.google.protos.youtube.elements.C66234eu;
import com.google.protos.youtube.elements.C66243fc;
import com.google.protos.youtube.elements.C66244fd;
import com.google.protos.youtube.elements.C66255m;
import com.google.protos.youtube.elements.C66256n;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hw */
/* compiled from: PG */
public final class C109258hw implements C28522d {

    /* renamed from: a */
    public static final C59071e f304227a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.hw");

    /* renamed from: A */
    public final C21682l f304228A;

    /* renamed from: B */
    public final C21683m f304229B;

    /* renamed from: C */
    public final C21672b f304230C;

    /* renamed from: D */
    public final C21686p f304231D;

    /* renamed from: E */
    private final C109138h f304232E;

    /* renamed from: F */
    private final C108429ij f304233F;

    /* renamed from: G */
    private final C68214a f304234G;

    /* renamed from: H */
    private final C108244bo f304235H;

    /* renamed from: I */
    private final C107619d f304236I;

    /* renamed from: J */
    private final C91183ao f304237J;

    /* renamed from: K */
    private final C22871g f304238K;

    /* renamed from: L */
    private final C58833ax f304239L;

    /* renamed from: M */
    private final C107710u f304240M;

    /* renamed from: N */
    private final C107144k f304241N;

    /* renamed from: O */
    private final C108211ai f304242O;

    /* renamed from: P */
    private final C11292a f304243P;

    /* renamed from: Q */
    private final C68214a f304244Q;

    /* renamed from: R */
    private final C114524l f304245R;

    /* renamed from: S */
    private final C58833ax f304246S;

    /* renamed from: T */
    private final C22871g f304247T;

    /* renamed from: U */
    private final C68214a f304248U;

    /* renamed from: V */
    private final C113863cr f304249V;

    /* renamed from: W */
    private final boolean f304250W;

    /* renamed from: X */
    private final C68214a f304251X;

    /* renamed from: Y */
    private final C68214a f304252Y;

    /* renamed from: Z */
    private final C68214a f304253Z;

    /* renamed from: aa */
    private final C89110d f304254aa;

    /* renamed from: ab */
    private final C68214a f304255ab;

    /* renamed from: ac */
    private final C9388a f304256ac;

    /* renamed from: ad */
    private final C68214a f304257ad;

    /* renamed from: ae */
    private final C9409b f304258ae;

    /* renamed from: af */
    private final C40061z f304259af;

    /* renamed from: ag */
    private final C40062d f304260ag;

    /* renamed from: ah */
    private final C21232ab f304261ah;

    /* renamed from: ai */
    private C108387gv f304262ai;

    /* renamed from: aj */
    private final boolean f304263aj;

    /* renamed from: ak */
    private final C58833ax f304264ak;

    /* renamed from: al */
    private final C58833ax f304265al;

    /* renamed from: am */
    private final C58833ax f304266am;

    /* renamed from: an */
    private final C68214a f304267an;

    /* renamed from: ao */
    private boolean f304268ao = false;

    /* renamed from: ap */
    private boolean f304269ap = false;

    /* renamed from: aq */
    private boolean f304270aq = false;

    /* renamed from: ar */
    private boolean f304271ar = false;

    /* renamed from: as */
    private boolean f304272as = false;

    /* renamed from: at */
    private final C58528ij f304273at;

    /* renamed from: au */
    private final C68214a f304274au;

    /* renamed from: av */
    private final C68214a f304275av;

    /* renamed from: aw */
    private final C68214a f304276aw;

    /* renamed from: ax */
    private final C39141kp f304277ax;

    /* renamed from: ay */
    private final C68214a f304278ay;

    /* renamed from: b */
    public final Context f304279b;

    /* renamed from: c */
    public final C108230ba f304280c;

    /* renamed from: d */
    public final C113892w f304281d;

    /* renamed from: e */
    public final C91097g f304282e;

    /* renamed from: f */
    public final C68214a f304283f;

    /* renamed from: g */
    public final C0167am f304284g;

    /* renamed from: h */
    public final C107698i f304285h;

    /* renamed from: i */
    public final C107659as f304286i;

    /* renamed from: j */
    public final C58881cr f304287j;

    /* renamed from: k */
    public final m f304288k;

    /* renamed from: l */
    public final C22871g f304289l;

    /* renamed from: m */
    public final C22871g f304290m;

    /* renamed from: n */
    public final C68214a f304291n;

    /* renamed from: o */
    public final C68214a f304292o;

    /* renamed from: p */
    public C11300h f304293p;

    /* renamed from: q */
    public final C21370a f304294q;

    /* renamed from: r */
    public final Query f304295r;

    /* renamed from: s */
    public final C68214a f304296s;

    /* renamed from: t */
    public boolean f304297t = false;

    /* renamed from: u */
    public C58833ax f304298u = C58836b.f156633a;

    /* renamed from: v */
    public final C11054a f304299v;

    /* renamed from: w */
    public final C68214a f304300w;

    /* renamed from: x */
    public long f304301x = 0;

    /* renamed from: y */
    public final ConcurrentLinkedQueue f304302y = new ConcurrentLinkedQueue();

    /* renamed from: z */
    public final C104149a f304303z;

    public C109258hw(C109138h hVar, C108230ba baVar, C91097g gVar, C113892w wVar, C108244bo boVar, C107659as asVar, C107144k kVar, C58881cr crVar, C108211ai aiVar, C21370a aVar, Context context, C108429ij ijVar, C68214a aVar2, C68214a aVar3, C104149a aVar4, C0167am amVar, C107619d dVar, C91183ao aoVar, C22871g gVar2, C58833ax axVar, C107698i iVar, C11292a aVar5, C68214a aVar6, C114524l lVar, C89110d dVar2, C58833ax axVar2, m mVar, C22871g gVar3, C22871g gVar4, C68214a aVar7, C22871g gVar5, C21682l lVar2, C21683m mVar2, C21672b bVar, C21686p pVar, C68214a aVar8, C113863cr crVar2, boolean z, C68214a aVar9, C68214a aVar10, C9388a aVar11, C68214a aVar12, C9409b bVar2, C107710u uVar, Query query, C68214a aVar13, boolean z2, C40061z zVar, C40062d dVar3, C21232ab abVar, C68214a aVar14, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C68214a aVar15, C11054a aVar16, C68214a aVar17, C68214a aVar18, C68214a aVar19, C68214a aVar20, C68214a aVar21, C68214a aVar22, C39141kp kpVar, C68214a aVar23) {
        C107710u uVar2 = uVar;
        this.f304232E = hVar;
        this.f304280c = baVar;
        this.f304282e = gVar;
        this.f304281d = wVar;
        this.f304279b = context;
        this.f304233F = ijVar;
        this.f304235H = boVar;
        this.f304234G = aVar2;
        this.f304283f = aVar3;
        this.f304303z = aVar4;
        this.f304284g = amVar;
        this.f304236I = dVar;
        this.f304237J = aoVar;
        this.f304238K = gVar2;
        this.f304239L = axVar;
        this.f304285h = iVar;
        this.f304286i = asVar;
        this.f304241N = kVar;
        this.f304287j = crVar;
        this.f304242O = aiVar;
        this.f304243P = aVar5;
        this.f304244Q = aVar6;
        this.f304245R = lVar;
        this.f304254aa = dVar2;
        this.f304246S = axVar2;
        this.f304288k = mVar;
        this.f304289l = gVar3;
        this.f304247T = gVar4;
        this.f304290m = gVar5;
        this.f304291n = aVar7;
        this.f304228A = lVar2;
        this.f304229B = mVar2;
        this.f304230C = bVar;
        this.f304231D = pVar;
        this.f304294q = aVar;
        this.f304292o = aVar8;
        this.f304249V = crVar2;
        this.f304250W = z;
        this.f304251X = aVar9;
        this.f304255ab = aVar10;
        this.f304256ac = aVar11;
        this.f304257ad = aVar12;
        this.f304258ae = bVar2;
        this.f304295r = query;
        this.f304252Y = aVar13;
        this.f304263aj = z2;
        this.f304259af = zVar;
        this.f304260ag = dVar3;
        this.f304261ah = abVar;
        this.f304264ak = axVar3;
        this.f304265al = axVar4;
        this.f304266am = axVar5;
        this.f304296s = aVar15;
        this.f304267an = aVar14;
        this.f304273at = C58528ij.m90006F(((C86124t) aVar3.mo27525b()).mo79745c(C90041ct.f248696i));
        this.f304240M = uVar2;
        uVar2.mo96220c(new C109210hq(this), C88244um.OPA_SESSION_SERVICE_EVENT);
        uVar2.mo96220c(new C109210hq(this), C88244um.END_OF_CONVERSATION_TURN);
        this.f304299v = aVar16;
        this.f304274au = aVar17;
        this.f304275av = aVar18;
        this.f304248U = aVar19;
        this.f304300w = aVar20;
        this.f304253Z = aVar21;
        this.f304276aw = aVar22;
        this.f304277ax = kpVar;
        this.f304278ay = aVar23;
    }

    /* renamed from: A */
    private final C58485gu m181831A(C51986gl glVar, boolean z) {
        C58480gp e = C58485gu.m89837e();
        int i = -1;
        for (C108430ik ikVar : this.f304233F.mo96872b(glVar, e.A, Optional.empty())) {
            if (ikVar.f301610q.isPresent() && ikVar.f301610q.getAsInt() > i) {
                i = ikVar.f301610q.getAsInt();
                if (!z || ((C51985gk) glVar.f136426d.get(i)).f136418b) {
                    String str = ((C51985gk) glVar.f136426d.get(i)).f136417a;
                    str.getClass();
                    e.mo55395g(new C108479n(str));
                }
            }
            if (!z || ikVar.f301612s) {
                if (ikVar.f301611r.isPresent()) {
                    C54201r rVar = (C54201r) ikVar.f301611r.get();
                    rVar.getClass();
                    e.mo55395g(new C108478m(rVar));
                } else {
                    ikVar.getClass();
                    e.mo55395g(new C108480o(ikVar));
                }
            }
        }
        return e.mo55394f();
    }

    /* renamed from: B */
    private final C60870cx m181832B(agj agj, C58833ax axVar) {
        C60870cx cxVar;
        Object obj;
        OpaAppWidgetCard opaAppWidgetCard = (OpaAppWidgetCard) LayoutInflater.from(m181893t()).inflate(R.layout.opa_app_widget_card, (ViewGroup) null);
        C60856cj.m92900i(C108354fp.NO_RENDERED_RESULT);
        if ((agj.f135056a & 8) != 0) {
            String str = agj.f135057b;
            String str2 = agj.f135060e;
            String str3 = agj.f135058c;
            C120920ap c = C120921aq.m200138c();
            C120928ax axVar2 = (C120928ax) c;
            axVar2.f336220c = new ComponentName(agj.f135057b, agj.f135060e);
            c.mo104979o(!agj.f135061f);
            axVar2.f336222e = new C108358ft(Optional.ofNullable(axVar.mo56111f()), this.f304285h, this.f304238K, new C109069gf(opaAppWidgetCard));
            c.mo104974j(agj.f135058c);
            c.mo104977m(agj.f135059d);
            C62940bt r9 = C62942bv.checkIsLite(C48775a.f126214f);
            agj.mo58887l(r9);
            if (agj.f169962ag.mo58857o(r9.f169971d)) {
                C62940bt r92 = C62942bv.checkIsLite(C48775a.f126214f);
                agj.mo58887l(r92);
                Object l = agj.f169962ag.mo58854l(r92.f169971d);
                if (l == null) {
                    obj = r92.f169969b;
                } else {
                    obj = r92.mo58889c(l);
                }
                axVar2.f336221d = (C52846w) obj;
            }
            cxVar = opaAppWidgetCard.mo96560c(c);
        } else {
            String str4 = agj.f135057b;
            String str5 = agj.f135058c;
            C120920ap c2 = C120921aq.m200138c();
            c2.mo104978n(agj.f135057b);
            c2.mo104979o(!agj.f135061f);
            ((C120928ax) c2).f336222e = new C108358ft(Optional.ofNullable(axVar.mo56111f()), this.f304285h, this.f304238K, new C109070gg(opaAppWidgetCard));
            c2.mo104974j(agj.f135058c);
            c2.mo104977m(agj.f135059d);
            cxVar = opaAppWidgetCard.mo96560c(c2);
        }
        C108212aj ajVar = new C108212aj(opaAppWidgetCard, 10);
        C108230ba baVar = this.f304280c;
        m181892r(ajVar, this.f304301x);
        baVar.mo95430s(ajVar);
        opaAppWidgetCard.getViewTreeObserver().addOnGlobalLayoutListener(new C108353fo(opaAppWidgetCard));
        return cxVar;
    }

    /* renamed from: C */
    private static MessageLite m181833C(C51807dw dwVar, String str, C63010eb ebVar) {
        try {
            return m181889b(dwVar, str, ebVar);
        } catch (C22371a unused) {
            return null;
        }
    }

    /* renamed from: D */
    private final C66166ck m181834D(String str, boolean z) {
        int a = C109068ge.m181589a(((C86124t) this.f304283f.mo27525b()).mo79743a(C90029ch.f248286bt));
        C66255m mVar = (C66255m) C66256n.f180148o.createBuilder();
        String str2 = (a >= 18 || a <= 0 || Build.VERSION.SDK_INT < 31) ? "google-sans" : "google-sans-text";
        mVar.copyOnWrite();
        C66256n nVar = (C66256n) mVar.instance;
        nVar.f180150a |= 8;
        nVar.f180154e = str2;
        float f = a > 0 ? (float) a : 20.0f;
        mVar.copyOnWrite();
        C66256n nVar2 = (C66256n) mVar.instance;
        nVar2.f180150a |= 16;
        nVar2.f180155f = f;
        int a2 = C1878d.m5128a(this.f304279b, this.f304280c.mo95416e() == 42567 ? R.color.chatui_drl_color_template_font_in_personality_joke : z ? R.color.chatui_drl_color_template_font_dark_mode : R.color.chatui_drl_color_template_font);
        mVar.copyOnWrite();
        C66256n nVar3 = (C66256n) mVar.instance;
        nVar3.f180150a |= 128;
        nVar3.f180156g = a2;
        C66256n nVar4 = (C66256n) mVar.build();
        C66233et etVar = (C66233et) C66234eu.f180108c.createBuilder();
        C66148c cVar = (C66148c) C66182d.f179960e.createBuilder();
        cVar.copyOnWrite();
        C66182d dVar = (C66182d) cVar.instance;
        str.getClass();
        dVar.f179962a |= 1;
        dVar.f179963b = str;
        cVar.copyOnWrite();
        C66182d dVar2 = (C66182d) cVar.instance;
        dVar2.f179962a |= 2;
        dVar2.f179964c = 2.0f;
        cVar.copyOnWrite();
        C66182d dVar3 = (C66182d) cVar.instance;
        nVar4.getClass();
        C62971cq cqVar = dVar3.f179965d;
        if (!cqVar.mo58948c()) {
            dVar3.f179965d = C62942bv.mutableCopy(cqVar);
        }
        dVar3.f179965d.add(nVar4);
        C66182d dVar4 = (C66182d) cVar.build();
        etVar.copyOnWrite();
        C66234eu euVar = (C66234eu) etVar.instance;
        dVar4.getClass();
        euVar.f180112b = dVar4;
        euVar.f180111a |= 1;
        C66165cj cjVar = (C66165cj) C66166ck.f179921e.createBuilder();
        C66243fc fcVar = (C66243fc) C66244fd.f180131a.createBuilder();
        fcVar.mo58885m(C66234eu.f180109d, (C66234eu) etVar.build());
        C66244fd fdVar = (C66244fd) fcVar.build();
        cjVar.copyOnWrite();
        C66166ck ckVar = (C66166ck) cjVar.instance;
        fdVar.getClass();
        ckVar.f179924b = fdVar;
        ckVar.f179923a |= 1;
        return (C66166ck) cjVar.build();
    }

    /* renamed from: E */
    private final void m181835E(boolean z) {
        if (m181890n(this.f304280c)) {
            ((C113989h) ((C113988g) this.f304280c).mo100833bf().mo56107c()).mo100868bw(z);
        }
    }

    /* renamed from: G */
    private final void m181837G(C51809dy dyVar) {
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247184cP)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51660r rVar = (C51660r) m181889b(dwVar, "keyboard_update_args", C51660r.f134605c.getParserForType());
            int i = rVar.f134607a;
            if (i == 1) {
                C51666x xVar = (C51666x) rVar.f134608b;
                if ((xVar.f134617a & 1) != 0) {
                    this.f304238K.mo28208h("Scroll to end only when UI card is fully renderered", 300, new C109135gx(this)).mo4106b(C109136gy.f303904a, C109137gz.f303905a);
                    int a = C51663u.m86265a(xVar.f134620d);
                    int i2 = a == 0 ? 1 : a;
                    String str = xVar.f134618b;
                    if ((xVar.f134617a & 2) != 0) {
                        C51665w wVar = xVar.f134619c;
                        if (wVar == null) {
                            wVar = C51665w.f134610d;
                        }
                        int i3 = wVar.f134612a;
                        if (!((i3 & 1) == 0 || (i3 & 2) == 0)) {
                            this.f304286i.mo96146aS(str, new C90735as(wVar.f134613b, wVar.f134614c), C58836b.f156633a, i2, C51211f.CLIENT_OP);
                            return;
                        }
                    }
                    this.f304286i.mo96145aR(str, i2, C51211f.CLIENT_OP);
                }
            } else if (i == 2) {
                this.f304286i.mo96151ac(false);
            }
        } else {
            ((C59052c) ((C59052c) f304227a.mo56226d()).mo56372aa(22758)).mo56386p("ClientOp keyboard.UPDATE is not expected");
            throw new C22428d(dyVar);
        }
    }

    /* renamed from: H */
    private final void m181838H(C108232bc bcVar, C51387fv fvVar) {
        int a;
        if (!this.f304263aj) {
            return;
        }
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90029ch.f248207U) || ((C86124t) this.f304283f.mo27525b()).mo79746e(C90029ch.f248204R) || m181883au()) {
            int a2 = C51386fu.m86174a(fvVar.f133831b);
            int i = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            bcVar.f301026C = a2;
            boolean z = false;
            if (!((fvVar.f133830a & 4) == 0 || (a = C51381fp.m86172a(fvVar.f133833d)) == 0 || a != 2)) {
                z = true;
            }
            bcVar.f301043y = z;
            if (bcVar instanceof C108451je) {
                C108451je jeVar = (C108451je) bcVar;
                int a3 = C51383fr.m86173a(fvVar.f133832c);
                if (a3 != 0) {
                    i = a3;
                }
                jeVar.f301656J = i;
            } else if (bcVar instanceof C108262cf) {
                C108262cf cfVar = (C108262cf) bcVar;
                int a4 = C51383fr.m86173a(fvVar.f133832c);
                if (a4 != 0) {
                    i = a4;
                }
                cfVar.f301171L = i;
            }
        }
    }

    /* renamed from: I */
    private final void m181839I(C109254hs hsVar, C51809dy dyVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C52522uw uwVar = ((C51839b) m181889b(dwVar, "carrier_consent_intent_args", C51839b.f135990c.getParserForType())).f135993b;
        if (uwVar == null) {
            uwVar = C52522uw.f137864j;
        }
        Intent intent = new Intent("com.google.android.gms.mobiledataplan.ui.DETAIL");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
        intent.putExtra("AgreementText", uwVar.f137872g.mo59174N());
        hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
        this.f304282e.mo65090b(intent, new C109199hf(this, uwVar));
    }

    /* renamed from: J */
    private final void m181840J(C51809dy dyVar) {
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247186cR)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51656n nVar = (C51656n) m181889b(dwVar, "highlight_user_query_args", C51656n.f134597e.getParserForType());
            if ((nVar.f134599a & 1) != 0) {
                this.f304280c.mo95359A(this.f304279b, nVar);
            } else {
                ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22761)).mo56386p("No valid text argument for highlighting user query.");
                throw new C22534k();
            }
        } else {
            ((C59052c) ((C59052c) f304227a.mo56226d()).mo56372aa(22762)).mo56386p("ClientOp ui.HIGHLIGHT_USER_QUERY is not expected");
            throw new C22428d(dyVar);
        }
    }

    /* renamed from: K */
    private final void m181841K(C51809dy dyVar) {
        C58833ax c = C109725c.m182679c(dyVar);
        if (c.mo56113h() && "stay_in_half_shelf".equals(c.mo56107c()) && C113987f.m188691b((C86124t) this.f304283f.mo27525b()) && !this.f304280c.mo95399aj() && !this.f304281d.mo98094z()) {
            this.f304281d.mo98067B();
            this.f304281d.mo98070b();
        }
    }

    /* renamed from: L */
    private final void m181842L(String str) {
        if ("lockscreen_permission_promo".equals(str)) {
            ((SharedPreferences) this.f304244Q.mo27525b()).edit().putInt("opa_lockscreen_permission_promo_count", ((SharedPreferences) this.f304244Q.mo27525b()).getInt("opa_lockscreen_permission_promo_count", 0) + 1).apply();
        }
    }

    /* renamed from: M */
    private final void m181843M(C51986gl glVar, C89849ae aeVar) {
        C51133hp a = C51133hp.m86035a(glVar.f136425c);
        if (a == null) {
            a = C51133hp.DEFAULT;
        }
        if (a.equals(C51133hp.NGA_INPUT_PLATE)) {
            ((C89859i) this.f304292o.mo27525b()).mo83702b(aeVar);
        }
    }

    /* renamed from: N */
    private final void m181844N(Context context, View view) {
        Drawable background;
        if (this.f304303z.mo93970a() && (background = view.getBackground()) != null) {
            background.setTint(C28505a.m53283a(R.dimen.gm3_sys_elevation_level2, context));
        }
    }

    /* renamed from: O */
    private final void m181845O(C51809dy dyVar) {
        boolean contains = this.f304273at.contains(dyVar.f135936b);
        boolean e = ((C86124t) this.f304283f.mo27525b()).mo79746e(C90041ct.f248688a);
        if (!contains || !e || !this.f304268ao) {
            this.f304281d.mo98077i();
            this.f304270aq = false;
        } else if (this.f304270aq) {
            this.f304281d.mo98078j();
            this.f304270aq = false;
        }
    }

    /* renamed from: P */
    private final void m181846P(long j, C51809dy dyVar) {
        C51893d dVar;
        C86124t tVar = (C86124t) this.f304283f.mo27525b();
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        try {
            dVar = (C51893d) m181889b(dwVar, "ui_dismiss_args", C51893d.f136119d.getParserForType());
        } catch (C22371a unused) {
            dVar = C51893d.f136119d;
        }
        boolean z = dVar.f136121a;
        boolean z2 = dVar.f136122b;
        boolean z3 = dVar.f136123c;
        if (!tVar.mo79746e(C90029ch.f248282bp) || (!dVar.f136121a && !dVar.f136122b)) {
            C0167am amVar = this.f304284g;
            if (amVar instanceof OpaActivity) {
                ((OpaActivity) amVar).f295634T.mo97837p();
            }
            this.f304284g.finish();
        } else {
            this.f304281d.mo98090v(j, dVar);
        }
        if (dVar.f136123c && m181884av() && this.f304266am.mo56113h()) {
            ((bq) this.f304266am.mo56107c()).m();
        }
    }

    /* renamed from: Q */
    private final void m181847Q(C51823ak akVar) {
        C62971cq<C51822aj> cqVar = akVar.f135963b;
        ArrayList arrayList = new ArrayList();
        for (C51822aj ajVar : cqVar) {
            if ((1 & ajVar.f135958a) != 0) {
                arrayList.add(ajVar.f135959b);
            }
        }
        if (!arrayList.isEmpty()) {
            Intent x = C87566i.m142325x(String.format("googlehome://controller/cast?app_device_id=%s", new Object[]{new C58827ar(",").mo56097d(arrayList)}));
            x.putExtra("extra_opa_keep_conversation_alive_on_stop", true);
            this.f304282e.mo65089a(x);
            return;
        }
        ((C59052c) ((C59052c) f304227a.mo56226d()).mo56372aa(22773)).mo56386p("Unable to show cast device control. There's no available device id.");
        throw new C22534k();
    }

    /* renamed from: R */
    private final void m181848R(C51825am amVar) {
        C51016dg dgVar = amVar.f135967a;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        C107698i iVar = this.f304285h;
        C113713a aVar = new C113713a();
        aVar.f314938a = dgVar;
        aVar.f314939b = iVar;
        aVar.show(this.f304284g.getFragmentManager(), "datePicker");
    }

    /* renamed from: S */
    private final void m181849S(C52131gj gjVar) {
        int i;
        int a;
        int i2 = gjVar.f136795e;
        int a2 = C52130gi.m86513a(i2);
        if (a2 != 0 && a2 == 2) {
            i = R.layout.slider_setting_card;
        } else {
            int a3 = C52130gi.m86513a(i2);
            i = (a3 != 0 && a3 == 4) ? R.layout.discrete_slider_setting_card : R.layout.toggle_setting_card;
        }
        Context q = m181891q(this.f304303z, this.f304279b);
        C108375gj gjVar2 = (C108375gj) LayoutInflater.from(q).inflate(i, (ViewGroup) null);
        boolean z = false;
        if (this.f304250W && ((a = C52130gi.m86513a(gjVar.f136795e)) == 0 || a == 1)) {
            z = true;
        }
        gjVar2.f301430g = z;
        gjVar2.mo96538b(gjVar);
        m181844N(q, gjVar2);
        C28295m.m52919e(gjVar2, new C28292j(78035));
        C108230ba baVar = this.f304280c;
        C108212aj ajVar = new C108212aj(gjVar2, 1);
        m181892r(ajVar, this.f304301x);
        baVar.mo95430s(ajVar);
    }

    /* renamed from: T */
    private final void m181850T(C51840ba baVar) {
        C108365g gVar = new C108365g(baVar);
        gVar.f301038t = ((Long) this.f304287j.mo6453a()).longValue();
        C108230ba baVar2 = this.f304280c;
        m181892r(gVar, this.f304301x);
        baVar2.mo95430s(gVar);
    }

    /* renamed from: U */
    private final void m181851U(List list, C52227jy jyVar, C58833ax axVar) {
        if (!list.isEmpty()) {
            C91183ao aoVar = this.f304237J;
            Context context = this.f304279b;
            C91191aw f = C91192ax.m149027f();
            f.mo85437d(true);
            f.mo85435b(true);
            f.mo85436c(true);
            C91189au c = aoVar.mo85412c(context, f.mo85434a());
            C108387gv gvVar = this.f304262ai;
            if (gvVar != null) {
                synchronized (gvVar.f301468J) {
                    Iterator it = gvVar.f301467I.iterator();
                    while (it.hasNext()) {
                        ((C60870cx) it.next()).cancel(true);
                    }
                    gvVar.f301467I.clear();
                }
                this.f304280c.mo95372N(this.f304262ai);
            }
            C108387gv gvVar2 = new C108387gv(this.f304279b, list, this.f304241N, c, this.f304238K, jyVar, (C107129a) this.f304255ab.mo27525b(), (C86124t) this.f304283f.mo27525b());
            this.f304262ai = gvVar2;
            gvVar2.f301033o = false;
            if (axVar.mo56113h()) {
                m181838H(gvVar2, (C51387fv) axVar.mo56107c());
            }
            C108230ba baVar = this.f304280c;
            C108387gv gvVar3 = this.f304262ai;
            m181892r(gvVar3, this.f304301x);
            baVar.mo95430s(gvVar3);
        }
    }

    /* renamed from: V */
    private final void m181852V(C51809dy dyVar, C58833ax axVar, String str, boolean z) {
        C51965fr frVar;
        try {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            frVar = (C51965fr) m181889b(dwVar, "show_rendered_elements_card_args", C51965fr.f136369d.getParserForType());
        } catch (C22371a unused) {
            frVar = null;
        }
        if (frVar == null) {
            try {
                C51807dw dwVar2 = dyVar.f135938d;
                if (dwVar2 == null) {
                    dwVar2 = C51807dw.f135930b;
                }
                frVar = (C51965fr) m181889b(dwVar2, "show_rendered_card_args", C51965fr.f136369d.getParserForType());
            } catch (C22371a e) {
                throw new C90452a(e, 211, C89885b.OPA_RENDERED_CARD_ARGS_NOT_FOUND_VALUE);
            }
        }
        C51965fr frVar2 = frVar;
        C51807dw dwVar3 = dyVar.f135938d;
        if (dwVar3 == null) {
            dwVar3 = C51807dw.f135930b;
        }
        mo97720j(frVar2, axVar, str, (Integer) null, m181897x(dwVar3), z);
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249658A) && this.f304268ao) {
            ((C109738nl) this.f304275av.mo27525b()).mo98058b(0, ((C86124t) this.f304283f.mo27525b()).mo79743a(C90014bt.f247408gb));
        }
    }

    /* renamed from: W */
    private final void m181853W() {
        C9388a aVar = this.f304256ac;
        C9409b bVar = this.f304258ae;
        C113719g gVar = new C113719g();
        gVar.f314943a = aVar;
        gVar.f314944b = bVar;
        gVar.show(this.f304284g.mo545jw(), "screenContextPermissionDialog");
    }

    /* renamed from: X */
    private final void m181854X(C52027hz hzVar) {
        String str;
        C62971cq<C52026hy> cqVar = hzVar.f136552a;
        ArrayList arrayList = new ArrayList();
        for (C52026hy hyVar : cqVar) {
            if ((1 & hyVar.f136546a) != 0) {
                arrayList.add(hyVar.f136547b);
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder("googlehome://controller/ha?device_id=");
            new C58827ar(",").mo56100g(sb, arrayList);
            if (arrayList.size() == 1) {
                C52026hy hyVar2 = (C52026hy) cqVar.get(0);
                C52019hr hrVar = hyVar2.f136548c;
                if (hrVar == null) {
                    hrVar = C52019hr.f136523g;
                }
                if (hrVar.f136525a.size() > 0) {
                    C52019hr hrVar2 = hyVar2.f136548c;
                    if (hrVar2 == null) {
                        hrVar2 = C52019hr.f136523g;
                    }
                    str = (String) hrVar2.f136525a.get(0);
                } else {
                    str = BuildConfig.FLAVOR;
                }
                if (!str.isEmpty()) {
                    sb.append("&device_type=");
                    sb.append(str);
                }
            }
            Intent x = C87566i.m142325x(sb.toString());
            x.putExtra("extra_opa_keep_conversation_alive_on_stop", true);
            this.f304282e.mo65089a(x);
            return;
        }
        ((C59052c) ((C59052c) f304227a.mo56226d()).mo56372aa(22777)).mo56386p("Unable to show smart device control. There's no available device.");
        throw new C22534k();
    }

    /* renamed from: Y */
    private final void m181855Y(C109254hs hsVar, akp akp) {
        if ((akp.f135281a & 1) != 0) {
            Intent intent = new Intent();
            intent.putExtra("uri", new Uri.Builder().scheme("assistant-identity").authority("link-account").build().toString());
            if (akp.f135283c.size() > 0) {
                intent.putExtra("scopes", new C58827ar(" ").mo56097d(akp.f135283c));
            }
            if (akp.f135284d) {
                intent.putExtra("support_app_flip", true);
            }
            int i = akp.f135285e;
            if (i != 0) {
                intent.putExtra("session_id", i);
            }
            intent.putExtra("provider", akp.f135282b);
            Intent a = C9443a.m23961a(intent, 2, 2);
            hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
            m181875am(a);
            return;
        }
        ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22778)).mo56386p("No valid clientOp arguments to start account linking.");
        throw new C22534k();
    }

    /* renamed from: Z */
    private final void m181856Z(C51978gd gdVar, C58833ax axVar) {
        C108204ab abVar = new C108204ab(gdVar.f136401a, this.f304282e);
        abVar.f301038t = ((Long) this.f304287j.mo6453a()).longValue();
        if (axVar.mo56113h()) {
            m181838H(abVar, (C51387fv) axVar.mo56107c());
        }
        C108230ba baVar = this.f304280c;
        m181892r(abVar, this.f304301x);
        baVar.mo95430s(abVar);
    }

    /* renamed from: aA */
    private final boolean m181857aA(String str, String str2) {
        if ((!((C58833ax) this.f304257ad.mo27525b()).mo56113h() || !((C74713bn) ((C58833ax) this.f304257ad.mo27525b()).mo56107c()).mo71077b()) && !((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247307eg)) {
            return false;
        }
        return m181862aF(str, str2, 2, (byte[]) null, (Integer) C89108b.f241543c.getOrDefault(str, Integer.valueOf(R.drawable.quantum_gm_ic_settings_gm_grey_36)), (String) null, 1, C58836b.f156633a);
    }

    /* renamed from: aB */
    private final boolean m181858aB(C51986gl glVar, C58833ax axVar, long j, String str) {
        int a;
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247609kQ)) {
            boolean ar = m181880ar(glVar);
            this.f304272as = ar;
            if (ar) {
                if (this.f304271ar) {
                    m181835E(false);
                }
            } else if (this.f304271ar) {
                m181835E(true);
            }
        }
        this.f304298u = axVar;
        C51133hp a2 = C51133hp.m86035a(glVar.f136425c);
        if (a2 == null) {
            a2 = C51133hp.DEFAULT;
        }
        if (a2.equals(C51133hp.NGA_INPUT_PLATE)) {
            if (!m181884av()) {
                ((C19567d) this.f304277ax.f102823aG.mo6453a()).mo24822a(1, new Object[0]);
                ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.ESCAPE_HATCH_PERFORMER_DROPPED_DUE_TO_NGA_DISABLED);
                return false;
            }
            C107759j jVar = (C107759j) this.f304296s.mo27525b();
            C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
            C83630as asVar = (C83630as) C83631at.f227986c.createBuilder();
            asVar.copyOnWrite();
            C83631at atVar = (C83631at) asVar.instance;
            glVar.getClass();
            atVar.f227989b = glVar;
            atVar.f227988a |= 1;
            wVar.copyOnWrite();
            C83673y yVar = (C83673y) wVar.instance;
            C83631at atVar2 = (C83631at) asVar.build();
            atVar2.getClass();
            yVar.f228084c = atVar2;
            yVar.f228083b = 15;
            if (!jVar.mo96274j(wVar)) {
                ((C89859i) jVar.f299832c.mo27525b()).mo83702b(C89849ae.ESCAPE_HATCH_NGA_SENDER_DROPPED);
            } else {
                ((C89859i) jVar.f299832c.mo27525b()).mo83702b(C89849ae.ESCAPE_HATCH_SENT_FROM_OPA);
            }
            ((C19567d) this.f304277ax.f102824aH.mo6453a()).mo24822a(1, new Object[0]);
            return false;
        } else if (!((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247760nI) || (a = (int) ((C86124t) this.f304283f.mo27525b()).mo79743a(C90014bt.f247772nU)) <= 0) {
            if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247793np) && this.f304263aj && this.f304250W) {
                C51133hp a3 = C51133hp.m86035a(glVar.f136425c);
                if (a3 == null) {
                    a3 = C51133hp.DEFAULT;
                }
                if (a3 == C51133hp.RICH_SUGGESTIONS) {
                    this.f304280c.mo95397ah(j, str);
                    this.f304280c.mo95433v(m181831A(glVar, false));
                    this.f304280c.mo95381W(m181831A(glVar, true));
                    return true;
                }
            }
            mo97722l(glVar);
            return true;
        } else {
            this.f304238K.mo28213m("showSuggestions", (long) a, new C109202hi(this, glVar));
            return true;
        }
    }

    /* renamed from: aC */
    private final boolean m181859aC(afb afb) {
        C108339fa l = this.f304280c.mo95423l();
        if (l == null) {
            return false;
        }
        l.mo96799b(afb.f134987b);
        int i = afb.f134987b;
        String str = afb.f134988c;
        C107572o b = l.f301361b.mo96026b(i);
        if ((b instanceof C107561d) || (b instanceof C107558a)) {
            return l.f301361b.mo96028e(b, new C107578u(b.f299285c, str, b.f299290h));
        }
        C59104x d = C108339fa.f301360a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MsgNotifCarousel");
        ((C59052c) ((C59052c) d).mo56372aa(24011)).mo56387q("Failed to replace the card at index %%d with reply sent card.%d", i);
        return false;
    }

    /* renamed from: aD */
    private final boolean m181860aD(afd afd) {
        C108339fa l = this.f304280c.mo95423l();
        if (l != null) {
            int i = afd.f134992a;
            if (i == 2) {
                int i2 = ((aff) afd.f134993b).f134998b;
                l.mo96799b(i2);
                C107572o b = l.f301361b.mo96026b(i2);
                if (b instanceof C107558a) {
                    return l.f301361b.mo96028e(b, new C107561d(b.f299285c, b.f299286d, b.f299287e, b.f299290h));
                }
                return false;
            } else if (i == 1) {
                aeo aeo = (aeo) afd.f134993b;
                int i3 = aeo.f134945b;
                String str = aeo.f134946c;
                l.mo96799b(i3);
                C107572o b2 = l.f301361b.mo96026b(i3);
                if ((b2 instanceof C107561d) || (b2 instanceof C107558a)) {
                    return l.f301361b.mo96028e(b2, new C107558a(b2.f299285c, str, b2.f299286d, b2.f299287e, b2.f299290h));
                }
                C59104x d = C108339fa.f301360a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MsgNotifCarousel");
                ((C59052c) ((C59052c) d).mo56372aa(24010)).mo56387q("Failed to replace the card at index %d with edit reply card.", i3);
                return false;
            }
        }
        throw new C22534k();
    }

    /* renamed from: aE */
    private final boolean m181861aE() {
        if (!this.f304263aj || !((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247617kY) || !this.f304264ak.mo56113h()) {
            return false;
        }
        boolean isDeviceLocked = ((C106171l) this.f304264ak.mo56107c()).f296304b.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        return !isDeviceLocked && !this.f304268ao && !this.f304269ap && !this.f304270aq;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e A[RETURN] */
    /* renamed from: aF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m181862aF(java.lang.String r13, java.lang.String r14, int r15, byte[] r16, java.lang.Integer r17, java.lang.String r18, int r19, com.google.common.base.C58833ax r20) {
        /*
            r12 = this;
            r0 = r12
            r1 = r17
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r2 = r0.f304303z
            android.content.Context r3 = r0.f304279b
            android.content.Context r2 = m181891q(r2, r3)
            com.google.android.apps.gsa.search.shared.service.b.um r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            int r3 = r19 + -1
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0037
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            if (r1 == 0) goto L_0x001d
            r6 = 2131626265(0x7f0e0919, float:1.8879761E38)
            goto L_0x0020
        L_0x001d:
            r6 = 2131626264(0x7f0e0918, float:1.887976E38)
        L_0x0020:
            android.view.View r3 = r3.inflate(r6, r4)
            com.google.android.apps.gsa.staticplugins.opa.chatui.OpaSliceCard r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.OpaSliceCard) r3
            if (r1 == 0) goto L_0x002b
            r3.mo96567b(r1)
        L_0x002b:
            com.google.android.libraries.logging.j r1 = new com.google.android.libraries.logging.j
            r4 = 77600(0x12f20, float:1.08741E-40)
            r1.<init>(r4)
            com.google.android.libraries.logging.C28295m.m52919e(r3, r1)
            goto L_0x0045
        L_0x0037:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r3 = 2131626278(0x7f0e0926, float:1.8879788E38)
            android.view.View r1 = r1.inflate(r3, r4)
            r3 = r1
            com.google.android.apps.gsa.staticplugins.opa.chatui.OpaSliceCard r3 = (com.google.android.apps.gsa.staticplugins.opa.chatui.OpaSliceCard) r3
        L_0x0045:
            r1 = 2131435957(0x7f0b21b5, float:1.849377E38)
            android.view.View r1 = r3.findViewById(r1)
            if (r1 != 0) goto L_0x004f
            r1 = r3
        L_0x004f:
            r12.m181844N(r2, r1)
            int r1 = r15 + -1
            if (r1 == r5) goto L_0x0061
            r2 = 3
            r4 = 2
            if (r1 == r4) goto L_0x005f
            if (r1 == r2) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            r9 = 2
            goto L_0x0062
        L_0x005f:
            r9 = 3
            goto L_0x0062
        L_0x0061:
            r9 = 1
        L_0x0062:
            r6 = r3
            r7 = r13
            r8 = r14
            r10 = r16
            r11 = r18
            boolean r1 = r6.mo96568c(r7, r8, r9, r10, r11)
            if (r1 == 0) goto L_0x008e
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r1 = new com.google.android.apps.gsa.staticplugins.opa.chatui.aj
            r1.<init>(r3, r5)
            boolean r2 = r20.mo56113h()
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r20.mo56107c()
            com.google.assistant.e.i.a.fv r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51387fv) r2
            r12.m181838H(r1, r2)
        L_0x0083:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r0.f304280c
            long r3 = r0.f304301x
            m181892r(r1, r3)
            r2.mo95430s(r1)
            return r5
        L_0x008e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109258hw.m181862aF(java.lang.String, java.lang.String, int, byte[], java.lang.Integer, java.lang.String, int, com.google.common.base.ax):boolean");
    }

    /* renamed from: aa */
    private final void m181863aa(C51918dy dyVar, C58833ax axVar) {
        OpaSwipeViewListCard opaSwipeViewListCard = (OpaSwipeViewListCard) LayoutInflater.from(C108435ip.m180256a(this.f304303z, this.f304279b)).inflate(R.layout.opa_swipe_view_list_card, (ViewGroup) null);
        FragmentManager fragmentManager = this.f304232E.f303910e;
        opaSwipeViewListCard.f300930a.setText(dyVar.f136195a);
        opaSwipeViewListCard.f300931b.mo9146k(new C113727n(fragmentManager, dyVar.f136196b));
        C108212aj ajVar = new C108212aj(opaSwipeViewListCard, 1);
        if (axVar.mo56113h()) {
            m181838H(ajVar, (C51387fv) axVar.mo56107c());
        }
        C108230ba baVar = this.f304280c;
        m181892r(ajVar, this.f304301x);
        baVar.mo95430s(ajVar);
    }

    /* renamed from: ab */
    private final void m181864ab(String str, C58833ax axVar, String str2) {
        Object obj;
        boolean a = C82193a.m130503a(this.f304284g);
        boolean z = this.f304280c.mo95416e() == 42567;
        int a2 = C109068ge.m181589a(((C86124t) this.f304283f.mo27525b()).mo79743a(C90029ch.f248197K));
        C66227en enVar = (C66227en) C66228eo.f180093f.createBuilder();
        Context context = this.f304279b;
        if (!z) {
            a2 = a ? R.color.chatui_drl_color_template_card_background_dark_mode : R.color.chatui_drl_color_template_card_background;
        } else if (a2 == 0) {
            a2 = R.color.chatui_drl_color_template_card_background_in_personality_joke;
        }
        int a3 = C1878d.m5128a(context, a2);
        enVar.copyOnWrite();
        C66228eo eoVar = (C66228eo) enVar.instance;
        eoVar.f180096a |= 1;
        eoVar.f180097b = a3;
        int a4 = C1878d.m5128a(this.f304279b, z ? 17170445 : a ? R.color.chatui_drl_color_template_border_dark_mode : R.color.chatui_drl_color_template_border);
        enVar.copyOnWrite();
        C66228eo eoVar2 = (C66228eo) enVar.instance;
        eoVar2.f180096a |= 4;
        eoVar2.f180098c = a4;
        enVar.copyOnWrite();
        C66228eo eoVar3 = (C66228eo) enVar.instance;
        eoVar3.f180096a |= 8;
        eoVar3.f180099d = 1.0f;
        enVar.copyOnWrite();
        C66228eo eoVar4 = (C66228eo) enVar.instance;
        eoVar4.f180096a |= 16;
        eoVar4.f180100e = 20.0f;
        C66228eo eoVar5 = (C66228eo) enVar.build();
        C66188db dbVar = (C66188db) C66189dc.f179984d.createBuilder();
        C66142bu buVar = (C66142bu) C66143bv.f179857f.createBuilder();
        C66144bw bwVar = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar.copyOnWrite();
        C66145bx bxVar = (C66145bx) bwVar.instance;
        bxVar.f179866a |= 1;
        bxVar.f179867b = 16.0f;
        bwVar.copyOnWrite();
        C66145bx bxVar2 = (C66145bx) bwVar.instance;
        bxVar2.f179868c = 1;
        bxVar2.f179866a |= 2;
        C66145bx bxVar3 = (C66145bx) bwVar.build();
        buVar.copyOnWrite();
        C66143bv bvVar = (C66143bv) buVar.instance;
        bxVar3.getClass();
        bvVar.f179861c = bxVar3;
        bvVar.f179859a |= 2;
        C66144bw bwVar2 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar2.copyOnWrite();
        C66145bx bxVar4 = (C66145bx) bwVar2.instance;
        bxVar4.f179866a |= 1;
        bxVar4.f179867b = 16.0f;
        bwVar2.copyOnWrite();
        C66145bx bxVar5 = (C66145bx) bwVar2.instance;
        bxVar5.f179868c = 1;
        bxVar5.f179866a |= 2;
        C66145bx bxVar6 = (C66145bx) bwVar2.build();
        buVar.copyOnWrite();
        C66143bv bvVar2 = (C66143bv) buVar.instance;
        bxVar6.getClass();
        bvVar2.f179863e = bxVar6;
        bvVar2.f179859a |= 8;
        C66144bw bwVar3 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar3.copyOnWrite();
        C66145bx bxVar7 = (C66145bx) bwVar3.instance;
        bxVar7.f179866a |= 1;
        bxVar7.f179867b = 16.0f;
        bwVar3.copyOnWrite();
        C66145bx bxVar8 = (C66145bx) bwVar3.instance;
        bxVar8.f179868c = 1;
        bxVar8.f179866a |= 2;
        C66145bx bxVar9 = (C66145bx) bwVar3.build();
        buVar.copyOnWrite();
        C66143bv bvVar3 = (C66143bv) buVar.instance;
        bxVar9.getClass();
        bvVar3.f179860b = bxVar9;
        bvVar3.f179859a |= 1;
        C66144bw bwVar4 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar4.copyOnWrite();
        C66145bx bxVar10 = (C66145bx) bwVar4.instance;
        bxVar10.f179866a |= 1;
        bxVar10.f179867b = 16.0f;
        bwVar4.copyOnWrite();
        C66145bx bxVar11 = (C66145bx) bwVar4.instance;
        bxVar11.f179868c = 1;
        bxVar11.f179866a |= 2;
        C66145bx bxVar12 = (C66145bx) bwVar4.build();
        buVar.copyOnWrite();
        C66143bv bvVar4 = (C66143bv) buVar.instance;
        bxVar12.getClass();
        bvVar4.f179862d = bxVar12;
        bvVar4.f179859a |= 4;
        C66143bv bvVar5 = (C66143bv) buVar.build();
        dbVar.copyOnWrite();
        C66189dc dcVar = (C66189dc) dbVar.instance;
        bvVar5.getClass();
        dcVar.f179988b = bvVar5;
        dcVar.f179987a |= 128;
        C66142bu buVar2 = (C66142bu) C66143bv.f179857f.createBuilder();
        C66144bw bwVar5 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar5.copyOnWrite();
        C66145bx bxVar13 = (C66145bx) bwVar5.instance;
        bxVar13.f179866a |= 1;
        bxVar13.f179867b = 16.0f;
        bwVar5.copyOnWrite();
        C66145bx bxVar14 = (C66145bx) bwVar5.instance;
        bxVar14.f179868c = 1;
        bxVar14.f179866a |= 2;
        C66145bx bxVar15 = (C66145bx) bwVar5.build();
        buVar2.copyOnWrite();
        C66143bv bvVar6 = (C66143bv) buVar2.instance;
        bxVar15.getClass();
        bvVar6.f179861c = bxVar15;
        bvVar6.f179859a |= 2;
        C66144bw bwVar6 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar6.copyOnWrite();
        C66145bx bxVar16 = (C66145bx) bwVar6.instance;
        bxVar16.f179866a |= 1;
        bxVar16.f179867b = 16.0f;
        bwVar6.copyOnWrite();
        C66145bx bxVar17 = (C66145bx) bwVar6.instance;
        bxVar17.f179868c = 1;
        bxVar17.f179866a |= 2;
        C66145bx bxVar18 = (C66145bx) bwVar6.build();
        buVar2.copyOnWrite();
        C66143bv bvVar7 = (C66143bv) buVar2.instance;
        bxVar18.getClass();
        bvVar7.f179863e = bxVar18;
        bvVar7.f179859a |= 8;
        C66144bw bwVar7 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar7.copyOnWrite();
        C66145bx bxVar19 = (C66145bx) bwVar7.instance;
        bxVar19.f179866a |= 1;
        bxVar19.f179867b = 20.0f;
        bwVar7.copyOnWrite();
        C66145bx bxVar20 = (C66145bx) bwVar7.instance;
        bxVar20.f179868c = 1;
        bxVar20.f179866a |= 2;
        C66145bx bxVar21 = (C66145bx) bwVar7.build();
        buVar2.copyOnWrite();
        C66143bv bvVar8 = (C66143bv) buVar2.instance;
        bxVar21.getClass();
        bvVar8.f179860b = bxVar21;
        bvVar8.f179859a |= 1;
        C66144bw bwVar8 = (C66144bw) C66145bx.f179864d.createBuilder();
        bwVar8.copyOnWrite();
        C66145bx bxVar22 = (C66145bx) bwVar8.instance;
        bxVar22.f179866a |= 1;
        bxVar22.f179867b = 20.0f;
        bwVar8.copyOnWrite();
        C66145bx bxVar23 = (C66145bx) bwVar8.instance;
        bxVar23.f179868c = 1;
        bxVar23.f179866a |= 2;
        C66145bx bxVar24 = (C66145bx) bwVar8.build();
        buVar2.copyOnWrite();
        C66143bv bvVar9 = (C66143bv) buVar2.instance;
        bxVar24.getClass();
        bvVar9.f179862d = bxVar24;
        bvVar9.f179859a |= 4;
        C66143bv bvVar10 = (C66143bv) buVar2.build();
        dbVar.copyOnWrite();
        C66189dc dcVar2 = (C66189dc) dbVar.instance;
        bvVar10.getClass();
        dcVar2.f179989c = bvVar10;
        dcVar2.f179987a |= 256;
        C66189dc dcVar3 = (C66189dc) dbVar.build();
        ArrayList arrayList = new ArrayList();
        C108232bc c = this.f304280c.mo95421j().mo95353c();
        if (c instanceof C108474ka) {
            C108474ka kaVar = (C108474ka) c;
            if (kaVar.f301721e) {
                C54201r rVar = kaVar.f301718b;
                C62940bt r6 = C62942bv.checkIsLite(C54192i.f142222b);
                rVar.mo58887l(r6);
                Object l = rVar.f169962ag.mo58854l(r6.f169971d);
                if (l == null) {
                    obj = r6.f169969b;
                } else {
                    obj = r6.mo58889c(l);
                }
                try {
                    C63070h hVar = ((C57784p) obj).f154385b;
                    if (hVar == null) {
                        hVar = C63070h.f170215c;
                    }
                    C66166ck ckVar = (C66166ck) C62942bv.parseFrom((C62942bv) C66166ck.f179921e, hVar.f170218b, C62921ba.m95368a());
                    if (ckVar.f179926d.size() > 0) {
                        arrayList.addAll(ckVar.f179926d);
                    }
                } catch (C62974ct e) {
                    ((C59052c) ((C59052c) ((C59052c) f304227a.mo56225c()).mo56382g(e)).mo56372aa(22755)).mo56386p("Failed to add text from last local generated XUiKitCard when showing a new one.");
                }
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(m181834D(" ", a));
        }
        arrayList.add(m181834D(str, a));
        C66165cj cjVar = (C66165cj) C66166ck.f179921e.createBuilder();
        C66243fc fcVar = (C66243fc) C66244fd.f180131a.createBuilder();
        fcVar.mo58885m(C66136bo.f179843b, C66136bo.f179842a);
        cjVar.copyOnWrite();
        C66166ck ckVar2 = (C66166ck) cjVar.instance;
        C66244fd fdVar = (C66244fd) fcVar.build();
        fdVar.getClass();
        ckVar2.f179924b = fdVar;
        ckVar2.f179923a |= 1;
        cjVar.copyOnWrite();
        C66166ck ckVar3 = (C66166ck) cjVar.instance;
        C62971cq cqVar = ckVar3.f179926d;
        if (!cqVar.mo58948c()) {
            ckVar3.f179926d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) ckVar3.f179926d);
        C66207du duVar = (C66207du) C66208dv.f180040a.createBuilder();
        duVar.mo58885m(C66228eo.f180094g, eoVar5);
        duVar.mo58885m(C66189dc.f179985e, dcVar3);
        C66208dv dvVar = (C66208dv) duVar.build();
        cjVar.copyOnWrite();
        C66166ck ckVar4 = (C66166ck) cjVar.instance;
        dvVar.getClass();
        ckVar4.f179925c = dvVar;
        ckVar4.f179923a |= 2;
        C57783o oVar = (C57783o) C57784p.f154382f.createBuilder();
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        C63088z byteString = ((C66166ck) cjVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        C63070h hVar2 = (C63070h) gVar.build();
        oVar.copyOnWrite();
        C57784p pVar = (C57784p) oVar.instance;
        hVar2.getClass();
        pVar.f154385b = hVar2;
        pVar.f154384a |= 1;
        C51964fq fqVar = (C51964fq) C51965fr.f136369d.createBuilder();
        C54200q qVar = (C54200q) C54201r.f142243f.createBuilder();
        qVar.mo58885m(C54192i.f142222b, (C57784p) oVar.build());
        C63088z byteString2 = ((C54201r) qVar.build()).toByteString();
        fqVar.copyOnWrite();
        C51965fr frVar = (C51965fr) fqVar.instance;
        byteString2.getClass();
        frVar.f136371a |= 1;
        frVar.f136372b = byteString2;
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "ui.SHOW_RENDERED_CARD";
        C51806dv dvVar2 = (C51806dv) C51807dw.f135930b.createBuilder();
        C63088z byteString3 = ((C51965fr) fqVar.build()).toByteString();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "show_rendered_elements_card_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.client_op.ShowRenderedCardArgs";
        jzVar.copyOnWrite();
        C52230ka kaVar3 = (C52230ka) jzVar.instance;
        byteString3.getClass();
        kaVar3.f137059a |= 2;
        kaVar3.f137061c = byteString3;
        C52230ka kaVar4 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar4.getClass();
        kcVar2.f137066c = kaVar4;
        kcVar2.f137064a |= 2;
        dvVar2.mo53733c((C52232kc) kbVar.build());
        C51807dw dwVar = (C51807dw) dvVar2.build();
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        try {
            m181852V((C51809dy) dxVar.build(), axVar, str2, true);
        } catch (C90452a | C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f304227a.mo56225c()).mo56382g(e2)).mo56372aa(22779)).mo56386p("Failed to render local generated text-only XUiKitCard");
        }
    }

    /* renamed from: ac */
    private final void m181865ac(C52005hd hdVar) {
        C51016dg dgVar = hdVar.f136488a;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        C107698i iVar = this.f304285h;
        C113731r rVar = new C113731r();
        rVar.f314963a = dgVar;
        rVar.f314964b = iVar;
        rVar.show(this.f304284g.getFragmentManager(), "timePicker");
    }

    /* renamed from: ad */
    private final void m181866ad(C52011hj hjVar, C58833ax axVar) {
        OpaToggleCard opaToggleCard = (OpaToggleCard) LayoutInflater.from(m181891q(this.f304303z, this.f304279b)).inflate(R.layout.opa_toggle_card, (ViewGroup) null);
        C108244bo boVar = this.f304235H;
        opaToggleCard.f300933b.setText(hjVar.f136500a);
        opaToggleCard.f300934c.setText(hjVar.f136501b);
        opaToggleCard.f300936e.setId(View.generateViewId());
        opaToggleCard.f300936e.setOnCheckedChangeListener(new C108381gp(hjVar.f136503d, hjVar.f136504e, boVar));
        opaToggleCard.f300937f = (C91189au) this.f304234G.mo27525b();
        C51012dc dcVar = hjVar.f136502c;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        if ((dcVar.f132815a & 2) != 0) {
            C51012dc dcVar2 = hjVar.f136502c;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            C60856cj.m92911t(opaToggleCard.f300937f.mo85417d(Uri.parse(dcVar2.f132817c)), new C108380go(opaToggleCard), C60826bg.f164896a);
        }
        if (opaToggleCard.f300935d.getDrawable() == null) {
            opaToggleCard.f300935d.setImageDrawable(opaToggleCard.getContext().getDrawable(R.drawable.opa_assistant_logo));
        }
        C108212aj ajVar = new C108212aj(opaToggleCard, 1);
        ajVar.f301028j = hjVar.f136505f;
        if (axVar.mo56113h()) {
            m181838H(ajVar, (C51387fv) axVar.mo56107c());
        }
        C108230ba baVar = this.f304280c;
        m181892r(ajVar, this.f304301x);
        baVar.mo95430s(ajVar);
    }

    /* renamed from: ae */
    private final void m181867ae(C109254hs hsVar, anf anf) {
        Intent intent = new Intent();
        intent.putExtra("uri", new Uri.Builder().scheme("assistant-transactions").authority("add-address").build().toString());
        int i = anf.f135426a;
        if ((i & 2) != 0) {
            C59326i iVar = C59326i.f157517e;
            byte[] N = anf.f135428c.mo59174N();
            intent.putExtra("address_collection_parameters", iVar.mo56837l(N, N.length));
        } else if ((i & 1) != 0) {
            intent.putExtra("country_code", anf.f135427b);
        }
        Intent a = C9443a.m23961a(intent, 2, 2);
        hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
        m181875am(a);
    }

    /* renamed from: ag */
    private final void m181869ag(C109254hs hsVar, anl anl) {
        int a;
        if (!((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247537iy)) {
            int i = anl.f135436a;
            if ((i & 4) == 0 || (i & 8) == 0) {
                ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22781)).mo56386p("No valid clientOp arguments to start transactions authentication.");
                throw new C22534k();
            }
        }
        boolean z = false;
        if (!((anl.f135436a & 2) == 0 || (a = anj.m86347a(anl.f135438c)) == 0 || a != 2)) {
            z = true;
        }
        Intent intent = new Intent();
        intent.putExtra("uri", new Uri.Builder().scheme("assistant-transactions").authority("authentication").build().toString());
        if ((1 & anl.f135436a) != 0) {
            intent.putExtra("client_input_name", anl.f135437b);
        }
        if ((anl.f135436a & 32) != 0) {
            intent.putExtra("fingerprint_hint", anl.f135442g);
        }
        if ((anl.f135436a & 16) != 0) {
            intent.putExtra("title", anl.f135441f);
        }
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247537iy)) {
            if ((anl.f135436a & 128) != 0) {
                intent.putExtra("legal_text", anl.f135444i);
            }
        } else if ((anl.f135436a & 64) != 0) {
            intent.putExtra("legal_text", anl.f135443h);
        }
        if ((anl.f135436a & 256) != 0) {
            intent.putExtra("pw_max_try_error", anl.f135445j);
        }
        if ((anl.f135436a & 4) != 0) {
            intent.putExtra("header", anl.f135439d);
        }
        if ((anl.f135436a & 8) != 0) {
            intent.putExtra("sub_header", anl.f135440e);
        }
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247537iy)) {
            intent.putExtra("enable_fingerprint_for_future_approvals_checkbox", anl.f135446k);
        }
        intent.putExtra("use_fingerprint", z);
        Intent a2 = C9443a.m23961a(intent, 2, 2);
        hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
        m181875am(a2);
    }

    /* renamed from: aj */
    private final void m181872aj(C109254hs hsVar, aoq aoq) {
        int i = 1;
        if ((aoq.f135510a & 1) == 0 || aoq.f135511b <= 0) {
            ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22784)).mo56386p("No valid clientOp arguments to start transactions pin authentication.");
            throw new C22534k();
        }
        Intent intent = new Intent();
        intent.putExtra("uri", new Uri.Builder().scheme("assistant-transactions").authority("pin-authentication").build().toString());
        intent.putExtra("pin_length", aoq.f135511b);
        if ((aoq.f135510a & 2) != 0) {
            intent.putExtra("header", aoq.f135512c);
        }
        if ((aoq.f135510a & 4) != 0) {
            intent.putExtra("logo_url", aoq.f135513d);
        }
        if ((aoq.f135510a & 32) != 0) {
            intent.putExtra("hint", aoq.f135516g);
        }
        if ((aoq.f135510a & 16) != 0) {
            int a = aop.m86354a(aoq.f135515f);
            if (a != 0) {
                i = a;
            }
            intent.putExtra("hint_type", i - 1);
        }
        if ((aoq.f135510a & 64) != 0) {
            intent.putExtra("forgot_pin_url", aoq.f135517h);
        }
        if ((aoq.f135510a & 128) != 0) {
            intent.putExtra("forgot_pin_message", aoq.f135518i);
        }
        if ((aoq.f135510a & 8) != 0) {
            intent.putExtra("forgot_pin_html_message", aoq.f135514e);
        }
        Intent a2 = C9443a.m23961a(intent, 2, 2);
        hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
        m181875am(a2);
    }

    /* renamed from: ak */
    private final void m181873ak(C109254hs hsVar) {
        Intent intent = new Intent();
        intent.putExtra("uri", new Uri.Builder().scheme("assistant-transactions").authority("setup-payments").build().toString());
        Intent a = C9443a.m23961a(intent, 2, 2);
        hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
        m181875am(a);
    }

    /* renamed from: al */
    private final void m181874al(C109254hs hsVar, C51686apa apa) {
        int i = apa.f135538a;
        if ((i & 1) == 0) {
            ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22786)).mo56386p("url argument is required for url.HANDOFF client op.");
            throw new C22534k();
        } else if ((i & 2) != 0) {
            Intent intent = new Intent();
            intent.putExtra("uri", new Uri.Builder().scheme("url-handoff").authority("assistant").build().toString());
            intent.putExtra("url", apa.f135539b);
            int a = aoz.m86357a(apa.f135540c);
            if (a == 0) {
                a = 1;
            }
            intent.putExtra("feature_namespace", a - 1);
            intent.putExtra("feature_name", apa.f135541d);
            Intent a2 = C9443a.m23961a(intent, 2, 2);
            hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
            m181875am(a2);
        } else {
            ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22785)).mo56386p("feature namespace argument is required for url.HANDOFF client op.");
            throw new C22534k();
        }
    }

    /* renamed from: am */
    private final void m181875am(Intent intent) {
        OpaResultCallback opaResultCallback = new OpaResultCallback(0, Bundle.EMPTY);
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249703z)) {
            intent.putExtra("extra_opa_keep_conversation_alive_on_stop", true);
        }
        this.f304282e.mo65090b(intent, opaResultCallback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* renamed from: ao */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m181877ao(com.google.assistant.p3897e.p3921j.C51809dy r17, com.google.common.base.C58833ax r18, com.google.android.apps.gsa.staticplugins.opa.C109254hs r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            dagger.a r2 = r0.f304276aw
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.search.assistant.platform.g.a.d r2 = (com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120948d) r2
            r3 = 0
            if (r2 != 0) goto L_0x0010
            return r3
        L_0x0010:
            java.lang.String r4 = r1.f135936b
            int r5 = r4.hashCode()
            r6 = -8315748(0xffffffffff811c9c, float:NaN)
            r7 = 2
            r8 = 1
            if (r5 == r6) goto L_0x003c
            r6 = 485415337(0x1ceed9a9, float:1.5805783E-21)
            if (r5 == r6) goto L_0x0032
            r6 = 1182117200(0x4675ad50, float:15723.328)
            if (r5 == r6) goto L_0x0028
            goto L_0x0046
        L_0x0028:
            java.lang.String r5 = "provider.BIND_APP_ACTIONS_SERVICE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0046
            r4 = 0
            goto L_0x0047
        L_0x0032:
            java.lang.String r5 = "provider.UNBIND_APP_ACTIONS_SERVICE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0046
            r4 = 2
            goto L_0x0047
        L_0x003c:
            java.lang.String r5 = "provider.UPDATE_APP_ACTIONS_SERVICE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0046
            r4 = 1
            goto L_0x0047
        L_0x0046:
            r4 = -1
        L_0x0047:
            if (r4 == 0) goto L_0x00a0
            if (r4 == r8) goto L_0x0077
            if (r4 == r7) goto L_0x004e
            return r3
        L_0x004e:
            java.util.concurrent.atomic.AtomicReference r2 = r2.mo105012a()
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.assistant.platform.g.a.c r2 = (com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120947c) r2
            if (r2 == 0) goto L_0x0076
            com.google.android.apps.search.assistant.platform.g.a.bl r4 = new com.google.android.apps.search.assistant.platform.g.a.bl
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x0062
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0062:
            com.google.assistant.e.j.aeg r5 = com.google.assistant.p3897e.p3921j.aeg.f134932a
            com.google.protobuf.eb r5 = r5.getParserForType()
            java.lang.String r6 = "provider_unbind_app_actions_service_args"
            com.google.protobuf.MessageLite r1 = m181889b(r1, r6, r5)
            com.google.assistant.e.j.aeg r1 = (com.google.assistant.p3897e.p3921j.aeg) r1
            r4.<init>(r1)
            r2.mo104962c(r4)
        L_0x0076:
            return r3
        L_0x0077:
            java.util.concurrent.atomic.AtomicReference r2 = r2.mo105012a()
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.assistant.platform.g.a.c r2 = (com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120947c) r2
            if (r2 == 0) goto L_0x009f
            com.google.android.apps.search.assistant.platform.g.a.bm r4 = new com.google.android.apps.search.assistant.platform.g.a.bm
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x008b
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x008b:
            com.google.assistant.e.j.aei r5 = com.google.assistant.p3897e.p3921j.aei.f134934a
            com.google.protobuf.eb r5 = r5.getParserForType()
            java.lang.String r6 = "provider_update_app_actions_service_args"
            com.google.protobuf.MessageLite r1 = m181889b(r1, r6, r5)
            com.google.assistant.e.j.aei r1 = (com.google.assistant.p3897e.p3921j.aei) r1
            r4.<init>(r1)
            r2.mo104962c(r4)
        L_0x009f:
            return r3
        L_0x00a0:
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x00a6
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x00a6:
            com.google.assistant.e.j.ady r4 = com.google.assistant.p3897e.p3921j.ady.f134912f
            com.google.protobuf.eb r4 = r4.getParserForType()
            java.lang.String r5 = "provider_bind_app_actions_service_args"
            com.google.protobuf.MessageLite r1 = m181889b(r1, r5, r4)
            com.google.assistant.e.j.ady r1 = (com.google.assistant.p3897e.p3921j.ady) r1
            boolean r4 = r1.f134918e
            if (r4 == 0) goto L_0x00c7
            com.google.android.apps.gsa.staticplugins.opa.gu r4 = new com.google.android.apps.gsa.staticplugins.opa.gu
            r4.<init>(r2, r1)
            com.google.common.util.concurrent.cx r1 = androidx.p104d.p105a.C2169h.m6027a(r4)
            r2 = r19
            r2.mo97709b(r1)
            return r3
        L_0x00c7:
            android.content.Context r3 = r16.m181893t()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r3)
            r5 = 2131626213(0x7f0e08e5, float:1.8879656E38)
            r6 = 0
            android.view.View r4 = r4.inflate(r5, r6)
            com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsServiceCard r4 = (com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsServiceCard) r4
            android.content.res.Resources r5 = r3.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            android.content.res.Resources r6 = r3.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.heightPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            android.support.v4.app.am r7 = r0.f304284g
            com.google.android.apps.gsa.staticplugins.opa.gv r10 = new com.google.android.apps.gsa.staticplugins.opa.gv
            r10.<init>(r0)
            com.google.android.apps.gsa.staticplugins.opa.az.i r12 = r0.f304285h
            com.google.android.apps.gsa.staticplugins.opa.az.u r13 = r0.f304240M
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f304295r
            java.lang.Object r11 = r18.mo56111f()
            j$.util.Optional r11 = p3186j$.util.Optional.ofNullable(r11)
            java.lang.String r14 = "opaClientEventSender"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r14)
            java.lang.String r14 = "opaServiceEventReceiver"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r14)
            java.lang.String r14 = "emptyQuery"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r14)
            java.lang.String r14 = "query"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r14)
            com.google.android.apps.gsa.staticplugins.opa.chatui.gc r14 = new com.google.android.apps.gsa.staticplugins.opa.chatui.gc
            r14.<init>(r12, r9, r13)
            com.google.android.apps.gsa.staticplugins.opa.chatui.gb r15 = new com.google.android.apps.gsa.staticplugins.opa.chatui.gb
            r9 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            com.google.assistant.f.d.a.ah r9 = com.google.assistant.p3931f.p3940d.p3941a.C52858ah.f138677h
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.f.d.a.af r9 = (com.google.assistant.p3931f.p3940d.p3941a.C52856af) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.f.d.a.ah r10 = (com.google.assistant.p3931f.p3940d.p3941a.C52858ah) r10
            float r6 = (float) r6
            float r6 = r6 / r5
            int r6 = (int) r6
            float r6 = (float) r6
            r10.f138680b = r6
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            com.google.assistant.f.d.a.ah r6 = (com.google.assistant.p3931f.p3940d.p3941a.C52858ah) r6
            float r3 = (float) r3
            float r3 = r3 / r5
            int r3 = (int) r3
            float r3 = (float) r3
            r6.f138679a = r3
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.assistant.f.d.a.ah r3 = (com.google.assistant.p3931f.p3940d.p3941a.C52858ah) r3
            r3.f138685g = r8
            com.google.assistant.f.d.a.ag r3 = com.google.assistant.p3931f.p3940d.p3941a.C52857ag.MOBILE
            r9.copyOnWrite()
            com.google.protobuf.bv r5 = r9.instance
            com.google.assistant.f.d.a.ah r5 = (com.google.assistant.p3931f.p3940d.p3941a.C52858ah) r5
            int r3 = r3.getNumber()
            r5.f138684f = r3
            com.google.protobuf.bv r3 = r9.build()
            com.google.assistant.f.d.a.ah r3 = (com.google.assistant.p3931f.p3940d.p3941a.C52858ah) r3
            r2.mo105015d(r7, r1, r15, r3)
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.apps.gsa.staticplugins.opa.gw r1 = new com.google.android.apps.gsa.staticplugins.opa.gw
            r1.<init>(r2)
            r4.f300897b = r1
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r1 = new com.google.android.apps.gsa.staticplugins.opa.chatui.aj
            r2 = 11
            r1.<init>(r4, r2)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r2 = r0.f304280c
            long r3 = r0.f304301x
            m181892r(r1, r3)
            r2.mo95430s(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109258hw.m181877ao(com.google.assistant.e.j.dy, com.google.common.base.ax, com.google.android.apps.gsa.staticplugins.opa.hs):boolean");
    }

    /* renamed from: ap */
    private final boolean m181878ap(C51809dy dyVar, C58833ax axVar, C58833ax axVar2) {
        if (this.f304293p == null) {
            this.f304293p = this.f304243P;
        }
        C58833ax y = m181898y(dyVar);
        if (y.mo56113h() && ((C51953ff) y.mo56107c()).f136322f) {
            this.f304280c.mo95410au();
        }
        C108212aj v = m181895v(8);
        if (v == null) {
            v = new C108212aj(this.f304243P.mo19708b(this.f304284g, new C109209hp(this, axVar), this.f304299v), 8);
            if (y.mo56113h()) {
                v.f300980f = (C51953ff) y.mo56107c();
            }
            if (axVar2.mo56113h()) {
                m181838H(v, (C51387fv) axVar2.mo56107c());
            }
            C108230ba baVar = this.f304280c;
            m181892r(v, this.f304301x);
            baVar.mo95430s(v);
        }
        boolean d = this.f304243P.f36722a.mo19694d(dyVar);
        if (d) {
            C28295m.m52919e(v.f300976b, new C28292j(78263));
        }
        this.f304281d.mo98093y(this.f304293p, false);
        return d;
    }

    /* renamed from: aq */
    private final boolean m181879aq(aju aju, C58833ax axVar) {
        int i;
        int a;
        aju aju2 = aju;
        int i2 = aju2.f135240a;
        byte[] bArr = null;
        if ((i2 & 32) == 0 || ((a = ajr.m86309a(i)) != 0 && a == 2)) {
            if ((i2 & 8) != 0 && aju2.f135244e.mo59031d() > 0) {
                byte[] bArr2 = new byte[aju2.f135244e.mo59031d()];
                aju2.f135244e.mo59171K(bArr2, 0);
                bArr = bArr2;
            }
            String str = aju2.f135241b;
            String str2 = aju2.f135242c;
            int a2 = ajt.m86310a(aju2.f135243d);
            if (a2 == 0) {
                a2 = 1;
            }
            m181862aF(str, str2, a2, bArr, (Integer) null, aju2.f135245f, 2, axVar);
            return true;
        }
        int a3 = ajr.m86309a((i = aju2.f135246g));
        if (a3 == 0 || a3 != 3) {
            return false;
        }
        ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.APP_ACTIONS_SLICE_CLIENTOP_RECEIVED);
        String str3 = aju2.f135241b;
        String str4 = aju2.f135242c;
        OpaAppActionsSliceCard opaAppActionsSliceCard = (OpaAppActionsSliceCard) LayoutInflater.from(this.f304279b).inflate(true != ((C86124t) this.f304283f.mo27525b()).mo79746e(C90019by.f248080n) ? R.layout.opa_app_actions_slice_card : R.layout.opa_app_actions_slice_card_v2, (ViewGroup) null);
        C28295m.m52919e(opaAppActionsSliceCard, new C28292j(131794));
        this.f304249V.mo100721a(0, 0, C28285c.m52874a(opaAppActionsSliceCard, 131794));
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        int a4 = ajt.m86310a(aju2.f135243d);
        if (a4 == 0) {
            a4 = 1;
        }
        int i3 = a4 - 1;
        int i4 = i3 != 1 ? i3 != 2 ? 2 : 3 : 1;
        String str5 = aju2.f135241b;
        String str6 = aju2.f135242c;
        ajo ajo = aju2.f135247h;
        if (ajo == null) {
            ajo = ajo.f135231c;
        }
        String str7 = ajo.f135233a;
        ajo ajo2 = aju2.f135247h;
        if (ajo2 == null) {
            ajo2 = ajo.f135231c;
        }
        if (!opaAppActionsSliceCard.mo96555c(str5, str6, i4, str7, ajo2.f135234b, (C91189au) this.f304234G.mo27525b(), (C89859i) this.f304292o.mo27525b(), this.f304285h, this.f304247T, this.f304238K)) {
            return false;
        }
        C108212aj ajVar = new C108212aj(opaAppActionsSliceCard, 1);
        if (axVar.mo56113h()) {
            m181838H(ajVar, (C51387fv) axVar.mo56107c());
        }
        C108230ba baVar = this.f304280c;
        m181892r(ajVar, this.f304301x);
        baVar.mo95430s(ajVar);
        return true;
    }

    /* renamed from: ar */
    private final boolean m181880ar(C51986gl glVar) {
        List b = this.f304233F.mo96872b(glVar, e.A, Optional.empty());
        if (b.size() > 4) {
            return false;
        }
        if ((b.size() != 4 || ((C108430ik) b.get(3)).mo96877h().equals("Debug trace")) && !b.isEmpty() && (b.get(0) instanceof C108245bp)) {
            String action = ((C108245bp) b.get(0)).mo96600a().getAction();
            action.getClass();
            if (action.equals("com.google.android.googlequicksearchbox.GOOGLE_SEARCH")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: as */
    private static boolean m181881as(C52027hz hzVar) {
        for (C52026hy hyVar : hzVar.f136552a) {
            Iterator it = hyVar.f136549d.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = ((C52023hv) it.next()).f136542b;
                    Map map = C23542dp.f64323a;
                    if (((C23574eu) C23541do.m43942a(str).map(C109071gh.f303681a).orElse(null)) == C23574eu.CAMERA_STREAM) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: at */
    private final boolean m181882at() {
        return ((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247535iw);
    }

    /* renamed from: au */
    private final boolean m181883au() {
        return ((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249698u) || ((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249702y) || ((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249699v) || ((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249701x) || ((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249700w);
    }

    /* renamed from: av */
    private final boolean m181884av() {
        return ((Boolean) this.f304265al.mo56106b(C109194ha.f304038a).mo56109e(false)).booleanValue();
    }

    /* renamed from: aw */
    private final boolean m181885aw() {
        return ((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247760nI) && ((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247507iU);
    }

    /* renamed from: ax */
    private final boolean m181886ax() {
        return ((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247760nI);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x038a, code lost:
        if (r15.f136393b == false) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0ca7, code lost:
        r7 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0b02  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0b84  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0b89  */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0b9a  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0bca  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0d7b  */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x0bc8 A[SYNTHETIC] */
    /* renamed from: ay */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m181887ay(com.google.common.base.C58833ax r12, com.google.assistant.p3897e.p3921j.C51809dy r13, java.lang.String r14, com.google.common.base.C58833ax r15) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            r12.mo56109e(r0)
            java.lang.String r0 = r13.f135936b
            com.google.android.apps.gsa.staticplugins.opa.hs r0 = new com.google.android.apps.gsa.staticplugins.opa.hs
            r0.<init>(r11, r12)
            com.google.common.base.ax r12 = r11.m181899z(r13, r0)
            boolean r1 = r12.mo56113h()
            if (r1 == 0) goto L_0x0021
            java.lang.Object r12 = r12.mo56107c()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L_0x0021:
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247609kQ
            boolean r12 = r12.mo79746e(r1)
            java.lang.String r1 = "ui.SHOW_SEARCH_RESULTS_PAGE"
            java.lang.String r2 = "ui.SHOW_SUGGESTIONS"
            r7 = 0
            if (r12 == 0) goto L_0x0049
            java.lang.String r12 = r13.f135936b
            boolean r3 = r12.equals(r2)
            if (r3 != 0) goto L_0x0049
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L_0x0049
            r11.f304271ar = r7
            r11.m181835E(r7)
        L_0x0049:
            boolean r12 = r15.mo56113h()
            if (r12 == 0) goto L_0x0059
            java.lang.Object r12 = r15.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r12 = (com.google.android.apps.gsa.shared.search.Query) r12
            long r3 = r12.f252780s
            r11.f304301x = r3
        L_0x0059:
            java.lang.String r12 = r13.f135936b
            int r3 = r12.hashCode()
            r8 = 1
            switch(r3) {
                case -2090664851: goto L_0x0309;
                case -1983733737: goto L_0x02fe;
                case -1982909385: goto L_0x02f3;
                case -1829486805: goto L_0x02e8;
                case -1829053269: goto L_0x02dd;
                case -1711183381: goto L_0x02d2;
                case -1680457312: goto L_0x02c7;
                case -1666457551: goto L_0x02bc;
                case -1631422273: goto L_0x02b1;
                case -1607484871: goto L_0x02a5;
                case -1573932694: goto L_0x029a;
                case -1571202848: goto L_0x028e;
                case -1390781712: goto L_0x0282;
                case -1387688166: goto L_0x0276;
                case -1366849264: goto L_0x026b;
                case -1315392939: goto L_0x0260;
                case -1235890734: goto L_0x0254;
                case -1230413041: goto L_0x0248;
                case -1134127286: goto L_0x023c;
                case -1106977946: goto L_0x0230;
                case -1080777987: goto L_0x0224;
                case -1066437403: goto L_0x0218;
                case -957196185: goto L_0x020e;
                case -873857998: goto L_0x0202;
                case -836954165: goto L_0x01f6;
                case -731500976: goto L_0x01ea;
                case -646761166: goto L_0x01de;
                case -613178929: goto L_0x01d2;
                case -467172371: goto L_0x01c6;
                case -52089303: goto L_0x01bb;
                case -8315748: goto L_0x01b0;
                case 7962159: goto L_0x01a4;
                case 104082492: goto L_0x0198;
                case 144171367: goto L_0x018c;
                case 210787780: goto L_0x0180;
                case 211520846: goto L_0x0174;
                case 408574706: goto L_0x0168;
                case 485415337: goto L_0x015d;
                case 521198619: goto L_0x0151;
                case 554144810: goto L_0x0145;
                case 650298066: goto L_0x0139;
                case 696482992: goto L_0x012d;
                case 717469746: goto L_0x0121;
                case 913812185: goto L_0x0115;
                case 1032917605: goto L_0x0109;
                case 1182117200: goto L_0x00fe;
                case 1200158887: goto L_0x00f4;
                case 1357093482: goto L_0x00e8;
                case 1371019597: goto L_0x00dc;
                case 1374680071: goto L_0x00d0;
                case 1422427802: goto L_0x00c5;
                case 1473666112: goto L_0x00b9;
                case 1557815432: goto L_0x00ad;
                case 1621484801: goto L_0x00a1;
                case 1819954200: goto L_0x0095;
                case 1887092524: goto L_0x0089;
                case 1927616706: goto L_0x007d;
                case 1967298590: goto L_0x0071;
                case 2109005555: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0314
        L_0x0065:
            java.lang.String r1 = "ui.SHOW_TOGGLE_CARD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 31
            goto L_0x0315
        L_0x0071:
            java.lang.String r1 = "transactions.ADD_INSTRUMENT"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 25
            goto L_0x0315
        L_0x007d:
            java.lang.String r1 = "media.SOUND_SEARCH"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 34
            goto L_0x0315
        L_0x0089:
            java.lang.String r1 = "ui.SHOW_CAST_DEVICE_CONTROL"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 39
            goto L_0x0315
        L_0x0095:
            java.lang.String r1 = "ui.SHOW_TIME_PICKER"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 44
            goto L_0x0315
        L_0x00a1:
            java.lang.String r1 = "url.HANDOFF"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 30
            goto L_0x0315
        L_0x00ad:
            java.lang.String r1 = "transactions.SETUP_PAYMENTS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 24
            goto L_0x0315
        L_0x00b9:
            java.lang.String r1 = "device.WAIT_FOR_AUTHENTICATION"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 36
            goto L_0x0315
        L_0x00c5:
            java.lang.String r1 = "core.DISMISS_ASSISTANT"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 0
            goto L_0x0315
        L_0x00d0:
            java.lang.String r1 = "notification.REPLY"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 47
            goto L_0x0315
        L_0x00dc:
            java.lang.String r1 = "ui.SHOW_CHAT_UI_HELP"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 38
            goto L_0x0315
        L_0x00e8:
            java.lang.String r1 = "device.SAVE_IMAGE_LOCALLY"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 42
            goto L_0x0315
        L_0x00f4:
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0314
            r12 = 9
            goto L_0x0315
        L_0x00fe:
            java.lang.String r1 = "provider.BIND_APP_ACTIONS_SERVICE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 4
            goto L_0x0315
        L_0x0109:
            java.lang.String r1 = "ui.EXIT_NATIVE_FORM"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 52
            goto L_0x0315
        L_0x0115:
            java.lang.String r1 = "ui.HIGHLIGHT_USER_QUERY"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 54
            goto L_0x0315
        L_0x0121:
            java.lang.String r1 = "ui.SHOW_INTERPRETER"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 48
            goto L_0x0315
        L_0x012d:
            java.lang.String r1 = "keyboard.UPDATE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 50
            goto L_0x0315
        L_0x0139:
            java.lang.String r1 = "ui.SHOW_SMART_DEVICE_CONTROL"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 40
            goto L_0x0315
        L_0x0145:
            java.lang.String r1 = "transactions.FIX_INSTRUMENT"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 28
            goto L_0x0315
        L_0x0151:
            java.lang.String r1 = "transactions.CVC_CHALLENGE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 27
            goto L_0x0315
        L_0x015d:
            java.lang.String r1 = "provider.UNBIND_APP_ACTIONS_SERVICE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 6
            goto L_0x0315
        L_0x0168:
            java.lang.String r1 = "third_party.UPDATE_INTENT"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 22
            goto L_0x0315
        L_0x0174:
            java.lang.String r1 = "ui.RESET_FOCUS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 35
            goto L_0x0315
        L_0x0180:
            java.lang.String r1 = "ui.SHOW_NATIVE_FORM"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 51
            goto L_0x0315
        L_0x018c:
            java.lang.String r1 = "ui.THIRD_PARTY_START_INDICATOR"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 20
            goto L_0x0315
        L_0x0198:
            java.lang.String r1 = "ui.SHOW_SHARE_UI"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 57
            goto L_0x0315
        L_0x01a4:
            java.lang.String r1 = "ui.SHOW_HTML_IMMERSIVE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 45
            goto L_0x0315
        L_0x01b0:
            java.lang.String r1 = "provider.UPDATE_APP_ACTIONS_SERVICE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 5
            goto L_0x0315
        L_0x01bb:
            java.lang.String r1 = "identity.START_ACCOUNT_LINKING"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 2
            goto L_0x0315
        L_0x01c6:
            java.lang.String r1 = "ui.KEEP_SCREEN_CONTENTS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 49
            goto L_0x0315
        L_0x01d2:
            java.lang.String r1 = "notification.SHOW_CARD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 46
            goto L_0x0315
        L_0x01de:
            java.lang.String r1 = "device.SPRINGBOARD_SETTING"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 33
            goto L_0x0315
        L_0x01ea:
            java.lang.String r1 = "lens.SET_VIEW_MODE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 41
            goto L_0x0315
        L_0x01f6:
            java.lang.String r1 = "photos.DISPLAY_PHOTOS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 11
            goto L_0x0315
        L_0x0202:
            java.lang.String r1 = "ui.SHOW_RENDERED_CARD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 10
            goto L_0x0315
        L_0x020e:
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 15
            goto L_0x0315
        L_0x0218:
            java.lang.String r1 = "ui.SHOW_SLICE_CARD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 16
            goto L_0x0315
        L_0x0224:
            java.lang.String r1 = "transactions.ADD_ADDRESS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 23
            goto L_0x0315
        L_0x0230:
            java.lang.String r1 = "ui.CURRENT_ACTION_INDICATOR"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 19
            goto L_0x0315
        L_0x023c:
            java.lang.String r1 = "feedback.RECORD_FEEDBACK"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 53
            goto L_0x0315
        L_0x0248:
            java.lang.String r1 = "ui.SHOW_HTML_AD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 58
            goto L_0x0315
        L_0x0254:
            java.lang.String r1 = "device.FETCH_CARRIER_INFO"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 56
            goto L_0x0315
        L_0x0260:
            java.lang.String r1 = "ui.SHOW_TEXT"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 7
            goto L_0x0315
        L_0x026b:
            java.lang.String r1 = "ui.DISMISS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 1
            goto L_0x0315
        L_0x0276:
            java.lang.String r1 = "ui.SHOW_STATUS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 8
            goto L_0x0315
        L_0x0282:
            java.lang.String r1 = "ui.UPDATE_UI"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 29
            goto L_0x0315
        L_0x028e:
            java.lang.String r1 = "ui.SHOW_DEVICE_SETTING_CARD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 14
            goto L_0x0315
        L_0x029a:
            java.lang.String r1 = "ui.SHOW_APP_WIDGET"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 3
            goto L_0x0315
        L_0x02a5:
            java.lang.String r1 = "ui.THIRD_PARTY_EXIT_INDICATOR"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 21
            goto L_0x0315
        L_0x02b1:
            java.lang.String r1 = "opa_android.OP"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 55
            goto L_0x0315
        L_0x02bc:
            java.lang.String r1 = "transactions.AUTHENTICATION"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 26
            goto L_0x0315
        L_0x02c7:
            java.lang.String r1 = "ui.SHOW_IMAGES"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 32
            goto L_0x0315
        L_0x02d2:
            java.lang.String r1 = "ui.SET_USER_QUERY"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 13
            goto L_0x0315
        L_0x02dd:
            java.lang.String r1 = "photos.DOWNLOAD_PHOTOS"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 12
            goto L_0x0315
        L_0x02e8:
            java.lang.String r1 = "hold.START_HOLD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 17
            goto L_0x0315
        L_0x02f3:
            java.lang.String r1 = "device.REQUEST_PERMISSION"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 37
            goto L_0x0315
        L_0x02fe:
            java.lang.String r1 = "ui.SHOW_DATE_PICKER"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 43
            goto L_0x0315
        L_0x0309:
            java.lang.String r1 = "hold.STOP_HOLD"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0314
            r12 = 18
            goto L_0x0315
        L_0x0314:
            r12 = -1
        L_0x0315:
            java.lang.String r1 = "com.google.android.apps.chromecast.app"
            r9 = 0
            r2 = 0
            switch(r12) {
                case 0: goto L_0x0cd4;
                case 1: goto L_0x0cbf;
                case 2: goto L_0x0caa;
                case 3: goto L_0x0c8c;
                case 4: goto L_0x0c86;
                case 5: goto L_0x0c86;
                case 6: goto L_0x0c86;
                case 7: goto L_0x0c3d;
                case 8: goto L_0x0c21;
                case 9: goto L_0x0bd3;
                case 10: goto L_0x0ac6;
                case 11: goto L_0x0a99;
                case 12: goto L_0x0a7c;
                case 13: goto L_0x0a4d;
                case 14: goto L_0x0a28;
                case 15: goto L_0x09b6;
                case 16: goto L_0x098c;
                case 17: goto L_0x0972;
                case 18: goto L_0x096b;
                case 19: goto L_0x0954;
                case 20: goto L_0x093b;
                case 21: goto L_0x0922;
                case 22: goto L_0x08e9;
                case 23: goto L_0x08d4;
                case 24: goto L_0x08cf;
                case 25: goto L_0x08ba;
                case 26: goto L_0x0886;
                case 27: goto L_0x0871;
                case 28: goto L_0x085c;
                case 29: goto L_0x0847;
                case 30: goto L_0x0832;
                case 31: goto L_0x0815;
                case 32: goto L_0x07ef;
                case 33: goto L_0x07a4;
                case 34: goto L_0x078c;
                case 35: goto L_0x0785;
                case 36: goto L_0x072a;
                case 37: goto L_0x06a8;
                case 38: goto L_0x0683;
                case 39: goto L_0x063d;
                case 40: goto L_0x05db;
                case 41: goto L_0x0d79;
                case 42: goto L_0x0d79;
                case 43: goto L_0x05c2;
                case 44: goto L_0x05a9;
                case 45: goto L_0x056c;
                case 46: goto L_0x0546;
                case 47: goto L_0x0520;
                case 48: goto L_0x04e9;
                case 49: goto L_0x04b9;
                case 50: goto L_0x04b4;
                case 51: goto L_0x04a2;
                case 52: goto L_0x0468;
                case 53: goto L_0x0418;
                case 54: goto L_0x0413;
                case 55: goto L_0x040e;
                case 56: goto L_0x0409;
                case 57: goto L_0x0360;
                case 58: goto L_0x0336;
                default: goto L_0x031d;
            }
        L_0x031d:
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            r14 = 22795(0x590b, float:3.1943E-41)
            com.google.common.f.x r12 = r12.mo56372aa(r14)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            java.lang.String r14 = "Unrecognized clientop name: %s"
            java.lang.String r15 = r13.f135936b
            r12.mo56389s(r14, r15)
            goto L_0x0d79
        L_0x0336:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x033c
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x033c:
            com.google.assistant.e.j.e.ba r14 = com.google.assistant.p3897e.p3921j.p3926e.C51840ba.f135994b
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "show_html_ad_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.ba r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51840ba) r12
            if (r12 != 0) goto L_0x035b
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r14 = "No valid showHtmlAdArgs for Client-Op: ui.SHOW_HTML_AD"
            r15 = 22810(0x591a, float:3.1964E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r15)).mo56386p(r14)
            goto L_0x0d79
        L_0x035b:
            r11.m181850T(r12)
            goto L_0x0ca7
        L_0x0360:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x0366
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0366:
            com.google.assistant.e.j.e.gb r14 = com.google.assistant.p3897e.p3921j.p3926e.C51976gb.f136395b
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "show_share_ui_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.gb r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51976gb) r12
            com.google.assistant.e.j.e.ga r14 = r12.mo53771a()
            java.lang.String r14 = r14.f136392a
            if (r12 == 0) goto L_0x03fa
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L_0x038d
            com.google.assistant.e.j.e.ga r15 = r12.f136397a
            if (r15 != 0) goto L_0x0388
            com.google.assistant.e.j.e.ga r15 = com.google.assistant.p3897e.p3921j.p3926e.C51975ga.f136390c
        L_0x0388:
            boolean r15 = r15.f136393b
            if (r15 != 0) goto L_0x038d
            goto L_0x03fa
        L_0x038d:
            dagger.a r15 = r11.f304248U
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.hk r15 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108403hk) r15
            r15.f301513c = r14
            com.google.assistant.e.j.e.ga r12 = r12.f136397a
            if (r12 != 0) goto L_0x039d
            com.google.assistant.e.j.e.ga r12 = com.google.assistant.p3897e.p3921j.p3926e.C51975ga.f136390c
        L_0x039d:
            boolean r12 = r12.f136393b
            if (r12 == 0) goto L_0x03a9
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r11.f304280c
            android.view.ViewGroup r12 = r12.mo95419h()
            r15.f301514d = r12
        L_0x03a9:
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90144w.f251879a
            boolean r12 = r12.mo79746e(r14)
            if (r12 == 0) goto L_0x03ca
            com.google.android.apps.gsa.staticplugins.opa.chatui.hm r12 = new com.google.android.apps.gsa.staticplugins.opa.chatui.hm
            r12.<init>(r15)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            long r1 = r11.f304301x
            m181892r(r12, r1)
            r14.mo95430s(r12)
            goto L_0x0ca7
        L_0x03ca:
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90144w.f251880b
            boolean r12 = r12.mo79746e(r14)
            if (r12 == 0) goto L_0x03eb
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r11.f304280c
            com.google.android.apps.gsa.staticplugins.opa.chatui.ho r14 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ho
            r14.<init>(r15)
            long r1 = r11.f304301x
            m181892r(r14, r1)
            r12.mo95430s(r14)
            goto L_0x0ca7
        L_0x03eb:
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r14 = "#sharing - No Sharing ux flag flipped: Ignoring ui.SHOW_SHARE_UI op."
            r15 = 22807(0x5917, float:3.196E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r15)).mo56386p(r14)
            goto L_0x0d79
        L_0x03fa:
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r14 = "#sharing - Invalid arguments for Client-Op: ui.SHOW_SHARE_UI."
            r15 = 22806(0x5916, float:3.1958E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r15)).mo56386p(r14)
            goto L_0x0d79
        L_0x0409:
            r11.m181839I(r0, r13)
            goto L_0x0d79
        L_0x040e:
            r11.m181841K(r13)
            goto L_0x0d79
        L_0x0413:
            r11.m181840J(r13)
            goto L_0x0d79
        L_0x0418:
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247275eA
            boolean r12 = r12.mo79746e(r14)
            if (r12 != 0) goto L_0x042a
            goto L_0x0d79
        L_0x042a:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x0430
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0430:
            com.google.assistant.e.j.hb r14 = com.google.assistant.p3897e.p3921j.C52150hb.f136843e
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "feedback_completion_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.hb r12 = (com.google.assistant.p3897e.p3921j.C52150hb) r12
            if (r12 != 0) goto L_0x044f
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r14 = "No valid feedbackArgs for Client-Op: feedback.RECORD_FEEDBACK."
            r15 = 22805(0x5915, float:3.1957E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r15)).mo56386p(r14)
            goto L_0x0d79
        L_0x044f:
            com.google.android.apps.gsa.staticplugins.opa.ay.as r14 = r11.f304286i
            r14.mo96151ac(r7)
            com.google.android.apps.gsa.staticplugins.opa.x.l r14 = r11.f304245R
            com.google.android.apps.gsa.staticplugins.opa.hl r15 = new com.google.android.apps.gsa.staticplugins.opa.hl
            r15.<init>(r11)
            r14.f317603k = r15
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r15 = r11.f304280c
            android.view.ViewGroup r15 = r15.mo95419h()
            r14.mo101386d(r12, r15)
            goto L_0x0d79
        L_0x0468:
            r11.f304269ap = r7
            r11.mo97714d()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            dagger.a r14 = r11.f304283f
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r14 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r14
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248510bl
            boolean r14 = r14.mo79746e(r15)
            if (r14 == 0) goto L_0x0d79
            dagger.a r14 = r11.f304300w
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.jw r14 = (com.google.android.apps.gsa.staticplugins.opa.C109332jw) r14
            com.google.common.util.concurrent.cx r14 = r14.mo97765a()
            com.google.android.libraries.gsa.k.g r15 = r11.f304238K
            com.google.android.apps.gsa.staticplugins.opa.go r1 = new com.google.android.apps.gsa.staticplugins.opa.go
            r1.<init>(r11, r12)
            java.lang.String r12 = "Getting multi-step try saying chip"
            com.google.android.apps.gsa.shared.util.c.ag r12 = com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148464a(r1, r14, r15, r12)
            com.google.android.apps.gsa.staticplugins.opa.gq r14 = com.google.android.apps.gsa.staticplugins.opa.C109080gq.f303694a
            r12.mo85223a(r14)
            goto L_0x0d79
        L_0x04a2:
            r11.f304269ap = r8
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x04aa
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x04aa:
            com.google.common.base.ax r12 = r11.m181897x(r12)
            boolean r7 = r11.m181878ap(r13, r15, r12)
            goto L_0x0d79
        L_0x04b4:
            r11.m181837G(r13)
            goto L_0x0d79
        L_0x04b9:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x04bf
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x04bf:
            com.google.assistant.e.j.e.ac r14 = com.google.assistant.p3897e.p3921j.p3926e.C51815ac.f135941f
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "keep_screen_contents_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.ac r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51815ac) r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            r14.mo95384Z(r8)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            boolean r15 = r12.f135945c
            r14.mo95390aa(r15)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            boolean r15 = r12.f135946d
            r14.mo95383Y(r15)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            boolean r12 = r12.f135947e
            r14.mo95382X(r12)
            goto L_0x0ca7
        L_0x04e9:
            boolean r12 = r11.m181886ax()
            if (r12 == 0) goto L_0x051a
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.f r14 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251526kV
            long r14 = r12.mo79743a(r14)
            int r12 = (int) r14
            if (r12 <= 0) goto L_0x050b
            dagger.a r14 = r11.f304274au
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.shared.ah.g r14 = (com.google.android.apps.gsa.shared.p6983ah.C89150g) r14
            r14.mo83141o(r8)
        L_0x050b:
            com.google.android.libraries.gsa.k.g r14 = r11.f304238K
            com.google.android.apps.gsa.staticplugins.opa.gn r15 = new com.google.android.apps.gsa.staticplugins.opa.gn
            r15.<init>(r11, r13)
            java.lang.String r1 = "start interpreter"
            long r2 = (long) r12
            r14.mo28213m(r1, r2, r15)
            goto L_0x0d79
        L_0x051a:
            com.google.android.libraries.gsa.conversation.clientop.d r12 = new com.google.android.libraries.gsa.conversation.clientop.d
            r12.<init>(r13)
            throw r12
        L_0x0520:
            boolean r12 = r11.m181885aw()
            if (r12 == 0) goto L_0x0540
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x052c
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x052c:
            com.google.assistant.e.j.afb r14 = com.google.assistant.p3897e.p3921j.afb.f134984e
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "notification_reply_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.afb r12 = (com.google.assistant.p3897e.p3921j.afb) r12
            boolean r7 = r11.m181859aC(r12)
            goto L_0x0d79
        L_0x0540:
            com.google.android.libraries.gsa.conversation.clientop.d r12 = new com.google.android.libraries.gsa.conversation.clientop.d
            r12.<init>(r13)
            throw r12
        L_0x0546:
            boolean r12 = r11.m181885aw()
            if (r12 == 0) goto L_0x0566
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x0552
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0552:
            com.google.assistant.e.j.afd r14 = com.google.assistant.p3897e.p3921j.afd.f134990d
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "notification_show_card_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.afd r12 = (com.google.assistant.p3897e.p3921j.afd) r12
            boolean r7 = r11.m181860aD(r12)
            goto L_0x0d79
        L_0x0566:
            com.google.android.libraries.gsa.conversation.clientop.d r12 = new com.google.android.libraries.gsa.conversation.clientop.d
            r12.<init>(r13)
            throw r12
        L_0x056c:
            r11.f304270aq = r8
            r11.f304297t = r7
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247260dm
            boolean r12 = r12.mo79746e(r15)
            if (r12 == 0) goto L_0x05a3
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x0586
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0586:
            com.google.assistant.e.j.e.cs r15 = com.google.assistant.p3897e.p3921j.p3926e.C51885cs.f136078y
            com.google.protobuf.eb r15 = r15.getParserForType()
            java.lang.String r1 = "show_html_immersive_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r1, r15)
            com.google.assistant.e.j.e.cs r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51885cs) r12
            com.google.android.apps.gsa.staticplugins.opa.util.w r15 = r11.f304281d
            com.google.common.util.concurrent.cx r14 = r15.mo98069a(r12, r14)
            boolean r12 = r12.f136091j
            if (r12 == 0) goto L_0x0d79
            r0.mo97709b(r14)
            goto L_0x0d79
        L_0x05a3:
            com.google.android.libraries.gsa.conversation.clientop.d r12 = new com.google.android.libraries.gsa.conversation.clientop.d
            r12.<init>(r13)
            throw r12
        L_0x05a9:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x05af
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x05af:
            com.google.assistant.e.j.e.hd r14 = com.google.assistant.p3897e.p3921j.p3926e.C52005hd.f136486b
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "time_picker_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.hd r12 = (com.google.assistant.p3897e.p3921j.p3926e.C52005hd) r12
            r11.m181865ac(r12)
            goto L_0x0d79
        L_0x05c2:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x05c8
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x05c8:
            com.google.assistant.e.j.e.am r14 = com.google.assistant.p3897e.p3921j.p3926e.C51825am.f135965b
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "date_picker_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.am r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51825am) r12
            r11.m181848R(r12)
            goto L_0x0d79
        L_0x05db:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x05e1
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x05e1:
            java.lang.String r14 = "show_smart_device_control_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.p3926e.C52027hz.m86470a()
            com.google.protobuf.MessageLite r2 = m181889b(r12, r14, r15)     // Catch:{ a -> 0x05ec }
            goto L_0x05ed
        L_0x05ec:
        L_0x05ed:
            com.google.assistant.e.j.e.hz r2 = (com.google.assistant.p3897e.p3921j.p3926e.C52027hz) r2
            if (r2 == 0) goto L_0x0619
            java.lang.String r12 = r2.f136553b
            boolean r12 = r12.equals(r1)
            if (r12 != 0) goto L_0x060f
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90039cr.f248633b
            boolean r12 = r12.mo79746e(r14)
            if (r12 == 0) goto L_0x0619
            boolean r12 = m181881as(r2)
            if (r12 == 0) goto L_0x0619
        L_0x060f:
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            r0.mo97708a(r12)
            r11.m181854X(r2)
            goto L_0x0d79
        L_0x0619:
            com.google.common.base.ax r12 = r11.f304239L
            boolean r12 = r12.mo56113h()
            if (r12 == 0) goto L_0x0637
            com.google.common.base.ax r12 = r11.f304239L
            java.lang.Object r12 = r12.mo56107c()
            dagger.a r12 = (dagger.C68214a) r12
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ab.d.a r12 = (com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8178d.C105999a) r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            boolean r12 = r12.mo95202c(r13, r14)
            goto L_0x0a25
        L_0x0637:
            com.google.android.libraries.gsa.conversation.clientop.k r12 = new com.google.android.libraries.gsa.conversation.clientop.k
            r12.<init>()
            throw r12
        L_0x063d:
            com.google.assistant.e.j.dw r12 = r13.f135938d
            if (r12 != 0) goto L_0x0643
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0643:
            com.google.assistant.e.j.e.ak r14 = com.google.assistant.p3897e.p3921j.p3926e.C51823ak.f135960d
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "show_cast_device_control_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.ak r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51823ak) r12
            boolean r14 = r12.mo53738a()
            if (r14 == 0) goto L_0x067d
            com.google.assistant.e.c.c.gh r14 = r12.f135964c
            if (r14 != 0) goto L_0x065d
            com.google.assistant.e.c.c.gh r14 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x065d:
            com.google.assistant.e.c.c.ev r15 = r14.mo53517a()
            boolean r15 = r15.mo53513a()
            if (r15 == 0) goto L_0x0d79
            com.google.assistant.e.c.c.ev r14 = r14.mo53517a()
            java.lang.String r14 = r14.f132944b
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0d79
            com.google.assistant.e.j.ec r14 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            r0.mo97708a(r14)
            r11.m181847Q(r12)
            goto L_0x0d79
        L_0x067d:
            com.google.android.libraries.gsa.conversation.clientop.k r12 = new com.google.android.libraries.gsa.conversation.clientop.k
            r12.<init>()
            throw r12
        L_0x0683:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.assistant.e.j.oc r14 = com.google.assistant.p3897e.p3921j.C52340oc.f137370l
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "chat_ui_help_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.oc r12 = (com.google.assistant.p3897e.p3921j.C52340oc) r12
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            com.google.common.base.cr r15 = r11.f304287j
            java.lang.Object r15 = r15.mo6453a()
            java.lang.Long r15 = (java.lang.Long) r15
            long r1 = r15.longValue()
            r14.mo98083o(r1, r12)
            goto L_0x0d79
        L_0x06a8:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.assistant.e.j.rt r14 = com.google.assistant.p3897e.p3921j.C52438rt.f137645h
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "device_request_permission_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.rt r12 = (com.google.assistant.p3897e.p3921j.C52438rt) r12
            boolean r14 = r12.mo53871b()
            if (r14 == 0) goto L_0x06c5
            com.google.bj.c.a.b r14 = r12.mo53872c()
            goto L_0x06c6
        L_0x06c5:
            r14 = r2
        L_0x06c6:
            if (r14 == 0) goto L_0x0715
            dagger.a r15 = r11.f304251X
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ae.d r15 = (com.google.android.apps.gsa.staticplugins.opa.p8181ae.C106114d) r15
            r15.mo95285c()
            dagger.a r15 = r11.f304251X
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ae.d r15 = (com.google.android.apps.gsa.staticplugins.opa.p8181ae.C106114d) r15
            r15.mo95284b()
            dagger.a r15 = r11.f304251X
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ae.d r15 = (com.google.android.apps.gsa.staticplugins.opa.p8181ae.C106114d) r15
            r15.mo95283a(r14)
            com.google.android.apps.gsa.staticplugins.opa.ht r15 = new com.google.android.apps.gsa.staticplugins.opa.ht
            r15.<init>(r11)
            boolean r1 = r12.mo53874e()
            if (r1 == 0) goto L_0x06f7
            java.lang.String r1 = r12.f137653g
            goto L_0x06f8
        L_0x06f7:
            r1 = r2
        L_0x06f8:
            r15.f304219a = r1
            boolean r1 = r12.mo53873d()
            if (r1 == 0) goto L_0x0706
            com.google.protobuf.z r12 = r12.f137652f
            byte[] r2 = r12.mo59174N()
        L_0x0706:
            r15.f304220b = r2
            dagger.a r12 = r11.f304251X
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.ae.d r12 = (com.google.android.apps.gsa.staticplugins.opa.p8181ae.C106114d) r12
            r12.mo95286d(r15, r14)
            goto L_0x0d79
        L_0x0715:
            boolean r14 = r12.mo53870a()
            if (r14 == 0) goto L_0x0d79
            java.lang.String r12 = r12.f137648b
            java.lang.String r14 = "android.settings.ACTION_OPEN_SCREEN_CONTEXT_DIALOG"
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x0d79
            r11.m181853W()
            goto L_0x0d79
        L_0x072a:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "wait_for_authentication_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.C52141gt.m86520b()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.gt r12 = (com.google.assistant.p3897e.p3921j.C52141gt) r12
            boolean r14 = r12.mo53802a()
            if (r14 == 0) goto L_0x0751
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            int r15 = r12.mo53803c()
            com.google.protobuf.z r12 = r12.f136819b
            byte[] r12 = r12.mo59174N()
            r14.mo98068C(r15, r12, r2)
            goto L_0x0d79
        L_0x0751:
            dagger.a r14 = r11.f304283f
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r14 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r14
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248137A
            boolean r14 = r14.mo79746e(r15)
            if (r14 == 0) goto L_0x0772
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            int r12 = r12.mo53803c()
            com.google.android.apps.gsa.staticplugins.opa.gm r15 = new com.google.android.apps.gsa.staticplugins.opa.gm
            r15.<init>(r0)
            r14.mo98068C(r12, r2, r15)
            r8 = 0
            goto L_0x0d79
        L_0x0772:
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r13 = "No ClientInput in WaitForAuthenticationArgs"
            r14 = 22803(0x5913, float:3.1954E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56386p(r13)
            com.google.android.libraries.gsa.conversation.clientop.k r12 = new com.google.android.libraries.gsa.conversation.clientop.k
            r12.<init>()
            throw r12
        L_0x0785:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r11.f304280c
            r12.mo95377S()
            goto L_0x0d79
        L_0x078c:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r11.f304280c
            com.google.android.apps.gsa.staticplugins.opa.chatui.l r14 = new com.google.android.apps.gsa.staticplugins.opa.chatui.l
            com.google.android.apps.gsa.staticplugins.opa.audio.d r15 = r11.f304236I
            r14.<init>(r15)
            long r1 = r11.f304301x
            m181892r(r14, r1)
            r12.mo95430s(r14)
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r11.f304280c
            r12.mo95412aw()
            goto L_0x0ca7
        L_0x07a4:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "open_device_setting_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.C52119fy.m86511a()
            com.google.protobuf.MessageLite r12 = m181833C(r12, r14, r15)
            r3 = r12
            com.google.assistant.e.j.fy r3 = (com.google.assistant.p3897e.p3921j.C52119fy) r3
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "springboard_ok_text_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.m86466a()
            com.google.protobuf.MessageLite r12 = m181833C(r12, r14, r15)
            r4 = r12
            com.google.assistant.e.j.e.hb r4 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r4
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "springboard_unavailable_setting_text_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.m86466a()
            com.google.protobuf.MessageLite r12 = m181833C(r12, r14, r15)
            r5 = r12
            com.google.assistant.e.j.e.hb r5 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r5
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "springboard_invalid_intent_text_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.m86466a()
            com.google.protobuf.MessageLite r12 = m181833C(r12, r14, r15)
            r6 = r12
            com.google.assistant.e.j.e.hb r6 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r6
            r1 = r11
            r2 = r0
            r1.m181836F(r2, r3, r4, r5, r6)
            goto L_0x0d79
        L_0x07ef:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "show_images_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.p3926e.C51889cw.m86408a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.e.cw r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51889cw) r12
            com.google.assistant.e.j.dw r14 = r13.mo53737a()
            com.google.common.base.ax r14 = r11.m181897x(r14)
            boolean r12 = r11.m181888az(r12, r14)
            if (r12 == 0) goto L_0x080f
            goto L_0x0ca7
        L_0x080f:
            com.google.android.libraries.gsa.conversation.clientop.k r12 = new com.google.android.libraries.gsa.conversation.clientop.k
            r12.<init>()
            throw r12
        L_0x0815:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "show_toggle_card_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.p3926e.C52011hj.m86468a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.e.hj r12 = (com.google.assistant.p3897e.p3921j.p3926e.C52011hj) r12
            com.google.assistant.e.j.dw r14 = r13.mo53737a()
            com.google.common.base.ax r14 = r11.m181897x(r14)
            r11.m181866ad(r12, r14)
            goto L_0x0ca7
        L_0x0832:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "url_handoff_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.C51686apa.m86358a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.apa r12 = (com.google.assistant.p3897e.p3921j.C51686apa) r12
            r11.m181874al(r0, r12)
            goto L_0x0d79
        L_0x0847:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "update_ui_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.aow.m86356a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.aow r12 = (com.google.assistant.p3897e.p3921j.aow) r12
            r11.m181876an(r12)
            goto L_0x0ca7
        L_0x085c:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "transactions_fix_instrument_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.ans.m86351a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.ans r12 = (com.google.assistant.p3897e.p3921j.ans) r12
            r11.m181871ai(r0, r12)
            goto L_0x0d79
        L_0x0871:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "transactions_cvc_challenge_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.anq.m86350a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.anq r12 = (com.google.assistant.p3897e.p3921j.anq) r12
            r11.m181870ah(r0, r12)
            goto L_0x0d79
        L_0x0886:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "transactions_authentication_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.anl.m86348a()
            com.google.protobuf.MessageLite r12 = m181833C(r12, r14, r15)
            com.google.assistant.e.j.anl r12 = (com.google.assistant.p3897e.p3921j.anl) r12
            if (r12 == 0) goto L_0x089d
            r11.m181869ag(r0, r12)
            goto L_0x0d79
        L_0x089d:
            boolean r12 = r11.m181882at()
            if (r12 == 0) goto L_0x0d79
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "transactions_pin_authentication_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.aoq.m86355a()
            com.google.protobuf.MessageLite r12 = m181833C(r12, r14, r15)
            com.google.assistant.e.j.aoq r12 = (com.google.assistant.p3897e.p3921j.aoq) r12
            if (r12 == 0) goto L_0x0d79
            r11.m181872aj(r0, r12)
            goto L_0x0d79
        L_0x08ba:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "transactions_add_instrument_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.anh.m86346a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.anh r12 = (com.google.assistant.p3897e.p3921j.anh) r12
            r11.m181868af(r0, r12)
            goto L_0x0d79
        L_0x08cf:
            r11.m181873ak(r0)
            goto L_0x0d79
        L_0x08d4:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "transactions_add_address_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.anf.m86345a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.anf r12 = (com.google.assistant.p3897e.p3921j.anf) r12
            r11.m181867ae(r0, r12)
            goto L_0x0d79
        L_0x08e9:
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247260dm
            boolean r12 = r12.mo79746e(r14)
            if (r12 == 0) goto L_0x091c
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "third_party_update_intent_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3899b.p3901b.C50891r.m85975b()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.b.b.r r12 = (com.google.assistant.p3897e.p3899b.p3901b.C50891r) r12
            boolean r14 = r12.mo53487a()
            if (r14 == 0) goto L_0x0916
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            r14.mo98089u(r12)
            goto L_0x0d79
        L_0x0916:
            com.google.android.libraries.gsa.conversation.clientop.d r12 = new com.google.android.libraries.gsa.conversation.clientop.d
            r12.<init>(r13)
            throw r12
        L_0x091c:
            com.google.android.libraries.gsa.conversation.clientop.d r12 = new com.google.android.libraries.gsa.conversation.clientop.d
            r12.<init>(r13)
            throw r12
        L_0x0922:
            r11.f304268ao = r7
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.protobuf.eb r14 = com.google.assistant.p3897e.p3921j.p3926e.C52032id.m86471a()
            java.lang.String r15 = "third_party_exit_indicator_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.id r12 = (com.google.assistant.p3897e.p3921j.p3926e.C52032id) r12
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            r14.mo98086r(r12)
            goto L_0x0ca7
        L_0x093b:
            r11.f304268ao = r8
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.protobuf.eb r14 = com.google.assistant.p3897e.p3921j.p3926e.C52036ih.m86472a()
            java.lang.String r15 = "third_party_start_indicator_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.ih r12 = (com.google.assistant.p3897e.p3921j.p3926e.C52036ih) r12
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            r14.mo98088t(r12, r8)
            goto L_0x0ca7
        L_0x0954:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.protobuf.eb r14 = com.google.assistant.p3897e.p3921j.p3926e.C52042in.m86473a()
            java.lang.String r15 = "ui_current_action_indicator_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.in r12 = (com.google.assistant.p3897e.p3921j.p3926e.C52042in) r12
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            r14.mo98072d(r12)
            goto L_0x0ca7
        L_0x096b:
            com.google.android.apps.gsa.staticplugins.opa.util.w r12 = r11.f304281d
            r12.mo98085q()
            goto L_0x0d79
        L_0x0972:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.protobuf.eb r14 = com.google.assistant.p3897e.p3921j.akr.m86321a()
            java.lang.String r15 = "hold_control_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.akr r12 = (com.google.assistant.p3897e.p3921j.akr) r12
            com.google.android.apps.gsa.staticplugins.opa.util.w r14 = r11.f304281d
            int r12 = r12.f135288a
            long r1 = (long) r12
            r14.mo98066A(r1)
            goto L_0x0d79
        L_0x098c:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "show_slice_card_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.aju.m86311b()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.aju r12 = (com.google.assistant.p3897e.p3921j.aju) r12
            boolean r14 = r12.mo53688a()
            if (r14 == 0) goto L_0x09b0
            com.google.assistant.e.j.dw r14 = r13.mo53737a()
            com.google.common.base.ax r14 = r11.m181897x(r14)
            boolean r7 = r11.m181879aq(r12, r14)
            goto L_0x0d79
        L_0x09b0:
            com.google.android.libraries.gsa.conversation.clientop.k r12 = new com.google.android.libraries.gsa.conversation.clientop.k
            r12.<init>()
            throw r12
        L_0x09b6:
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247677lf
            boolean r12 = r12.mo79746e(r14)
            if (r12 == 0) goto L_0x0a07
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r12 = r12.mo79746e(r14)
            if (r12 == 0) goto L_0x0a07
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r11.f304280c
            boolean r12 = m181890n(r12)
            if (r12 == 0) goto L_0x0a05
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r12 = r11.f304280c
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r12 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r12
            com.google.common.base.ax r12 = r12.mo100833bf()
            java.lang.Object r12 = r12.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r12 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r12
            com.google.assistant.e.j.dw r14 = r13.mo53737a()
            java.lang.String r15 = "opa_webview_query_args"
            com.google.protobuf.eb r1 = com.google.android.apps.gsa.assistant.shared.l.g.a()
            com.google.protobuf.MessageLite r14 = m181889b(r14, r15, r1)
            com.google.android.apps.gsa.assistant.shared.l.g r14 = (com.google.android.apps.gsa.assistant.shared.l.g) r14
            long r1 = r11.f304301x
            com.google.android.apps.gsa.assistant.shared.l.g r14 = m181894u(r14, r1)
            r12.mo100893cl(r14)
        L_0x0a05:
            r12 = 1
            goto L_0x0a08
        L_0x0a07:
            r12 = 0
        L_0x0a08:
            dagger.a r14 = r11.f304283f
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r14 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r14
            com.google.android.apps.gsa.shared.m.d r15 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247609kQ
            boolean r14 = r14.mo79746e(r15)
            if (r14 == 0) goto L_0x0a25
            r11.f304271ar = r8
            boolean r14 = r11.f304272as
            if (r14 != 0) goto L_0x0a22
            r11.m181835E(r8)
            goto L_0x0a25
        L_0x0a22:
            r11.m181835E(r7)
        L_0x0a25:
            r7 = r12
            goto L_0x0d79
        L_0x0a28:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "show_device_setting_card_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.C52131gj.m86514b()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.gj r12 = (com.google.assistant.p3897e.p3921j.C52131gj) r12
            boolean r14 = r12.mo53800a()
            if (r14 == 0) goto L_0x0a48
            java.lang.String r14 = r12.f136796f
            java.lang.String r15 = r12.f136793c
            boolean r14 = r11.m181857aA(r14, r15)
            if (r14 != 0) goto L_0x0ca7
        L_0x0a48:
            r11.m181849S(r12)
            goto L_0x0ca7
        L_0x0a4d:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.assistant.e.j.e.ag r14 = com.google.assistant.p3897e.p3921j.p3926e.C51819ag.f135952b
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "set_user_query_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.e.ag r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51819ag) r12
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            boolean r14 = m181890n(r14)
            if (r14 == 0) goto L_0x0ca7
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.g r14 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g) r14
            com.google.common.base.ax r14 = r14.mo100833bf()
            java.lang.Object r14 = r14.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r14 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r14
            java.lang.String r12 = r12.f135954a
            r14.mo100882cV(r12)
            goto L_0x0ca7
        L_0x0a7c:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.assistant.e.j.jm r14 = com.google.assistant.p3897e.p3921j.C52215jm.f137024b
            com.google.protobuf.eb r14 = r14.getParserForType()
            java.lang.String r15 = "download_photos_args"
            com.google.protobuf.MessageLite r12 = m181889b(r12, r15, r14)
            com.google.assistant.e.j.jm r12 = (com.google.assistant.p3897e.p3921j.C52215jm) r12
            com.google.android.apps.gsa.staticplugins.opa.ap.k r14 = r11.f304241N
            com.google.common.util.concurrent.cx r12 = r14.mo95802g(r12)
            r0.mo97709b(r12)
            goto L_0x0d79
        L_0x0a99:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "display_photos_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.C52213jk.m86542d()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.jk r12 = (com.google.assistant.p3897e.p3921j.C52213jk) r12
            boolean r14 = r12.mo53814a()
            if (r14 == 0) goto L_0x0ca7
            com.google.assistant.e.j.jq r14 = r12.mo53815b()
            com.google.protobuf.cq r14 = r14.f137032a
            com.google.assistant.e.j.jy r12 = r12.mo53816c()
            com.google.assistant.e.j.dw r15 = r13.mo53737a()
            com.google.common.base.ax r15 = r11.m181897x(r15)
            r11.m181851U(r14, r12, r15)
            goto L_0x0ca7
        L_0x0ac6:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.common.base.ax r12 = r11.m181897x(r12)
            r11.m181852V(r13, r15, r14, r7)     // Catch:{ a -> 0x0ae3, RuntimeException -> 0x0ad4 }
            r14 = 1
            r7 = 1
            goto L_0x0ae5
        L_0x0ad4:
            r2 = move-exception
            com.google.common.f.e r14 = f304227a
            com.google.common.f.x r14 = r14.mo56225c()
            java.lang.String r15 = "Failed to render card"
            r1 = 22801(0x5911, float:3.1951E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56382g(r2)).mo56372aa(r1)).mo56386p(r15)
            goto L_0x0ae4
        L_0x0ae3:
        L_0x0ae4:
            r14 = 0
        L_0x0ae5:
            if (r7 != 0) goto L_0x0afe
            com.google.assistant.e.j.dw r15 = r13.mo53737a()
            java.lang.String r1 = "show_rendered_card_text_args_fallback"
            com.google.protobuf.eb r3 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.m86466a()
            com.google.protobuf.MessageLite r15 = m181833C(r15, r1, r3)
            com.google.assistant.e.j.e.hb r15 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r15
            if (r15 == 0) goto L_0x0afe
            r11.mo97723m(r15, r12)
            r14 = 1
            r7 = 1
        L_0x0afe:
            java.lang.String r15 = "string"
            if (r7 != 0) goto L_0x0b72
            com.google.assistant.e.j.dw r1 = r13.mo53737a()
            com.google.protobuf.cq r1 = r1.f135932a
            java.util.Iterator r1 = r1.iterator()
        L_0x0b0c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0b72
            java.lang.Object r3 = r1.next()
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3
            java.lang.String r4 = "show_rendered_card_fallback"
            java.lang.String r5 = r3.f137065b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0b0c
            com.google.assistant.e.j.ka r4 = r3.mo53818a()
            java.lang.String r4 = r4.f137060b
            boolean r4 = r15.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0b0c
            java.lang.String r14 = new java.lang.String
            com.google.assistant.e.j.ka r1 = r3.mo53818a()
            com.google.protobuf.z r1 = r1.f137061c
            byte[] r1 = r1.mo59174N()
            r14.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L_0x0b71
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r1 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cf
            r1.<init>()
            r1.f301174d = r14
            com.google.common.base.cr r14 = r11.f304287j
            java.lang.Object r14 = r14.mo6453a()
            java.lang.Long r14 = (java.lang.Long) r14
            long r3 = r14.longValue()
            r1.f301038t = r3
            boolean r14 = r12.mo56113h()
            if (r14 == 0) goto L_0x0b67
            java.lang.Object r14 = r12.mo56107c()
            com.google.assistant.e.i.a.fv r14 = (com.google.assistant.p3897e.p3917i.p3918a.C51387fv) r14
            r11.m181838H(r1, r14)
        L_0x0b67:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r14 = r11.f304280c
            long r3 = r11.f304301x
            m181892r(r1, r3)
            r14.mo95430s(r1)
        L_0x0b71:
            r14 = 1
        L_0x0b72:
            com.google.assistant.e.j.dw r1 = r13.mo53737a()
            java.lang.String r3 = "show_key_value_list_card_args"
            com.google.protobuf.eb r4 = com.google.assistant.p3897e.p3921j.p3926e.C51918dy.m86412a()
            com.google.protobuf.MessageLite r1 = m181833C(r1, r3, r4)
            com.google.assistant.e.j.e.dy r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51918dy) r1
            if (r1 == 0) goto L_0x0b89
            r11.m181863aa(r1, r12)
            r7 = 1
            goto L_0x0b8a
        L_0x0b89:
            r7 = r14
        L_0x0b8a:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            com.google.protobuf.cq r12 = r12.f135932a
            java.util.Iterator r12 = r12.iterator()
        L_0x0b94:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0bc8
            java.lang.Object r14 = r12.next()
            com.google.assistant.e.j.kc r14 = (com.google.assistant.p3897e.p3921j.C52232kc) r14
            java.lang.String r1 = "show_rendered_card_type"
            java.lang.String r3 = r14.f137065b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0b94
            com.google.assistant.e.j.ka r1 = r14.mo53818a()
            java.lang.String r1 = r1.f137060b
            boolean r1 = r15.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0b94
            java.lang.String r12 = new java.lang.String
            com.google.assistant.e.j.ka r14 = r14.mo53818a()
            com.google.protobuf.z r14 = r14.f137061c
            byte[] r14 = r14.mo59174N()
            r12.<init>(r14)
            r11.m181842L(r12)
        L_0x0bc8:
            if (r7 != 0) goto L_0x0d79
            if (r2 == 0) goto L_0x0bcd
            throw r2
        L_0x0bcd:
            com.google.android.libraries.gsa.conversation.clientop.k r12 = new com.google.android.libraries.gsa.conversation.clientop.k
            r12.<init>()
            throw r12
        L_0x0bd3:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r1 = "show_suggestions_args"
            com.google.protobuf.eb r2 = com.google.assistant.p3897e.p3921j.p3926e.C51986gl.m86461b()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r1, r2)
            r2 = r12
            com.google.assistant.e.j.e.gl r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51986gl) r2
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_RECEIVED
            r11.m181843M(r2, r12)
            boolean r12 = r11.f304270aq
            if (r12 == 0) goto L_0x0c03
            boolean r12 = r11.f304297t
            if (r12 != 0) goto L_0x0c03
            boolean r12 = r11.m181880ar(r2)
            if (r12 != 0) goto L_0x0c03
            com.google.android.apps.gsa.shared.logger.b.ae r12 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.ESCAPE_HATCH_PERFORMER_DROPPED_DUE_TO_IMMERSIVE
            r11.m181843M(r2, r12)
            com.google.android.apps.gsa.staticplugins.opa.util.w r12 = r11.f304281d
            r12.mo98084p(r2)
            goto L_0x0d79
        L_0x0c03:
            com.google.android.apps.gsa.staticplugins.opa.gl r12 = com.google.android.apps.gsa.staticplugins.opa.C109075gl.f303686a
            com.google.common.base.ax r3 = r15.mo56106b(r12)
            boolean r12 = r15.mo56113h()
            if (r12 == 0) goto L_0x0c18
            java.lang.Object r12 = r15.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r12 = (com.google.android.apps.gsa.shared.search.Query) r12
            long r4 = r12.f252749G
            goto L_0x0c19
        L_0x0c18:
            r4 = r9
        L_0x0c19:
            r1 = r11
            r6 = r14
            boolean r12 = r1.m181858aB(r2, r3, r4, r6)
            goto L_0x0a25
        L_0x0c21:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "show_status_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.p3926e.C51978gd.m86459a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.e.gd r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51978gd) r12
            com.google.assistant.e.j.dw r14 = r13.mo53737a()
            com.google.common.base.ax r14 = r11.m181897x(r14)
            r11.m181856Z(r12, r14)
            goto L_0x0ca7
        L_0x0c3d:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r1 = "show_text_args"
            com.google.protobuf.eb r2 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.m86466a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r1, r2)
            com.google.assistant.e.j.e.hb r12 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r12
            boolean r1 = r11.f304263aj
            if (r1 == 0) goto L_0x0c7a
            dagger.a r1 = r11.f304283f
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248287bu
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0c7a
            boolean r1 = r12.f136483f
            if (r1 == 0) goto L_0x0c7a
            boolean r1 = r12.f136482e
            if (r1 == 0) goto L_0x0c70
            java.lang.String r12 = r12.f136479b
            android.text.Spanned r12 = android.text.Html.fromHtml(r12)
            goto L_0x0c72
        L_0x0c70:
            java.lang.String r12 = r12.f136479b
        L_0x0c72:
            java.lang.String r12 = r12.toString()
            r11.m181864ab(r12, r15, r14)
            goto L_0x0ca7
        L_0x0c7a:
            com.google.assistant.e.j.dw r14 = r13.mo53737a()
            com.google.common.base.ax r14 = r11.m181897x(r14)
            r11.mo97723m(r12, r14)
            goto L_0x0ca7
        L_0x0c86:
            boolean r7 = r11.m181877ao(r13, r15, r0)
            goto L_0x0d79
        L_0x0c8c:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "show_app_widget_args"
            com.google.protobuf.eb r1 = com.google.assistant.p3897e.p3921j.agj.m86308a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r1)
            com.google.assistant.e.j.agj r12 = (com.google.assistant.p3897e.p3921j.agj) r12
            com.google.common.util.concurrent.cx r12 = r11.m181832B(r12, r15)
            com.google.common.util.concurrent.cx r12 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108360fv.m180122a(r12)
            r0.mo97709b(r12)
        L_0x0ca7:
            r7 = 1
            goto L_0x0d79
        L_0x0caa:
            com.google.assistant.e.j.dw r12 = r13.mo53737a()
            java.lang.String r14 = "start_account_linking_args"
            com.google.protobuf.eb r15 = com.google.assistant.p3897e.p3921j.akp.m86320a()
            com.google.protobuf.MessageLite r12 = m181889b(r12, r14, r15)
            com.google.assistant.e.j.akp r12 = (com.google.assistant.p3897e.p3921j.akp) r12
            r11.m181855Y(r0, r12)
            goto L_0x0d79
        L_0x0cbf:
            boolean r12 = r15.mo56113h()
            if (r12 == 0) goto L_0x0cce
            java.lang.Object r12 = r15.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r12 = (com.google.android.apps.gsa.shared.search.Query) r12
            long r14 = r12.f252749G
            goto L_0x0ccf
        L_0x0cce:
            r14 = r9
        L_0x0ccf:
            r11.m181846P(r14, r13)
            goto L_0x0d79
        L_0x0cd4:
            dagger.a r12 = r11.f304283f
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r12 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r12
            com.google.assistant.e.j.dw r14 = r13.mo53737a()
            com.google.assistant.e.j.a.b r14 = m181896w(r14)
            boolean r1 = r14.f134578c
            if (r1 == 0) goto L_0x0d02
            android.support.v4.app.am r1 = r11.f304284g
            boolean r1 = r1 instanceof com.google.android.apps.gsa.staticplugins.opa.OpaActivity
            if (r1 == 0) goto L_0x0d02
            com.google.common.f.e r1 = f304227a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "DISMISS_ASSISTANT retaining conversation."
            r3 = 22798(0x590e, float:3.1947E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            android.support.v4.app.am r1 = r11.f304284g
            com.google.android.apps.gsa.staticplugins.opa.OpaActivity r1 = (com.google.android.apps.gsa.staticplugins.opa.OpaActivity) r1
            r1.mo95149B()
        L_0x0d02:
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90016bv.f247856c
            boolean r12 = r12.mo79746e(r1)
            if (r12 == 0) goto L_0x0d15
            java.util.concurrent.ConcurrentLinkedQueue r12 = r11.f304302y
            com.google.android.apps.gsa.staticplugins.opa.gk r1 = new com.google.android.apps.gsa.staticplugins.opa.gk
            r1.<init>(r0)
            r12.add(r1)
            goto L_0x0d27
        L_0x0d15:
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r1 = "DISMISS_ASSISTANT finished."
            r2 = 22796(0x590c, float:3.1944E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            r0.mo97708a(r12)
        L_0x0d27:
            dagger.a r12 = r11.f304292o
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r12 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r12
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ACTIVITY_DISMISS_CLIENT_OP
            r12.mo83702b(r1)
            boolean r12 = r14.f134577b
            if (r12 == 0) goto L_0x0d4b
            com.google.common.f.e r12 = f304227a
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r14 = "DISMISS_ASSISTANT finishAndRemoveTask."
            r1 = 22797(0x590d, float:3.1945E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r1)).mo56386p(r14)
            android.support.v4.app.am r12 = r11.f304284g
            r12.finishAndRemoveTask()
            goto L_0x0d50
        L_0x0d4b:
            android.support.v4.app.am r12 = r11.f304284g
            r12.finish()
        L_0x0d50:
            boolean r12 = r15.mo56113h()
            if (r12 == 0) goto L_0x0d6c
            dagger.a r12 = r11.f304253Z
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.v.x r12 = (com.google.android.apps.gsa.staticplugins.opa.p8595v.C113920x) r12
            java.lang.Object r14 = r15.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r14 = (com.google.android.apps.gsa.shared.search.Query) r14
            long r14 = r14.f252749G
            com.google.android.apps.gsa.staticplugins.opa.v.w r1 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.CLIENT_OP_CORE_DISMISS_ASSISTANT
            r12.mo100774c(r14, r1)
            goto L_0x0d79
        L_0x0d6c:
            dagger.a r12 = r11.f304253Z
            java.lang.Object r12 = r12.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.v.x r12 = (com.google.android.apps.gsa.staticplugins.opa.p8595v.C113920x) r12
            com.google.android.apps.gsa.staticplugins.opa.v.w r14 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.CLIENT_OP_CORE_DISMISS_ASSISTANT
            r12.mo100773b(r14)
        L_0x0d79:
            if (r7 == 0) goto L_0x0d7e
            r11.m181845O(r13)
        L_0x0d7e:
            boolean r12 = r0.f304217b
            if (r12 != 0) goto L_0x0d89
            if (r8 == 0) goto L_0x0d89
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            r0.mo97708a(r12)
        L_0x0d89:
            r11.f304301x = r9
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109258hw.m181887ay(com.google.common.base.ax, com.google.assistant.e.j.dy, java.lang.String, com.google.common.base.ax):boolean");
    }

    /* renamed from: az */
    private final boolean m181888az(C51889cw cwVar, C58833ax axVar) {
        int a = C51888cv.m86407a(cwVar.f136111b);
        boolean z = false;
        if (a != 0 && a == 5) {
            for (C52066y yVar : cwVar.f136110a) {
                C51012dc dcVar = yVar.f136643a;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                String str = dcVar.f132817c;
                if (!TextUtils.isEmpty(str)) {
                    C108307dx dxVar = new C108307dx(this.f304279b, (C86124t) this.f304283f.mo27525b(), this.f304237J.mo85410a(this.f304279b), str, this.f304238K);
                    dxVar.f301029k.mo85049c(0, 4);
                    if (axVar.mo56113h()) {
                        m181838H(dxVar, (C51387fv) axVar.mo56107c());
                    }
                    C108230ba baVar = this.f304280c;
                    m181892r(dxVar, this.f304301x);
                    baVar.mo95430s(dxVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public static MessageLite m181889b(C51807dw dwVar, String str, C63010eb ebVar) {
        for (C52232kc kcVar : dwVar.f135932a) {
            if (str.equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                return (MessageLite) ebVar.mo59011j(kaVar.f137061c, C62921ba.m95368a());
            }
        }
        throw new C22371a(str);
    }

    /* renamed from: n */
    public static boolean m181890n(C108230ba baVar) {
        return (baVar instanceof C113988g) && ((C113988g) baVar).mo100833bf().mo56113h();
    }

    /* renamed from: q */
    static Context m181891q(C104149a aVar, Context context) {
        if (aVar.mo93970a()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2132148956);
            if (!C44534d.m78715b()) {
                return contextThemeWrapper;
            }
            contextThemeWrapper.getTheme().applyStyle(2132148957, true);
            return contextThemeWrapper;
        } else if (!aVar.mo93971b()) {
            return new ContextThemeWrapper(context, 2132149688);
        } else {
            ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, 2132149689);
            if (!C44534d.m78715b()) {
                return contextThemeWrapper2;
            }
            contextThemeWrapper2.getTheme().applyStyle(2132149690, true);
            return contextThemeWrapper2;
        }
    }

    /* renamed from: r */
    public static void m181892r(C108232bc bcVar, long j) {
        if (bcVar != null && j != 0) {
            bcVar.f301025B = j;
        }
    }

    /* renamed from: t */
    private final Context m181893t() {
        return m181891q(this.f304303z, this.f304279b.createConfigurationContext(this.f304284g.getResources().getConfiguration()));
    }

    /* renamed from: u */
    private static g m181894u(g gVar, long j) {
        if (gVar == null || j == 0) {
            return gVar;
        }
        f builder = gVar.toBuilder();
        builder.copyOnWrite();
        g gVar2 = builder.instance;
        gVar2.a |= 4;
        gVar2.d = j;
        return builder.build();
    }

    /* renamed from: v */
    private final C108212aj m181895v(int i) {
        C108235bf j = this.f304280c.mo95421j();
        int a = j.mo95351a();
        while (true) {
            a--;
            if (a < 0) {
                return null;
            }
            C108232bc b = j.mo95352b(a);
            if (b instanceof C108212aj) {
                C108212aj ajVar = (C108212aj) b;
                if (ajVar.f300977c == i) {
                    return ajVar;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: w */
    private static C51644b m181896w(C51807dw dwVar) {
        try {
            return (C51644b) m181889b(dwVar, "dismiss_assistant_args", C51644b.f134574d.getParserForType());
        } catch (C22371a unused) {
            ((C59052c) ((C59052c) f304227a.mo56224b()).mo56372aa(22746)).mo56386p("DismissAssistantArgs not found.");
            return C51644b.f134574d;
        }
    }

    /* renamed from: x */
    private final C58833ax m181897x(C51807dw dwVar) {
        if (this.f304263aj && m181883au()) {
            for (C52232kc kcVar : dwVar.f135932a) {
                if ("show_drl_visual_treatment_args".equals(kcVar.f137065b)) {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return C58833ax.m90834k((C51387fv) C62942bv.parseFrom((C62942bv) C51387fv.f133828e, kaVar.f137061c));
                }
            }
        }
        if (this.f304263aj && ((C86124t) this.f304283f.mo27525b()).mo79746e(C90029ch.f248207U)) {
            for (C52232kc kcVar2 : dwVar.f135932a) {
                if ("show_drl_visual_treatment_args".equals(kcVar2.f137065b)) {
                    C52230ka kaVar2 = kcVar2.f137066c;
                    if (kaVar2 == null) {
                        kaVar2 = C52230ka.f137057d;
                    }
                    return C58833ax.m90834k((C51387fv) C62942bv.parseFrom((C62942bv) C51387fv.f133828e, kaVar2.f137061c));
                }
            }
        }
        if (!this.f304263aj || !((C86124t) this.f304283f.mo27525b()).mo79746e(C90029ch.f248204R) || !this.f304268ao) {
            return C58836b.f156633a;
        }
        C51384fs fsVar = (C51384fs) C51387fv.f133828e.createBuilder();
        fsVar.copyOnWrite();
        C51387fv fvVar = (C51387fv) fsVar.instance;
        fvVar.f133831b = 1;
        fvVar.f133830a |= 1;
        fsVar.copyOnWrite();
        C51387fv fvVar2 = (C51387fv) fsVar.instance;
        fvVar2.f133832c = 1;
        fvVar2.f133830a |= 2;
        fsVar.copyOnWrite();
        C51387fv fvVar3 = (C51387fv) fsVar.instance;
        fvVar3.f133833d = 1;
        fvVar3.f133830a |= 4;
        return C58833ax.m90834k((C51387fv) C62942bv.parseFrom((C62942bv) C51387fv.f133828e, ((C51387fv) fsVar.build()).toByteString()));
    }

    /* renamed from: y */
    private static C58833ax m181898y(C51809dy dyVar) {
        if (dyVar.f135936b.equals("ui.SHOW_NATIVE_FORM")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51953ff ffVar = (C51953ff) m181889b(dwVar, "show_native_form_args", C51953ff.f136315l.getParserForType());
            if (ffVar != null) {
                return C58833ax.m90834k(ffVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: a */
    public final C28521c mo34068a(String str) {
        C11300h hVar = this.f304293p;
        if (hVar == null) {
            return null;
        }
        return hVar.mo19709i(str);
    }

    /* renamed from: c */
    public final Optional mo97713c() {
        C108212aj v = m181895v(11);
        if (v == null) {
            return Optional.empty();
        }
        View view = v.f300976b;
        if (!(view instanceof OpaAppActionsServiceCard)) {
            return Optional.empty();
        }
        return Optional.m71637of((OpaAppActionsServiceCard) view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo97714d() {
        C51953ff ffVar;
        C11300h hVar = this.f304293p;
        if (hVar != null) {
            boolean z = hVar.mo19707K() == 1;
            if (hVar.mo19700D()) {
                hVar.mo19710q();
            }
            this.f304293p = null;
            this.f304281d.mo98093y((C11300h) null, z);
            this.f304280c.mo95384Z(false);
            this.f304280c.mo95382X(false);
            this.f304280c.mo95383Y(false);
            this.f304280c.mo95390aa(false);
            C108235bf j = this.f304280c.mo95421j();
            int a = j.mo95351a();
            while (true) {
                a--;
                if (a < 0) {
                    break;
                }
                C108232bc b = j.mo95352b(a);
                if (b instanceof C108212aj) {
                    C108212aj ajVar = (C108212aj) b;
                    if (ajVar.f300977c == 8 && (ffVar = ajVar.f300980f) != null && !ffVar.f136322f) {
                        this.f304280c.mo95372N(b);
                        break;
                    }
                }
            }
            C107496v vVar = (C107496v) C107462aa.f299031h.createBuilder();
            vVar.copyOnWrite();
            C107462aa aaVar = (C107462aa) vVar.instance;
            aaVar.f299038f = 1;
            aaVar.f299033a |= 8;
            mo97719i((C107462aa) vVar.build());
        }
    }

    /* renamed from: e */
    public final void mo97715e(C51965fr frVar, C54201r rVar, C87545a aVar, C108212aj ajVar, boolean z, C58833ax axVar) {
        if (aVar == null || aVar.mo25098kH() == null) {
            ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22763)).mo56386p("Failed to build rendered card.");
            throw new C22534k();
        }
        View kH = aVar.mo25098kH();
        kH.getClass();
        ajVar.f300976b = kH;
        ajVar.f300982h = this.f304242O;
        ajVar.mo96596c(rVar, aVar, (C51205t) null);
        ajVar.f301028j = frVar.f136373c;
        ajVar.f301038t = ((Long) this.f304287j.mo6453a()).longValue();
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247179cK)) {
            List d = this.f304232E.mo97634d(rVar);
            C60870cx b = aVar.mo25099b();
            if (b != null) {
                d.add(b);
            }
            C109257hv hvVar = new C109257hv(this.f304292o, d, ajVar.f301038t, this.f304294q);
            if (hvVar.f304223a.isEmpty()) {
                hvVar.mo97712a();
            } else {
                C60856cj.m92892a(hvVar.f304223a).mo57334a(new C109256hu(hvVar), C60826bg.f164896a);
            }
        } else {
            this.f304232E.mo97634d(rVar);
        }
        if (z) {
            if (axVar.mo56113h()) {
                m181838H(ajVar, (C51387fv) axVar.mo56107c());
            }
            C108230ba baVar = this.f304280c;
            m181892r(ajVar, this.f304301x);
            baVar.mo95430s(ajVar);
        }
        this.f304238K.mo28212l("onNewCardRendered", new C109195hb(this, aVar));
    }

    /* renamed from: f */
    public final void mo97716f(byte[] bArr) {
        if (bArr != null) {
            C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
            C63088z A = C63088z.m96139A(bArr);
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            oyVar.f238176a |= 1;
            oyVar.f238177b = A;
            C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
            jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
            this.f304285h.mo96219b(jVar.mo82013a());
        }
    }

    /* renamed from: g */
    public final void mo97717g(C52078ek ekVar) {
        C63088z byteString;
        if (ekVar.f136674b == 5 && (byteString = ((C51805du) ekVar.f136675c).toByteString()) != null) {
            C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            oyVar.f238176a |= 1;
            oyVar.f238177b = byteString;
            if ((ekVar.f136673a & 2) != 0) {
                String str = ekVar.f136676d;
                oxVar.copyOnWrite();
                C88094oy oyVar2 = (C88094oy) oxVar.instance;
                str.getClass();
                oyVar2.f238176a |= 4;
                oyVar2.f238179d = str;
            }
            if ((ekVar.f136673a & 4) != 0) {
                C52089ev evVar = ekVar.f136677e;
                if (evVar == null) {
                    evVar = C52089ev.f136706c;
                }
                C63088z byteString2 = evVar.toByteString();
                oxVar.copyOnWrite();
                C88094oy oyVar3 = (C88094oy) oxVar.instance;
                byteString2.getClass();
                oyVar3.f238176a |= 8;
                oyVar3.f238180e = byteString2;
            }
            C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
            jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
            this.f304285h.mo96219b(jVar.mo82013a());
        }
    }

    /* renamed from: h */
    public final void mo97718h(C107494t tVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_CLIENT_OP_RESULT;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107488n.f299083a, tVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f304238K.mo28212l("Send generic event", new C109201hh(this, jVar.mo82013a()));
    }

    /* renamed from: i */
    public final void mo97719i(C107462aa aaVar) {
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_FLUID_ACTIONS_CLIENT_EVENT;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107495u.f299096a, aaVar);
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        this.f304238K.mo28212l("sendFluidActionsClientEventData", new C109198he(this, jVar));
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [com.google.android.apps.gsa.staticplugins.opa.chatui.ka] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97720j(com.google.assistant.p3897e.p3921j.p3926e.C51965fr r19, com.google.common.base.C58833ax r20, java.lang.String r21, java.lang.Integer r22, com.google.common.base.C58833ax r23, boolean r24) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            com.google.protobuf.z r1 = r0.f136372b
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()
            com.google.at.h.b.a.r r3 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C63088z) r1, (com.google.protobuf.C62921ba) r2)
            com.google.at.h.b.a.r r1 = (com.google.p4017at.p4060h.p4068b.p4069a.C54201r) r1
            com.google.protobuf.bt r2 = com.google.p4017at.p4060h.p4068b.p4069a.C54192i.f142222b
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r1 = r1.mo58857o(r2)
            r9 = 211(0xd3, float:2.96E-43)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0185
            com.google.android.apps.gsa.staticplugins.opa.s.b.a r1 = new com.google.android.apps.gsa.staticplugins.opa.s.b.a
            r1.<init>()
            r4 = r21
            r1.f306452b = r4
            r4 = r22
            r1.f306453c = r4
            com.google.android.apps.gsa.staticplugins.opa.s.b.f r1 = r1.mo98278a()
            com.google.android.apps.gsa.shared.logger.b.f r4 = new com.google.android.apps.gsa.shared.logger.b.f
            r4.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_IMAGES_LOADED
            r4.f246201a = r5
            com.google.common.o.cb r5 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.aj r5 = (com.google.common.p4552o.C59582aj) r5
            com.google.common.base.cr r6 = r8.f304287j
            java.lang.Object r6 = r6.mo6453a()
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.String r6 = r6.toString()
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.common.o.cb r7 = (com.google.common.p4552o.C59687cb) r7
            r6.getClass()
            int r10 = r7.f160062a
            r10 = r10 | 4
            r7.f160062a = r10
            r7.f160127h = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.common.o.cb r5 = (com.google.common.p4552o.C59687cb) r5
            r4.f246203c = r5
            com.google.android.apps.gsa.shared.logger.b.g r4 = r4.mo83699a()
            com.google.android.libraries.search.rendering.xuikit.a.c.z r5 = r8.f304259af
            java.lang.Object r6 = r5.f105270a
            monitor-enter(r6)
            java.util.Set r7 = r5.f105271b     // Catch:{ all -> 0x0182 }
            r7.clear()     // Catch:{ all -> 0x0182 }
            java.util.Set r7 = r5.f105272c     // Catch:{ all -> 0x0182 }
            r7.clear()     // Catch:{ all -> 0x0182 }
            r5.f105274e = r3     // Catch:{ all -> 0x0182 }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r4)     // Catch:{ all -> 0x0182 }
            r5.f105273d = r3     // Catch:{ all -> 0x0182 }
            monitor-exit(r6)     // Catch:{ all -> 0x0182 }
            com.google.protobuf.z r3 = r0.f136372b
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()
            com.google.at.h.b.a.r r5 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r4)
            com.google.at.h.b.a.r r3 = (com.google.p4017at.p4060h.p4068b.p4069a.C54201r) r3
            com.google.protobuf.bt r4 = com.google.p4017at.p4060h.p4068b.p4069a.C54192i.f142222b
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r5 = r3.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            r5 = 2162701(0x21000d, float:3.03059E-39)
            if (r4 == 0) goto L_0x016a
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r4 = r8.f304280c
            com.google.android.apps.gsa.staticplugins.opa.chatui.bf r4 = r4.mo95421j()
            int r6 = r4.mo95351a()
        L_0x00bb:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00ca
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r7 = r4.mo95352b(r6)
            boolean r10 = r7 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka
            if (r10 == 0) goto L_0x00bb
            r2 = r7
            com.google.android.apps.gsa.staticplugins.opa.chatui.ka r2 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108474ka) r2
        L_0x00ca:
            com.google.protobuf.bt r4 = com.google.p4017at.p4060h.p4068b.p4069a.C54192i.f142222b
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r3.mo58887l(r4)
            com.google.protobuf.bf r6 = r3.f169962ag
            com.google.protobuf.bs r7 = r4.f169971d
            java.lang.Object r6 = r6.mo58854l(r7)
            if (r6 != 0) goto L_0x00e0
            java.lang.Object r4 = r4.f169969b
            goto L_0x00e4
        L_0x00e0:
            java.lang.Object r4 = r4.mo58889c(r6)
        L_0x00e4:
            com.google.bv.j.b.a.p r4 = (com.google.p4283bv.p4380j.p4385b.p4386a.C57784p) r4
            int r6 = r4.f154384a
            r6 = r6 & 1
            if (r6 == 0) goto L_0x0151
            com.google.android.apps.gsa.staticplugins.opa.chatui.ka r2 = new com.google.android.apps.gsa.staticplugins.opa.chatui.ka
            android.content.Context r11 = r8.f304279b
            com.google.android.libraries.elements.interfaces.ab r12 = r8.f304261ah
            dagger.a r13 = r8.f304267an
            com.google.android.libraries.gsa.k.g r14 = r8.f304238K
            r10 = r2
            r15 = r3
            r16 = r20
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            com.google.common.base.ax r4 = r8.f304246S
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.s.b.d r4 = (com.google.android.apps.gsa.staticplugins.opa.p8410s.p8412b.C109990d) r4
            com.google.android.apps.gsa.staticplugins.opa.s.b.c r3 = r4.mo98287a(r3)
            r2.f301719c = r3
            com.google.common.base.cr r3 = r8.f304287j
            java.lang.Object r3 = r3.mo6453a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r2.f301038t = r3
            java.lang.String r0 = r0.f136373c
            r2.f301028j = r0
            java.lang.String r0 = r1.mo98281c()
            r2.f301037s = r0
            r0 = r24
            r2.f301721e = r0
            boolean r0 = r23.mo56113h()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r23.mo56107c()
            com.google.assistant.e.i.a.fv r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51387fv) r0
            r8.m181838H(r2, r0)
        L_0x0138:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r8.f304280c
            long r3 = r8.f304301x
            m181892r(r2, r3)
            r0.mo95430s(r2)
            com.facebook.litho.LithoView r0 = r2.f301720d
            com.google.android.libraries.gsa.k.g r1 = r8.f304238K
            com.google.android.apps.gsa.staticplugins.opa.hc r2 = new com.google.android.apps.gsa.staticplugins.opa.hc
            r2.<init>(r8, r0)
            java.lang.String r0 = "add card view"
            r1.mo28212l(r0, r2)
            return
        L_0x0151:
            if (r2 == 0) goto L_0x015f
            com.google.android.libraries.search.rendering.xuikit.a.d r0 = r8.f304260ag
            com.google.bv.j.b.a.h r1 = r4.f154387d
            if (r1 != 0) goto L_0x015b
            com.google.bv.j.b.a.h r1 = com.google.p4283bv.p4380j.p4385b.p4386a.C57776h.f154365b
        L_0x015b:
            r0.mo42164a(r1)
            return
        L_0x015f:
            com.google.android.apps.gsa.shared.q.a r0 = new com.google.android.apps.gsa.shared.q.a
            com.google.android.libraries.gsa.conversation.clientop.k r1 = new com.google.android.libraries.gsa.conversation.clientop.k
            r1.<init>()
            r0.<init>(r1, r9, r5)
            throw r0
        L_0x016a:
            com.google.common.f.e r0 = f304227a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Elements extension not found."
            r2 = 22776(0x58f8, float:3.1916E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.apps.gsa.shared.q.a r0 = new com.google.android.apps.gsa.shared.q.a
            com.google.android.libraries.gsa.conversation.clientop.k r1 = new com.google.android.libraries.gsa.conversation.clientop.k
            r1.<init>()
            r0.<init>(r1, r9, r5)
            throw r0
        L_0x0182:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0182 }
            throw r0
        L_0x0185:
            com.google.protobuf.z r1 = r0.f136372b     // Catch:{ k -> 0x02d2 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ k -> 0x02d2 }
            com.google.at.h.b.a.r r5 = com.google.p4017at.p4060h.p4068b.p4069a.C54201r.f142243f     // Catch:{ k -> 0x02d2 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (com.google.protobuf.C63088z) r1, (com.google.protobuf.C62921ba) r4)     // Catch:{ k -> 0x02d2 }
            r4 = r1
            com.google.at.h.b.a.r r4 = (com.google.p4017at.p4060h.p4068b.p4069a.C54201r) r4     // Catch:{ k -> 0x02d2 }
            if (r4 == 0) goto L_0x0229
            int r1 = r4.f142245a     // Catch:{ k -> 0x02d2 }
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0229
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r8.f304280c     // Catch:{ k -> 0x02d2 }
            java.util.Set r1 = r1.mo95429r()     // Catch:{ k -> 0x02d2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ k -> 0x02d2 }
        L_0x01a6:
            boolean r5 = r1.hasNext()     // Catch:{ k -> 0x02d2 }
            if (r5 == 0) goto L_0x01c9
            java.lang.Object r5 = r1.next()     // Catch:{ k -> 0x02d2 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ k -> 0x02d2 }
            int r5 = r5.intValue()     // Catch:{ k -> 0x02d2 }
            com.google.common.f.e r6 = f304227a     // Catch:{ k -> 0x02d2 }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ k -> 0x02d2 }
            java.lang.String r7 = "increment cml card count for veid %d"
            r10 = 22775(0x58f7, float:3.1915E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r10)).mo56387q(r7, r5)     // Catch:{ k -> 0x02d2 }
            com.google.android.libraries.search.logging.d.kp r6 = r8.f304277ax     // Catch:{ k -> 0x02d2 }
            r6.mo41702q(r5)     // Catch:{ k -> 0x02d2 }
            goto L_0x01a6
        L_0x01c9:
            com.google.android.libraries.search.logging.d.kp r1 = r8.f304277ax     // Catch:{ k -> 0x02d2 }
            r1.mo41702q(r3)     // Catch:{ k -> 0x02d2 }
            dagger.a r1 = r8.f304283f     // Catch:{ k -> 0x02d2 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247227dF     // Catch:{ k -> 0x02d2 }
            boolean r1 = r1.mo79746e(r5)     // Catch:{ k -> 0x02d2 }
            if (r1 == 0) goto L_0x0229
            android.content.Context r0 = r8.f304279b     // Catch:{ k -> 0x02d2 }
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch:{ k -> 0x02d2 }
            r1 = 2131624594(0x7f0e0292, float:1.8876372E38)
            android.view.View r0 = r0.inflate(r1, r2)     // Catch:{ k -> 0x02d2 }
            android.content.Context r1 = r8.f304279b     // Catch:{ k -> 0x02d2 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ k -> 0x02d2 }
            r2 = 2132083460(0x7f150304, float:1.9807063E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ k -> 0x02d2 }
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder     // Catch:{ k -> 0x02d2 }
            r2.<init>(r1)     // Catch:{ k -> 0x02d2 }
            java.lang.String r4 = "go/cml-sunset"
            int r1 = r1.indexOf(r4)     // Catch:{ k -> 0x02d2 }
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan     // Catch:{ k -> 0x02d2 }
            r5 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r4.<init>(r5)     // Catch:{ k -> 0x02d2 }
            int r5 = r1 + 13
            r6 = 17
            r2.setSpan(r4, r1, r5, r6)     // Catch:{ k -> 0x02d2 }
            r1 = 2131428077(0x7f0b02ed, float:1.8477788E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ k -> 0x02d2 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ k -> 0x02d2 }
            r1.setText(r2)     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r1 = new com.google.android.apps.gsa.staticplugins.opa.chatui.aj     // Catch:{ k -> 0x02d2 }
            r1.<init>(r0, r3)     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r8.f304280c     // Catch:{ k -> 0x02d2 }
            r0.mo95430s(r1)     // Catch:{ k -> 0x02d2 }
            return
        L_0x0229:
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r5 = new com.google.android.apps.gsa.staticplugins.opa.chatui.aj     // Catch:{ k -> 0x02d2 }
            android.view.View r1 = new android.view.View     // Catch:{ k -> 0x02d2 }
            android.content.Context r6 = r8.f304279b     // Catch:{ k -> 0x02d2 }
            r1.<init>(r6)     // Catch:{ k -> 0x02d2 }
            r5.<init>(r1, r3)     // Catch:{ k -> 0x02d2 }
            dagger.a r1 = r8.f304283f     // Catch:{ k -> 0x02d2 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247443hJ     // Catch:{ k -> 0x02d2 }
            boolean r1 = r1.mo79746e(r3)     // Catch:{ k -> 0x02d2 }
            if (r1 == 0) goto L_0x02aa
            boolean r1 = r8.f304250W     // Catch:{ k -> 0x02d2 }
            if (r1 == 0) goto L_0x02aa
            boolean r1 = r23.mo56113h()     // Catch:{ k -> 0x02d2 }
            if (r1 == 0) goto L_0x0258
            java.lang.Object r1 = r23.mo56107c()     // Catch:{ k -> 0x02d2 }
            com.google.assistant.e.i.a.fv r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51387fv) r1     // Catch:{ k -> 0x02d2 }
            r8.m181838H(r5, r1)     // Catch:{ k -> 0x02d2 }
        L_0x0258:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r8.f304280c     // Catch:{ k -> 0x02d2 }
            long r6 = r8.f304301x     // Catch:{ k -> 0x02d2 }
            m181892r(r5, r6)     // Catch:{ k -> 0x02d2 }
            r1.mo95430s(r5)     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.staticplugins.opa.h r1 = r8.f304232E     // Catch:{ k -> 0x02d2 }
            if (r4 == 0) goto L_0x0287
            int r3 = r4.f142245a     // Catch:{ k -> 0x02d2 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0287
            com.google.android.apps.gsa.search.shared.f.b r2 = r1.f303914i     // Catch:{ k -> 0x02d2 }
            if (r2 == 0) goto L_0x0279
            com.google.android.apps.gsa.search.shared.f.a r1 = com.google.android.apps.gsa.staticplugins.opa.C109138h.m181659b(r2, r4)     // Catch:{ k -> 0x02d2 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ k -> 0x02d2 }
            goto L_0x0295
        L_0x0279:
            com.google.common.util.concurrent.cx r1 = r1.f303913h     // Catch:{ k -> 0x02d2 }
            com.google.android.apps.gsa.staticplugins.opa.f r2 = new com.google.android.apps.gsa.staticplugins.opa.f     // Catch:{ k -> 0x02d2 }
            r2.<init>(r4)     // Catch:{ k -> 0x02d2 }
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ k -> 0x02d2 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)     // Catch:{ k -> 0x02d2 }
            goto L_0x0295
        L_0x0287:
            com.google.android.apps.gsa.shared.logger.f r1 = r1.f303908c     // Catch:{ k -> 0x02d2 }
            r3 = 38437351(0x24a81e7, float:1.4877896E-37)
            r6 = 29
            com.google.android.apps.gsa.shared.logger.e r1 = r1.mo83755a(r2, r3, r6)     // Catch:{ k -> 0x02d2 }
            r1.mo83721a()     // Catch:{ k -> 0x02d2 }
        L_0x0295:
            r7 = r2
            if (r7 == 0) goto L_0x02a9
            com.google.android.apps.gsa.staticplugins.opa.hk r10 = new com.google.android.apps.gsa.staticplugins.opa.hk     // Catch:{ k -> 0x02d2 }
            r1 = r10
            r2 = r18
            r3 = r19
            r6 = r23
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ k -> 0x02d2 }
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ k -> 0x02d2 }
            com.google.common.util.concurrent.C60856cj.m92911t(r7, r10, r0)     // Catch:{ k -> 0x02d2 }
        L_0x02a9:
            return
        L_0x02aa:
            com.google.android.apps.gsa.staticplugins.opa.h r1 = r8.f304232E     // Catch:{ h -> 0x02be }
            com.google.android.apps.gsa.search.shared.f.a r6 = r1.mo97633a(r4)     // Catch:{ h -> 0x02be }
            r7 = 1
            r1 = r18
            r2 = r19
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r23
            r1.mo97715e(r2, r3, r4, r5, r6, r7)     // Catch:{ k -> 0x02d2 }
            return
        L_0x02be:
            r0 = move-exception
            com.google.common.f.e r1 = f304227a     // Catch:{ k -> 0x02d2 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ k -> 0x02d2 }
            java.lang.String r2 = "Invalid card data."
            r3 = 22774(0x58f6, float:3.1913E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ k -> 0x02d2 }
            com.google.android.libraries.gsa.conversation.clientop.k r0 = new com.google.android.libraries.gsa.conversation.clientop.k     // Catch:{ k -> 0x02d2 }
            r0.<init>()     // Catch:{ k -> 0x02d2 }
            throw r0     // Catch:{ k -> 0x02d2 }
        L_0x02d2:
            r0 = move-exception
            com.google.android.apps.gsa.shared.q.a r1 = new com.google.android.apps.gsa.shared.q.a
            r2 = 2162702(0x21000e, float:3.030591E-39)
            r1.<init>(r0, r9, r2)
            goto L_0x02dd
        L_0x02dc:
            throw r1
        L_0x02dd:
            goto L_0x02dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109258hw.mo97720j(com.google.assistant.e.j.e.fr, com.google.common.base.ax, java.lang.String, java.lang.Integer, com.google.common.base.ax, boolean):void");
    }

    /* renamed from: k */
    public final void mo97721k(List list) {
        C107144k kVar = this.f304241N;
        if (kVar.f298231j) {
            List list2 = (List) Collection.EL.stream(list).filter(C107139f.f298217a).collect(Collectors.toList());
            java.util.Collection h = kVar.mo95803h(list2);
            if (!h.isEmpty()) {
                list.addAll(0, h);
                list.removeAll(list2);
                list.addAll(0, list2);
            }
        }
        if (!list.isEmpty()) {
            if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90029ch.f248242ac)) {
                this.f304280c.mo95362D();
            }
            if (m181861aE() && !((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247210cp)) {
                this.f304280c.mo95432u(((C108250bu) this.f304252Y.mo27525b()).mo96700a(C108248bs.CHAT_HISTORY, new Object[0]));
            }
            this.f304280c.mo95408as(list);
            if (m181861aE() && ((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249687j) && ((C86124t) this.f304283f.mo27525b()).mo79746e(C90014bt.f247210cp)) {
                this.f304280c.mo95432u(((C108250bu) this.f304252Y.mo27525b()).mo96700a(C108248bs.CHAT_HISTORY_AT_LAST, new Object[0]));
            }
            ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_SUGGESTIONS_SHOWN);
        }
    }

    /* renamed from: l */
    public final void mo97722l(C51986gl glVar) {
        List b = this.f304233F.mo96872b(glVar, e.A, Optional.empty());
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90037cp.f248510bl)) {
            new C90873ag(((C109332jw) this.f304300w.mo27525b()).mo97765a(), this.f304238K, "Getting multi-step try saying chip", new C109072gi(this, b)).mo85223a(C109073gj.f303684a);
        } else {
            mo97721k(b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.je} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.apps.gsa.staticplugins.opa.chatui.cf} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97723m(com.google.assistant.p3897e.p3921j.p3926e.C52003hb r8, com.google.common.base.C58833ax r9) {
        /*
            r7 = this;
            int r0 = r8.f136480c
            int r0 = com.google.assistant.p3897e.p3921j.p3926e.C52002ha.m86465a(r0)
            r1 = 4
            if (r0 != 0) goto L_0x000a
            goto L_0x0034
        L_0x000a:
            if (r0 != r1) goto L_0x0034
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.je
            r0.<init>()
            java.lang.String r8 = r8.f136479b
            r0.f301663e = r8
            com.google.common.base.cr r8 = r7.f304287j
            java.lang.Object r8 = r8.mo6453a()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            r0.f301038t = r1
            boolean r8 = r9.mo56113h()
            if (r8 == 0) goto L_0x014f
            java.lang.Object r8 = r9.mo56107c()
            com.google.assistant.e.i.a.fv r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51387fv) r8
            r7.m181838H(r0, r8)
            goto L_0x014f
        L_0x0034:
            com.google.android.apps.gsa.staticplugins.opa.chatui.cf r0 = new com.google.android.apps.gsa.staticplugins.opa.chatui.cf
            r0.<init>()
            boolean r2 = r8.f136482e
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r8.f136479b
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            goto L_0x0046
        L_0x0044:
            java.lang.String r2 = r8.f136479b
        L_0x0046:
            int r3 = r8.f136480c
            int r3 = com.google.assistant.p3897e.p3921j.p3926e.C52002ha.m86465a(r3)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0051
            goto L_0x009c
        L_0x0051:
            r6 = 3
            if (r3 != r6) goto L_0x009c
            int r3 = r8.f136478a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x009c
            com.google.assistant.e.c.c.gh r1 = r8.f136481d
            if (r1 != 0) goto L_0x005f
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x005f:
            int r1 = r1.f133012b
            if (r1 != r6) goto L_0x009c
            com.google.assistant.e.c.c.gh r1 = r8.f136481d
            if (r1 != 0) goto L_0x0069
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0069:
            int r3 = r1.f133012b
            if (r3 != r6) goto L_0x0072
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.fl r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51075fl) r1
            goto L_0x0074
        L_0x0072:
            com.google.assistant.e.c.c.fl r1 = com.google.assistant.p3897e.p3902c.p3907c.C51075fl.f132982e
        L_0x0074:
            java.lang.String r1 = r1.f132985b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x009c
            com.google.assistant.e.c.c.gh r1 = r8.f136481d
            if (r1 != 0) goto L_0x0082
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0082:
            int r3 = r1.f133012b
            if (r3 != r6) goto L_0x008b
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.fl r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51075fl) r1
            goto L_0x008d
        L_0x008b:
            com.google.assistant.e.c.c.fl r1 = com.google.assistant.p3897e.p3902c.p3907c.C51075fl.f132982e
        L_0x008d:
            java.lang.String r1 = r1.f132985b
            dagger.a r3 = r7.f304234G
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.y.au r3 = (com.google.android.apps.gsa.shared.p7195y.C91189au) r3
            r0.f301045a = r1
            r0.f301046b = r3
            goto L_0x00aa
        L_0x009c:
            int r1 = r8.f136480c
            int r1 = com.google.assistant.p3897e.p3921j.p3926e.C52002ha.m86465a(r1)
            if (r1 != 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            if (r1 != r4) goto L_0x00aa
            r0.mo96611b(r5)
        L_0x00aa:
            r2.getClass()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.f301174d = r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r7.f304280c
            boolean r1 = m181890n(r1)
            if (r1 == 0) goto L_0x00c2
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r1 = r7.f304280c
            com.google.android.apps.gsa.staticplugins.opa.valyrian.c.h r1 = (com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h) r1
            boolean r1 = r1.mo100905db()
            goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            dagger.a r2 = r7.f304283f
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248285bs
            long r2 = r2.mo79743a(r3)
            int r2 = com.google.android.apps.gsa.staticplugins.opa.C109068ge.m181589a(r2)
            if (r2 <= 0) goto L_0x00e1
            boolean r8 = r8.f136483f
            if (r8 == 0) goto L_0x00de
            if (r1 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r4 = 0
        L_0x00df:
            r0.f301165F = r4
        L_0x00e1:
            com.google.common.base.cr r8 = r7.f304287j
            java.lang.Object r8 = r8.mo6453a()
            java.lang.Long r8 = (java.lang.Long) r8
            long r2 = r8.longValue()
            r0.f301038t = r2
            boolean r8 = r9.mo56113h()
            if (r8 == 0) goto L_0x00fe
            java.lang.Object r8 = r9.mo56107c()
            com.google.assistant.e.i.a.fv r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51387fv) r8
            r7.m181838H(r0, r8)
        L_0x00fe:
            dagger.a r8 = r7.f304283f
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r8 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r8
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248137A
            boolean r8 = r8.mo79746e(r9)
            if (r8 == 0) goto L_0x0147
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r8 = r7.f304280c
            boolean r8 = r8.mo95398ai()
            if (r8 == 0) goto L_0x0147
            if (r1 != 0) goto L_0x0147
            com.google.common.base.ax r8 = r7.f304264ak
            boolean r8 = r8.mo56113h()
            if (r8 == 0) goto L_0x0147
            com.google.common.base.ax r8 = r7.f304264ak
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.ah.l r8 = (com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l) r8
            com.google.android.apps.gsa.search.core.aj.aa r8 = r8.f296304b
            android.app.KeyguardManager r8 = r8.f230023b
            boolean r8 = r8.isDeviceLocked()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r8 != 0) goto L_0x0147
            com.google.android.apps.gsa.staticplugins.opa.chatui.je r8 = new com.google.android.apps.gsa.staticplugins.opa.chatui.je
            r8.<init>()
            java.lang.String r9 = ""
            r8.f301663e = r9
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r9 = r7.f304280c
            long r1 = r7.f304301x
            m181892r(r8, r1)
            r9.mo95430s(r8)
        L_0x0147:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r8 = r7.f304280c
            boolean r8 = r8.mo95403an(r0)
            if (r8 != 0) goto L_0x0159
        L_0x014f:
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r8 = r7.f304280c
            long r1 = r7.f304301x
            m181892r(r0, r1)
            r8.mo95430s(r0)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109258hw.mo97723m(com.google.assistant.e.j.e.hb, com.google.common.base.ax):void");
    }

    /* renamed from: o */
    public final boolean mo97724o(C58833ax axVar, C63088z zVar, String str, C58833ax axVar2) {
        ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_RENDER_START);
        if (((C86124t) this.f304283f.mo27525b()).mo79746e(C90029ch.f248217aD)) {
            try {
                C62921ba a = C62921ba.m95368a();
                C63088z zVar2 = zVar;
                C107224k kVar = (C107224k) this.f304278ay.mo27525b();
                C22871g gVar = kVar.f298423b;
                new C90873ag(gVar.mo28209i(gVar.mo28209i(kVar.f298422a.mo79697b(), "get account id", new C107223j(kVar)), "get tng renderers", new C107222i((C51809dy) C62942bv.parseFrom((C62942bv) C51809dy.f135933f, zVar, a))), this.f304238K, "get renderer", new C109081gr(this, axVar, zVar, str, axVar2)).mo85223a(new C109130gs(this, axVar, zVar, str, axVar2));
                return true;
            } catch (C62974ct | RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f304227a.mo56225c()).mo56382g(e)).mo56372aa(22811)).mo56386p("Failed to render client op");
                C58833ax axVar3 = axVar;
                new C109254hs(this, axVar).mo97710c(e);
                ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_RENDER_END);
                return false;
            }
        } else {
            C58833ax axVar4 = axVar;
            C63088z zVar3 = zVar;
            return mo97725p(axVar, zVar, str, axVar2);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo97725p(C58833ax axVar, C63088z zVar, String str, C58833ax axVar2) {
        try {
            boolean ay = m181887ay(axVar, (C51809dy) C62942bv.parseFrom((C62942bv) C51809dy.f135933f, zVar), str, axVar2);
            ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_RENDER_END);
            return ay;
        } catch (C22371a | C22428d | C22534k | C62974ct | RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f304227a.mo56225c()).mo56382g(e)).mo56372aa(22793)).mo56386p("Failed to render client op");
            new C109254hs(this, axVar).mo97710c(e);
            ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_RENDER_END);
            return false;
        } catch (Throwable th) {
            ((C89859i) this.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_RENDER_END);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo97726s(C51965fr frVar, C58833ax axVar, Integer num) {
        mo97720j(frVar, axVar, (String) null, num, C58836b.f156633a, false);
    }

    /* renamed from: F */
    private final void m181836F(C109254hs hsVar, C52119fy fyVar, C52003hb hbVar, C52003hb hbVar2, C52003hb hbVar3) {
        String str;
        int a;
        if (fyVar != null) {
            int i = fyVar.f136771a;
            if ((i & 1) != 0) {
                Intent intent = null;
                if ((i & 2) == 0 || (a = C52118fx.m86510a(fyVar.f136773c)) == 0 || a != 3) {
                    str = this.f304254aa.mo83088a(fyVar.f136772b, (String) null).mo83086g();
                } else {
                    str = fyVar.f136772b;
                }
                if (TextUtils.isEmpty(str)) {
                    if (hbVar2 != null) {
                        mo97723m(hbVar2, C58836b.f156633a);
                    }
                    hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
                    return;
                }
                try {
                    intent = Intent.parseUri(str, 0);
                } catch (Exception unused) {
                }
                if (intent == null) {
                    if (hbVar3 != null) {
                        mo97723m(hbVar3, C58836b.f156633a);
                    }
                    hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
                    return;
                }
                if (hbVar != null) {
                    mo97723m(hbVar, C58836b.f156633a);
                }
                hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
                this.f304282e.mo65090b(intent, C109197hd.f304043a);
                return;
            }
        }
        throw new C22534k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: an */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m181876an(com.google.assistant.p3897e.p3921j.aow r7) {
        /*
            r6 = this;
            int r0 = r7.f135531a
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00af
            int r0 = r7.f135532b
            r2 = 2
            if (r0 != r2) goto L_0x00af
            com.google.android.apps.gsa.staticplugins.opa.chatui.ba r0 = r6.f304280c
            java.lang.String r3 = r7.f135534d
            com.google.android.apps.gsa.staticplugins.opa.chatui.bc r0 = r0.mo95409at()
            boolean r3 = r0 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0057
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj) r0
            android.view.View r0 = r0.f300976b
            boolean r3 = r0 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.OpaToggleCard
            if (r3 == 0) goto L_0x0057
            com.google.android.apps.gsa.staticplugins.opa.chatui.OpaToggleCard r0 = (com.google.android.apps.gsa.staticplugins.opa.chatui.OpaToggleCard) r0
            int r3 = r7.f135532b
            if (r3 != r2) goto L_0x002c
            java.lang.Object r7 = r7.f135533c
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4
        L_0x002c:
            java.lang.String r7 = "ON"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x003a
            android.widget.Switch r7 = r0.f300936e
            r7.setChecked(r1)
            return
        L_0x003a:
            java.lang.String r7 = "OFF"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x0049
            android.widget.Switch r7 = r0.f300936e
            r0 = 0
            r7.setChecked(r0)
            return
        L_0x0049:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.chatui.OpaToggleCard.f300932a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r0 = "Cannot perform specified change type."
            r1 = 24022(0x5dd6, float:3.3662E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0057:
            com.google.android.apps.gsa.staticplugins.opa.h r0 = r6.f304232E
            java.lang.String r3 = r7.f135534d
            int r5 = r7.f135532b
            if (r5 != r2) goto L_0x0064
            java.lang.Object r7 = r7.f135533c
            r4 = r7
            java.lang.String r4 = (java.lang.String) r4
        L_0x0064:
            java.lang.Class<com.google.android.libraries.componentview.services.application.bs> r7 = com.google.android.libraries.componentview.services.application.C20592bs.class
            com.google.common.base.ax r7 = com.google.common.base.C58811ab.m90798a(r7, r4)
            boolean r2 = r7.mo56113h()
            if (r2 == 0) goto L_0x00a1
            com.google.android.apps.gsa.search.shared.f.b r2 = r0.f303914i
            if (r2 == 0) goto L_0x00a1
            com.google.android.libraries.componentview.services.application.bt r2 = com.google.android.libraries.componentview.services.application.C20593bt.f57796c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.componentview.services.application.bq r2 = (com.google.android.libraries.componentview.services.application.C20590bq) r2
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.libraries.componentview.services.application.bs r7 = (com.google.android.libraries.componentview.services.application.C20592bs) r7
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.libraries.componentview.services.application.bt r4 = (com.google.android.libraries.componentview.services.application.C20593bt) r4
            int r7 = r7.f57795f
            r4.f57799b = r7
            int r7 = r4.f57798a
            r7 = r7 | r1
            r4.f57798a = r7
            com.google.protobuf.bv r7 = r2.build()
            com.google.android.libraries.componentview.services.application.bt r7 = (com.google.android.libraries.componentview.services.application.C20593bt) r7
            com.google.android.apps.gsa.search.shared.f.b r0 = r0.f303914i
            r0.getClass()
            r0.mo77521c(r3, r7)
            return
        L_0x00a1:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.C109138h.f303906a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r0 = "Failed to update rendered card"
            r1 = 22556(0x581c, float:3.1608E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x00af:
            com.google.common.f.e r7 = f304227a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r0 = "Update UI args not complete."
            r1 = 22787(0x5903, float:3.1931E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            com.google.android.libraries.gsa.conversation.clientop.k r7 = new com.google.android.libraries.gsa.conversation.clientop.k
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109258hw.m181876an(com.google.assistant.e.j.aow):void");
    }

    /* renamed from: af */
    private final void m181868af(C109254hs hsVar, anh anh) {
        if ((anh.f135431a & 1) != 0) {
            Intent intent = new Intent();
            intent.putExtra("uri", new Uri.Builder().scheme("assistant-transactions").authority("add-instrument").build().toString());
            byte[] N = anh.f135432b.mo59174N();
            intent.putExtra("add_token", C59326i.f157517e.mo56837l(N, N.length));
            Intent a = C9443a.m23961a(intent, 2, 2);
            hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
            m181875am(a);
            return;
        }
        ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22780)).mo56386p("No valid clientOp arguments to start transactions add instrument.");
        throw new C22534k();
    }

    /* renamed from: ah */
    private final void m181870ah(C109254hs hsVar, anq anq) {
        if ((anq.f135453a & 1) != 0) {
            Intent intent = new Intent();
            intent.putExtra("uri", new Uri.Builder().scheme("assistant-transactions").authority("cvc-challenge").build().toString());
            byte[] N = anq.f135454b.mo59174N();
            intent.putExtra("challenge_token", C59326i.f157517e.mo56837l(N, N.length));
            Intent a = C9443a.m23961a(intent, 2, 2);
            hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
            m181875am(a);
            return;
        }
        ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22782)).mo56386p("No valid clientOp arguments to start transactions cvc challenge.");
        throw new C22534k();
    }

    /* renamed from: ai */
    private final void m181871ai(C109254hs hsVar, ans ans) {
        if ((ans.f135457a & 1) != 0) {
            Intent intent = new Intent();
            intent.putExtra("uri", new Uri.Builder().scheme("assistant-transactions").authority("fix-instrument").build().toString());
            byte[] N = ans.f135458b.mo59174N();
            intent.putExtra("edit_token", C59326i.f157517e.mo56837l(N, N.length));
            Intent a = C9443a.m23961a(intent, 2, 2);
            hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
            m181875am(a);
            return;
        }
        ((C59052c) ((C59052c) f304227a.mo56225c()).mo56372aa(22783)).mo56386p("No valid clientOp arguments to start transactions fix instrument.");
        throw new C22534k();
    }

    /* renamed from: z */
    private final C58833ax m181899z(C51809dy dyVar, C109254hs hsVar) {
        C11300h hVar = this.f304293p;
        if (hVar != null && hVar.mo19700D() && hVar.mo19701E(dyVar.f135936b) && (((C86124t) this.f304283f.mo27525b()).mo79746e(C90066dr.f249668K) || !(this.f304293p instanceof C11292a) || m181895v(8) != null)) {
            C11300h hVar2 = this.f304293p;
            if (hVar2 != null && hVar2.mo19700D() && hVar2.mo19702F(dyVar.f135936b) && this.f304293p != null) {
                C108212aj v = m181895v(8);
                if (this.f304293p instanceof C11292a) {
                    if (v == null) {
                        return C58836b.f156633a;
                    }
                    this.f304280c.mo95431t(v);
                    C58833ax y = m181898y(dyVar);
                    if (y.mo56113h()) {
                        if (((C51953ff) y.mo56107c()).f136322f) {
                            this.f304280c.mo95410au();
                        }
                        v.f300980f = (C51953ff) y.mo56107c();
                    }
                }
                C11300h hVar3 = this.f304293p;
                if (hVar3 != null) {
                    Boolean valueOf = Boolean.valueOf(hVar3.mo19703G(dyVar));
                    this.f304281d.mo98093y(this.f304293p, false);
                    hsVar.mo97709b(C60856cj.m92900i(C22402a.f61894b));
                    return C58833ax.m90834k(valueOf);
                }
            }
            return C58836b.f156633a;
        }
        mo97714d();
        return C58836b.f156633a;
    }
}

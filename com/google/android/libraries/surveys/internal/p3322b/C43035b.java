package com.google.android.libraries.surveys.internal.p3322b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.surveys.C43026c;
import com.google.android.libraries.surveys.C43027d;
import com.google.android.libraries.surveys.C43028e;
import com.google.android.libraries.surveys.C43029f;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43058g;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.view.C43132cg;
import com.google.p4281bu.p4282a.C56499aj;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64460au;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64469bc;
import com.google.protos.p4959be.p4960a.p4961a.p4962a.C64474bh;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68351a;

/* renamed from: com.google.android.libraries.surveys.internal.b.b */
/* compiled from: PG */
public final class C43035b {

    /* renamed from: a */
    public static final C43035b f112558a = new C43035b();

    /* renamed from: b */
    public static final AtomicBoolean f112559b = new AtomicBoolean(false);

    /* renamed from: c */
    public C43028e f112560c;

    /* renamed from: d */
    public SurveyDataImpl f112561d;

    /* renamed from: e */
    public String f112562e;

    /* renamed from: f */
    public List f112563f;

    /* renamed from: g */
    public long f112564g;

    /* renamed from: h */
    public final C21370a f112565h = new C21375e();

    /* renamed from: i */
    public String f112566i;

    /* renamed from: j */
    public long f112567j;

    /* renamed from: k */
    public final String f112568k = "com.google.android.libraries.surveys.internal.view.SurveyActivity";

    static {
        Arrays.asList(new String[]{"com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.apps.tv.launcherx", "com.google.android.tvrecommendations"});
    }

    private C43035b() {
        C43132cg.f112811a = new C43034a(this);
        this.f112564g = 0;
        this.f112567j = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static void m75938a() {
        AtomicBoolean atomicBoolean = f112559b;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }

    /* renamed from: d */
    public static Integer m75939d(C56532bp bpVar) {
        C43029f fVar = C43029f.FIRST_CARD_MODAL;
        C43027d dVar = C43027d.CARD;
        C56499aj ajVar = bpVar.f150967c;
        if (ajVar == null) {
            ajVar = C56499aj.f150905e;
        }
        int i = ajVar.f150908b;
        int i2 = 1;
        int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 != 0) {
            i2 = i3;
        }
        int i4 = i2 - 2;
        if (i4 == 2) {
            return Integer.valueOf(R.drawable.google_g_logo);
        }
        if (i4 != 3) {
            return null;
        }
        return Integer.valueOf(R.drawable.google_g_logo);
    }

    /* renamed from: b */
    public final void mo46057b(C64469bc bcVar, C43060i iVar, Context context) {
        String str;
        if (TextUtils.isEmpty(this.f112562e)) {
            str = null;
        } else {
            str = this.f112562e;
        }
        String str2 = str;
        if (C43054c.m75960c(C68351a.m98703c(C43054c.f112610b))) {
            C43058g a = C43058g.m75965a();
            C64460au auVar = (C64460au) C64474bh.f174880c.createBuilder();
            auVar.copyOnWrite();
            C64474bh bhVar = (C64474bh) auVar.instance;
            bcVar.getClass();
            bhVar.f174883b = bcVar;
            bhVar.f174882a = 4;
            a.mo46078c((C64474bh) auVar.build(), C43060i.m75976b(iVar.f112619a), iVar.mo46080a(), context, str2);
        }
    }

    /* renamed from: c */
    public final void mo46058c(C43026c cVar) {
        C43028e eVar = this.f112560c;
        if (eVar != null) {
            this.f112561d.mo46048a();
            eVar.mo33743l(cVar);
        }
    }
}

package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9684e;

import android.app.KeyguardManager;
import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.e.j */
/* compiled from: PG */
public final class C128204j implements C128197c {

    /* renamed from: a */
    public final Context f352675a;

    /* renamed from: b */
    private C58495hd f352676b;

    /* renamed from: c */
    private final KeyguardManager f352677c;

    public C128204j(Context context) {
        this.f352675a = context;
        this.f352677c = (KeyguardManager) Objects.requireNonNull((KeyguardManager) context.getSystemService(KeyguardManager.class));
    }

    /* renamed from: a */
    public final C60870cx mo95282a(C123733b bVar) {
        Stream stream;
        C123733b bVar2 = bVar;
        if (this.f352676b == null) {
            synchronized (this) {
                if (this.f352676b == null) {
                    C58490gz gzVar = new C58490gz(4);
                    C128202h f = C128203i.m209289f();
                    ((C128195a) f).f352661a = "nga-hs-1";
                    f.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_1);
                    C128203i a = f.mo108356a();
                    C128202h f2 = C128203i.m209289f();
                    ((C128195a) f2).f352661a = "nga-hs-11";
                    f2.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_12);
                    ((C128195a) f2).f352662b = Optional.m71637of("com.google.android.gm");
                    f2.mo108358c(false);
                    C128203i a2 = f2.mo108356a();
                    C128202h f3 = C128203i.m209289f();
                    ((C128195a) f3).f352661a = "nga-hs-2";
                    f3.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_2);
                    C128203i a3 = f3.mo108356a();
                    C128202h f4 = C128203i.m209289f();
                    ((C128195a) f4).f352661a = "nga-hs-8";
                    f4.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_4);
                    ((C128195a) f4).f352662b = Optional.m71637of("com.google.android.GoogleCamera");
                    C128203i a4 = f4.mo108356a();
                    C128202h f5 = C128203i.m209289f();
                    ((C128195a) f5).f352661a = "nga-hs-12";
                    f5.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_13);
                    f5.mo108358c(false);
                    C128203i a5 = f5.mo108356a();
                    C128202h f6 = C128203i.m209289f();
                    ((C128195a) f6).f352661a = "nga-hs-4";
                    f6.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_5);
                    C128203i a6 = f6.mo108356a();
                    C128202h f7 = C128203i.m209289f();
                    ((C128195a) f7).f352661a = "nga-hs-5";
                    f7.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_6);
                    f7.mo108358c(false);
                    C128203i a7 = f7.mo108356a();
                    C128202h f8 = C128203i.m209289f();
                    ((C128195a) f8).f352661a = "nga-hs-13";
                    f8.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_14);
                    ((C128195a) f8).f352662b = Optional.m71637of("com.android.vending");
                    f8.mo108358c(false);
                    C128203i a8 = f8.mo108356a();
                    C128202h f9 = C128203i.m209289f();
                    ((C128195a) f9).f352661a = "nga-hs-7";
                    f9.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_8);
                    f9.mo108358c(false);
                    C128203i a9 = f9.mo108356a();
                    C128202h f10 = C128203i.m209289f();
                    ((C128195a) f10).f352661a = "nga-hs-14";
                    f10.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_15);
                    ((C128195a) f10).f352662b = Optional.m71637of("com.google.android.apps.messaging");
                    f10.mo108358c(false);
                    C128203i a10 = f10.mo108356a();
                    C128202h f11 = C128203i.m209289f();
                    ((C128195a) f11).f352661a = "nga-hs-10";
                    f11.mo108357b(R.string.assistant_preloaded_fre_homescreen_suggestion_11);
                    f11.mo108358c(false);
                    gzVar.mo55429h(BuildConfig.FLAVOR, C58485gu.m89833C(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, f11.mo108356a()));
                    C128202h f12 = C128203i.m209289f();
                    ((C128195a) f12).f352661a = "nga-ia-1";
                    f12.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_1);
                    ((C128195a) f12).f352662b = Optional.m71637of("com.android.chrome");
                    gzVar.mo55429h("com.android.chrome", C58485gu.m89846n(f12.mo108356a()));
                    C128202h f13 = C128203i.m209289f();
                    ((C128195a) f13).f352661a = "nga-ia-2";
                    f13.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_2);
                    ((C128195a) f13).f352662b = Optional.m71637of("com.google.android.dialer");
                    gzVar.mo55429h("com.google.android.dialer", C58485gu.m89846n(f13.mo108356a()));
                    C128202h f14 = C128203i.m209289f();
                    ((C128195a) f14).f352661a = "nga-ia-3";
                    f14.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_3);
                    ((C128195a) f14).f352662b = Optional.m71637of("com.google.android.GoogleCamera");
                    gzVar.mo55429h("com.google.android.GoogleCamera", C58485gu.m89846n(f14.mo108356a()));
                    C128202h f15 = C128203i.m209289f();
                    ((C128195a) f15).f352661a = "nga-ia-4";
                    f15.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_4);
                    ((C128195a) f15).f352662b = Optional.m71637of("com.google.android.apps.photos");
                    gzVar.mo55429h("com.google.android.apps.photos", C58485gu.m89846n(f15.mo108356a()));
                    C128202h f16 = C128203i.m209289f();
                    ((C128195a) f16).f352661a = "nga-ia-6";
                    f16.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_6);
                    ((C128195a) f16).f352662b = Optional.m71637of("com.google.android.youtube");
                    gzVar.mo55429h("com.google.android.youtube", C58485gu.m89846n(f16.mo108356a()));
                    C128202h f17 = C128203i.m209289f();
                    ((C128195a) f17).f352661a = "nga-ia-7";
                    f17.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_7);
                    ((C128195a) f17).f352662b = Optional.m71637of("com.google.android.apps.messaging");
                    gzVar.mo55429h("com.google.android.apps.messaging", C58485gu.m89846n(f17.mo108356a()));
                    C128202h f18 = C128203i.m209289f();
                    ((C128195a) f18).f352661a = "nga-ia-8";
                    f18.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_8);
                    ((C128195a) f18).f352662b = Optional.m71637of("com.android.vending");
                    gzVar.mo55429h("com.android.vending", C58485gu.m89846n(f18.mo108356a()));
                    C128202h f19 = C128203i.m209289f();
                    ((C128195a) f19).f352661a = "nga-ia-9";
                    f19.mo108357b(R.string.assistant_preloaded_fre_inapp_suggestion_9);
                    ((C128195a) f19).f352662b = Optional.m71637of("com.google.android.gm");
                    gzVar.mo55429h("com.google.android.gm", C58485gu.m89846n(f19.mo108356a()));
                    this.f352676b = gzVar.mo55427f(false);
                    bVar2 = bVar;
                }
            }
        }
        Stream stream2 = Collection.EL.stream(bVar2.f341781c);
        C123791t tVar = bVar2.f341780b;
        if (tVar == null) {
            tVar = C123791t.f341978d;
        }
        boolean isKeyguardLocked = this.f352677c.isKeyguardLocked();
        C128198d dVar = new C128198d((C58528ij) Stream.CC.concat(stream2, Stream.CC.m71935of(tVar.f341981b)).collect(C58370cn.f155947b), isKeyguardLocked);
        if ((bVar2.f341779a & 1) == 0 || isKeyguardLocked) {
            stream = Stream.CC.empty();
        } else {
            C58495hd hdVar = this.f352676b;
            hdVar.getClass();
            C123791t tVar2 = bVar2.f341780b;
            if (tVar2 == null) {
                tVar2 = C123791t.f341978d;
            }
            stream = Collection.EL.stream((C58485gu) hdVar.getOrDefault(tVar2.f341981b, C58485gu.m89845m()));
        }
        Stream map = stream.filter(dVar).map(new C128199e(this));
        C58495hd hdVar2 = this.f352676b;
        hdVar2.getClass();
        return C60856cj.m92900i((C58485gu) Stream.CC.concat(map, Collection.EL.stream((C58485gu) hdVar2.getOrDefault(BuildConfig.FLAVOR, C58485gu.m89845m())).filter(dVar).map(new C128200f(this))).collect(C58370cn.f155946a));
    }
}

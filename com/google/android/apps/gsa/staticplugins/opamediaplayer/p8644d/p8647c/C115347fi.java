package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115198a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115435e;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115445o;
import com.google.android.libraries.gsa.monet.shared.C23073ad;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.fi */
/* compiled from: PG */
public final class C115347fi {

    /* renamed from: a */
    public final C23149a f320055a;

    /* renamed from: b */
    private final C115315ed f320056b;

    /* renamed from: c */
    private final C22871g f320057c;

    /* renamed from: d */
    private final C90464f f320058d;

    /* renamed from: e */
    private final C115445o f320059e;

    public C115347fi(C23149a aVar, C115315ed edVar, C22871g gVar, C90464f fVar, C115445o oVar) {
        this.f320055a = aVar;
        this.f320056b = edVar;
        this.f320057c = gVar;
        this.f320058d = fVar;
        this.f320059e = oVar;
    }

    /* renamed from: g */
    private final void m191268g(String str, ProtoParcelable protoParcelable) {
        if (this.f320056b.mo101954a().mo101952f()) {
            ((C23251a) this.f320059e.mo102013q()).mo28730f(true, false);
        }
        C115315ed edVar = this.f320056b;
        edVar.mo101965m(new C115292dh(edVar));
        this.f320056b.mo101966n(this.f320057c, "pause-playback", new C115345fg(this, str, protoParcelable));
    }

    /* renamed from: a */
    public final void mo101984a() {
        m191268g("speakr_select_language_feature", ProtoParcelable.f63423a);
    }

    /* renamed from: b */
    public final void mo101985b() {
        m191268g("speakr_select_voice_feature", ProtoParcelable.f63423a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo101986c(String str) {
        C115371gf gfVar;
        C52583xc xcVar;
        C115370ge geVar = (C115370ge) C115371gf.f320102d.createBuilder();
        geVar.copyOnWrite();
        C115371gf gfVar2 = (C115371gf) geVar.instance;
        str.getClass();
        gfVar2.f320104a |= 1;
        gfVar2.f320105b = str;
        try {
            C52568wo woVar = this.f320056b.mo101954a().mo101947a().f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 26) {
                xcVar = (C52583xc) woVar.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            C52582xb a = C52582xb.m86658a(xcVar.f138076l);
            if (a == null) {
                a = C52582xb.UNKNOWN_TRIGGER_TYPE;
            }
            geVar.copyOnWrite();
            C115371gf gfVar3 = (C115371gf) geVar.instance;
            gfVar3.f320106c = a.f138062i;
            gfVar3.f320104a |= 2;
            gfVar = (C115371gf) geVar.build();
        } catch (IllegalStateException unused) {
            gfVar = (C115371gf) geVar.build();
        }
        m191268g("speakr_select_voice_feature", new ProtoParcelable((C23073ad) new C115346fh(gfVar)));
    }

    /* renamed from: d */
    public final void mo101987d() {
        if (((Boolean) ((C23251a) this.f320059e.mo102013q()).f63720e).booleanValue()) {
            ((C23251a) this.f320059e.mo102013q()).mo28730f(false, false);
            this.f320056b.mo101963k();
        }
    }

    /* renamed from: e */
    public final void mo101988e(byte[] bArr, C58833ax axVar, C115435e eVar) {
        mo101989f(bArr, axVar, eVar, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    /* renamed from: f */
    public final void mo101989f(byte[] bArr, C58833ax axVar, C115435e eVar, String str, String str2) {
        String str3;
        C52583xc xcVar;
        C58490gz gzVar = new C58490gz(4);
        C115314ec a = this.f320056b.mo101954a();
        gzVar.mo55429h("Read-it Feedback type", eVar.name());
        gzVar.mo55429h("Feedback word", str);
        gzVar.mo55429h("Feedback surrounding text", str2);
        try {
            C52568wo woVar = a.mo101947a().f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 26) {
                xcVar = (C52583xc) woVar.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            C52582xb a2 = C52582xb.m86658a(xcVar.f138076l);
            if (a2 == null) {
                a2 = C52582xb.UNKNOWN_TRIGGER_TYPE;
            }
            gzVar.mo55429h("Read-it Trigger type", a2.name());
        } catch (IllegalStateException unused) {
        }
        gzVar.mo55429h("Read-it Voice", ((C68185bu) axVar.mo56109e(C68185bu.f184497d)).f184499a);
        C90464f fVar = this.f320058d;
        C58833ax axVar2 = a.f319952b;
        C58495hd f = gzVar.mo55427f(false);
        if (str.isEmpty()) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = String.format("Affected word: %s\n\nParagraph: %s\n\nObserved output: \n\nDesired output: ", new Object[]{str, str2});
        }
        C115198a.m190985b(fVar, axVar2, bArr, f, str3);
    }
}

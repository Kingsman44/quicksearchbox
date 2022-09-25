package com.google.android.gms.learning.dynamite.training;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.learning.C144573b;
import com.google.android.libraries.micore.learning.p2258a.C29693c;
import com.google.android.libraries.micore.learning.p2258a.C29696f;
import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29699i;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.android.libraries.micore.learning.training.C29728d;
import com.google.protobuf.C63077o;

/* renamed from: com.google.android.gms.learning.dynamite.training.bd */
/* compiled from: PG */
final class C144688bd extends C144715k {

    /* renamed from: a */
    final /* synthetic */ InAppTrainingServiceImpl f391466a;

    public C144688bd(InAppTrainingServiceImpl inAppTrainingServiceImpl) {
        this.f391466a = inAppTrainingServiceImpl;
    }

    /* renamed from: e */
    public final void mo120157e() {
        InAppTrainingServiceImpl inAppTrainingServiceImpl = this.f391466a;
        inAppTrainingServiceImpl.f391391g.mo120056h(1174);
        inAppTrainingServiceImpl.mo120128f();
    }

    /* renamed from: f */
    public final void mo120158f(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, byte[] bArr, C144719o oVar) {
        boolean z4;
        if (!this.f391466a.f391393i.mo119982aP()) {
            InAppTrainingServiceImpl inAppTrainingServiceImpl = this.f391466a;
            C144573b bVar = inAppTrainingServiceImpl.f391393i;
            String str4 = inAppTrainingServiceImpl.f391394j;
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append("/");
            String str5 = str;
            sb.append(str);
            String str6 = str2;
            if (!bVar.mo120004al(C29728d.m54829a(sb.toString(), str2))) {
                z4 = false;
                C29699i iVar = (C29699i) C29700j.f80437f.createBuilder();
                iVar.copyOnWrite();
                ((C29700j) iVar.instance).f80440b = true ^ z4;
                C63077o a = C63077o.m96099a(z);
                iVar.copyOnWrite();
                a.getClass();
                ((C29700j) iVar.instance).f80443e = a;
                iVar.copyOnWrite();
                ((C29700j) iVar.instance).f80441c = z2;
                iVar.copyOnWrite();
                ((C29700j) iVar.instance).f80442d = z3;
                String str7 = str;
                String str8 = str2;
                String str9 = str3;
                this.f391466a.mo120130h(str7, str8, str9, C29693c.m54785b(i), (C29700j) iVar.build(), bArr, oVar);
            }
        } else {
            String str10 = str;
            String str11 = str2;
        }
        z4 = true;
        C29699i iVar2 = (C29699i) C29700j.f80437f.createBuilder();
        iVar2.copyOnWrite();
        ((C29700j) iVar2.instance).f80440b = true ^ z4;
        C63077o a2 = C63077o.m96099a(z);
        iVar2.copyOnWrite();
        a2.getClass();
        ((C29700j) iVar2.instance).f80443e = a2;
        iVar2.copyOnWrite();
        ((C29700j) iVar2.instance).f80441c = z2;
        iVar2.copyOnWrite();
        ((C29700j) iVar2.instance).f80442d = z3;
        String str72 = str;
        String str82 = str2;
        String str92 = str3;
        this.f391466a.mo120130h(str72, str82, str92, C29693c.m54785b(i), (C29700j) iVar2.build(), bArr, oVar);
    }

    /* renamed from: g */
    public final void mo120159g(String str, String str2, String str3, String str4, boolean z, boolean z2, byte[] bArr, C144719o oVar) {
        boolean z3;
        if (!this.f391466a.f391393i.mo119982aP()) {
            InAppTrainingServiceImpl inAppTrainingServiceImpl = this.f391466a;
            C144573b bVar = inAppTrainingServiceImpl.f391393i;
            String str5 = inAppTrainingServiceImpl.f391394j;
            if (!bVar.mo120004al(C29728d.m54829a(str5 + "/" + str, BuildConfig.FLAVOR))) {
                z3 = false;
                C29699i iVar = (C29699i) C29700j.f80437f.createBuilder();
                iVar.copyOnWrite();
                ((C29700j) iVar.instance).f80440b = !z3;
                C63077o a = C63077o.m96099a(z);
                iVar.copyOnWrite();
                a.getClass();
                ((C29700j) iVar.instance).f80443e = a;
                iVar.copyOnWrite();
                ((C29700j) iVar.instance).f80441c = z2;
                InAppTrainingServiceImpl inAppTrainingServiceImpl2 = this.f391466a;
                C29696f fVar = (C29696f) C29697g.f80430f.createBuilder();
                fVar.copyOnWrite();
                str2.getClass();
                ((C29697g) fVar.instance).f80432a = str2;
                fVar.copyOnWrite();
                str3.getClass();
                ((C29697g) fVar.instance).f80436e = str3;
                fVar.copyOnWrite();
                str4.getClass();
                ((C29697g) fVar.instance).f80434c = str4;
                String str6 = str;
                inAppTrainingServiceImpl2.mo120126d(str6, C144708d.m235219b((C29697g) fVar.build()), BuildConfig.FLAVOR, (C29700j) iVar.build(), bArr, oVar);
            }
        }
        z3 = true;
        C29699i iVar2 = (C29699i) C29700j.f80437f.createBuilder();
        iVar2.copyOnWrite();
        ((C29700j) iVar2.instance).f80440b = !z3;
        C63077o a2 = C63077o.m96099a(z);
        iVar2.copyOnWrite();
        a2.getClass();
        ((C29700j) iVar2.instance).f80443e = a2;
        iVar2.copyOnWrite();
        ((C29700j) iVar2.instance).f80441c = z2;
        InAppTrainingServiceImpl inAppTrainingServiceImpl22 = this.f391466a;
        C29696f fVar2 = (C29696f) C29697g.f80430f.createBuilder();
        fVar2.copyOnWrite();
        str2.getClass();
        ((C29697g) fVar2.instance).f80432a = str2;
        fVar2.copyOnWrite();
        str3.getClass();
        ((C29697g) fVar2.instance).f80436e = str3;
        fVar2.copyOnWrite();
        str4.getClass();
        ((C29697g) fVar2.instance).f80434c = str4;
        String str62 = str;
        inAppTrainingServiceImpl22.mo120126d(str62, C144708d.m235219b((C29697g) fVar2.build()), BuildConfig.FLAVOR, (C29700j) iVar2.build(), bArr, oVar);
    }
}

package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4545b.C59365af;
import com.google.protobuf.C63088z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63139e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63140f;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ey */
/* compiled from: PG */
final class C96202ey implements C58881cr {

    /* renamed from: a */
    int f269273a = 0;

    /* renamed from: b */
    final /* synthetic */ C58485gu f269274b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f269275c;

    /* renamed from: d */
    final /* synthetic */ byte[] f269276d;

    /* renamed from: e */
    final /* synthetic */ C96206fb f269277e;

    public C96202ey(C96206fb fbVar, C58485gu guVar, AtomicReference atomicReference, byte[] bArr) {
        this.f269277e = fbVar;
        this.f269274b = guVar;
        this.f269275c = atomicReference;
        this.f269276d = bArr;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        this.f269273a++;
        Duration duration = C96206fb.f269287b;
        int size = this.f269274b.size();
        int i = this.f269273a;
        if (size > i) {
            Duration duration2 = (Duration) this.f269274b.get(i);
            duration2.getClass();
            if (C59365af.m92281a(C96206fb.f269287b, duration2)) {
                duration = (Duration) this.f269274b.get(this.f269273a);
            }
        }
        this.f269275c.set(this.f269277e.f269299n.mo57444a());
        C58976aa aaVar = C58975e.f156826a;
        C96206fb fbVar = this.f269277e;
        byte[] bArr = this.f269276d;
        C63139e eVar = (C63139e) C63140f.f170505f.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        eVar.copyOnWrite();
        C63140f fVar = (C63140f) eVar.instance;
        fVar.f170507a |= 1;
        fVar.f170508b = A;
        C58833ax a = fbVar.f269300o.mo77278a();
        if (fbVar.f269301p) {
            if (!a.mo56113h()) {
                C59104x c = C96206fb.f269286a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoDataLayerSeq");
                ((C59052c) ((C59052c) c).mo56372aa(16986)).mo56386p("Missing account");
            } else {
                eVar.copyOnWrite();
                C63140f fVar2 = (C63140f) eVar.instance;
                fVar2.f170507a |= 2;
                fVar2.f170509c = true;
                String str = ((Account) a.mo56107c()).name;
                eVar.copyOnWrite();
                C63140f fVar3 = (C63140f) eVar.instance;
                str.getClass();
                fVar3.f170507a |= 4;
                fVar3.f170510d = str;
            }
        }
        fbVar.f269293h.f266647b.mo57066b(String.format("SendPskRequest-%b", new Object[]{Boolean.valueOf(((C63140f) eVar.instance).f170509c)}));
        return fbVar.f269291f.mo90115e(fbVar.f269292g, ((C63140f) eVar.build()).toByteArray(), duration);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.databinding.C0118a;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83934u;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83935v;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108849bf;
import com.google.assistant.p3861at.C50207on;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.t */
/* compiled from: PG */
final class C110496t extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C110500x f308055a;

    public C110496t(C110500x xVar) {
        this.f308055a = xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        Bundle bundle = new Bundle();
        if (this.f308055a.f308060b.mo98725e()) {
            C83934u uVar = (C83934u) C83935v.f228590f.createBuilder();
            boolean e = this.f308055a.f308060b.mo98725e();
            uVar.copyOnWrite();
            C83935v vVar = (C83935v) uVar.instance;
            vVar.f228592a |= 1;
            vVar.f228593b = e;
            String b = this.f308055a.f308060b.mo98722b();
            uVar.copyOnWrite();
            C83935v vVar2 = (C83935v) uVar.instance;
            b.getClass();
            vVar2.f228592a |= 2;
            vVar2.f228594c = b;
            int a = C50207on.m85790a(this.f308055a.f308060b.mo98721a());
            uVar.copyOnWrite();
            C83935v vVar3 = (C83935v) uVar.instance;
            int i = a - 1;
            if (a != 0) {
                vVar3.f228595d = i;
                vVar3.f228592a |= 4;
                ProtoParsers.m95532o(bundle, "phone-unicorn-info", uVar.build());
            } else {
                throw null;
            }
        }
        bundle.putInt("enrollment_entry_id", C9439b.OPA_HOTWORD_ENROLLMENT.f32835aq);
        if (this.f308055a.f308060b.mo98724d()) {
            bundle.putBoolean("use-neutral-buttons", this.f308055a.f308060b.mo98724d());
        }
        return C83875ai.m133540e(new C108849bf(), bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        if (!mo98739d()) {
            C59104x b = C110500x.f308059a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaSuwContentSeq");
            C0118a.m109q(b, "Skipping Voice Match because it is disabled in the SUW script or Voice Match is already enabled.", 26391, "SuwHotwordSequence", C58975e.f156826a);
            return false;
        } else if (!this.f308055a.f308063e.mo79746e(C90062dn.f249227z) || this.f308055a.f308066h.mo87309c() == 2) {
            return true;
        } else {
            C59104x b2 = C110500x.f308059a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "OpaSuwContentSeq");
            C0118a.m109q(b2, "Skipping Voice Match as the user has not allowed hotword in the previous SUW screen.", 26390, "SuwHotwordSequence", C58975e.f156826a);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo98739d() {
        boolean e = this.f308055a.f308061c.mo98718e();
        boolean z = this.f308055a.f308062d.mo87242p() && !this.f308055a.f308062d.mo87249w() && !this.f308055a.mo98740b();
        C59104x b = C110500x.f308059a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSuwContentSeq");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C58975e.f156826a, "SuwHotwordSequence");
        ((C59052c) cVar.mo56372aa(26389)).mo56359L("shouldRun: hasHotwordEverywhere = %b, isVoiceMatchEnabled = %b, hasSeenHotword = %b", Boolean.valueOf(this.f308055a.f308062d.mo87242p()), Boolean.valueOf(this.f308055a.f308062d.mo87249w()), Boolean.valueOf(this.f308055a.mo98740b()));
        return e && z;
    }
}

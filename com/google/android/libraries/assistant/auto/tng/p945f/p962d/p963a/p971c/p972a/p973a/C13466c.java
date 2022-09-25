package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p972a.p973a;

import android.content.Context;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p972a.C13463a;
import com.google.android.play.core.p3538g.C45121ag;
import com.google.android.play.core.p3538g.C45122ah;
import com.google.android.play.core.p3538g.C45180o;
import com.google.android.play.core.p3538g.C45187v;
import com.google.android.play.core.p3538g.C45188w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.a.a.c */
/* compiled from: PG */
public final class C13466c implements C13463a {

    /* renamed from: a */
    public static final C59071e f41320a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.a.c.a.a.c");

    /* renamed from: b */
    private final Context f41321b;

    /* renamed from: c */
    private final C45187v f41322c;

    public C13466c(Context context) {
        this.f41321b = context;
        this.f41322c = C45188w.m80459a(context);
    }

    /* renamed from: a */
    public final void mo21101a() {
        C59104x b = f41320a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FeatureSplitManager");
        ((C59052c) ((C59052c) b).mo56372aa(44828)).mo56386p("#loadNativeLibrary");
        C45180o.m80432a(this.f41321b, "textclassifier3_jni_tclib_assistant");
    }

    /* renamed from: b */
    public final void mo21102b() {
        C59104x b = f41320a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FeatureSplitManager");
        ((C59052c) ((C59052c) b).mo56372aa(44829)).mo56386p("#startImmediateInstall");
        C45187v vVar = this.f41322c;
        C45121ag agVar = new C45121ag();
        agVar.mo48957a("tclib_native_feature_module");
        C146006ab e = vVar.mo48998e(new C45122ah(agVar));
        e.mo122499r(C13464a.f41318a);
        e.mo122498q(C13465b.f41319a);
    }

    /* renamed from: c */
    public final boolean mo21103c() {
        C59104x b = f41320a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FeatureSplitManager");
        ((C59052c) ((C59052c) b).mo56372aa(44830)).mo56386p("#isNativeModuleInstalled");
        return this.f41322c.mo49000g().contains("tclib_native_feature_module");
    }
}

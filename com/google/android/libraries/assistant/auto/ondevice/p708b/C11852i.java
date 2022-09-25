package com.google.android.libraries.assistant.auto.ondevice.p708b;

import android.text.TextUtils;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;
import com.google.protos.p4850an.p4855d.p4856a.C63450c;
import com.google.protos.p4850an.p4855d.p4856a.C63451d;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.i */
/* compiled from: PG */
public final /* synthetic */ class C11852i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11853j f38146a;

    /* renamed from: b */
    public final /* synthetic */ C63451d f38147b;

    /* renamed from: c */
    public final /* synthetic */ boolean f38148c;

    public /* synthetic */ C11852i(C11853j jVar, C63451d dVar, boolean z) {
        this.f38146a = jVar;
        this.f38147b = dVar;
        this.f38148c = z;
    }

    public final Object apply(Object obj) {
        C58485gu guVar;
        int i;
        C11853j jVar = this.f38146a;
        C63451d dVar = this.f38147b;
        boolean z = this.f38148c;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) C11853j.f38149a.mo56226d()).mo56372aa(43561)).mo56386p("#createRedialClientOps: No related record is found in log.");
            if (z) {
                String str = ((C63446af) dVar.f171478b.get(0)).f171466d;
                C9309a aVar = jVar.f38152d;
                guVar = C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.redial_contact_no_record, new Object[]{str})));
            } else {
                int a = C63450c.m96238a(dVar.f171482f);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 1) {
                    i = R.string.redial_no_record;
                } else if (i2 == 2) {
                    i = R.string.call_back_no_record;
                } else if (i2 == 3) {
                    i = R.string.call_last_missed_no_record;
                } else if (i2 != 4) {
                    ((C58970a) ((C58970a) C11853j.f38149a.mo56226d()).mo56372aa(43571)).mo56386p("No redial type is provided. Return empty clientop");
                    guVar = C58485gu.m89845m();
                } else {
                    i = R.string.call_last_received_no_record;
                }
                C9309a aVar2 = jVar.f38152d;
                guVar = C58485gu.m89846n(C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(i)));
            }
            return new C58835az(guVar, C58485gu.m89846n(23202));
        }
        String str2 = ((C13256b) axVar.mo56107c()).f40931c;
        if (!TextUtils.isEmpty(str2)) {
            return new C58835az(C58485gu.m89846n(C11853j.m27575d(str2)), C58485gu.m89846n(23204));
        }
        ((C58970a) ((C58970a) C11853j.f38149a.mo56226d()).mo56372aa(43560)).mo56386p("The phone number from log is empty");
        return new C58835az(C58485gu.m89845m(), C58485gu.m89845m());
    }
}

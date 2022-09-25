package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C35806l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35807m f93803a;

    /* renamed from: b */
    public final /* synthetic */ String f93804b;

    public /* synthetic */ C35806l(C35807m mVar, String str) {
        this.f93803a = mVar;
        this.f93804b = str;
    }

    public final Object apply(Object obj) {
        C35807m mVar = this.f93803a;
        String str = this.f93804b;
        if (((Boolean) obj).booleanValue()) {
            mVar.f93806b.mo39896d(str, C62722b.OK);
            return C36180b.f94544a;
        }
        String format = String.format(Locale.US, "Failed to start voice activity for %s", new Object[]{str});
        C59104x c = C35807m.f93805a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ModifyPowerSaver");
        ((C59052c) ((C59052c) c).mo56372aa(52020)).mo56389s("%s", format);
        mVar.f93806b.mo39896d(str, C62722b.INTERNAL);
        return C36180b.m64579c(C52235kf.INTERNAL, format);
    }
}

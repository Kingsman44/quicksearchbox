package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C35800f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35801g f93785a;

    /* renamed from: b */
    public final /* synthetic */ String f93786b;

    public /* synthetic */ C35800f(C35801g gVar, String str) {
        this.f93785a = gVar;
        this.f93786b = str;
    }

    public final Object apply(Object obj) {
        C35801g gVar = this.f93785a;
        String str = this.f93786b;
        if (((Boolean) obj).booleanValue()) {
            gVar.f93788b.mo39896d(str, C62722b.OK);
            return C36180b.f94544a;
        }
        String format = String.format(Locale.US, "Failed to start voice activity for %s", new Object[]{str});
        C59104x c = C35801g.f93787a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ModifyAirplaneMode");
        ((C59052c) ((C59052c) c).mo56372aa(52000)).mo56389s("%s", format);
        gVar.f93788b.mo39896d(str, C62722b.INTERNAL);
        return C36180b.m64579c(C52235kf.INTERNAL, format);
    }
}

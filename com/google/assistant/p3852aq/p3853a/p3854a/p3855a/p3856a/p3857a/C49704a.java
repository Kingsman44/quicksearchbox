package com.google.assistant.p3852aq.p3853a.p3854a.p3855a.p3856a.p3857a;

import android.os.Message;
import android.os.Messenger;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.assistant.aq.a.a.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C49704a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Message f128280a;

    public /* synthetic */ C49704a(Message message) {
        this.f128280a = message;
    }

    public final Object apply(Object obj) {
        Message message = this.f128280a;
        try {
            ((Messenger) obj).send(message);
            return null;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C49710g.f128287a.mo56225c()).mo56382g(e)).mo56372aa(54862)).mo56389s("Failed to sent out message %s", message);
            return null;
        }
    }
}

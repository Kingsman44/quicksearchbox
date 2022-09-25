package com.google.assistant.p3852aq.p3853a.p3854a.p3855a.p3856a.p3857a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.assistant.aq.a.a.a.a.a.f */
/* compiled from: PG */
final class C49709f extends Handler {

    /* renamed from: a */
    public C2164c f128286a;

    public C49709f() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 4) {
            ((C59052c) ((C59052c) C49710g.f128287a.mo56224b()).mo56372aa(54858)).mo56386p("Get cast device id from cast auth apk");
            String string = message.getData().getString("castDeviceID");
            if (string != null) {
                this.f128286a.mo5437b(string);
            }
        } else if (i == 5) {
            ((C59052c) ((C59052c) C49710g.f128287a.mo56224b()).mo56372aa(54859)).mo56386p("Get cast device certificate from cast auth apk");
            if (message.getData().getString("certAndChain") != null) {
                throw null;
            }
        } else if (i == 7) {
            this.f128286a.mo5439d(new IllegalStateException(String.format("Get error %s", new Object[]{message.getData().getString("errorInfo")})));
        } else if (i != 8) {
            ((C59052c) ((C59052c) C49710g.f128287a.mo56226d()).mo56372aa(54857)).mo56389s("Unexpected message from auth cast %s", message);
        } else {
            new IllegalStateException(String.format("Get error %s", new Object[]{message.getData().getString("errorInfo")}));
            throw null;
        }
    }
}

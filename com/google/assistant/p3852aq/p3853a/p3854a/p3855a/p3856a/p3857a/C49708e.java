package com.google.assistant.p3852aq.p3853a.p3854a.p3855a.p3856a.p3857a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.assistant.aq.a.a.a.a.a.e */
/* compiled from: PG */
final class C49708e implements ServiceConnection {

    /* renamed from: a */
    private final C2164c f128285a;

    public C49708e(C2164c cVar) {
        this.f128285a = cVar;
    }

    public final void onNullBinding(ComponentName componentName) {
        ((C59052c) ((C59052c) C49710g.f128287a.mo56225c()).mo56372aa(54854)).mo56389s("AuthCastServiceConnection: %s get null binding.", componentName);
        this.f128285a.mo5439d(new IOException("AuthCastServiceConnection get null binding."));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((C59052c) ((C59052c) C49710g.f128287a.mo56224b()).mo56372aa(54855)).mo56386p("AuthCastServiceConnection connected");
        this.f128285a.mo5437b(new Messenger(iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ((C59052c) ((C59052c) C49710g.f128287a.mo56224b()).mo56372aa(54856)).mo56386p("AuthCastServiceConnection disconnected.");
    }
}

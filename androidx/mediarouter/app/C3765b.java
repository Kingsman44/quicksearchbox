package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.mediarouter.app.b */
/* compiled from: PG */
final class C3765b extends BroadcastReceiver {

    /* renamed from: a */
    public final Context f12163a;

    /* renamed from: b */
    public boolean f12164b = true;

    /* renamed from: c */
    public final List f12165c;

    public C3765b(Context context) {
        this.f12163a = context;
        this.f12165c = new ArrayList();
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.f12164b != (!intent.getBooleanExtra("noConnectivity", false))) {
            this.f12164b = z;
            for (MediaRouteButton b : this.f12165c) {
                b.mo7932b();
            }
        }
    }
}

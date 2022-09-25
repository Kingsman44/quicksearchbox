package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.nga.shared.android.C80955k;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.aa */
/* compiled from: PG */
final class C103901aa {

    /* renamed from: a */
    public final Context f289214a;

    /* renamed from: b */
    public final C90465g f289215b;

    /* renamed from: c */
    public final BroadcastReceiver f289216c = new C104129z();

    /* renamed from: d */
    private final C91385o f289217d;

    public C103901aa(Context context, C90465g gVar, C91385o oVar) {
        this.f289214a = context;
        this.f289215b = gVar;
        this.f289217d = oVar;
    }

    /* renamed from: a */
    public final void mo93878a(String str) {
        this.f289214a.registerReceiver(this.f289216c, new IntentFilter("com.google.android.libraries.gsa.splitinstall.SEND_FEEDBACK"));
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f289214a, 0, C80955k.m128811a(this, new C104127x(this, str)).setAction("com.google.android.libraries.gsa.splitinstall.SEND_FEEDBACK").setPackage(this.f289214a.getPackageName()), 335544320);
        C1839z a = C89095d.m144923a(this.f289214a, "SplitInstallFinished");
        a.mo5015d(8, true);
        a.mo5015d(16, true);
        a.f5679J.icon = R.drawable.ic_assistant_light;
        a.f5690j = -1;
        a.f5685e = C1839z.m5037c(this.f289214a.getString(R.string.download_native_lib_notification_title));
        a.f5686f = C1839z.m5037c(this.f289214a.getString(R.string.download_native_lib_notification_description, new Object[]{str}));
        a.f5687g = broadcast;
        a.mo5016e(R.drawable.ic_assistant_light, this.f289214a.getString(R.string.send_feedback_action), broadcast);
        this.f289217d.mo85703f("si", 9175043, a.mo5013a());
    }
}

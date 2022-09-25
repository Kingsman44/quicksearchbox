package androidx.media3.p174ui;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.apps.search.podcasts.player.impl.C140836o;

/* renamed from: androidx.media3.ui.l */
/* compiled from: PG */
public final class C3648l {
    /* renamed from: a */
    public static final C3652p m10561a(Context context, int i, String str, C3649m mVar, int i2, int i3, int i4, int i5, int i6, int i7, String str2, C140836o oVar) {
        Context context2 = context;
        int i8 = i2;
        if (i8 != 0) {
            int i9 = C2612ak.f7249a;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.getClass();
            String str3 = str;
            notificationManager.createNotificationChannel(new NotificationChannel(str, context.getString(i8), 2));
        } else {
            String str4 = str;
        }
        return new C3652p(context, str, i, mVar, oVar, i4, i5, i3, i6, i7, str2);
    }
}

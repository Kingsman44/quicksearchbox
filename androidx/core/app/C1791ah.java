package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.C1932e;
import androidx.core.graphics.drawable.C1934g;
import androidx.core.graphics.drawable.IconCompat;
import com.evernote.android.state.BuildConfig;
import java.util.Set;

/* renamed from: androidx.core.app.ah */
/* compiled from: PG */
public final class C1791ah {
    /* renamed from: a */
    public static int m4933a(Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    /* renamed from: b */
    public static C1832s m4934b(Notification.Action action) {
        C1811ba[] baVarArr;
        Notification.Action action2 = action;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        if (remoteInputs == null) {
            baVarArr = null;
        } else {
            C1811ba[] baVarArr2 = new C1811ba[remoteInputs.length];
            for (int i = 0; i < remoteInputs.length; i++) {
                RemoteInput remoteInput = remoteInputs[i];
                baVarArr2[i] = new C1811ba(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getEditChoicesBeforeSending(), remoteInput.getExtras(), (Set) null);
            }
            baVarArr = baVarArr2;
        }
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = action.getSemanticAction();
        boolean isContextual = action.isContextual();
        boolean isAuthenticationRequired = Build.VERSION.SDK_INT >= 31 ? action.isAuthenticationRequired() : false;
        if (action.getIcon() != null || action2.icon == 0) {
            if (action.getIcon() != null) {
                Icon icon = action.getIcon();
                if (!(C1934g.m5240b(icon) == 2 && C1934g.m5239a(icon) == 0)) {
                    iconCompat = C1932e.m5236e(icon);
                }
            }
            return new C1832s(iconCompat, action2.title, action2.actionIntent, action.getExtras(), baVarArr, z, semanticAction, z2, isContextual, isAuthenticationRequired);
        }
        int i2 = action2.icon;
        CharSequence charSequence = action2.title;
        PendingIntent pendingIntent = action2.actionIntent;
        Bundle extras = action.getExtras();
        if (i2 != 0) {
            iconCompat = IconCompat.m5207j((Resources) null, BuildConfig.FLAVOR, i2);
        }
        return new C1832s(iconCompat, charSequence, pendingIntent, extras, baVarArr, z, semanticAction, z2, isContextual, isAuthenticationRequired);
    }

    /* renamed from: c */
    public static boolean m4935c(Notification notification) {
        return (notification.flags & 512) != 0;
    }
}

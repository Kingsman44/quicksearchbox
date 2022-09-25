package androidx.core.content.p090a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;

/* renamed from: androidx.core.content.a.e */
/* compiled from: PG */
public final class C1850e {

    /* renamed from: a */
    private static volatile C1849d f5717a;

    /* renamed from: b */
    private static volatile List f5718b;

    /* renamed from: a */
    public static Intent m5068a(Context context, C1848c cVar) {
        Bitmap bitmap;
        Intent createShortcutResultIntent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(cVar.mo5032a());
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        Intent[] intentArr = cVar.f5713c;
        int length = intentArr.length;
        createShortcutResultIntent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[0]).putExtra("android.intent.extra.shortcut.NAME", cVar.f5714d.toString());
        IconCompat iconCompat = cVar.f5716f;
        if (iconCompat != null) {
            Context context2 = cVar.f5711a;
            iconCompat.mo5078l(context2);
            int i = iconCompat.f5826b;
            if (i == 1) {
                bitmap = (Bitmap) iconCompat.f5827c;
            } else if (i == 2) {
                try {
                    createShortcutResultIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context2.createPackageContext(iconCompat.mo5077k(), 0), iconCompat.f5830f));
                } catch (PackageManager.NameNotFoundException e) {
                    StringBuilder sb = new StringBuilder("Can't find package ");
                    Object obj = iconCompat.f5827c;
                    sb.append(obj);
                    throw new IllegalArgumentException("Can't find package ".concat(String.valueOf(obj)), e);
                }
            } else if (i == 5) {
                bitmap = IconCompat.m5208m((Bitmap) iconCompat.f5827c);
            } else {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            createShortcutResultIntent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
        return createShortcutResultIntent;
    }

    /* renamed from: b */
    public static boolean m5069b(Context context) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    /* renamed from: c */
    public static boolean m5070c(Context context, C1848c cVar, IntentSender intentSender) {
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(cVar.mo5032a(), intentSender);
    }
}

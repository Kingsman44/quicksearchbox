package androidx.constraintlayout.motion.p084a;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.C1701a;
import androidx.constraintlayout.widget.C1742a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.constraintlayout.motion.a.a */
/* compiled from: PG */
public final class C1655a {
    /* renamed from: a */
    public static void m4531a(C1742a aVar, View view, float[] fArr) {
        String str;
        C1742a aVar2 = aVar;
        View view2 = view;
        Class<?> cls = view.getClass();
        String str2 = aVar2.f5217b;
        String concat = str2.length() != 0 ? "set".concat(str2) : new String("set");
        try {
            int i = aVar2.f5223h;
            int i2 = i - 1;
            if (i != 0) {
                boolean z = true;
                switch (i2) {
                    case 0:
                        cls.getMethod(concat, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                        return;
                    case 1:
                        cls.getMethod(concat, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                        return;
                    case 2:
                        cls.getMethod(concat, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((m4532b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m4532b((int) (fArr[3] * 255.0f)) << 24) | (m4532b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m4532b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                        return;
                    case 3:
                        Method method = cls.getMethod(concat, new Class[]{Drawable.class});
                        int b = m4532b((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                        int b2 = m4532b((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor((b << 16) | (m4532b((int) (fArr[3] * 255.0f)) << 24) | (b2 << 8) | m4532b((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                        method.invoke(view2, new Object[]{colorDrawable});
                        return;
                    case 4:
                        String str3 = aVar2.f5217b;
                        if (str3.length() != 0) {
                            str = "unable to interpolate strings ".concat(str3);
                        } else {
                            str = new String("unable to interpolate strings ");
                        }
                        throw new RuntimeException(str);
                    case 5:
                        Method method2 = cls.getMethod(concat, new Class[]{Boolean.TYPE});
                        Object[] objArr = new Object[1];
                        if (fArr[0] <= 0.5f) {
                            z = false;
                        }
                        objArr[0] = Boolean.valueOf(z);
                        method2.invoke(view2, objArr);
                        return;
                    case 6:
                        cls.getMethod(concat, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                        return;
                    default:
                        return;
                }
            } else {
                throw null;
            }
        } catch (NoSuchMethodException e) {
            String b3 = C1701a.m4619b(view);
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 21 + String.valueOf(b3).length());
            sb.append("no method ");
            sb.append(concat);
            sb.append(" on View \"");
            sb.append(b3);
            sb.append("\"");
            Log.e("CustomSupport", sb.toString());
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            String b4 = C1701a.m4619b(view);
            StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 32 + String.valueOf(b4).length());
            sb2.append("cannot access method ");
            sb2.append(concat);
            sb2.append(" on View \"");
            sb2.append(b4);
            sb2.append("\"");
            Log.e("CustomSupport", sb2.toString());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: b */
    private static int m4532b(int i) {
        int i2 = (i & ((i >> 31) ^ -1)) - 255;
        return (i2 & (i2 >> 31)) + PrivateKeyType.INVALID;
    }
}

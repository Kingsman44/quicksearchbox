package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.chromium.net.PrivateKeyType;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* compiled from: PG */
public final class C1742a {

    /* renamed from: a */
    public final boolean f5216a;

    /* renamed from: b */
    public final String f5217b;

    /* renamed from: c */
    public int f5218c;

    /* renamed from: d */
    public float f5219d;

    /* renamed from: e */
    public String f5220e;

    /* renamed from: f */
    public boolean f5221f;

    /* renamed from: g */
    public int f5222g;

    /* renamed from: h */
    public final int f5223h;

    public C1742a(C1742a aVar, Object obj) {
        this.f5216a = false;
        this.f5217b = aVar.f5217b;
        this.f5223h = aVar.f5223h;
        mo4851f(obj);
    }

    /* renamed from: d */
    public static void m4755d(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1761t.f5462d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(0);
                if (str != null && str.length() > 0) {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1);
                    sb.append(upperCase);
                    sb.append(substring);
                    str = sb.toString();
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(10);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
                i = 6;
            } else if (index == 3) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(3, 0));
                i = 3;
            } else if (index == 2) {
                obj = Integer.valueOf(obtainStyledAttributes.getColor(2, 0));
                i = 4;
            } else {
                if (index == 7) {
                    obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(7, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    obj = Float.valueOf(obtainStyledAttributes.getDimension(4, 0.0f));
                } else if (index == 5) {
                    obj = Float.valueOf(obtainStyledAttributes.getFloat(5, Float.NaN));
                    i = 2;
                } else if (index == 6) {
                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(6, -1));
                    i = 1;
                } else if (index == 9) {
                    obj = obtainStyledAttributes.getString(9);
                    i = 5;
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(8, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(8, -1);
                    }
                    obj = Integer.valueOf(resourceId);
                    i = 8;
                }
                i = 7;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C1742a(str, i, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    public static void m4756e(View view, HashMap hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            C1742a aVar = (C1742a) hashMap.get(str2);
            if (!aVar.f5216a) {
                String valueOf = String.valueOf(str2);
                str = valueOf.length() != 0 ? "set".concat(valueOf) : new String("set");
            } else {
                str = str2;
            }
            try {
                int i = aVar.f5223h;
                int i2 = i - 1;
                if (i != 0) {
                    switch (i2) {
                        case 0:
                            cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f5218c)});
                            break;
                        case 1:
                            cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f5219d)});
                            break;
                        case 2:
                            cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f5222g)});
                            break;
                        case 3:
                            Method method = cls.getMethod(str, new Class[]{Drawable.class});
                            ColorDrawable colorDrawable = new ColorDrawable();
                            colorDrawable.setColor(aVar.f5222g);
                            method.invoke(view, new Object[]{colorDrawable});
                            break;
                        case 4:
                            cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f5220e});
                            break;
                        case 5:
                            cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f5221f)});
                            break;
                        case 6:
                            cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f5219d)});
                            break;
                        case 7:
                            cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f5218c)});
                            break;
                    }
                } else {
                    throw null;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                String name = cls.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(name).length());
                sb.append(" Custom Attribute \"");
                sb.append(str2);
                sb.append("\" not found on ");
                sb.append(name);
                Log.e("TransitionLayout", sb.toString());
                String name2 = cls.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 20 + String.valueOf(str).length());
                sb2.append(name2);
                sb2.append(" must have a method ");
                sb2.append(str);
                Log.e("TransitionLayout", sb2.toString());
            } catch (IllegalAccessException e2) {
                String name3 = cls.getName();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(name3).length());
                sb3.append(" Custom Attribute \"");
                sb3.append(str2);
                sb3.append("\" not found on ");
                sb3.append(name3);
                Log.e("TransitionLayout", sb3.toString());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                String name4 = cls.getName();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(name4).length());
                sb4.append(" Custom Attribute \"");
                sb4.append(str2);
                sb4.append("\" not found on ");
                sb4.append(name4);
                Log.e("TransitionLayout", sb4.toString());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final int mo4849b() {
        int i = this.f5223h;
        int i2 = i - 1;
        if (i != 0) {
            return (i2 == 2 || i2 == 3) ? 4 : 1;
        }
        throw null;
    }

    /* renamed from: g */
    public final boolean mo4852g() {
        int i = this.f5223h;
        int i2 = i - 1;
        if (i != 0) {
            return (i2 == 4 || i2 == 5 || i2 == 7) ? false : true;
        }
        throw null;
    }

    /* renamed from: f */
    public final void mo4851f(Object obj) {
        int i = this.f5223h;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                case 7:
                    this.f5218c = ((Integer) obj).intValue();
                    return;
                case 1:
                    this.f5219d = ((Float) obj).floatValue();
                    return;
                case 2:
                case 3:
                    this.f5222g = ((Integer) obj).intValue();
                    return;
                case 4:
                    this.f5220e = (String) obj;
                    return;
                case 5:
                    this.f5221f = ((Boolean) obj).booleanValue();
                    return;
                case 6:
                    this.f5219d = ((Float) obj).floatValue();
                    return;
                default:
                    return;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final float mo4848a() {
        int i = this.f5223h;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                    return (float) this.f5218c;
                case 1:
                    return this.f5219d;
                case 2:
                case 3:
                    throw new RuntimeException("Color does not have a single color to interpolate");
                case 4:
                    throw new RuntimeException("Cannot interpolate String");
                case 5:
                    return this.f5221f ? 1.0f : 0.0f;
                case 6:
                    return this.f5219d;
                default:
                    return Float.NaN;
            }
        } else {
            throw null;
        }
    }

    public C1742a(String str, int i, Object obj, boolean z) {
        this.f5217b = str;
        this.f5223h = i;
        this.f5216a = z;
        mo4851f(obj);
    }

    /* renamed from: c */
    public final void mo4850c(float[] fArr) {
        int i = this.f5223h;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                    fArr[0] = (float) this.f5218c;
                    return;
                case 1:
                    fArr[0] = this.f5219d;
                    return;
                case 2:
                case 3:
                    int i3 = this.f5222g;
                    double pow = Math.pow((double) (((float) ((i3 >> 16) & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
                    double pow2 = Math.pow((double) (((float) ((i3 >> 8) & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
                    double pow3 = Math.pow((double) (((float) (i3 & PrivateKeyType.INVALID)) / 255.0f), 2.2d);
                    fArr[0] = (float) pow;
                    fArr[1] = (float) pow2;
                    fArr[2] = (float) pow3;
                    fArr[3] = ((float) ((i3 >> 24) & PrivateKeyType.INVALID)) / 255.0f;
                    return;
                case 4:
                    throw new RuntimeException("Color does not have a single color to interpolate");
                case 5:
                    fArr[0] = true != this.f5221f ? 0.0f : 1.0f;
                    return;
                case 6:
                    fArr[0] = this.f5219d;
                    return;
                default:
                    return;
            }
        } else {
            throw null;
        }
    }
}

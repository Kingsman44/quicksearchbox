package android.support.p033v7.app;

import android.content.Context;
import android.support.p033v7.widget.AppCompatButton;
import android.support.p033v7.widget.AppCompatCheckBox;
import android.support.p033v7.widget.AppCompatTextView;
import android.support.p033v7.widget.C0516an;
import android.support.p033v7.widget.C0778x;
import android.util.AttributeSet;
import android.view.View;
import androidx.p060c.C0984n;
import java.lang.reflect.Constructor;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
/* compiled from: PG */
public class AppCompatViewInflater {

    /* renamed from: a */
    public static final int[] f1129a = {16843375};

    /* renamed from: b */
    public static final String[] f1130b = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Class[] f1131d = {Context.class, AttributeSet.class};

    /* renamed from: e */
    private static final C0984n f1132e = new C0984n(0);

    /* renamed from: c */
    public final Object[] f1133c = new Object[2];

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0778x mo1111a(Context context, AttributeSet attributeSet) {
        return new C0778x(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatButton mo1112b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatCheckBox mo1113c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0516an mo1114d(Context context, AttributeSet attributeSet) {
        return new C0516an(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatTextView mo1115e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: f */
    public final View mo1116f(Context context, String str, String str2) {
        String str3;
        C0984n nVar = f1132e;
        Constructor<? extends U> constructor = (Constructor) nVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1131d);
            nVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1133c);
    }

    /* renamed from: g */
    public final void mo1117g(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}

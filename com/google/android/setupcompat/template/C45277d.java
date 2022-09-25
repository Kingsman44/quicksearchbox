package com.google.android.setupcompat.template;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.setupcompat.C45252d;

/* renamed from: com.google.android.setupcompat.template.d */
/* compiled from: PG */
public final class C45277d implements View.OnClickListener {

    /* renamed from: a */
    public final int f118285a;

    /* renamed from: b */
    public final CharSequence f118286b;

    /* renamed from: c */
    public int f118287c = 0;

    /* renamed from: d */
    public int f118288d;

    /* renamed from: e */
    public C45274a f118289e;

    /* renamed from: f */
    private final View.OnClickListener f118290f;

    /* renamed from: g */
    private int f118291g = 0;

    public C45277d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45252d.f118191b);
        this.f118286b = obtainStyledAttributes.getString(1);
        this.f118290f = null;
        int i = obtainStyledAttributes.getInt(2, 0);
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Not a ButtonType");
        }
        this.f118285a = i;
        this.f118288d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C45277d(CharSequence charSequence, View.OnClickListener onClickListener, int i, int i2) {
        this.f118286b = charSequence;
        this.f118290f = onClickListener;
        this.f118285a = i;
        this.f118288d = i2;
    }

    /* renamed from: a */
    public final PersistableBundle mo49182a(String str) {
        String str2;
        PersistableBundle persistableBundle = new PersistableBundle();
        String concat = str.concat("_text");
        String obj = this.f118286b.toString();
        if (obj.length() > 50) {
            obj = String.format("%s…", new Object[]{obj.substring(0, 49)});
        }
        persistableBundle.putString(concat, obj);
        String concat2 = str.concat("_type");
        switch (this.f118285a) {
            case 1:
                str2 = "ADD_ANOTHER";
                break;
            case 2:
                str2 = "CANCEL";
                break;
            case 3:
                str2 = "CLEAR";
                break;
            case 4:
                str2 = "DONE";
                break;
            case 5:
                str2 = "NEXT";
                break;
            case 6:
                str2 = "OPT_IN";
                break;
            case 7:
                str2 = "SKIP";
                break;
            case 8:
                str2 = "STOP";
                break;
            default:
                str2 = "OTHER";
                break;
        }
        persistableBundle.putString(concat2, str2);
        persistableBundle.putInt(str.concat("_onClickCount"), this.f118291g);
        return persistableBundle;
    }

    /* renamed from: b */
    public final void mo49183b(int i) {
        LinearLayout linearLayout;
        Button button;
        this.f118287c = i;
        C45274a aVar = this.f118289e;
        if (aVar != null && (linearLayout = aVar.f118260b.f118264d) != null && (button = (Button) linearLayout.findViewById(aVar.f118259a)) != null) {
            button.setVisibility(i);
            aVar.f118260b.mo49172c();
        }
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f118290f;
        if (onClickListener != null) {
            this.f118291g++;
            onClickListener.onClick(view);
        }
    }
}

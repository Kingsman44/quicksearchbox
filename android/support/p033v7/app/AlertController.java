package android.support.p033v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.app.AlertController */
/* compiled from: PG */
public final class AlertController {

    /* renamed from: A */
    int f1091A = -1;

    /* renamed from: B */
    public final int f1092B;

    /* renamed from: C */
    public final int f1093C;

    /* renamed from: D */
    final int f1094D;

    /* renamed from: E */
    final int f1095E;

    /* renamed from: F */
    final int f1096F;

    /* renamed from: G */
    final int f1097G;

    /* renamed from: H */
    public final boolean f1098H;

    /* renamed from: I */
    final Handler f1099I;

    /* renamed from: J */
    public final View.OnClickListener f1100J = new C0384e(this);

    /* renamed from: a */
    public final Context f1101a;

    /* renamed from: b */
    final C0358as f1102b;

    /* renamed from: c */
    public final Window f1103c;

    /* renamed from: d */
    public CharSequence f1104d;

    /* renamed from: e */
    public CharSequence f1105e;

    /* renamed from: f */
    public ListView f1106f;

    /* renamed from: g */
    public View f1107g;

    /* renamed from: h */
    public int f1108h;

    /* renamed from: i */
    public boolean f1109i = false;

    /* renamed from: j */
    public Button f1110j;

    /* renamed from: k */
    public CharSequence f1111k;

    /* renamed from: l */
    Message f1112l;

    /* renamed from: m */
    public Button f1113m;

    /* renamed from: n */
    public CharSequence f1114n;

    /* renamed from: o */
    Message f1115o;

    /* renamed from: p */
    Button f1116p;

    /* renamed from: q */
    public CharSequence f1117q;

    /* renamed from: r */
    Message f1118r;

    /* renamed from: s */
    NestedScrollView f1119s;

    /* renamed from: t */
    public int f1120t = 0;

    /* renamed from: u */
    public Drawable f1121u;

    /* renamed from: v */
    public ImageView f1122v;

    /* renamed from: w */
    public TextView f1123w;

    /* renamed from: x */
    public TextView f1124x;

    /* renamed from: y */
    public View f1125y;

    /* renamed from: z */
    ListAdapter f1126z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    /* compiled from: PG */
    public class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f1127a;

        /* renamed from: b */
        public final int f1128b;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338a.f1085u);
            this.f1128b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f1127a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, C0358as asVar, Window window) {
        this.f1101a = context;
        this.f1102b = asVar;
        this.f1103c = window;
        this.f1099I = new C0389j(asVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0338a.f1069e, R.attr.alertDialogStyle, 0);
        this.f1092B = obtainStyledAttributes.getResourceId(0, 0);
        this.f1093C = obtainStyledAttributes.getResourceId(2, 0);
        this.f1094D = obtainStyledAttributes.getResourceId(4, 0);
        this.f1095E = obtainStyledAttributes.getResourceId(5, 0);
        this.f1096F = obtainStyledAttributes.getResourceId(7, 0);
        this.f1097G = obtainStyledAttributes.getResourceId(3, 0);
        this.f1098H = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        asVar.mo1201e();
    }

    /* renamed from: e */
    static boolean m1036e(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1036e(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final void m1037f(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    public static final ViewGroup m1038g(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public final Button mo1106a(int i) {
        if (i == -3) {
            return this.f1116p;
        }
        if (i == -2) {
            return this.f1113m;
        }
        if (i != -1) {
            return null;
        }
        return this.f1110j;
    }

    /* renamed from: b */
    public final void mo1107b(CharSequence charSequence) {
        this.f1105e = charSequence;
        TextView textView = this.f1124x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: c */
    public final void mo1108c(CharSequence charSequence) {
        this.f1104d = charSequence;
        TextView textView = this.f1123w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: d */
    public final void mo1109d(View view) {
        this.f1107g = view;
        this.f1108h = 0;
        this.f1109i = false;
    }

    /* renamed from: h */
    public final void mo1110h(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f1099I.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f1117q = charSequence;
            this.f1118r = obtainMessage;
        } else if (i != -2) {
            this.f1111k = charSequence;
            this.f1112l = obtainMessage;
        } else {
            this.f1114n = charSequence;
            this.f1115o = obtainMessage;
        }
    }
}

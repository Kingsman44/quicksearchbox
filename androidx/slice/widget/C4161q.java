package androidx.slice.widget;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.slice.p195b.C4103a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.slice.widget.q */
/* compiled from: PG */
public final class C4161q {

    /* renamed from: a */
    public int f13403a = -1;

    /* renamed from: b */
    public int f13404b = -1;

    /* renamed from: c */
    public int f13405c = -1;

    /* renamed from: d */
    public int f13406d = -1;

    /* renamed from: e */
    public int f13407e = -1;

    /* renamed from: f */
    public int f13408f = -1;

    /* renamed from: g */
    public int f13409g = -1;

    /* renamed from: h */
    public int f13410h = -1;

    /* renamed from: i */
    public int f13411i = -1;

    /* renamed from: j */
    public int f13412j = -1;

    /* renamed from: k */
    public int f13413k = -1;

    /* renamed from: l */
    public int f13414l = -1;

    /* renamed from: m */
    public int f13415m = -1;

    /* renamed from: n */
    public int f13416n = -1;

    /* renamed from: o */
    public int f13417o = -1;

    /* renamed from: p */
    public int f13418p = -1;

    /* renamed from: q */
    public int f13419q = -1;

    /* renamed from: r */
    public int f13420r = -1;

    /* renamed from: s */
    public int f13421s = -1;

    /* renamed from: t */
    public boolean f13422t = false;

    /* renamed from: u */
    public int f13423u;

    /* renamed from: v */
    private final C4137ao f13424v;

    /* renamed from: w */
    private Integer f13425w;

    /* renamed from: x */
    private Integer f13426x;

    /* renamed from: y */
    private Integer f13427y;

    public C4161q(Context context, int i, C4137ao aoVar) {
        this.f13424v = aoVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C4103a.f13132a);
        try {
            this.f13403a = (int) obtainStyledAttributes.getDimension(22, -1.0f);
            this.f13404b = (int) obtainStyledAttributes.getDimension(21, -1.0f);
            this.f13405c = (int) obtainStyledAttributes.getDimension(4, -1.0f);
            this.f13406d = (int) obtainStyledAttributes.getDimension(3, -1.0f);
            this.f13407e = (int) obtainStyledAttributes.getDimension(23, -1.0f);
            this.f13408f = (int) obtainStyledAttributes.getDimension(20, -1.0f);
            this.f13409g = (int) obtainStyledAttributes.getDimension(15, -1.0f);
            this.f13410h = (int) obtainStyledAttributes.getDimension(14, -1.0f);
            this.f13411i = (int) obtainStyledAttributes.getDimension(7, -1.0f);
            this.f13412j = (int) obtainStyledAttributes.getDimension(6, -1.0f);
            this.f13413k = (int) obtainStyledAttributes.getDimension(2, -1.0f);
            this.f13414l = (int) obtainStyledAttributes.getDimension(1, -1.0f);
            this.f13415m = (int) obtainStyledAttributes.getDimension(0, -1.0f);
            this.f13416n = (int) obtainStyledAttributes.getDimension(13, -1.0f);
            this.f13417o = (int) obtainStyledAttributes.getDimension(11, -1.0f);
            this.f13418p = (int) obtainStyledAttributes.getDimension(12, -1.0f);
            this.f13419q = (int) obtainStyledAttributes.getDimension(10, -1.0f);
            this.f13420r = (int) obtainStyledAttributes.getDimension(17, 10.0f);
            this.f13421s = (int) obtainStyledAttributes.getDimension(8, -1.0f);
            this.f13422t = obtainStyledAttributes.getBoolean(5, false);
            this.f13423u = (int) obtainStyledAttributes.getDimension(9, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_slice_small_image_size));
            this.f13425w = m11931d(obtainStyledAttributes, 18);
            this.f13426x = m11931d(obtainStyledAttributes, 19);
            this.f13427y = m11931d(obtainStyledAttributes, 16);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    private static Integer m11931d(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return Integer.valueOf(typedArray.getColor(i, 0));
        }
        return null;
    }

    /* renamed from: a */
    public final int mo8753a() {
        Integer num = this.f13427y;
        return num != null ? num.intValue() : this.f13424v.f13297c;
    }

    /* renamed from: b */
    public final int mo8754b() {
        Integer num = this.f13425w;
        return num != null ? num.intValue() : this.f13424v.f13295a;
    }

    /* renamed from: c */
    public final int mo8755c() {
        Integer num = this.f13426x;
        return num != null ? num.intValue() : this.f13424v.f13296b;
    }

    public C4161q(Context context, C4137ao aoVar) {
        this.f13424v = aoVar;
        this.f13423u = context.getResources().getDimensionPixelSize(R.dimen.abc_slice_small_image_size);
    }
}

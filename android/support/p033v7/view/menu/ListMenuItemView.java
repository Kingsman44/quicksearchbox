package android.support.p033v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.widget.C0735ip;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
/* compiled from: PG */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, C0453ag {

    /* renamed from: a */
    public C0480t f1518a;

    /* renamed from: b */
    public ImageView f1519b;

    /* renamed from: c */
    public boolean f1520c;

    /* renamed from: d */
    public boolean f1521d;

    /* renamed from: e */
    public boolean f1522e;

    /* renamed from: f */
    private ImageView f1523f;

    /* renamed from: g */
    private RadioButton f1524g;

    /* renamed from: h */
    private TextView f1525h;

    /* renamed from: i */
    private CheckBox f1526i;

    /* renamed from: j */
    private TextView f1527j;

    /* renamed from: k */
    private ImageView f1528k;

    /* renamed from: l */
    private LinearLayout f1529l;

    /* renamed from: m */
    private Drawable f1530m;

    /* renamed from: n */
    private int f1531n;

    /* renamed from: o */
    private Context f1532o;

    /* renamed from: p */
    private Drawable f1533p;

    /* renamed from: q */
    private LayoutInflater f1534q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    /* renamed from: b */
    private final LayoutInflater m1463b() {
        if (this.f1534q == null) {
            this.f1534q = LayoutInflater.from(getContext());
        }
        return this.f1534q;
    }

    /* renamed from: c */
    private final void m1464c(View view, int i) {
        LinearLayout linearLayout = this.f1529l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    public final C0480t mo1441a() {
        return this.f1518a;
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1519b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1519b.getLayoutParams();
            rect.top += this.f1519b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: e */
    public final boolean mo1445e() {
        return false;
    }

    /* renamed from: f */
    public final void mo1446f(C0480t tVar) {
        ImageView imageView;
        String str;
        RadioButton radioButton;
        CheckBox checkBox;
        CompoundButton compoundButton;
        this.f1518a = tVar;
        int i = 0;
        setVisibility(true != tVar.isVisible() ? 8 : 0);
        CharSequence f = tVar.mo1685f(this);
        if (f != null) {
            this.f1525h.setText(f);
            if (this.f1525h.getVisibility() != 0) {
                this.f1525h.setVisibility(0);
            }
        } else if (this.f1525h.getVisibility() != 8) {
            this.f1525h.setVisibility(8);
        }
        boolean isCheckable = tVar.isCheckable();
        if (!(!isCheckable && this.f1524g == null && this.f1526i == null)) {
            if (this.f1518a.mo1711p()) {
                if (this.f1524g == null) {
                    RadioButton radioButton2 = (RadioButton) m1463b().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f1524g = radioButton2;
                    m1464c(radioButton2, -1);
                }
                CompoundButton compoundButton2 = this.f1524g;
                checkBox = this.f1526i;
                radioButton = checkBox;
                compoundButton = compoundButton2;
            } else {
                if (this.f1526i == null) {
                    CheckBox checkBox2 = (CheckBox) m1463b().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.f1526i = checkBox2;
                    m1464c(checkBox2, -1);
                }
                CompoundButton compoundButton3 = this.f1526i;
                radioButton = this.f1524g;
                checkBox = compoundButton3;
                compoundButton = compoundButton3;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.f1518a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (!(radioButton == null || radioButton.getVisibility() == 8)) {
                    radioButton.setVisibility(8);
                }
            } else {
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton3 = this.f1524g;
                if (radioButton3 != null) {
                    radioButton3.setVisibility(8);
                }
            }
        }
        boolean t = tVar.mo1733t();
        tVar.mo1684e();
        int i2 = (!t || !this.f1518a.mo1733t()) ? 8 : 0;
        if (i2 == 0) {
            TextView textView = this.f1527j;
            C0480t tVar2 = this.f1518a;
            char e = tVar2.mo1684e();
            if (e == 0) {
                str = BuildConfig.FLAVOR;
            } else {
                Resources resources = tVar2.f1690i.f1650a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(tVar2.f1690i.f1650a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = tVar2.f1690i.mo1600x() ? tVar2.f1689h : tVar2.f1687f;
                C0480t.m1634g(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C0480t.m1634g(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C0480t.m1634g(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C0480t.m1634g(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C0480t.m1634g(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C0480t.m1634g(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == 8) {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e == 10) {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e != ' ') {
                    sb.append(e);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f1527j.getVisibility() != i2) {
            this.f1527j.setVisibility(i2);
        }
        Drawable icon = tVar.getIcon();
        boolean z = this.f1518a.f1690i.f1659j || this.f1522e;
        if ((z || this.f1520c) && !((imageView = this.f1523f) == null && icon == null && !this.f1520c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) m1463b().inflate(R.layout.abc_list_menu_item_icon, this, false);
                this.f1523f = imageView2;
                m1464c(imageView2, 0);
            }
            if (icon != null || this.f1520c) {
                ImageView imageView3 = this.f1523f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f1523f.getVisibility() != 0) {
                    this.f1523f.setVisibility(0);
                }
            } else {
                this.f1523f.setVisibility(8);
            }
        }
        setEnabled(tVar.isEnabled());
        boolean hasSubMenu = tVar.hasSubMenu();
        ImageView imageView4 = this.f1528k;
        if (imageView4 != null) {
            if (true != hasSubMenu) {
                i = 8;
            }
            imageView4.setVisibility(i);
        }
        setContentDescription(tVar.f1692k);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        C2043bi.m5530X(this, this.f1530m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1525h = textView;
        int i = this.f1531n;
        if (i != -1) {
            textView.setTextAppearance(this.f1532o, i);
        }
        this.f1527j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1528k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1533p);
        }
        this.f1519b = (ImageView) findViewById(R.id.group_divider);
        this.f1529l = (LinearLayout) findViewById(R.id.content);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f1523f != null && this.f1520c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1523f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0735ip f = C0735ip.m2473f(getContext(), attributeSet, C0338a.f1083s, i, 0);
        this.f1530m = f.mo3246b(5);
        this.f1531n = f.f2596b.getResourceId(1, -1);
        this.f1520c = f.f2596b.getBoolean(7, false);
        this.f1532o = context;
        this.f1533p = f.mo3246b(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f1521d = obtainStyledAttributes.hasValue(0);
        f.f2596b.recycle();
        obtainStyledAttributes.recycle();
    }
}

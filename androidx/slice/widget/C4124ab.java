package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import androidx.slice.p194a.C4094a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.slice.widget.ab */
/* compiled from: PG */
public final class C4124ab extends FrameLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    static final int[] f13221a = {16842912};

    /* renamed from: b */
    public C4094a f13222b;

    /* renamed from: c */
    public View f13223c;

    /* renamed from: d */
    private C4147c f13224d;

    /* renamed from: e */
    private C4141as f13225e;

    /* renamed from: f */
    private C4123aa f13226f;

    /* renamed from: g */
    private ProgressBar f13227g;

    /* renamed from: h */
    private int f13228h;

    /* renamed from: i */
    private int f13229i;

    /* renamed from: j */
    private int f13230j = 0;

    public C4124ab(Context context, C4161q qVar) {
        super(context);
        Resources resources = getContext().getResources();
        this.f13228h = resources.getDimensionPixelSize(R.dimen.abc_slice_icon_size);
        this.f13229i = resources.getDimensionPixelSize(R.dimen.abc_slice_small_image_size);
        if (qVar != null) {
            this.f13228h = qVar.f13421s;
            this.f13229i = qVar.f13423u;
            this.f13230j = qVar.f13420r;
        }
    }

    /* renamed from: a */
    public final void mo8687a() {
        Intent intent;
        C4147c cVar;
        C4094a aVar = this.f13222b;
        if (aVar != null && aVar.f13106a != null) {
            try {
                if (aVar.mo8607d()) {
                    boolean isChecked = ((Checkable) this.f13223c).isChecked();
                    intent = new Intent().addFlags(268435456).putExtra("android.app.slice.extra.TOGGLE_STATE", isChecked);
                    C4147c cVar2 = this.f13224d;
                    if (cVar2 != null) {
                        cVar2.f13344h = isChecked ? 1 : 0;
                    }
                } else {
                    intent = null;
                }
                if (this.f13222b.f13106a.mo8599g(getContext(), intent)) {
                    mo8689c();
                    C4123aa aaVar = this.f13226f;
                    if (aaVar != null) {
                        C4147c cVar3 = this.f13224d;
                        aaVar.mo8686a(this.f13222b.f13113h, cVar3 != null ? cVar3.f13340d : -1);
                    }
                }
                C4141as asVar = this.f13225e;
                if (asVar != null && (cVar = this.f13224d) != null) {
                    asVar.mo8726b(cVar, this.f13222b.f13113h);
                }
            } catch (PendingIntent.CanceledException e) {
                View view = this.f13223c;
                if (view instanceof Checkable) {
                    view.setSelected(!((Checkable) view).isChecked());
                }
                Log.e("SliceActionView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo8688b(C4094a aVar, C4147c cVar, C4141as asVar, int i, C4123aa aaVar) {
        View view = this.f13223c;
        if (view != null) {
            removeView(view);
            this.f13223c = null;
        }
        ProgressBar progressBar = this.f13227g;
        if (progressBar != null) {
            removeView(progressBar);
            this.f13227g = null;
        }
        this.f13222b = aVar;
        this.f13224d = cVar;
        this.f13225e = asVar;
        this.f13223c = null;
        this.f13226f = aaVar;
        int i2 = 0;
        if (aVar.f13115j == 2 && aVar.f13107b == null) {
            Switch switchR = (Switch) LayoutInflater.from(getContext()).inflate(R.layout.abc_slice_switch, this, false);
            switchR.setChecked(aVar.f13111f);
            switchR.setOnCheckedChangeListener(this);
            switchR.setMinimumHeight(this.f13229i);
            switchR.setMinimumWidth(this.f13229i);
            addView(switchR);
            if (i != -1) {
                int a = C4144av.m11881a(getContext(), 16842800);
                int[] iArr = f13221a;
                ColorStateList colorStateList = new ColorStateList(new int[][]{iArr, EMPTY_STATE_SET}, new int[]{i, a});
                Drawable trackDrawable = switchR.getTrackDrawable();
                C1929b.m5226g(trackDrawable, colorStateList);
                switchR.setTrackDrawable(trackDrawable);
                int a2 = C4144av.m11881a(getContext(), R.attr.colorSwitchThumbNormal);
                if (a2 == 0) {
                    a2 = C1878d.m5128a(getContext(), R.color.switch_thumb_normal_material_light);
                }
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, EMPTY_STATE_SET}, new int[]{i, a2});
                Drawable thumbDrawable = switchR.getThumbDrawable();
                C1929b.m5226g(thumbDrawable, colorStateList2);
                switchR.setThumbDrawable(thumbDrawable);
            }
            this.f13223c = switchR;
        } else if (aVar.f13108c == 6) {
            Button button = new Button(getContext());
            this.f13223c = button;
            Button button2 = button;
            button.setText(aVar.f13109d);
            addView(this.f13223c);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13223c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f13223c.setLayoutParams(layoutParams);
            int i3 = this.f13230j;
            this.f13223c.setPadding(i3, i3, i3, i3);
            this.f13223c.setOnClickListener(this);
        } else if (aVar.f13107b != null) {
            if (aVar.mo8607d()) {
                C4170z zVar = new C4170z(getContext());
                zVar.setChecked(aVar.f13111f);
                this.f13223c = zVar;
            } else {
                this.f13223c = new ImageView(getContext());
            }
            addView(this.f13223c);
            Drawable d = this.f13222b.f13107b.mo5075d(getContext());
            ((ImageView) this.f13223c).setImageDrawable(d);
            if (!(i == -1 || this.f13222b.f13108c != 0 || d == null)) {
                C1929b.m5225f(d, i);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f13223c.getLayoutParams();
            layoutParams2.width = this.f13229i;
            layoutParams2.height = this.f13229i;
            this.f13223c.setLayoutParams(layoutParams2);
            if (aVar.f13108c == 0) {
                int i4 = this.f13229i;
                if (i4 == -1) {
                    i2 = this.f13228h / 2;
                } else {
                    i2 = (i4 - this.f13228h) / 2;
                }
            }
            this.f13223c.setPadding(i2, i2, i2, i2);
            this.f13223c.setBackground(C4144av.m11883c(getContext(), 16843868));
            this.f13223c.setOnClickListener(this);
        }
        View view2 = this.f13223c;
        if (view2 != null) {
            CharSequence charSequence = aVar.f13110e;
            if (charSequence == null) {
                charSequence = aVar.f13109d;
            }
            view2.setContentDescription(charSequence);
        }
    }

    /* renamed from: c */
    public final void mo8689c() {
        if (this.f13227g == null) {
            ProgressBar progressBar = (ProgressBar) LayoutInflater.from(getContext()).inflate(R.layout.abc_slice_progress_view, this, false);
            this.f13227g = progressBar;
            addView(progressBar);
        }
        C4144av.m11885e(getContext(), this.f13227g);
        this.f13223c.setVisibility(8);
        this.f13227g.setVisibility(0);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.f13222b != null && this.f13223c != null) {
            mo8687a();
        }
    }

    public final void onClick(View view) {
        if (this.f13222b != null && this.f13223c != null) {
            mo8687a();
        }
    }
}

package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80786fg;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4985f.p5042u.C65342d;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.LegacyChipView */
/* compiled from: PG */
public class LegacyChipView extends C81705k {

    /* renamed from: c */
    private static final C59071e f223381c = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.LegacyChipView");

    /* renamed from: d */
    private LinearLayout f223382d;

    /* renamed from: e */
    private ImageView f223383e;

    /* renamed from: f */
    private TextView f223384f;

    /* renamed from: g */
    private final int f223385g;

    /* renamed from: h */
    private final int f223386h;

    public LegacyChipView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final void mo75229b(C80784fe feVar, C81674a aVar, C81698d dVar, C81688an anVar) {
        boolean z;
        if (this.f223383e != null && this.f223384f != null && this.f223382d != null) {
            String f = feVar.mo74609f();
            boolean z2 = !TextUtils.isEmpty(f);
            ImageView imageView = this.f223383e;
            C80786fg b = feVar.mo74604b();
            int i = 0;
            if (b == null) {
                z = false;
            } else {
                int b2 = b.mo74401b();
                int i2 = b2 - 1;
                if (b2 == 0) {
                    throw null;
                } else if (i2 == 0) {
                    z = ((Boolean) this.f223452b.map(new C81701g(b, imageView)).orElse(false)).booleanValue();
                } else if (i2 == 1) {
                    z = ((Boolean) this.f223452b.map(new C81699e(b, imageView)).orElse(false)).booleanValue();
                } else if (i2 == 2) {
                    z = ((Boolean) this.f223452b.map(new C81700f(b, imageView)).orElse(false)).booleanValue();
                } else {
                    throw new AssertionError();
                }
            }
            int h = feVar.mo74611h();
            int i3 = h - 1;
            if (h != 0) {
                if (i3 == 0) {
                    TextView textView = this.f223384f;
                    textView.getClass();
                    textView.setTextColor(this.f223386h);
                } else if (i3 == 1) {
                    TextView textView2 = this.f223384f;
                    textView2.getClass();
                    textView2.setTextColor(this.f223385g);
                }
                if (z || z2) {
                    this.f223383e.setVisibility(true != z ? 8 : 0);
                    this.f223384f.setText(f);
                    TextView textView3 = this.f223384f;
                    if (true != z2) {
                        i = 8;
                    }
                    textView3.setVisibility(i);
                    if (C80831aj.f221751c.equals(feVar.mo74605c())) {
                        ((C59052c) ((C59052c) f223381c.mo56226d()).mo56372aa(6216)).mo56386p("No tap action provided; ignoring chip");
                        return;
                    }
                    if (!feVar.mo74606d().equals(C65342d.f176699e)) {
                        setOnLongClickListener(new C81686al(dVar, feVar));
                    } else {
                        ((C59052c) ((C59052c) f223381c.mo56224b()).mo56372aa(6215)).mo56386p("No long press handler provided.");
                        setOnLongClickListener((View.OnLongClickListener) null);
                    }
                    setOnClickListener(new C81687am(this, aVar, feVar, anVar));
                    return;
                }
                ((C59052c) ((C59052c) f223381c.mo56226d()).mo56372aa(6217)).mo56386p("Neither icon nor label provided; ignoring chip");
                return;
            }
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.nga_chip_background);
        linearLayout.getClass();
        this.f223382d = linearLayout;
        ImageView imageView = (ImageView) findViewById(R.id.nga_chip_icon);
        imageView.getClass();
        this.f223383e = imageView;
        TextView textView = (TextView) findViewById(R.id.nga_chip_label);
        textView.getClass();
        this.f223384f = textView;
    }

    public LegacyChipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyChipView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public LegacyChipView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f223385g = C19391a.m36980a(context, R.attr.colorPrimary);
        this.f223386h = C19391a.m36980a(context, R.attr.colorOnSurface);
    }
}

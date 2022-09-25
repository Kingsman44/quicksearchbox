package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.constraint.C0129a;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent */
/* compiled from: PG */
public class ImageComponent extends ConstraintLayout {

    /* renamed from: g */
    private static final C59071e f36856g = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent");

    /* renamed from: d */
    public boolean f36857d;

    /* renamed from: e */
    public boolean f36858e;

    /* renamed from: f */
    public ImageView f36859f;

    /* renamed from: h */
    private int f36860h = 4;

    /* renamed from: i */
    private int f36861i;

    /* renamed from: j */
    private C11335b f36862j;

    /* renamed from: k */
    private ImageView f36863k;

    public ImageComponent(Context context) {
        super(context);
        m26960e(context, (AttributeSet) null, 0);
    }

    /* renamed from: e */
    private final void m26960e(Context context, AttributeSet attributeSet, int i) {
        LayoutInflater.from(getContext()).inflate(R.layout.image_component_contents, this);
        this.f36859f = (ImageView) findViewById(R.id.mainImage);
        this.f36863k = (ImageView) findViewById(R.id.badgeImage);
        this.f36861i = getVisibility();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C11338e.f36880a, i, 0);
            try {
                this.f36857d = obtainStyledAttributes.getBoolean(0, false);
                int i2 = obtainStyledAttributes.getInt(1, 4);
                if (!(i2 == 0 || i2 == 8)) {
                    if (i2 != 4) {
                        ((C59052c) ((C59052c) f36856g.mo56226d()).mo56372aa(43179)).mo56387q("asked to set empty visibility to unknown value %d", i2);
                        this.f36858e = obtainStyledAttributes.getBoolean(2, false);
                    }
                }
                this.f36860h = i2;
                this.f36858e = obtainStyledAttributes.getBoolean(2, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f36862j = new C11335b();
    }

    /* renamed from: b */
    public final void mo19786b(C51012dc dcVar, Drawable drawable) {
        int i;
        this.f36859f.setImageResource(17170445);
        this.f36863k.setImageResource(17170445);
        C6007z a = this.f36862j.mo19806a(getContext(), dcVar, this.f36858e, drawable);
        if (this.f36857d) {
            this.f36862j.mo19807b(a, getContext(), 1);
        }
        boolean z = this.f36862j.f36874a;
        a.mo12454r(this.f36859f);
        if (z) {
            i = this.f36860h;
        } else {
            i = this.f36861i;
        }
        super.setVisibility(i);
        if ((dcVar.f132815a & 64) != 0) {
            setContentDescription(dcVar.f132822h);
            setImportantForAccessibility(0);
        } else {
            setContentDescription((CharSequence) null);
            setImportantForAccessibility(2);
        }
        if ((dcVar.f132815a & 1024) != 0) {
            C51012dc dcVar2 = dcVar.f132823i;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            C6007z a2 = this.f36862j.mo19806a(getContext(), dcVar2, true, (Drawable) null);
            this.f36862j.mo19807b(a2, getContext(), 2);
            a2.mo12454r(this.f36863k);
            this.f36863k.setVisibility(0);
            float applyDimension = TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
            C0129a aVar = (C0129a) this.f36859f.getLayoutParams();
            aVar.bottomMargin = Math.round(applyDimension);
            aVar.rightMargin = Math.round(applyDimension);
            this.f36859f.setLayoutParams(aVar);
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo19787c(String str) {
        try {
            this.f36859f.setImageDrawable(getContext().getPackageManager().getApplicationIcon(str));
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f36856g.mo56225c()).mo56382g(e)).mo56372aa(43180)).mo56389s("Invalid package name: %s", str);
        }
    }

    @Deprecated
    /* renamed from: d */
    public final void mo19788d(String str, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 3) {
                long parseLong = Long.parseLong(str);
                Context context = getContext();
                C6007z h = C5543d.m14323c(context).mo12423b(context).mo11870h(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, parseLong));
                if (this.f36857d) {
                    h = h.mo11982o(C5593j.m14518b());
                }
                h.mo12454r(this.f36859f);
            }
        } else if (this.f36857d) {
            Context context2 = getContext();
            C5543d.m14323c(context2).mo12423b(context2).mo11873k(str).mo11982o(C5593j.m14518b()).mo12454r(this.f36859f);
        } else {
            Context context3 = getContext();
            C5543d.m14323c(context3).mo12423b(context3).mo11873k(str).mo12454r(this.f36859f);
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.f36861i = i;
    }

    public ImageComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26960e(context, attributeSet, 0);
    }

    public ImageComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26960e(context, attributeSet, i);
    }
}

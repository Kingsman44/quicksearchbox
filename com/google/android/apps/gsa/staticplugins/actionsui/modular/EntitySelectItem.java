package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.actionsui.C93434aa;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55177is;
import com.google.p4152bb.p4153a.C55179iu;

/* compiled from: PG */
public class EntitySelectItem extends C93566bq implements C93434aa {

    /* renamed from: a */
    View f261025a;

    /* renamed from: b */
    View f261026b;

    /* renamed from: c */
    private final boolean f261027c;

    /* renamed from: d */
    private EntityArgument.Entity f261028d;

    /* renamed from: e */
    private TextView f261029e;

    /* renamed from: f */
    private TextView f261030f;

    /* renamed from: w */
    private WebImageView f261031w;

    /* renamed from: x */
    private C91189au f261032x;

    /* renamed from: y */
    private C88511e f261033y;

    public EntitySelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C93607dd.f261335a);
        this.f261027c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: v */
    private static final void m154087v(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo87734a() {
        return this.f261028d;
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
    }

    /* renamed from: f */
    public final void mo87732f() {
        super.mo87732f();
        EntityArgument entityArgument = (EntityArgument) this.f261447m;
        if (entityArgument.mo81263C() && ((Disambiguation) entityArgument.f236203n).mo81543l()) {
            Parcelable parcelable = ((Disambiguation) entityArgument.f236203n).f236364c;
            parcelable.getClass();
            mo87872k((EntityArgument.Entity) parcelable, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final View[] mo87741j() {
        return new View[]{this.f261029e, this.f261030f, this.f261031w, this.f261026b};
    }

    /* renamed from: k */
    public final void mo87872k(EntityArgument.Entity entity, boolean z) {
        Drawable c;
        this.f261028d = entity;
        int i = 8;
        if (entity != null) {
            m154087v(this.f261029e, entity.f236170b);
            m154087v(this.f261030f, entity.f236172d);
            if (this.f261031w != null) {
                C58838bb.m90884s((this.f261033y == null || this.f261032x == null) ? false : true, "#setImageLoaders should be called before #setEntityWebImageView.");
                Bitmap bitmap = entity.f236174f;
                if (bitmap != null) {
                    this.f261031w.setImageBitmap(bitmap);
                } else {
                    int i2 = entity.f236181m;
                    if (i2 == 0 || (c = this.f261033y.mo82073c(i2, getContext())) == null) {
                        String str = entity.f236173e;
                        if (!TextUtils.isEmpty(str)) {
                            this.f261031w.mo76737h(Uri.parse(str), this.f261032x);
                        } else if (!this.f261027c) {
                            this.f261031w.setVisibility(8);
                        }
                    } else {
                        this.f261031w.setImageDrawable(c);
                    }
                }
            }
            View view = this.f261025a;
            if (view != null) {
                view.setVisibility((!TextUtils.isEmpty(entity.f236170b) || !TextUtils.isEmpty(entity.f236172d)) ? 0 : 8);
            }
            View view2 = this.f261026b;
            if (view2 != null) {
                if (true != z) {
                    i = 0;
                }
                view2.setVisibility(i);
                return;
            }
            return;
        }
        m154318B(8, mo87741j());
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f261029e = (TextView) findViewById(R.id.argument_value);
        this.f261030f = (TextView) findViewById(R.id.argument_secondary_value);
        this.f261031w = (WebImageView) findViewById(R.id.image);
        this.f261025a = findViewById(R.id.text_container);
        this.f261026b = findViewById(R.id.entity_disambiguation_margin);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        TextView textView = (TextView) findViewById(R.id.title);
        if (textView != null) {
            textView.setTextColor(getResources().getColorStateList(R.color.card_link_text));
            textView.setTypeface(Typeface.create("sans-serif-condensed", 2));
        }
    }

    /* renamed from: b */
    public static EntitySelectItem m154086b(EntityArgument.Entity entity, LayoutInflater layoutInflater, ViewGroup viewGroup, C91189au auVar, C88511e eVar, C55177is isVar, boolean z, int i) {
        int i2;
        if (i == 2) {
            i2 = R.layout.immersive_actions_entity_argument_select_item;
            if (isVar != null) {
                int a = C55179iu.m87617a(isVar.f145258b);
                if (a == 0) {
                    a = 1;
                }
                int i3 = a - 1;
                if (i3 == 1) {
                    i2 = R.layout.immersive_actions_entity_argument_select_item_large_portrait_image;
                } else if (i3 == 2) {
                    i2 = R.layout.immersive_actions_entity_argument_select_item_large_landscape_image;
                } else if (i3 == 3) {
                    i2 = R.layout.immersive_actions_entity_argument_select_item_medium_portrait_image;
                }
            }
        } else {
            i2 = R.layout.entity_argument_select_item;
            if (isVar != null) {
                int a2 = C55179iu.m87617a(isVar.f145258b);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i4 = a2 - 1;
                if (i4 == 1) {
                    i2 = R.layout.entity_argument_select_item_large_portrait_image;
                } else if (i4 == 2) {
                    i2 = R.layout.entity_argument_select_item_large_landscape_image;
                } else if (i4 == 3) {
                    i2 = R.layout.entity_argument_select_item_medium_portrait_image;
                }
            }
        }
        EntitySelectItem entitySelectItem = (EntitySelectItem) layoutInflater.inflate(i2, viewGroup, false);
        auVar.getClass();
        entitySelectItem.f261032x = auVar;
        eVar.getClass();
        entitySelectItem.f261033y = eVar;
        entitySelectItem.mo87872k(entity, z);
        return entitySelectItem;
    }
}

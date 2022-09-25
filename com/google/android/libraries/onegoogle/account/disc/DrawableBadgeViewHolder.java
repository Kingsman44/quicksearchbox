package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1928a;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.onegoogle.common.C30905ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30891t;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30894w;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30895x;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.ail;
import com.google.common.p4552o.aim;
import com.google.common.p4552o.aiq;
import com.google.common.p4552o.air;
import com.google.protobuf.C62940bt;

/* compiled from: PG */
final class DrawableBadgeViewHolder {

    /* renamed from: a */
    public final ImageView f81583a;

    /* renamed from: b */
    public final BadgeFrameLayout f81584b;

    /* renamed from: c */
    public final AvatarView f81585c;

    /* renamed from: d */
    public C30897z f81586d;

    /* renamed from: e */
    public C30226z f81587e;

    /* renamed from: f */
    public Animator f81588f = null;

    /* renamed from: g */
    public C28353e f81589g;

    /* compiled from: PG */
    class AlphaLayerDrawable extends LayerDrawable implements Drawable.Callback {

        /* renamed from: a */
        private final Drawable f81590a;

        /* renamed from: b */
        private final Drawable f81591b;

        public AlphaLayerDrawable(Drawable drawable, Drawable drawable2) {
            super(new Drawable[]{drawable, drawable2});
            this.f81590a = drawable;
            this.f81591b = drawable2;
            drawable2.setCallback(this);
        }

        public int getAlpha() {
            return C1928a.m5215a(this.f81591b);
        }

        public final int getOpacity() {
            return this.f81590a.getOpacity();
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            scheduleSelf(runnable, j);
        }

        public void setAlpha(int i) {
            this.f81591b.setAlpha(i);
            this.f81591b.invalidateSelf();
        }

        public final void setColorFilter(ColorFilter colorFilter) {
            this.f81590a.setColorFilter(colorFilter);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: finally extract failed */
    public DrawableBadgeViewHolder(BadgeFrameLayout badgeFrameLayout, ImageView imageView, int i, AvatarView avatarView) {
        int i2;
        this.f81584b = badgeFrameLayout;
        this.f81583a = imageView;
        this.f81585c = avatarView;
        TypedArray obtainStyledAttributes = badgeFrameLayout.getContext().obtainStyledAttributes((AttributeSet) null, C30191as.f81634a, R.attr.ogAccountParticleDiscStyle, 2132149635);
        try {
            LayerDrawable layerDrawable = (LayerDrawable) imageView.getResources().getDrawable(R.drawable.og_disc_badge_background);
            m56097c(layerDrawable, obtainStyledAttributes.getColor(9, imageView.getResources().getColor(R.color.google_white)), R.id.badge_background);
            m56097c(layerDrawable, obtainStyledAttributes.getColor(3, imageView.getResources().getColor(R.color.google_grey300)), R.id.badge_legacy_shadow);
            C2043bi.m5530X(imageView, layerDrawable);
            obtainStyledAttributes.recycle();
            Resources resources = imageView.getResources();
            if (i > resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_medium_badge)) {
                i2 = resources.getDimensionPixelSize(R.dimen.og_apd_large_badge_size);
            } else if (i > resources.getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_badge)) {
                i2 = resources.getDimensionPixelSize(R.dimen.og_apd_medium_badge_size);
            } else {
                i2 = resources.getDimensionPixelSize(R.dimen.og_apd_small_badge_size);
            }
            C58838bb.m90866a(imageView.getLayoutParams(), "LayoutParams must be set before calling updateBadgeViewForAvatarSize");
            imageView.getLayoutParams().height = i2;
            imageView.getLayoutParams().width = i2;
            avatarView.f81573c = badgeFrameLayout;
            avatarView.f81574d = i2;
            avatarView.mo35603c();
            avatarView.mo35602b();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public static Drawable m56096a(C30226z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar.mo35668a();
    }

    /* renamed from: c */
    private static void m56097c(LayerDrawable layerDrawable, int i, int i2) {
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(i2);
        if (findDrawableByLayerId != null) {
            C30905ae.m57696b(findDrawableByLayerId, i);
            layerDrawable.setDrawableByLayerId(i2, findDrawableByLayerId);
        }
    }

    /* renamed from: b */
    public final void mo35609b(C30226z zVar) {
        C28353e eVar;
        int i;
        if (zVar != null) {
            C30173aa b = zVar.mo35669b();
            C30173aa aaVar = C30173aa.APP_CUSTOM;
            switch (b.ordinal()) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 5;
                    break;
                case 2:
                    i = 6;
                    break;
                case 3:
                    i = 9;
                    break;
                case 4:
                    i = 10;
                    break;
                case 5:
                    i = 11;
                    break;
                case 6:
                    i = 12;
                    break;
                case 7:
                    i = 7;
                    break;
                default:
                    i = 1;
                    break;
            }
            C62940bt btVar = C30891t.f83295a;
            C30894w wVar = (C30894w) C30895x.f83301c.createBuilder();
            aiq aiq = (aiq) air.f158830f.createBuilder();
            ail ail = (ail) aim.f158821c.createBuilder();
            ail.copyOnWrite();
            aim aim = (aim) ail.instance;
            aim.f158824b = i - 1;
            aim.f158823a |= 1;
            aim aim2 = (aim) ail.build();
            aiq.copyOnWrite();
            air air = (air) aiq.instance;
            aim2.getClass();
            air.f158834b = aim2;
            air.f158833a |= 2;
            air air2 = (air) aiq.build();
            wVar.copyOnWrite();
            C30895x xVar = (C30895x) wVar.instance;
            air2.getClass();
            xVar.f83304b = air2;
            xVar.f83303a |= 1;
            eVar = new C28353e(btVar, (C30895x) wVar.build());
        } else {
            eVar = null;
        }
        this.f81589g = eVar;
        C30897z zVar2 = this.f81586d;
        if (zVar2 != null) {
            this.f81584b.mo35632lk(zVar2);
            C28353e eVar2 = this.f81589g;
            if (eVar2 != null) {
                this.f81584b.mo35631c(this.f81586d, eVar2);
            } else {
                this.f81584b.mo35630b(this.f81586d);
            }
        }
    }
}

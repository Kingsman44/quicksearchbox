package com.google.android.libraries.elements.p1728g;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Pair;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1928a;
import com.bumptech.glide.p287f.p288a.C5566h;
import com.bumptech.glide.p287f.p288a.C5571m;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.facebook.litho.C6276fs;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21265bh;
import com.google.android.libraries.elements.interfaces.C21266bi;
import com.google.android.libraries.elements.interfaces.C21267bj;
import com.google.android.libraries.elements.interfaces.C21268bk;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.ContentMode;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.internal.C21320a;
import com.google.android.libraries.elements.internal.C21322ab;
import com.google.android.libraries.elements.internal.C21341b;
import com.google.android.libraries.elements.p1705a.p1706a.C20682f;
import com.google.android.libraries.elements.p1707b.C20696c;
import com.google.android.libraries.elements.p1714d.p1717c.C20848e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68088j;

/* renamed from: com.google.android.libraries.elements.g.s */
/* compiled from: PG */
final class C21191s extends C5566h {

    /* renamed from: c */
    private final C6276fs f59446c;

    /* renamed from: d */
    private final ImageProxy f59447d;

    /* renamed from: e */
    private final C21266bi f59448e;

    /* renamed from: f */
    private final C21265bh f59449f;

    /* renamed from: g */
    private final ImageProxy f59450g;

    /* renamed from: h */
    private final ImageProxy f59451h;

    /* renamed from: i */
    private final C21341b f59452i;

    /* renamed from: j */
    private final C21259bb f59453j;

    /* renamed from: k */
    private boolean f59454k = false;

    /* renamed from: l */
    private final C20848e f59455l;

    public C21191s(C6276fs fsVar, ImageView imageView, ImageProxy imageProxy, C21266bi biVar, C21265bh bhVar, ImageProxy imageProxy2, ImageProxy imageProxy3, C21341b bVar, C21259bb bbVar, C20848e eVar) {
        super(imageView);
        this.f59446c = fsVar;
        this.f59447d = imageProxy;
        this.f59448e = biVar;
        this.f59449f = bhVar;
        this.f59450g = imageProxy2;
        this.f59451h = imageProxy3;
        this.f59452i = bVar;
        this.f59453j = bbVar;
        this.f59455l = eVar;
    }

    /* renamed from: n */
    private final Drawable m39807n(Drawable drawable, ImageProxy imageProxy) {
        C20848e eVar;
        Drawable b;
        if (drawable instanceof BitmapDrawable) {
            C68044ag h = ((C20682f) imageProxy).f57965a.mo60123h();
            ContentMode contentMode = imageProxy.contentMode();
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            ImageView.ScaleType b2 = C21195w.m39829b(contentMode);
            if (b2 == ImageView.ScaleType.CENTER_INSIDE) {
                b2 = ImageView.ScaleType.FIT_CENTER;
            }
            Drawable drawable2 = null;
            if (!(h == null || (eVar = this.f59455l) == null)) {
                if (h.mo60107j() == 1) {
                    C21268bk bkVar = (C21268bk) eVar.f58427a.get(Integer.valueOf(h.mo60106i()));
                    if (bkVar == null) {
                        C21259bb bbVar = eVar.f58429c;
                        C66260r rVar = C66260r.LOG_TYPE_UNKNOWN_EXTENSION;
                        int i = h.mo60106i();
                        bbVar.mo25782a(rVar, "Unknown Flatbuffer extension in ImageProcessorExtensionResolverExtension id: " + i, C21319z.f59680u, (Throwable) null);
                    } else {
                        b = bkVar.mo25960b(bkVar.mo25961c(h.mo16918f(6)), bitmap, b2);
                    }
                } else if (h.mo60107j() == 2) {
                    Pair pair = (Pair) eVar.f58428b.get(Integer.valueOf(h.mo60106i()));
                    if (pair == null) {
                        C21259bb bbVar2 = eVar.f58429c;
                        C66260r rVar2 = C66260r.LOG_TYPE_UNKNOWN_EXTENSION;
                        int i2 = h.mo60106i();
                        bbVar2.mo25782a(rVar2, "ImageProcessorExtensionResolver: Unknown PB image processor extension: " + i2, C21319z.f59680u, (Throwable) null);
                    } else {
                        try {
                            C21322ab.m40329a(h.mo16918f(6), (C63010eb) pair.second, C62921ba.m95368a());
                            b = ((C21267bj) pair.first).mo26759b();
                        } catch (C62974ct e) {
                            C21259bb bbVar3 = eVar.f58429c;
                            C66260r rVar3 = C66260r.LOG_TYPE_UNKNOWN_EXTENSION;
                            int i3 = h.mo60106i();
                            bbVar3.mo25782a(rVar3, "Failed to parse PB Image Processor Extension in ImageProcessorExtensionResolver. Extension id: " + i3, C21319z.f59680u, e);
                        }
                    }
                } else {
                    C21259bb bbVar4 = eVar.f58429c;
                    C66260r rVar4 = C66260r.LOG_TYPE_UNKNOWN_EXTENSION;
                    int i4 = h.mo60106i();
                    bbVar4.mo25782a(rVar4, "ImageProcessorExtensionResolver: extension with unknown format: " + i4, C21319z.f59680u, (Throwable) null);
                }
                drawable2 = b;
            }
            drawable = drawable2 == null ? new C20696c(bitmap, b2, this.f59453j) : drawable2;
        } else if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            C68088j b3 = C21193u.m39819b(imageProxy);
            if (b3 != null) {
                frameSequenceDrawable.setCornerRadius((int) TypedValue.applyDimension(1, b3.mo60232g(), ((ImageView) this.f16861a).getContext().getResources().getDisplayMetrics()));
            }
        }
        if (!(drawable instanceof C20696c)) {
            ((ImageView) this.f16861a).setScaleType(C21195w.m39829b(imageProxy.contentMode()));
        }
        C1928a.m5218d(drawable, imageProxy.flipForRtlLayout());
        C21195w.m39832e(drawable, imageProxy);
        return drawable;
    }

    /* renamed from: o */
    private final void m39808o() {
        this.f59454k = true;
        C21265bh bhVar = this.f59449f;
        if (bhVar != null) {
            bhVar.mo26750c();
        }
        C21266bi biVar = this.f59448e;
        if (biVar != null) {
            biVar.mo26755d(this.f16861a.hashCode());
        }
    }

    /* renamed from: s */
    private static void m39809s(AnimatedImageDrawable animatedImageDrawable) {
        animatedImageDrawable.setRepeatCount(-1);
        animatedImageDrawable.start();
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        ImageProxy imageProxy;
        if (!this.f59454k) {
            m39808o();
        }
        C21265bh bhVar = this.f59449f;
        if (bhVar != null) {
            bhVar.mo26748a();
        }
        C21266bi biVar = this.f59448e;
        if (biVar != null) {
            biVar.mo26752a(this.f16861a.hashCode());
        }
        if (!(drawable == null || (imageProxy = this.f59451h) == null)) {
            drawable = m39807n(drawable, imageProxy);
            if (drawable instanceof AnimatedImageDrawable) {
                m39809s((AnimatedImageDrawable) drawable);
            }
        }
        ((ImageView) this.f16861a).setImageDrawable((Drawable) null);
        super.mo12003k((Object) null);
        ((ImageView) this.f16861a).setImageDrawable(drawable);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        Drawable drawable = (Drawable) obj;
        if (!this.f59454k) {
            m39808o();
        }
        C21265bh bhVar = this.f59449f;
        if (bhVar != null) {
            bhVar.mo26751d();
        }
        C21266bi biVar = this.f59448e;
        if (biVar != null) {
            biVar.mo26756e(this.f16861a.hashCode());
        }
        ImageProxy imageProxy = this.f59447d;
        if (imageProxy != null) {
            drawable = m39807n(drawable, imageProxy);
        }
        super.mo11861c(drawable, fVar);
        C21341b bVar = this.f59452i;
        if (bVar != null && (drawable instanceof FrameSequenceDrawable)) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            bVar.f59708c = frameSequenceDrawable;
            frameSequenceDrawable.setLoopBehavior(1);
            frameSequenceDrawable.setLoopCount(1);
            frameSequenceDrawable.setOnFinishedListener(new C21320a(bVar));
            C21341b bVar2 = this.f59452i;
            FrameSequenceDrawable frameSequenceDrawable2 = bVar2.f59708c;
            if (frameSequenceDrawable2 != null) {
                frameSequenceDrawable2.start();
                CommandOuterClass$Command commandOuterClass$Command = bVar2.f59707b;
                if (commandOuterClass$Command != null) {
                    bVar2.f59709d.mo26124a(commandOuterClass$Command, (C21311r) null).mo61453k();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11995e(C5571m mVar) {
        C6276fs fsVar = this.f59446c;
        mVar.mo12006g(fsVar.f18535a, fsVar.f18536b);
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
        ImageProxy imageProxy;
        m39808o();
        if (!(drawable == null || (imageProxy = this.f59450g) == null)) {
            drawable = m39807n(drawable, imageProxy);
            if (drawable instanceof AnimatedImageDrawable) {
                m39809s((AnimatedImageDrawable) drawable);
            }
        }
        ((ImageView) this.f16861a).setImageDrawable((Drawable) null);
        super.mo12003k((Object) null);
        ((ImageView) this.f16861a).setImageDrawable(drawable);
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        ImageProxy imageProxy;
        C21265bh bhVar = this.f59449f;
        if (bhVar != null) {
            bhVar.mo26749b();
        }
        C21266bi biVar = this.f59448e;
        if (biVar != null) {
            biVar.mo26754c(this.f16861a.hashCode());
        }
        if (!(drawable == null || (imageProxy = this.f59450g) == null)) {
            drawable = m39807n(drawable, imageProxy);
        }
        super.mo11992fB(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final /* synthetic */ void mo11994i(Object obj) {
        ((ImageView) this.f16861a).setImageDrawable((Drawable) obj);
    }
}

package com.google.android.libraries.lens.view.gleam;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.Size;
import androidx.core.graphics.C1924a;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.common.text.C24128d;
import com.google.android.libraries.lens.common.text.C24135k;
import com.google.android.libraries.lens.common.text.C24137m;
import com.google.android.libraries.lens.common.text.p2004a.p2005a.C24117a;
import com.google.android.libraries.lens.common.text.p2004a.p2005a.C24118b;
import com.google.android.libraries.lens.common.text.p2004a.p2005a.C24119c;
import com.google.android.libraries.lens.common.text.p2004a.p2005a.C24122f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4575r.C60752i;
import com.google.common.p4575r.C60757n;
import com.google.lens.p4699e.C62218bd;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4707j.C62441br;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.lens.view.gleam.bp */
/* compiled from: PG */
final class C26484bp extends C26595fo {

    /* renamed from: a */
    public final C62219be f72142a;

    /* renamed from: b */
    final /* synthetic */ C26491bw f72143b;

    /* renamed from: c */
    private final C24122f f72144c;

    /* renamed from: d */
    private final C26595fo f72145d;

    /* renamed from: e */
    private final C58528ij f72146e = C58476gl.m89803b(EnumSet.of(C26493by.TRANSLATION_INPAINTING_BOX_LAYER, new C26493by[]{C26493by.TRANSLATION_TEXT_LAYER}));

    public C26484bp(C26491bw bwVar, C62219be beVar, C24137m mVar, Size size, C26595fo foVar) {
        this.f72143b = bwVar;
        this.f72142a = beVar;
        C24117a aVar = new C24117a();
        aVar.mo29526d(0.0f);
        aVar.mo29527e(0.0f);
        aVar.mo29525c(0.0f);
        aVar.mo29524b(0.0f);
        aVar.mo29523a(0.0f);
        aVar.mo29526d((float) bwVar.f72166g.f72498c);
        aVar.mo29527e((float) bwVar.f72166g.f72499d);
        aVar.mo29525c((float) bwVar.f72166g.f72497b);
        aVar.mo29524b(bwVar.f72168u);
        aVar.mo29523a(bwVar.f72169v);
        if (aVar.f65850f != 31) {
            StringBuilder sb = new StringBuilder();
            if ((aVar.f65850f & 1) == 0) {
                sb.append(" highlightHorizontalMargin");
            }
            if ((aVar.f65850f & 2) == 0) {
                sb.append(" highlightVerticalMargin");
            }
            if ((aVar.f65850f & 4) == 0) {
                sb.append(" cornerRadius");
            }
            if ((aVar.f65850f & 8) == 0) {
                sb.append(" backgroundUnderlayMinFontSizePx");
            }
            if ((aVar.f65850f & 16) == 0) {
                sb.append(" backgroundUnderlayMaxFontSizePx");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        this.f72144c = new C24122f(mVar, size, new C24119c(aVar.f65845a, aVar.f65846b, aVar.f65847c, aVar.f65848d, aVar.f65849e));
        this.f72145d = foVar;
    }

    /* renamed from: a */
    public final C58833ax mo31731a() {
        return C58833ax.m90834k(((C26475bg) this.f72145d).f72113a);
    }

    /* renamed from: c */
    public final void mo31733c(Canvas canvas, C26493by byVar) {
        int i;
        Xfermode xfermode;
        int i2;
        Canvas canvas2 = canvas;
        C26493by byVar2 = C26493by.SHADOW_LAYER;
        int ordinal = byVar.ordinal();
        if (ordinal == 1) {
            C24122f fVar = this.f72144c;
            float a = this.f72143b.f71997h.mo31819a();
            Iterator it = fVar.f65858a.f65900a.iterator();
            while (true) {
                int i3 = 0;
                if (!it.hasNext()) {
                    break;
                }
                C24135k kVar = (C24135k) it.next();
                canvas.save();
                C24128d dVar = kVar.f65897d;
                if (dVar == null) {
                    dVar = C24128d.f65875i;
                }
                C62218bd bdVar = dVar.f65879c;
                if (bdVar == null) {
                    bdVar = C62218bd.f167980e;
                }
                if (fVar.mo29539d(kVar)) {
                    i2 = bdVar.f167985d;
                } else {
                    i2 = (bdVar.f167982a & 2) != 0 ? bdVar.f167984c : -1;
                }
                C24128d dVar2 = kVar.f65897d;
                if (dVar2 == null) {
                    dVar2 = C24128d.f65875i;
                }
                if (dVar2.f65882f.mo59173M()) {
                    C24128d dVar3 = kVar.f65897d;
                    if (dVar3 == null) {
                        dVar3 = C24128d.f65875i;
                    }
                    C62441br brVar = dVar3.f65878b;
                    if (brVar == null) {
                        brVar = C62441br.f168608h;
                    }
                    fVar.mo29537a(canvas2, brVar, i2);
                } else {
                    C24128d dVar4 = kVar.f65897d;
                    if (dVar4 == null) {
                        dVar4 = C24128d.f65875i;
                    }
                    C62441br brVar2 = dVar4.f65878b;
                    if (brVar2 == null) {
                        brVar2 = C62441br.f168608h;
                    }
                    C24128d dVar5 = kVar.f65897d;
                    if (dVar5 == null) {
                        dVar5 = C24128d.f65875i;
                    }
                    byte[] N = dVar5.f65882f.mo59174N();
                    C24128d dVar6 = kVar.f65897d;
                    int i4 = (dVar6 == null ? C24128d.f65875i : dVar6).f65883g;
                    if (dVar6 == null) {
                        dVar6 = C24128d.f65875i;
                    }
                    int i5 = dVar6.f65884h;
                    if (i4 == 0 || i5 == 0 || N.length != i4 * i5 * 4) {
                        fVar.mo29537a(canvas2, brVar2, i2);
                    } else {
                        canvas.save();
                        Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                        while (true) {
                            int i6 = i3 + 3;
                            if (i6 >= N.length) {
                                break;
                            }
                            float f = ((float) (N[i6] & 255)) / 255.0f;
                            N[i3] = (byte) Math.min(PrivateKeyType.INVALID, (int) (((float) (N[i3] & 255)) * f));
                            int i7 = i3 + 1;
                            N[i7] = (byte) Math.min(PrivateKeyType.INVALID, (int) (((float) (N[i7] & 255)) * f));
                            int i8 = i3 + 2;
                            N[i8] = (byte) Math.min(PrivateKeyType.INVALID, (int) (((float) (N[i8] & 255)) * f));
                            i3 += 4;
                        }
                        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(N));
                        C62441br g = C24095c.m44762g(brVar2, fVar.f65865h);
                        canvas2.rotate((float) Math.toDegrees((double) g.f168615f), g.f168611b, g.f168612c);
                        RectF d = C24095c.m44759d(g);
                        C24118b bVar = (C24118b) fVar.f65866i;
                        C24122f.m44817c(d, bVar.f65851a, bVar.f65852b);
                        float f2 = ((C24118b) fVar.f65866i).f65853c;
                        fVar.f65864g.reset();
                        fVar.f65864g.addRoundRect(d, f2, f2, Path.Direction.CW);
                        canvas2.clipPath(fVar.f65864g);
                        canvas2.drawBitmap(createBitmap, (Rect) null, d, fVar.f65863f);
                        canvas.restore();
                    }
                }
            }
            for (C24135k kVar2 : fVar.f65858a.f65900a) {
                C24128d dVar7 = kVar2.f65897d;
                if (dVar7 == null) {
                    dVar7 = C24128d.f65875i;
                }
                C62218bd bdVar2 = dVar7.f65879c;
                if (bdVar2 == null) {
                    bdVar2 = C62218bd.f167980e;
                }
                C24128d dVar8 = kVar2.f65897d;
                if (dVar8 == null) {
                    dVar8 = C24128d.f65875i;
                }
                if (!dVar8.f65882f.mo59173M()) {
                    if (fVar.f65866i.mo29536f()) {
                        C24128d dVar9 = kVar2.f65897d;
                        C62218bd bdVar3 = (dVar9 == null ? C24128d.f65875i : dVar9).f65879c;
                        if (bdVar3 == null) {
                            bdVar3 = C62218bd.f167980e;
                        }
                        int i9 = bdVar3.f167984c;
                        C24118b bVar2 = (C24118b) fVar.f65866i;
                        float f3 = bVar2.f65854d / a;
                        float f4 = bVar2.f65855e / a;
                        if (dVar9 == null) {
                            dVar9 = C24128d.f65875i;
                        }
                        int c = 255 - C60757n.m92742c((int) (((dVar9.f65880d - f3) * 255.0f) / (f4 - f3)), 0, PrivateKeyType.INVALID);
                        if (c > 0) {
                            int i10 = (c << 24) | (i9 & 16777215);
                            C62441br brVar3 = kVar2.f65895b;
                            if (brVar3 == null) {
                                brVar3 = C62441br.f168608h;
                            }
                            fVar.mo29537a(canvas2, brVar3, i10);
                        }
                    }
                } else if (fVar.mo29539d(kVar2)) {
                    C62441br brVar4 = kVar2.f65895b;
                    if (brVar4 == null) {
                        brVar4 = C62441br.f168608h;
                    }
                    fVar.mo29537a(canvas2, brVar4, bdVar2.f167984c);
                }
            }
            for (C24135k kVar3 : fVar.f65858a.f65900a) {
                if (!kVar3.f65894a.isEmpty()) {
                    C24128d dVar10 = kVar3.f65897d;
                    if (dVar10 == null) {
                        dVar10 = C24128d.f65875i;
                    }
                    if (!dVar10.f65882f.mo59173M()) {
                        C24128d dVar11 = kVar3.f65897d;
                        if ((dVar11 == null ? C24128d.f65875i : dVar11).f65880d >= ((C24118b) fVar.f65866i).f65854d / a) {
                            if (dVar11 == null) {
                                dVar11 = C24128d.f65875i;
                            }
                            C62218bd bdVar4 = dVar11.f65879c;
                            if (bdVar4 == null) {
                                bdVar4 = C62218bd.f167980e;
                            }
                            int i11 = bdVar4.f167983b;
                            C62218bd bdVar5 = dVar11.f65879c;
                            if (((bdVar5 == null ? C62218bd.f167980e : bdVar5).f167982a & 2) != 0) {
                                if (bdVar5 == null) {
                                    bdVar5 = C62218bd.f167980e;
                                }
                                i = bdVar5.f167984c;
                            } else {
                                i = -1;
                            }
                            fVar.f65860c.setColor(i);
                            C24122f.m44819f(fVar.f65860c);
                            fVar.f65860c.setTextSize(dVar11.f65880d);
                            Paint paint = fVar.f65860c;
                            float f5 = dVar11.f65880d;
                            float f6 = f5 / 4.0f;
                            if (fVar.f65866i.mo29536f()) {
                                C24118b bVar3 = (C24118b) fVar.f65866i;
                                f6 = C60752i.m92727a(f6, bVar3.f65854d, bVar3.f65855e);
                            }
                            C24118b bVar4 = (C24118b) fVar.f65866i;
                            float f7 = bVar4.f65851a;
                            float f8 = bVar4.f65852b;
                            paint.setStrokeWidth(C60752i.m92729c(f6 / a, f5 / 5.0f, f7 + f7, f8 + f8));
                            fVar.f65860c.setTextAlign(C24122f.m44818e(fVar.f65867j));
                            Paint paint2 = fVar.f65860c;
                            if (C1924a.m5183b(i11) >= C1924a.m5183b(i)) {
                                xfermode = fVar.f65862e;
                            } else {
                                xfermode = fVar.f65861d;
                            }
                            paint2.setXfermode(xfermode);
                            fVar.mo29538b(canvas2, kVar3, fVar.f65860c);
                        }
                    }
                }
            }
            this.f72145d.mo31733c(canvas2, byVar);
        } else if (ordinal == 2) {
            C24122f fVar2 = this.f72144c;
            for (C24135k kVar4 : fVar2.f65858a.f65900a) {
                if (!kVar4.f65894a.isEmpty()) {
                    C24128d dVar12 = kVar4.f65897d;
                    if (dVar12 == null) {
                        dVar12 = C24128d.f65875i;
                    }
                    C62218bd bdVar6 = dVar12.f65879c;
                    if (bdVar6 == null) {
                        bdVar6 = C62218bd.f167980e;
                    }
                    if ((bdVar6.f167982a & 1) != 0) {
                        Paint paint3 = fVar2.f65859b;
                        C62218bd bdVar7 = dVar12.f65879c;
                        if (bdVar7 == null) {
                            bdVar7 = C62218bd.f167980e;
                        }
                        paint3.setColor(bdVar7.f167983b);
                    } else {
                        fVar2.f65859b.setColor(-16777216);
                    }
                    C24122f.m44819f(fVar2.f65859b);
                    fVar2.f65859b.setTextSize(dVar12.f65880d);
                    fVar2.f65859b.setTextAlign(C24122f.m44818e(fVar2.f65867j));
                    fVar2.mo29538b(canvas2, kVar4, fVar2.f65859b);
                }
            }
        }
    }

    /* renamed from: d */
    public final C58528ij mo31736d() {
        return this.f72146e;
    }
}

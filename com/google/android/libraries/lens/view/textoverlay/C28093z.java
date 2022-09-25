package com.google.android.libraries.lens.view.textoverlay;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24143a;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24144b;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;
import com.google.android.libraries.lens.common.text.selection.p2007b.C24150b;
import com.google.android.libraries.lens.common.text.selection.p2009ui.C24178s;
import com.google.android.libraries.lens.common.text.selection.p2009ui.TextSelectionView;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24158c;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24161f;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.p2014e.p2015a.C24197p;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.utils.C28109ak;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4707j.C62475cy;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.z */
/* compiled from: PG */
public final class C28093z {

    /* renamed from: a */
    public static final C58974d f76448a = C58974d.m91135i("TextOverlayFragment");

    /* renamed from: b */
    public final C28074g f76449b;

    /* renamed from: c */
    public final C28079l f76450c;

    /* renamed from: d */
    public final C28310af f76451d;

    /* renamed from: e */
    public final C28306ab f76452e;

    /* renamed from: f */
    public final Executor f76453f;

    /* renamed from: g */
    public final boolean f76454g;

    /* renamed from: h */
    final C25499ae f76455h;

    /* renamed from: i */
    public C24178s f76456i;

    /* renamed from: j */
    public C24150b f76457j = C24150b.f65938d;

    /* renamed from: k */
    public int f76458k;

    /* renamed from: l */
    public int f76459l;

    /* renamed from: m */
    public final SparseArray f76460m = new SparseArray();

    /* renamed from: n */
    public boolean f76461n;

    /* renamed from: o */
    public C28066aa f76462o;

    /* renamed from: p */
    public C28067ab f76463p;

    /* renamed from: q */
    public C24158c f76464q;

    /* renamed from: r */
    final C28091x f76465r = new C28091x(this);

    /* renamed from: s */
    private final C28092y f76466s = new C28092y(this);

    public C28093z(C28074g gVar, C28079l lVar, C28310af afVar, C28306ab abVar, Executor executor, C25499ae aeVar, boolean z) {
        this.f76449b = gVar;
        this.f76450c = lVar;
        this.f76451d = afVar;
        this.f76452e = abVar;
        this.f76453f = executor;
        this.f76455h = aeVar;
        this.f76454g = z;
    }

    /* renamed from: a */
    public static PointF m52364a(int i, int i2, View view) {
        Matrix matrix = new Matrix();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        matrix.setScale(view.getScaleX(), view.getScaleY());
        matrix.postTranslate((float) iArr[0], (float) iArr[1]);
        float[] fArr = {(float) i, (float) i2};
        matrix.mapPoints(fArr);
        return new PointF(fArr[0], fArr[1]);
    }

    /* renamed from: d */
    public static C28074g m52365d(AccountId accountId) {
        C28074g gVar = new C28074g();
        C68324h.m98669f(gVar);
        C47247a.m84047b(gVar, accountId);
        return gVar;
    }

    /* renamed from: b */
    public final C24146d mo33551b(int i) {
        return (C24146d) this.f76460m.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final TextSelectionView mo33552c() {
        return (TextSelectionView) this.f76449b.requireView().findViewById(R.id.lens_text_selection_view);
    }

    /* renamed from: e */
    public final void mo33553e() {
        C24158c cVar = this.f76464q;
        if (cVar != null) {
            if (cVar.f65998d) {
                C24161f fVar = cVar.f65996b;
                cVar.f65995a.removeView(fVar);
                fVar.f66007f = null;
                cVar.f65998d = false;
            }
            this.f76464q = null;
        }
    }

    /* renamed from: f */
    public final void mo33554f() {
        C24178s sVar = this.f76456i;
        if (sVar != null) {
            this.f76461n = true;
            sVar.mo29637c();
            this.f76461n = false;
            C28067ab abVar = this.f76463p;
            if (abVar != null) {
                abVar.mo33525a();
            }
        }
    }

    /* renamed from: g */
    public final void mo33555g() {
        TextSelectionView c = mo33552c();
        C28091x xVar = this.f76465r;
        C28092y yVar = this.f76466s;
        C24178s sVar = new C24178s(xVar);
        c.f65963p = sVar;
        boolean z = true;
        C58838bb.m90883r(sVar.f66075h == null);
        sVar.f66075h = yVar;
        if (sVar.f66073f != null) {
            z = false;
        }
        C58838bb.m90883r(z);
        sVar.f66073f = c;
        this.f76456i = sVar;
        sVar.f66074g = new C28090w(this);
        C24150b bVar = this.f76457j;
        TextSelectionView textSelectionView = sVar.f66073f;
        textSelectionView.f65960m = bVar.f65941b;
        textSelectionView.f65961n = bVar.f65942c;
        if (bVar.f65940a) {
            textSelectionView.f65953f.setVisibility(0);
        } else {
            textSelectionView.f65953f.setVisibility(8);
        }
        sVar.f66072e = bVar.f65941b;
    }

    /* renamed from: h */
    public final void mo33556h() {
        String str;
        String str2;
        String str3;
        Rect rect;
        if (this.f76462o != null && this.f76456i != null) {
            C58833ax axVar = (C58833ax) this.f76450c.f76418f.mo3842a();
            if (axVar.mo56113h()) {
                C56242aw awVar = (C56242aw) axVar.mo56107c();
                mo33552c().setVisibility(0);
                this.f76460m.clear();
                int i = 0;
                int i2 = 0;
                while (i < awVar.f149801a.size()) {
                    C56235ap apVar = (C56235ap) awVar.f149801a.get(i);
                    int i3 = 0;
                    while (i3 < apVar.f149783b.size()) {
                        C56233an anVar = (C56233an) apVar.f149783b.get(i3);
                        int i4 = 0;
                        while (i4 < anVar.f149778b.size()) {
                            int size = anVar.f149778b.size() - 1;
                            SparseArray sparseArray = this.f76460m;
                            C24197p a = C28109ak.m52387a(i2, (C56241av) anVar.f149778b.get(i4));
                            int b = C62475cy.m94782b(apVar.f149785d);
                            if (b == 0) {
                                b = 2;
                            }
                            C24143a aVar = new C24143a();
                            aVar.f65915a = "R".concat(String.valueOf(String.valueOf(UUID.randomUUID())));
                            aVar.f65916b = BuildConfig.FLAVOR;
                            aVar.f65917c = BuildConfig.FLAVOR;
                            aVar.mo29544a(0.0f);
                            aVar.mo29547d(-1);
                            aVar.mo29545b(-1);
                            aVar.mo29546c(-1);
                            aVar.f65924j = 1;
                            String hexString = Integer.toHexString(a.f66136a);
                            if (hexString != null) {
                                aVar.f65915a = hexString;
                                C24195n nVar = a.f66137b;
                                if (nVar == null) {
                                    nVar = C24195n.f66127f;
                                }
                                C28066aa aaVar = this.f76462o;
                                aaVar.getClass();
                                View view = this.f76449b.getView();
                                view.getClass();
                                int width = view.getWidth();
                                C56242aw awVar2 = awVar;
                                View view2 = this.f76449b.getView();
                                view2.getClass();
                                C56235ap apVar2 = apVar;
                                float f = (float) width;
                                float height = (float) view2.getHeight();
                                C56233an anVar2 = anVar;
                                int i5 = i2;
                                SparseArray sparseArray2 = sparseArray;
                                Rect rect2 = new Rect((int) (nVar.f66129a * f), (int) (nVar.f66130b * height), (int) (nVar.f66131c * f), (int) (nVar.f66132d * height));
                                float f2 = nVar.f66133e;
                                float[] fArr = {(float) rect2.left, (float) rect2.top, (float) rect2.left, (float) rect2.bottom, (float) rect2.right, (float) rect2.top, (float) rect2.right, (float) rect2.bottom};
                                aaVar.f76384a.reset();
                                aaVar.f76384a.postRotate(f2, (float) rect2.centerX(), (float) rect2.centerY());
                                aaVar.f76384a.mapPoints(fArr);
                                PointF pointF = new PointF(fArr[0], fArr[1]);
                                int i6 = i;
                                PointF pointF2 = new PointF(fArr[2], fArr[3]);
                                PointF pointF3 = new PointF(fArr[4], fArr[5]);
                                int i7 = i3;
                                PointF pointF4 = new PointF(fArr[6], fArr[7]);
                                C24143a aVar2 = aVar;
                                double tan = Math.tan(Math.toRadians((double) f2));
                                if ((f2 >= -50.0f && f2 < 0.0f) || (f2 >= 0.0f && f2 <= 50.0f)) {
                                    aaVar.mo33522c(pointF2, pointF, tan);
                                    aaVar.mo33522c(pointF4, pointF3, tan);
                                    aaVar.mo33523d(pointF4, pointF3, tan);
                                    aaVar.mo33523d(pointF2, pointF, tan);
                                    aaVar.mo33521b(pointF2, pointF4, tan);
                                    aaVar.mo33521b(pointF, pointF3, tan);
                                    aaVar.mo33524e(pointF2, pointF4, tan);
                                    aaVar.mo33524e(pointF, pointF3, tan);
                                } else if ((f2 > -180.0f && f2 <= -130.0f) || (f2 >= 130.0f && f2 <= 180.0f)) {
                                    aaVar.mo33522c(pointF4, pointF3, tan);
                                    aaVar.mo33522c(pointF2, pointF, tan);
                                    aaVar.mo33523d(pointF2, pointF, tan);
                                    aaVar.mo33523d(pointF4, pointF3, tan);
                                    aaVar.mo33521b(pointF, pointF3, tan);
                                    aaVar.mo33521b(pointF2, pointF4, tan);
                                    aaVar.mo33524e(pointF, pointF3, tan);
                                    aaVar.mo33524e(pointF2, pointF4, tan);
                                }
                                PointF[] pointFArr = {pointF, pointF2, pointF3, pointF4};
                                int i8 = 0;
                                for (int i9 = 4; i8 < i9; i9 = 4) {
                                    int i10 = i8 + i8;
                                    fArr[i10] = pointFArr[i8].x;
                                    fArr[i10 + 1] = pointFArr[i8].y;
                                    i8++;
                                    a = a;
                                }
                                C24197p pVar = a;
                                aaVar.f76384a.reset();
                                aaVar.f76384a.postRotate(-f2, (float) rect2.centerX(), (float) rect2.centerY());
                                aaVar.f76384a.mapPoints(fArr);
                                float f3 = fArr[0];
                                Rect rect3 = new Rect((int) f3, (int) fArr[1], (int) (f3 + C28066aa.m52318a(pointF, pointF3)), (int) (fArr[1] + C28066aa.m52318a(pointF, pointF2)));
                                if (b == 4) {
                                    rect3.inset(-this.f76459l, 0);
                                } else {
                                    rect3.inset(0, -this.f76458k);
                                }
                                if (i4 == 0) {
                                    int i11 = b - 2;
                                    if (i11 == 0) {
                                        rect3.left -= this.f76459l;
                                    } else if (i11 == 1) {
                                        rect3.right += this.f76459l;
                                    } else if (i11 == 2) {
                                        rect3.top -= this.f76458k;
                                    }
                                    i4 = 0;
                                }
                                if (i4 == size) {
                                    int i12 = b - 2;
                                    if (i12 == 0) {
                                        rect3.right += this.f76459l;
                                    } else if (i12 == 1) {
                                        rect3.left -= this.f76459l;
                                    } else if (i12 == 2) {
                                        rect3.bottom += this.f76458k;
                                    }
                                }
                                aVar2.f65918d = rect3;
                                C24197p pVar2 = pVar;
                                C24195n nVar2 = pVar2.f66137b;
                                if (nVar2 == null) {
                                    nVar2 = C24195n.f66127f;
                                }
                                aVar2.mo29544a(nVar2.f66133e);
                                aVar2.mo29547d(pVar2.f66136a);
                                int i13 = i7;
                                aVar2.mo29545b(i13);
                                int i14 = i6;
                                aVar2.mo29546c(i14);
                                aVar2.f65924j = b;
                                String str4 = pVar2.f66138c;
                                if (str4 != null) {
                                    aVar2.f65916b = str4;
                                    String str5 = pVar2.f66139d;
                                    if (str5 != null) {
                                        aVar2.f65917c = str5;
                                        if (aVar2.f65923i != 15 || (str = aVar2.f65915a) == null || (str2 = aVar2.f65916b) == null || (str3 = aVar2.f65917c) == null || (rect = aVar2.f65918d) == null) {
                                            StringBuilder sb = new StringBuilder();
                                            if (aVar2.f65915a == null) {
                                                sb.append(" id");
                                            }
                                            if (aVar2.f65916b == null) {
                                                sb.append(" text");
                                            }
                                            if (aVar2.f65917c == null) {
                                                sb.append(" textSeparator");
                                            }
                                            if (aVar2.f65918d == null) {
                                                sb.append(" boundingBox");
                                            }
                                            if ((aVar2.f65923i & 1) == 0) {
                                                sb.append(" angle");
                                            }
                                            if ((aVar2.f65923i & 2) == 0) {
                                                sb.append(" selectionOrder");
                                            }
                                            if ((aVar2.f65923i & 4) == 0) {
                                                sb.append(" lineIndex");
                                            }
                                            if ((aVar2.f65923i & 8) == 0) {
                                                sb.append(" paragraphIndex");
                                            }
                                            if (aVar2.f65924j == 0) {
                                                sb.append(" paragraphWritingDirection");
                                            }
                                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                        }
                                        C24144b bVar = new C24144b(str, str2, str3, rect, aVar2.f65919e, aVar2.f65920f, aVar2.f65921g, aVar2.f65922h, b);
                                        C58838bb.m90883r(!TextUtils.isEmpty(bVar.f65925a));
                                        C58838bb.m90883r(bVar.f65926b != -1);
                                        C58838bb.m90883r(bVar.f65927c != -1);
                                        C58838bb.m90883r(bVar.f65928d != -1);
                                        C58838bb.m90883r(bVar.f65929e != 1);
                                        int i15 = i5;
                                        sparseArray2.put(i15, bVar);
                                        i2 = i15 + 1;
                                        i4++;
                                        i3 = i13;
                                        i = i14;
                                        awVar = awVar2;
                                        apVar = apVar2;
                                        anVar = anVar2;
                                    } else {
                                        throw new NullPointerException("Null textSeparator");
                                    }
                                } else {
                                    throw new NullPointerException("Null text");
                                }
                            } else {
                                throw new NullPointerException("Null id");
                            }
                        }
                        C56242aw awVar3 = awVar;
                        i3++;
                        i = i;
                        apVar = apVar;
                    }
                    C56242aw awVar4 = awVar;
                    i++;
                }
                this.f76456i.mo29636b();
            }
        }
    }
}

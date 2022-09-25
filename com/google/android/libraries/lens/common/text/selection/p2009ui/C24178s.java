package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p060c.C0977g;
import androidx.p060c.C0984n;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24146d;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24147e;
import com.google.android.libraries.lens.common.text.selection.p2006a.C24148f;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24151a;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24152b;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2010a.C24154a;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b.C24158c;
import com.google.android.libraries.lens.view.p2069am.C25336l;
import com.google.android.libraries.lens.view.p2069am.C25338n;
import com.google.android.libraries.lens.view.textoverlay.C28079l;
import com.google.android.libraries.lens.view.textoverlay.C28090w;
import com.google.android.libraries.lens.view.textoverlay.C28091x;
import com.google.android.libraries.lens.view.textoverlay.C28092y;
import com.google.android.libraries.lens.view.textoverlay.C28093z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.s */
/* compiled from: PG */
public final class C24178s implements C24154a {

    /* renamed from: a */
    public C24146d f66068a;

    /* renamed from: b */
    public C24146d f66069b;

    /* renamed from: c */
    public C58485gu f66070c = C58485gu.m89845m();

    /* renamed from: d */
    public Intent f66071d;

    /* renamed from: e */
    public boolean f66072e;

    /* renamed from: f */
    public TextSelectionView f66073f;

    /* renamed from: g */
    public C28090w f66074g;

    /* renamed from: h */
    public C28092y f66075h;

    /* renamed from: i */
    public final C28091x f66076i;

    /* renamed from: j */
    private C24146d f66077j;

    /* renamed from: k */
    private C24146d f66078k;

    /* renamed from: l */
    private final Matrix f66079l = new Matrix();

    /* renamed from: m */
    private final Matrix f66080m = new Matrix();

    /* renamed from: n */
    private int f66081n = 1;

    static {
        C58974d.m91135i("TextSelectionPresenter");
    }

    public C24178s(C28091x xVar) {
        this.f66076i = xVar;
    }

    /* renamed from: h */
    private final Point m44992h(int i, int i2, C24146d dVar) {
        float[] fArr = {(float) i, (float) i2};
        this.f66079l.setRotate(dVar.mo29548a(), (float) dVar.mo29552e().centerX(), (float) dVar.mo29552e().centerY());
        this.f66079l.invert(this.f66080m);
        this.f66080m.mapPoints(fArr);
        if (C24152b.m44879a(dVar.mo29558i())) {
            fArr[0] = (float) dVar.mo29552e().centerX();
        } else {
            fArr[1] = (float) dVar.mo29552e().centerY();
        }
        this.f66079l.mapPoints(fArr);
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    /* renamed from: a */
    public final void mo29576a(int i, int i2) {
        C24167h i3 = C24167h.m44917i(this.f66075h.mo33549a(), i, i2, this.f66072e ? this.f66081n : 1);
        if (i3 != null) {
            C24146d dVar = i3.f66037a;
            C24146d dVar2 = this.f66077j;
            C24146d dVar3 = this.f66078k;
            if (this.f66074g != null) {
                Point h = m44992h(i, i2, dVar);
                C28090w wVar = this.f66074g;
                wVar.getClass();
                int i4 = h.x;
                int i5 = h.y;
                C28093z zVar = wVar.f76445a;
                if (zVar.f76464q != null) {
                    View view = zVar.f76449b.getView();
                    view.getClass();
                    PointF a = C28093z.m52364a(i4, i5, view);
                    C24158c cVar = wVar.f76445a.f76464q;
                    cVar.getClass();
                    cVar.mo29586a(a, dVar);
                }
            }
            int i6 = this.f66081n;
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        C58838bb.m90883r(false);
                    } else {
                        dVar3 = dVar;
                    }
                    dVar = dVar2;
                }
                dVar.getClass();
                int d = dVar.mo29551d();
                dVar3.getClass();
                if (d > dVar3.mo29551d()) {
                    int i8 = this.f66081n;
                    if (i8 == 2) {
                        this.f66081n = 3;
                    } else if (i8 == 3) {
                        this.f66081n = 2;
                    }
                    this.f66077j = dVar3;
                    this.f66078k = dVar;
                    C24146d dVar4 = dVar3;
                    dVar3 = dVar;
                    dVar = dVar4;
                }
                if (!Objects.equals(dVar, this.f66068a) || !Objects.equals(dVar3, this.f66069b)) {
                    C58485gu b = this.f66075h.mo33550b(dVar.mo29551d(), dVar3.mo29551d());
                    this.f66073f.mo29569j(9);
                    mo29640f(b, false, this.f66081n);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo29636b() {
        Intent intent = this.f66071d;
        if (!mo29638d() && intent != null) {
            Intent intent2 = this.f66071d;
            int intExtra = intent2 == null ? 2 : intent2.getIntExtra("invocation_mode", 2);
            if (intExtra == 0) {
                Point point = (Point) intent.getParcelableExtra("invocation_point");
                point.getClass();
                if (!intent.hasExtra("selection_start") || !intent.hasExtra("selection_end")) {
                    mo29639e(point.x, point.y, 1);
                } else {
                    C58485gu b = this.f66075h.mo33550b(intent.getIntExtra("selection_start", 0), intent.getIntExtra("selection_end", 0));
                    if (b != null && !b.isEmpty()) {
                        mo29640f(b, true, 1);
                    }
                }
            } else if (!(intExtra == 1 || intExtra == 2)) {
                C58838bb.m90884s(false, "Unsupported invocation mode:" + intExtra);
            }
            this.f66071d = null;
        }
        TextSelectionView textSelectionView = this.f66073f;
        SparseArray a = this.f66075h.mo33549a();
        C24163d dVar = textSelectionView.f65959l;
        dVar.f66025c.clear();
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i = 0; i < a.size(); i++) {
            C24146d dVar2 = (C24146d) a.valueAt(i);
            Rect e = dVar2.mo29552e();
            float a2 = dVar2.mo29548a();
            fArr[0] = (((float) i) / ((float) Math.max(1, a.size() - 1))) * 240.0f;
            dVar.f66025c.add(new C24153a(e, a2, Color.HSVToColor(128, fArr)));
        }
        dVar.invalidate();
    }

    /* renamed from: c */
    public final void mo29637c() {
        this.f66073f.mo29566g();
        this.f66069b = null;
        this.f66068a = null;
        this.f66070c = C58485gu.m89845m();
        this.f66076i.mo33548a();
    }

    /* renamed from: d */
    public final boolean mo29638d() {
        C58838bb.m90884s((this.f66068a == null) == (this.f66069b == null), "The start and end selection must be set and cleared at the same time!");
        return (this.f66068a == null || this.f66069b == null) ? false : true;
    }

    /* renamed from: e */
    public final boolean mo29639e(int i, int i2, int i3) {
        C58833ax axVar;
        C24167h f = C24167h.m44914f(this.f66075h.mo33549a(), i, i2);
        if (f == null) {
            C28090w wVar = this.f66074g;
            if (wVar != null) {
                wVar.mo33547a();
            }
            return false;
        } else if (i3 == 2) {
            return true;
        } else {
            C24146d dVar = this.f66068a;
            C24146d dVar2 = this.f66069b;
            char c = (dVar == null || f.f66037a.mo29551d() < dVar.mo29551d() || (dVar2 != null && f.f66037a.mo29551d() > dVar2.mo29551d())) ? 1 : (f.f66037a.mo29551d() < dVar.mo29551d() || dVar2 == null || f.f66037a.mo29551d() > dVar2.mo29551d()) ? 0 : dVar == dVar2 ? (char) 3 : 2;
            C24146d dVar3 = f.f66037a;
            int d = dVar3.mo29551d();
            if (i3 == 3) {
                this.f66073f.mo29569j(0);
            } else if (i3 == 4) {
                this.f66073f.mo29569j(1);
            }
            if (c == 1) {
                C28092y yVar = this.f66075h;
                this.f66073f.getContext();
                C24146d b = yVar.f76447a.mo33551b(d);
                C28079l lVar = yVar.f76447a.f76450c;
                int d2 = b.mo29551d();
                if (((C58833ax) lVar.f76422j.mo3842a()).mo56113h()) {
                    Iterator it = ((C25338n) ((C58833ax) lVar.f76422j.mo3842a()).mo56107c()).f68964a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C25336l lVar2 = (C25336l) it.next();
                        if (lVar2.f68959a <= d2 && d2 <= lVar2.f68960b) {
                            axVar = C58833ax.m90834k(lVar2);
                            break;
                        }
                    }
                }
                axVar = C58836b.f156633a;
                if (axVar.mo56113h()) {
                    C24177r.m44991a(((C25336l) axVar.mo56107c()).f68959a, ((C25336l) axVar.mo56107c()).f68960b, this);
                } else {
                    C24177r.m44991a(d, d, this);
                }
            } else if (c == 2 || c == 3) {
                mo29640f(C58485gu.m89846n(dVar3), true, 1);
                C28090w wVar2 = this.f66074g;
                if (wVar2 != null) {
                    wVar2.mo33547a();
                }
            }
            return true;
        }
    }

    /* renamed from: f */
    public final void mo29640f(C58485gu guVar, boolean z, int i) {
        View view;
        C24146d dVar = (C24146d) C58557jl.m90130k(guVar, (Object) null);
        C24146d dVar2 = (C24146d) C58557jl.m90132m(guVar, (Object) null);
        if (dVar != this.f66068a || dVar2 != this.f66069b) {
            this.f66068a = dVar;
            this.f66069b = dVar2;
            this.f66070c = guVar;
            if (guVar.isEmpty()) {
                this.f66073f.mo29566g();
            } else {
                C24147e eVar = new C24147e(guVar);
                TextSelectionView textSelectionView = this.f66073f;
                C58485gu<C24148f> k = C58485gu.m89843k(eVar);
                C0977g gVar = new C0977g(((C0984n) textSelectionView.f65962o).f3122d);
                for (C24148f fVar : k) {
                    C24151a aVar = fVar.f65936a;
                    if (textSelectionView.f65962o.containsKey(aVar)) {
                        gVar.put(aVar, (View) textSelectionView.f65962o.remove(aVar));
                    }
                }
                for (C24148f fVar2 : k) {
                    C24151a aVar2 = fVar2.f65936a;
                    if (!gVar.containsKey(aVar2)) {
                        Rect rect = aVar2.f65943a;
                        if (!textSelectionView.f65962o.isEmpty()) {
                            Iterator it = textSelectionView.f65962o.entrySet().iterator();
                            view = (View) ((Map.Entry) it.next()).getValue();
                            it.remove();
                        } else {
                            view = new View(textSelectionView.getContext());
                            view.setBackgroundColor(textSelectionView.f65954g);
                            view.setElevation(textSelectionView.f65948a);
                            textSelectionView.f65951d.addView(view);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
                        layoutParams.leftMargin = rect.left;
                        layoutParams.topMargin = rect.top;
                        view.setLayoutParams(layoutParams);
                        view.setRotation(aVar2.f65944b);
                        gVar.put(aVar2, view);
                    }
                }
                for (View removeView : textSelectionView.f65962o.values()) {
                    textSelectionView.f65951d.removeView(removeView);
                }
                textSelectionView.f65962o.clear();
                textSelectionView.f65962o.putAll(gVar);
                boolean z2 = false;
                textSelectionView.f65964q = ((C24148f) k.get(0)).f65937b;
                textSelectionView.f65965r = ((C24148f) C58557jl.m90131l(k)).f65937b;
                C24179t tVar = textSelectionView.f65949b;
                int i2 = C24179t.f66082f;
                if (!tVar.f66084b) {
                    textSelectionView.mo29565f();
                }
                C58485gu e = textSelectionView.mo29564e();
                int size = e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C24171l) e.get(i3)).mo29631f((C24148f) k.get(0));
                }
                C58485gu c = textSelectionView.mo29563c();
                int size2 = c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((C24171l) c.get(i4)).mo29631f((C24148f) C58557jl.m90131l(k));
                }
                textSelectionView.mo29567h(textSelectionView.f65957j);
                if (textSelectionView.f65950c) {
                    textSelectionView.f65955h.mo29633h(false);
                    textSelectionView.f65956i.mo29633h(false);
                } else if (textSelectionView.f65960m) {
                    textSelectionView.f65955h.mo29633h(i != 2);
                    C24171l lVar = textSelectionView.f65956i;
                    if (i != 3) {
                        z2 = true;
                    }
                    lVar.mo29633h(z2);
                } else {
                    textSelectionView.f65955h.mo29633h(true);
                    textSelectionView.f65956i.mo29633h(true);
                }
                textSelectionView.mo29568i();
            }
            if (z) {
                this.f66076i.mo33548a();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo29577g(int i, int i2, int i3) {
        C24167h f;
        SparseArray a = this.f66075h.mo33549a();
        if (a.size() == 0 || (f = C24167h.m44914f(a, i, i2)) == null) {
            return false;
        }
        C24146d dVar = f.f66037a;
        this.f66081n = 1;
        if (mo29638d()) {
            this.f66077j = this.f66068a;
            this.f66078k = this.f66069b;
            if (i3 != 2) {
                if (i3 == 3) {
                    i3 = 3;
                }
            }
            this.f66081n = i3;
        }
        if (this.f66081n == 1) {
            return false;
        }
        if (this.f66074g != null) {
            Point h = m44992h(i, i2, dVar);
            C28090w wVar = this.f66074g;
            wVar.getClass();
            int i4 = h.x;
            int i5 = h.y;
            C28093z zVar = wVar.f76445a;
            if (zVar.f76464q != null) {
                View view = zVar.f76449b.getView();
                view.getClass();
                PointF a2 = C28093z.m52364a(i4, i5, view);
                C24158c cVar = wVar.f76445a.f76464q;
                cVar.getClass();
                cVar.mo29586a(a2, dVar);
            }
            wVar.f76445a.f76450c.f76427o = true;
        }
        return true;
    }
}

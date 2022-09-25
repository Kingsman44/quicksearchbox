package com.google.android.libraries.lens.view.gleam.region;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.icu.text.ListFormatter;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Size;
import android.widget.SeekBar;
import androidx.core.p098j.p099a.C1991k;
import androidx.customview.p103b.C2144b;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.IllegalFormatFlagsException;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.n */
/* compiled from: PG */
public final class C26624n extends C2144b {

    /* renamed from: a */
    private static final C59071e f72604a = C59071e.m91332i("com.google.android.libraries.lens.view.gleam.region.n");

    /* renamed from: b */
    private static final C58485gu f72605b = C58485gu.m89853v(C26629s.TOP_LEFT_CORNER, C26629s.TOP_EDGE, C26629s.TOP_RIGHT_CORNER, C26629s.LEFT_EDGE, C26629s.RIGHT_EDGE, C26629s.BOTTOM_LEFT_CORNER, C26629s.BOTTOM_EDGE, C26629s.BOTTOM_RIGHT_CORNER);

    /* renamed from: c */
    private final RegionView f72606c;

    /* renamed from: d */
    private final Context f72607d;

    public C26624n(RegionView regionView) {
        super(regionView);
        this.f72606c = regionView;
        this.f72607d = regionView.getContext();
    }

    /* renamed from: a */
    private final float m49184a() {
        Size size = this.f72606c.f72547f;
        return (((float) size.getWidth()) / ((float) size.getHeight())) * 0.1f;
    }

    /* renamed from: b */
    private static int m49185b(float f) {
        return (int) ((((float) Math.round(f * 20.0f)) / 20.0f) * 100.0f);
    }

    /* renamed from: c */
    private final String m49186c(C26623m mVar) {
        String str;
        C26623m mVar2 = C26623m.LEFT;
        C26629s sVar = C26629s.NONE;
        int ordinal = mVar.ordinal();
        if (ordinal == 0) {
            str = this.f72607d.getString(R.string.lens_region_search_left);
        } else if (ordinal == 1) {
            str = this.f72607d.getString(R.string.lens_region_search_top);
        } else if (ordinal == 2) {
            str = this.f72607d.getString(R.string.lens_region_search_right);
        } else if (ordinal != 3) {
            str = BuildConfig.FLAVOR;
        } else {
            str = this.f72607d.getString(R.string.lens_region_search_bottom);
        }
        return this.f72607d.getString(R.string.lens_region_search_edge, new Object[]{str});
    }

    /* renamed from: d */
    private final String m49187d(String str, String str2) {
        return this.f72607d.getString(R.string.lens_region_search_area_position_indicator, new Object[]{str, str2});
    }

    /* renamed from: e */
    private static String m49188e(Resources resources, int i, String str) {
        try {
            return resources.getQuantityString(R.plurals.lens_region_search_area_percent, i, new Object[]{str, Integer.valueOf(i)});
        } catch (IllegalFormatFlagsException unused) {
            ((C59052c) ((C59052c) f72604a.mo56225c()).mo56372aa(49463)).mo56386p("Failed to retrieve percentage string, using fallback.");
            return String.format(resources.getConfiguration().locale, "%s %d%%", new Object[]{str, Integer.valueOf(i)});
        }
    }

    /* renamed from: f */
    private final String m49189f(List list) {
        RectF h = this.f72606c.mo31882h();
        ArrayList arrayList = new ArrayList();
        Resources resources = this.f72607d.getResources();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C26623m mVar = C26623m.LEFT;
            C26629s sVar = C26629s.NONE;
            int ordinal = ((C26623m) G.next()).ordinal();
            if (ordinal == 0) {
                arrayList.add(m49188e(resources, m49185b(h.left), this.f72607d.getString(R.string.lens_region_search_left)));
            } else if (ordinal == 1) {
                arrayList.add(m49188e(resources, m49185b(h.top), this.f72607d.getString(R.string.lens_region_search_top)));
            } else if (ordinal == 2) {
                arrayList.add(m49188e(resources, m49185b(h.right), this.f72607d.getString(R.string.lens_region_search_right)));
            } else if (ordinal == 3) {
                arrayList.add(m49188e(resources, m49185b(h.bottom), this.f72607d.getString(R.string.lens_region_search_bottom)));
            }
        }
        return ListFormatter.getInstance().format(arrayList);
    }

    /* renamed from: g */
    private final RectF m49190g(RectF rectF, C26629s sVar, int i) {
        RectF rectF2 = new RectF(rectF);
        float f = i == 1 ? 1.0f : -1.0f;
        float a = m49184a();
        C26623m mVar = C26623m.LEFT;
        C26629s sVar2 = C26629s.NONE;
        switch (sVar.ordinal()) {
            case 2:
            case 6:
                rectF2.left += f * 0.1f;
                break;
            case 3:
            case 7:
                rectF2.top -= f * a;
                break;
            case 4:
            case 8:
                rectF2.right += f * 0.1f;
                break;
            case 5:
            case 9:
                rectF2.bottom -= f * a;
                break;
        }
        RectF rectF3 = new RectF(rectF2);
        rectF3.intersect(0.0f, 0.0f, 1.0f, 1.0f);
        if (rectF3.equals(rectF2) && rectF3.left + 0.1f <= rectF3.right && rectF3.top + m49184a() <= rectF3.bottom) {
            return rectF2;
        }
        return new RectF(rectF);
    }

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        if (this.f72606c.mo31882h().isEmpty()) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        PointF pointF = new PointF(f, f2);
        Size size = this.f72606c.f72547f;
        PointF pointF2 = new PointF(pointF.x / ((float) size.getWidth()), pointF.y / ((float) size.getHeight()));
        RegionView regionView = this.f72606c;
        regionView.getClass();
        C26629s i = regionView.mo31883i(pointF2, true);
        if (i == C26629s.NONE) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        return i.ordinal();
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        if (!this.f72606c.mo31882h().isEmpty()) {
            C58485gu guVar = f72605b;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                list.add(Integer.valueOf(((C26629s) guVar.get(i2)).ordinal()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        RectF rectF;
        RectF h = this.f72606c.mo31882h();
        if (h.isEmpty()) {
            return false;
        }
        C26629s sVar = C26629s.values()[i];
        if (i2 == 4096) {
            rectF = m49190g(h, sVar, 1);
        } else if (i2 != 8192) {
            return false;
        } else {
            rectF = m49190g(h, sVar, 2);
        }
        if (!rectF.equals(h)) {
            C26610a aVar = new C26610a(rectF);
            RegionView regionView = this.f72606c;
            regionView.getClass();
            C47393f.m84237h(aVar, regionView);
            invalidateRoot();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForHost(C1991k kVar) {
        kVar.f5921a.setVisibleToUser(false);
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        String str;
        RectF h = this.f72606c.mo31882h();
        C26629s sVar = C26629s.values()[i];
        String string = this.f72607d.getString(R.string.lens_region_search_top_left_corner);
        String string2 = this.f72607d.getString(R.string.lens_region_search_top_right_corner);
        String string3 = this.f72607d.getString(R.string.lens_region_search_bottom_right_corner);
        String string4 = this.f72607d.getString(R.string.lens_region_search_bottom_left_corner);
        C26623m mVar = C26623m.LEFT;
        switch (sVar.ordinal()) {
            case 1:
                str = this.f72607d.getString(R.string.lens_region_search_search_area, new Object[]{m49189f(C58485gu.m89849q(C26623m.LEFT, C26623m.TOP, C26623m.RIGHT, C26623m.BOTTOM))});
                break;
            case 2:
                str = m49187d(string, m49189f(C58485gu.m89847o(C26623m.LEFT, C26623m.TOP)));
                break;
            case 3:
                str = m49187d(string2, m49189f(C58485gu.m89847o(C26623m.TOP, C26623m.RIGHT)));
                break;
            case 4:
                str = m49187d(string3, m49189f(C58485gu.m89847o(C26623m.RIGHT, C26623m.BOTTOM)));
                break;
            case 5:
                str = m49187d(string4, m49189f(C58485gu.m89847o(C26623m.BOTTOM, C26623m.LEFT)));
                break;
            case 6:
                str = m49187d(m49186c(C26623m.LEFT), m49189f(C58485gu.m89846n(C26623m.LEFT)));
                break;
            case 7:
                str = m49187d(m49186c(C26623m.TOP), m49189f(C58485gu.m89846n(C26623m.TOP)));
                break;
            case 8:
                str = m49187d(m49186c(C26623m.RIGHT), m49189f(C58485gu.m89846n(C26623m.RIGHT)));
                break;
            case 9:
                str = m49187d(m49186c(C26623m.BOTTOM), m49189f(C58485gu.m89846n(C26623m.BOTTOM)));
                break;
            default:
                throw new AssertionError("Invalid editable zone name");
        }
        kVar.f5921a.setContentDescription(str);
        kVar.f5921a.setFocusable(true);
        if (h.isEmpty()) {
            kVar.f5921a.setVisibleToUser(false);
            setBoundsInScreenFromBoundsInParent(kVar, new Rect(0, 0, 0, 0));
            return;
        }
        if (sVar != C26629s.CENTER_AREA) {
            kVar.f5921a.setClassName(SeekBar.class.getName());
            kVar.f5921a.addAction(4096);
            kVar.f5921a.addAction(8192);
        }
        RegionView regionView = this.f72606c;
        Size size = regionView.f72547f;
        float c = regionView.mo31877c();
        if (sVar != C26629s.CENTER_AREA) {
            PointF g = RegionView.m49128g(h, sVar);
            RectF rectF = new RectF(g.x, g.y, g.x, g.y);
            if (RegionView.m49130n(sVar)) {
                rectF.inset((-h.width()) / 2.0f, -this.f72606c.mo31881f(size, c));
            } else if (RegionView.m49131o(sVar)) {
                rectF.inset(-this.f72606c.mo31880e(size, c), (-h.height()) / 2.0f);
            } else {
                rectF.inset(-this.f72606c.mo31880e(size, c), -this.f72606c.mo31881f(size, c));
            }
            h = rectF;
        }
        RegionView regionView2 = this.f72606c;
        Size size2 = regionView2.f72547f;
        float c2 = regionView2.mo31877c();
        setBoundsInScreenFromBoundsInParent(kVar, new Rect(Math.round(h.left * ((float) size2.getWidth()) * c2), Math.round(h.top * ((float) size2.getHeight()) * c2), Math.round(h.right * ((float) size2.getWidth()) * c2), Math.round(h.bottom * ((float) size2.getHeight()) * c2)));
    }
}

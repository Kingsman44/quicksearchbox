package com.google.android.libraries.lens.view.gleam.region;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.r */
/* compiled from: PG */
final class C26628r extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ RegionView f72611a;

    public C26628r(RegionView regionView) {
        this.f72611a = regionView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        RegionView regionView = this.f72611a;
        PointF pointF = new PointF(motionEvent.getX() / ((float) regionView.f72547f.getWidth()), motionEvent.getY() / ((float) regionView.f72547f.getHeight()));
        regionView.mo31885l();
        regionView.f72545d = regionView.mo31883i(pointF, false);
        if (regionView.f72545d == C26629s.NONE) {
            return false;
        }
        regionView.f72546e = true;
        PointF g = RegionView.m49128g(regionView.mo31882h(), regionView.f72545d);
        regionView.f72543b.set(pointF.x - g.x, pointF.y - g.y);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C58833ax axVar;
        Size size;
        float f3;
        C26629s sVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        RegionView regionView = this.f72611a;
        if (motionEvent == null || motionEvent2 == null) {
            return regionView.f72546e;
        }
        if (Math.max(motionEvent.getPointerCount(), motionEvent2.getPointerCount()) > 1) {
            regionView.f72546e = false;
            return false;
        }
        PointF pointF = new PointF(motionEvent2.getX() / ((float) regionView.f72547f.getWidth()), motionEvent2.getY() / ((float) regionView.f72547f.getHeight()));
        float f4 = pointF.x;
        float f5 = pointF.y;
        if (!regionView.f72546e) {
            axVar = C58836b.f156633a;
        } else {
            regionView.f72544c = true;
            RectF h = regionView.mo31882h();
            RegionView.m49129k(h);
            Size size2 = regionView.f72547f;
            float c = regionView.mo31877c();
            float width = regionView.f72542a / (((float) size2.getWidth()) * c);
            float height = regionView.f72542a / (((float) size2.getHeight()) * c);
            PointF g = RegionView.m49128g(h, regionView.f72545d);
            float f6 = f4 - (g.x + regionView.f72543b.x);
            float f7 = f5 - (g.y + regionView.f72543b.y);
            int i7 = 2;
            if (regionView.f72545d == C26629s.CENTER_AREA) {
                h.offset(Math.min(Math.max(f6, -h.left), 1.0f - h.right), Math.min(Math.max(f7, -h.top), 1.0f - h.bottom));
                size = size2;
                f3 = c;
            } else {
                int ordinal = regionView.f72545d.ordinal();
                if (ordinal == 2) {
                    i5 = 1;
                    i3 = 1;
                    i6 = 2;
                } else if (ordinal != 3) {
                    if (ordinal == 4) {
                        i4 = 2;
                    } else if (ordinal != 5) {
                        i4 = 1;
                        i7 = 1;
                    } else {
                        i4 = 1;
                        i2 = 2;
                        i = 1;
                        f3 = c;
                        size = size2;
                        h.set(RegionView.m49133r(i2, h.left, h.left + f6, 0.0f, h.right - width), RegionView.m49133r(i, h.top, h.top + f7, 0.0f, h.bottom - height), RegionView.m49133r(i4, h.right, h.right + f6, h.left + width, 1.0f), RegionView.m49133r(i3, h.bottom, h.bottom + f7, h.top + height, 1.0f));
                    }
                    i2 = 1;
                    i = 1;
                    f3 = c;
                    size = size2;
                    h.set(RegionView.m49133r(i2, h.left, h.left + f6, 0.0f, h.right - width), RegionView.m49133r(i, h.top, h.top + f7, 0.0f, h.bottom - height), RegionView.m49133r(i4, h.right, h.right + f6, h.left + width, 1.0f), RegionView.m49133r(i3, h.bottom, h.bottom + f7, h.top + height, 1.0f));
                } else {
                    i5 = 2;
                    i3 = 1;
                    i6 = 1;
                }
                i = 2;
                f3 = c;
                size = size2;
                h.set(RegionView.m49133r(i2, h.left, h.left + f6, 0.0f, h.right - width), RegionView.m49133r(i, h.top, h.top + f7, 0.0f, h.bottom - height), RegionView.m49133r(i4, h.right, h.right + f6, h.left + width, 1.0f), RegionView.m49133r(i3, h.bottom, h.bottom + f7, h.top + height, 1.0f));
            }
            PointF pointF2 = new PointF(f4, f5);
            C26629s sVar2 = regionView.f72545d;
            if (sVar2 != C26629s.CENTER_AREA && !regionView.mo31891p(pointF2, h, sVar2, size, f3)) {
                C26629s sVar3 = C26629s.NONE;
                if (!h.contains(pointF2.x, pointF2.y)) {
                    PointF pointF3 = new PointF(h.centerX(), h.centerY());
                    C26629s[] q = RegionView.m49132q();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= 4) {
                            break;
                        }
                        sVar = q[i8];
                        float f8 = pointF2.x - pointF3.x;
                        float f9 = pointF2.y - pointF3.y;
                        int ordinal2 = sVar.ordinal();
                        if (ordinal2 == 2) {
                            if (f8 <= 0.0f && f9 <= 0.0f) {
                                break;
                            }
                            i8++;
                        } else if (ordinal2 == 3) {
                            if (f8 >= 0.0f && f9 <= 0.0f) {
                                break;
                            }
                            i8++;
                        } else if (ordinal2 != 4) {
                            if (ordinal2 == 5) {
                                if (f8 <= 0.0f && f9 >= 0.0f) {
                                    break;
                                }
                            }
                            i8++;
                        } else {
                            if (f8 >= 0.0f && f9 >= 0.0f) {
                                break;
                            }
                            i8++;
                        }
                    }
                    sVar3 = sVar;
                }
                if (!(sVar3 == C26629s.NONE || sVar3 == regionView.f72545d)) {
                    regionView.f72545d = sVar3;
                    PointF g2 = RegionView.m49128g(h, regionView.f72545d);
                    regionView.f72543b.set(f4 - g2.x, f5 - g2.y);
                }
            }
            axVar = C58833ax.m90834k(h);
        }
        if (axVar.mo56113h()) {
            C26613d f10 = C26614e.m49159f((RectF) axVar.mo56107c());
            ((C26611b) f10).f72570c = 1;
            f10.mo31894c(false);
            f10.mo31893b(false);
            regionView.mo31886m(f10.mo31892a());
        }
        return regionView.f72546e;
    }
}

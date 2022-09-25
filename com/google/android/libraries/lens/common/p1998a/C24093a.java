package com.google.android.libraries.lens.common.p1998a;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.google.common.p4552o.p4563i.C59946da;
import com.google.common.p4552o.p4563i.C59947db;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62580n;
import com.google.p4172bg.p4174b.C55715d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56221ab;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56223ad;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;

/* renamed from: com.google.android.libraries.lens.common.a.a */
/* compiled from: PG */
public final class C24093a {
    /* renamed from: a */
    public static RectF m44745a(C56224ae aeVar) {
        return m44751g(new PointF(aeVar.f149757c + (aeVar.f149758d / 2.0f), aeVar.f149756b + (aeVar.f149759e / 2.0f)), new SizeF(aeVar.f149758d, aeVar.f149759e), aeVar.f149760f, 1, 0.0f);
    }

    /* renamed from: b */
    public static C59947db m44746b(C56224ae aeVar, SizeF sizeF) {
        C59946da daVar = (C59946da) C59947db.f162011g.createBuilder();
        float f = aeVar.f149757c;
        float f2 = aeVar.f149758d;
        float width = sizeF.getWidth();
        daVar.copyOnWrite();
        C59947db dbVar = (C59947db) daVar.instance;
        dbVar.f162013a |= 1;
        dbVar.f162014b = (f + (f2 / 2.0f)) * width;
        float f3 = aeVar.f149756b;
        float f4 = aeVar.f149759e;
        float height = sizeF.getHeight();
        daVar.copyOnWrite();
        C59947db dbVar2 = (C59947db) daVar.instance;
        dbVar2.f162013a |= 2;
        dbVar2.f162015c = (f3 + (f4 / 2.0f)) * height;
        float f5 = aeVar.f149758d;
        float width2 = sizeF.getWidth();
        daVar.copyOnWrite();
        C59947db dbVar3 = (C59947db) daVar.instance;
        dbVar3.f162013a |= 4;
        dbVar3.f162016d = f5 * width2;
        float f6 = aeVar.f149759e;
        float height2 = sizeF.getHeight();
        daVar.copyOnWrite();
        C59947db dbVar4 = (C59947db) daVar.instance;
        dbVar4.f162013a |= 8;
        dbVar4.f162017e = f6 * height2;
        double radians = Math.toRadians((double) aeVar.f149760f);
        daVar.copyOnWrite();
        C59947db dbVar5 = (C59947db) daVar.instance;
        dbVar5.f162013a |= 16;
        dbVar5.f162018f = (float) radians;
        return (C59947db) daVar.build();
    }

    /* renamed from: c */
    public static C62441br m44747c(C56224ae aeVar) {
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        float f = aeVar.f149757c;
        float f2 = aeVar.f149758d;
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        brVar.f168610a |= 1;
        brVar.f168611b = f + (f2 / 2.0f);
        float f3 = aeVar.f149756b;
        float f4 = aeVar.f149759e;
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        int i = 2;
        brVar2.f168610a |= 2;
        brVar2.f168612c = f3 + (f4 / 2.0f);
        float f5 = aeVar.f149758d;
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 4;
        brVar3.f168613d = f5;
        float f6 = aeVar.f149759e;
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 8;
        brVar4.f168614e = f6;
        double radians = Math.toRadians((double) aeVar.f149760f);
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168610a |= 16;
        brVar5.f168615f = (float) radians;
        int a = C56223ad.m87941a(aeVar.f149761g);
        if (!(a == 0 || a == 1)) {
            i = 3;
        }
        bqVar.copyOnWrite();
        C62441br brVar6 = (C62441br) bqVar.instance;
        brVar6.f168616g = i - 1;
        brVar6.f168610a |= 32;
        return (C62441br) bqVar.build();
    }

    /* renamed from: d */
    public static C56224ae m44748d(C62441br brVar) {
        C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
        float f = brVar.f168611b;
        float f2 = brVar.f168613d;
        abVar.copyOnWrite();
        C56224ae aeVar = (C56224ae) abVar.instance;
        int i = 2;
        aeVar.f149755a |= 2;
        aeVar.f149757c = f - (f2 / 2.0f);
        float f3 = brVar.f168612c;
        float f4 = brVar.f168614e;
        abVar.copyOnWrite();
        C56224ae aeVar2 = (C56224ae) abVar.instance;
        aeVar2.f149755a |= 1;
        aeVar2.f149756b = f3 - (f4 / 2.0f);
        float f5 = brVar.f168613d;
        abVar.copyOnWrite();
        C56224ae aeVar3 = (C56224ae) abVar.instance;
        aeVar3.f149755a |= 4;
        aeVar3.f149758d = f5;
        float f6 = brVar.f168614e;
        abVar.copyOnWrite();
        C56224ae aeVar4 = (C56224ae) abVar.instance;
        aeVar4.f149755a |= 8;
        aeVar4.f149759e = f6;
        int a = C62580n.m94802a(brVar.f168616g);
        if (a != 0 && a == 2) {
            i = 1;
        }
        abVar.copyOnWrite();
        C56224ae aeVar5 = (C56224ae) abVar.instance;
        aeVar5.f149761g = i - 1;
        aeVar5.f149755a |= 32;
        double degrees = Math.toDegrees((double) brVar.f168615f);
        abVar.copyOnWrite();
        C56224ae aeVar6 = (C56224ae) abVar.instance;
        aeVar6.f149755a |= 16;
        aeVar6.f149760f = (float) degrees;
        return (C56224ae) abVar.build();
    }

    /* renamed from: e */
    public static C56224ae m44749e(C59947db dbVar, SizeF sizeF) {
        C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
        float f = dbVar.f162014b;
        float f2 = dbVar.f162016d;
        float width = sizeF.getWidth();
        abVar.copyOnWrite();
        C56224ae aeVar = (C56224ae) abVar.instance;
        aeVar.f149755a |= 2;
        aeVar.f149757c = (f - (f2 / 2.0f)) / width;
        float f3 = dbVar.f162015c;
        float f4 = dbVar.f162017e;
        float height = sizeF.getHeight();
        abVar.copyOnWrite();
        C56224ae aeVar2 = (C56224ae) abVar.instance;
        aeVar2.f149755a |= 1;
        aeVar2.f149756b = (f3 - (f4 / 2.0f)) / height;
        float f5 = dbVar.f162016d;
        float width2 = sizeF.getWidth();
        abVar.copyOnWrite();
        C56224ae aeVar3 = (C56224ae) abVar.instance;
        aeVar3.f149755a |= 4;
        aeVar3.f149758d = f5 / width2;
        float f6 = dbVar.f162017e;
        float height2 = sizeF.getHeight();
        abVar.copyOnWrite();
        C56224ae aeVar4 = (C56224ae) abVar.instance;
        aeVar4.f149755a |= 8;
        aeVar4.f149759e = f6 / height2;
        abVar.copyOnWrite();
        C56224ae aeVar5 = (C56224ae) abVar.instance;
        aeVar5.f149761g = 0;
        aeVar5.f149755a |= 32;
        double degrees = Math.toDegrees((double) dbVar.f162018f);
        abVar.copyOnWrite();
        C56224ae aeVar6 = (C56224ae) abVar.instance;
        aeVar6.f149755a |= 16;
        aeVar6.f149760f = (float) degrees;
        return (C56224ae) abVar.build();
    }

    /* renamed from: f */
    public static C56224ae m44750f(C55715d dVar, Size size) {
        float f = (float) dVar.f147000b;
        float f2 = (float) dVar.f147001c;
        PointF a = C24097e.m44767a(f, f2, dVar.f147004f, 1, new PointF((((float) dVar.f147002d) / 2.0f) + f, (((float) dVar.f147003e) / 2.0f) + f2));
        C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
        float f3 = a.x;
        int i = dVar.f147002d;
        int width = size.getWidth();
        abVar.copyOnWrite();
        C56224ae aeVar = (C56224ae) abVar.instance;
        aeVar.f149755a |= 2;
        aeVar.f149757c = (f3 - (((float) i) / 2.0f)) / ((float) width);
        float f4 = a.y;
        int i2 = dVar.f147003e;
        int height = size.getHeight();
        abVar.copyOnWrite();
        C56224ae aeVar2 = (C56224ae) abVar.instance;
        aeVar2.f149755a = 1 | aeVar2.f149755a;
        aeVar2.f149756b = (f4 - (((float) i2) / 2.0f)) / ((float) height);
        int i3 = dVar.f147002d;
        int width2 = size.getWidth();
        abVar.copyOnWrite();
        C56224ae aeVar3 = (C56224ae) abVar.instance;
        aeVar3.f149755a |= 4;
        aeVar3.f149758d = ((float) i3) / ((float) width2);
        int i4 = dVar.f147003e;
        int height2 = size.getHeight();
        abVar.copyOnWrite();
        C56224ae aeVar4 = (C56224ae) abVar.instance;
        aeVar4.f149755a |= 8;
        aeVar4.f149759e = ((float) i4) / ((float) height2);
        abVar.copyOnWrite();
        C56224ae aeVar5 = (C56224ae) abVar.instance;
        aeVar5.f149761g = 0;
        aeVar5.f149755a |= 32;
        float f5 = dVar.f147004f;
        abVar.copyOnWrite();
        C56224ae aeVar6 = (C56224ae) abVar.instance;
        aeVar6.f149755a |= 16;
        aeVar6.f149760f = f5;
        return (C56224ae) abVar.build();
    }

    /* renamed from: g */
    public static RectF m44751g(PointF pointF, SizeF sizeF, float f, int i, float f2) {
        float f3 = ((-sizeF.getWidth()) / 2.0f) - f2;
        float f4 = ((-sizeF.getHeight()) / 2.0f) - f2;
        float width = (sizeF.getWidth() / 2.0f) + f2;
        float height = (sizeF.getHeight() / 2.0f) + f2;
        PointF[] b = C24097e.m44768b(0.0f, 0.0f, -f, i, new PointF(f3, f4), new PointF(width, f4), new PointF(f3, height), new PointF(width, height));
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = -3.4028235E38f;
        float f8 = -3.4028235E38f;
        for (int i2 = 0; i2 < 4; i2++) {
            PointF pointF2 = b[i2];
            float f9 = pointF.x + pointF2.x;
            float f10 = pointF.y + pointF2.y;
            f5 = Math.min(f5, f9);
            f6 = Math.min(f6, f10);
            f7 = Math.max(f7, f9);
            f8 = Math.max(f8, f10);
        }
        return new RectF(f5, f6, f7, f8);
    }
}

package com.google.android.libraries.lens.view.p2154p.p2158d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Size;
import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24099g;
import com.google.android.libraries.lens.common.p1998a.C24101i;
import com.google.android.libraries.lens.common.p1998a.C24102j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.lens.p4707j.C62486di;
import com.google.lens.p4707j.C62487dj;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62490dm;
import com.google.lens.p4707j.C62491dn;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.lens.view.p.d.b */
/* compiled from: PG */
public final class C27547b implements C27546a {

    /* renamed from: a */
    private static final C59071e f75334a = C59071e.m91332i("com.google.android.libraries.lens.view.p.d.b");

    /* renamed from: b */
    private final boolean f75335b;

    public C27547b(boolean z) {
        this.f75335b = z;
    }

    /* renamed from: a */
    public final Bitmap mo33116a(Bitmap bitmap, C62491dn dnVar) {
        SizeF sizeF;
        C62491dn dnVar2 = dnVar;
        if (dnVar2.f168713b.size() == 4) {
            C62491dn b = C24101i.m44775b(dnVar);
            C62486di diVar = (C62486di) C62491dn.f168710e.createBuilder();
            C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
            djVar.copyOnWrite();
            C62488dk dkVar = (C62488dk) djVar.instance;
            dkVar.f168701a |= 1;
            dkVar.f168702b = 0.0f;
            djVar.copyOnWrite();
            C62488dk dkVar2 = (C62488dk) djVar.instance;
            dkVar2.f168701a |= 2;
            dkVar2.f168703c = 1.0f;
            diVar.mo58500c((C62488dk) djVar.build());
            C62487dj djVar2 = (C62487dj) C62488dk.f168699d.createBuilder();
            djVar2.copyOnWrite();
            C62488dk dkVar3 = (C62488dk) djVar2.instance;
            dkVar3.f168701a |= 1;
            dkVar3.f168702b = 0.0f;
            djVar2.copyOnWrite();
            C62488dk dkVar4 = (C62488dk) djVar2.instance;
            dkVar4.f168701a |= 2;
            dkVar4.f168703c = 0.0f;
            diVar.mo58500c((C62488dk) djVar2.build());
            C62487dj djVar3 = (C62487dj) C62488dk.f168699d.createBuilder();
            djVar3.copyOnWrite();
            C62488dk dkVar5 = (C62488dk) djVar3.instance;
            dkVar5.f168701a |= 1;
            dkVar5.f168702b = 1.0f;
            djVar3.copyOnWrite();
            C62488dk dkVar6 = (C62488dk) djVar3.instance;
            dkVar6.f168701a |= 2;
            dkVar6.f168703c = 0.0f;
            diVar.mo58500c((C62488dk) djVar3.build());
            C62487dj djVar4 = (C62487dj) C62488dk.f168699d.createBuilder();
            djVar4.copyOnWrite();
            C62488dk dkVar7 = (C62488dk) djVar4.instance;
            dkVar7.f168701a |= 1;
            dkVar7.f168702b = 1.0f;
            djVar4.copyOnWrite();
            C62488dk dkVar8 = (C62488dk) djVar4.instance;
            dkVar8.f168701a |= 2;
            dkVar8.f168703c = 1.0f;
            diVar.mo58500c((C62488dk) djVar4.build());
            diVar.copyOnWrite();
            C62491dn dnVar3 = (C62491dn) diVar.instance;
            dnVar3.f168715d = 1;
            dnVar3.f168712a |= 2;
            C62490dm dmVar = C62490dm.COUNTER_CLOCKWISE;
            diVar.copyOnWrite();
            C62491dn dnVar4 = (C62491dn) diVar.instance;
            dnVar4.f168714c = dmVar.f168709d;
            dnVar4.f168712a |= 1;
            C62491dn b2 = C24101i.m44775b((C62491dn) diVar.build());
            C62486di a = C24099g.m44772a(b, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            a.copyOnWrite();
            C62491dn dnVar5 = (C62491dn) a.instance;
            dnVar5.f168715d = 2;
            dnVar5.f168712a |= 2;
            C62491dn dnVar6 = (C62491dn) a.build();
            C62971cq cqVar = dnVar6.f168713b;
            if (cqVar.size() != 4) {
                sizeF = new SizeF(0.0f, 0.0f);
            } else {
                C62486di diVar2 = (C62486di) C62491dn.f168710e.createBuilder();
                diVar2.mo58498a(cqVar);
                C62491dn b3 = C24101i.m44775b((C62491dn) diVar2.build());
                C62488dk dkVar9 = (C62488dk) b3.f168713b.get(0);
                C62488dk dkVar10 = (C62488dk) b3.f168713b.get(1);
                C62488dk dkVar11 = (C62488dk) b3.f168713b.get(2);
                C62488dk dkVar12 = (C62488dk) b3.f168713b.get(3);
                sizeF = new SizeF((C24102j.m44777a(dkVar11, dkVar10) + C24102j.m44777a(dkVar12, dkVar9)) / 2.0f, (C24102j.m44777a(dkVar11, dkVar12) + C24102j.m44777a(dkVar10, dkVar9)) / 2.0f);
            }
            Size size = new Size(Math.round(sizeF.getWidth()), Math.round(sizeF.getHeight()));
            C62486di a2 = C24099g.m44772a(b2, (float) size.getWidth(), (float) size.getHeight());
            a2.copyOnWrite();
            C62491dn dnVar7 = (C62491dn) a2.instance;
            dnVar7.f168715d = 2;
            dnVar7.f168712a |= 2;
            Matrix matrix = new Matrix();
            matrix.setPolyToPoly(C24101i.m44776c(dnVar6), 0, C24101i.m44776c((C62491dn) a2.build()), 0, 4);
            ((C59052c) ((C59052c) f75334a.mo56224b()).mo56372aa(49310)).mo56389s("Rectification Matrix: %s", matrix);
            boolean z = this.f75335b;
            Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setFilterBitmap(z);
            int max = Math.max(bitmap.getWidth() / 20, 2);
            int max2 = Math.max(bitmap.getHeight() / 20, 2);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = max + 1;
            float[] fArr = new float[((i + i) * (max2 + 1))];
            for (int i2 = 0; i2 <= max2; i2++) {
                for (int i3 = 0; i3 <= max; i3++) {
                    int i4 = (i2 * i) + i3;
                    int i5 = i4 + i4;
                    fArr[i5] = (((float) i3) * ((float) width)) / ((float) max);
                    fArr[i5 + 1] = (((float) i2) * ((float) height)) / ((float) max2);
                }
            }
            matrix.mapPoints(fArr);
            canvas.drawBitmapMesh(bitmap, max, max2, fArr, 0, (int[]) null, 0, paint);
            return createBitmap;
        }
        throw new IllegalArgumentException(String.format("Not enough vertices in specified document quad: %d", new Object[]{Integer.valueOf(dnVar2.f168713b.size())}));
    }
}

package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9909d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3886c.C50758bw;
import com.google.assistant.p3886c.C50759bx;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50812di;
import com.google.assistant.p3886c.C50813dj;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50853y;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.d.a */
/* compiled from: PG */
public final /* synthetic */ class C130584a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130585b f357677a;

    /* renamed from: b */
    public final /* synthetic */ C83739ak f357678b;

    public /* synthetic */ C130584a(C130585b bVar, C83739ak akVar) {
        this.f357677a = bVar;
        this.f357678b = akVar;
    }

    public final Object apply(Object obj) {
        C50853y yVar;
        C130585b bVar = this.f357677a;
        C83739ak akVar = this.f357678b;
        C50818do doVar = (C50818do) obj;
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        C83738aj ajVar = akVar.f228233b;
        if (ajVar == null) {
            ajVar = C83738aj.f228226c;
        }
        if (ajVar.f228228a == 10) {
            C83738aj ajVar2 = akVar.f228233b;
            if (ajVar2 == null) {
                ajVar2 = C83738aj.f228226c;
            }
            if (ajVar2.f228228a == 10) {
                yVar = (C50853y) ajVar2.f228229b;
            } else {
                yVar = C50853y.f132421c;
            }
            C50758bw bwVar = (C50758bw) C50759bx.f132088c.createBuilder();
            bwVar.copyOnWrite();
            C50759bx bxVar = (C50759bx) bwVar.instance;
            yVar.getClass();
            bxVar.f132092b = yVar;
            bxVar.f132091a |= 1;
            C50759bx bxVar2 = (C50759bx) bwVar.build();
            C50813dj djVar = doVar.f132329z;
            if (djVar == null) {
                djVar = C50813dj.f132278a;
            }
            C50812di diVar = (C50812di) djVar.toBuilder();
            diVar.mo58885m(C50759bx.f132089d, bxVar2);
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            C50813dj djVar2 = (C50813dj) diVar.build();
            djVar2.getClass();
            doVar2.f132329z = djVar2;
            doVar2.f132304a |= 33554432;
        }
        C50729n nVar = doVar.f132327x;
        if (nVar == null) {
            nVar = C50729n.f132007g;
        }
        if ((nVar.f132009a & 16) != 0 && (doVar.f132304a & 1048576) == 0) {
            C50729n nVar2 = doVar.f132327x;
            if (nVar2 == null) {
                nVar2 = C50729n.f132007g;
            }
            byte[] N = nVar2.f132013e.mo59174N();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(N, 0, N.length);
            if (decodeByteArray == null) {
                ((C58970a) ((C58970a) bVar.f357679a.mo56225c()).mo56372aa(38937)).mo56386p("Could not decode bitmap.");
            } else {
                int width = decodeByteArray.getWidth();
                if (decodeByteArray.getHeight() != width) {
                    ((C58970a) ((C58970a) bVar.f357679a.mo56226d()).mo56372aa(38936)).mo56386p("Bitmap is not square.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Rect rect = new Rect(0, 0, width, width);
                float f = ((float) width) / 2.0f;
                canvas.drawCircle(f, f, f, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(decodeByteArray, rect, rect, paint);
                C63087y v = C63088z.m96150v();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, v);
                C50729n nVar3 = doVar.f132327x;
                if (nVar3 == null) {
                    nVar3 = C50729n.f132007g;
                }
                C50728m mVar = (C50728m) nVar3.toBuilder();
                C63088z b = v.mo59165b();
                mVar.copyOnWrite();
                C50729n nVar4 = (C50729n) mVar.instance;
                b.getClass();
                nVar4.f132009a |= 16;
                nVar4.f132013e = b;
                cnVar.copyOnWrite();
                C50818do doVar3 = (C50818do) cnVar.instance;
                C50729n nVar5 = (C50729n) mVar.build();
                nVar5.getClass();
                doVar3.f132326w = nVar5;
                doVar3.f132304a |= 1048576;
            }
            cnVar.copyOnWrite();
            C50818do doVar4 = (C50818do) cnVar.instance;
            doVar4.f132327x = null;
            doVar4.f132304a &= -2097153;
        }
        return (C50818do) cnVar.build();
    }
}

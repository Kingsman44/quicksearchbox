package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14276df;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14278dh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14328fd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14329fe;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14332fh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14360gi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14497lk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.c */
/* compiled from: PG */
public final class C15375c {

    /* renamed from: a */
    public static final C59071e f46152a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.h.c");

    /* renamed from: a */
    public static Bitmap m31983a(C14361gj gjVar) {
        try {
            byte[] N = gjVar.f43458a.mo59174N();
            ByteBuffer wrap = ByteBuffer.wrap(N);
            IntBuffer allocate = IntBuffer.allocate(N.length >> 2);
            allocate.put(wrap.asIntBuffer());
            return Bitmap.createBitmap(allocate.array(), gjVar.f43459b, gjVar.f43460c, Bitmap.Config.valueOf(gjVar.f43461d));
        } catch (RuntimeException e) {
            C59104x c = f46152a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.BitmapUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46088)).mo56386p("Cannot retrieve bitmap");
            return null;
        }
    }

    /* renamed from: b */
    public static Bitmap m31984b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawCircle(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f, ((float) bitmap.getWidth()) / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: c */
    public static C14361gj m31985c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        String config = bitmap.getConfig().toString();
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        C58976aa aaVar = C58975e.f156826a;
        try {
            C14360gi giVar = (C14360gi) C14361gj.f43456e.createBuilder();
            ByteBuffer allocate = ByteBuffer.allocate(i * 4);
            allocate.asIntBuffer().put(iArr);
            C63088z A = C63088z.m96139A(allocate.array());
            giVar.copyOnWrite();
            ((C14361gj) giVar.instance).f43458a = A;
            giVar.copyOnWrite();
            ((C14361gj) giVar.instance).f43459b = width;
            giVar.copyOnWrite();
            ((C14361gj) giVar.instance).f43460c = height;
            giVar.copyOnWrite();
            config.getClass();
            ((C14361gj) giVar.instance).f43461d = config;
            return (C14361gj) giVar.build();
        } catch (RuntimeException e) {
            C59104x c = f46152a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.BitmapUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46090)).mo56386p("Cannot convert to bitmap");
            return null;
        }
    }

    /* renamed from: d */
    public static void m31986d(C14499lm lmVar) {
        C14278dh dhVar;
        C14329fe feVar;
        C14278dh dhVar2;
        C14278dh dhVar3;
        C14329fe feVar2;
        C14278dh dhVar4;
        C14329fe feVar3;
        C14278dh dhVar5;
        C14329fe feVar4;
        C14361gj gjVar;
        if (lmVar.f43850a == 3) {
            dhVar = (C14278dh) lmVar.f43851b;
        } else {
            dhVar = C14278dh.f43183g;
        }
        if (dhVar.f43185a == 3) {
            feVar = (C14329fe) dhVar.f43186b;
        } else {
            feVar = C14329fe.f43345c;
        }
        C14333fi fiVar = feVar.f43348b;
        if (fiVar == null) {
            fiVar = C14333fi.f43350q;
        }
        if (fiVar.f43352a == 6) {
            C14497lk lkVar = (C14497lk) lmVar.toBuilder();
            if (lmVar.f43850a == 3) {
                dhVar2 = (C14278dh) lmVar.f43851b;
            } else {
                dhVar2 = C14278dh.f43183g;
            }
            C14276df dfVar = (C14276df) dhVar2.toBuilder();
            if (lmVar.f43850a == 3) {
                dhVar3 = (C14278dh) lmVar.f43851b;
            } else {
                dhVar3 = C14278dh.f43183g;
            }
            if (dhVar3.f43185a == 3) {
                feVar2 = (C14329fe) dhVar3.f43186b;
            } else {
                feVar2 = C14329fe.f43345c;
            }
            C14328fd fdVar = (C14328fd) feVar2.toBuilder();
            if (lmVar.f43850a == 3) {
                dhVar4 = (C14278dh) lmVar.f43851b;
            } else {
                dhVar4 = C14278dh.f43183g;
            }
            if (dhVar4.f43185a == 3) {
                feVar3 = (C14329fe) dhVar4.f43186b;
            } else {
                feVar3 = C14329fe.f43345c;
            }
            C14333fi fiVar2 = feVar3.f43348b;
            if (fiVar2 == null) {
                fiVar2 = C14333fi.f43350q;
            }
            C14332fh fhVar = (C14332fh) fiVar2.toBuilder();
            if (lmVar.f43850a == 3) {
                dhVar5 = (C14278dh) lmVar.f43851b;
            } else {
                dhVar5 = C14278dh.f43183g;
            }
            if (dhVar5.f43185a == 3) {
                feVar4 = (C14329fe) dhVar5.f43186b;
            } else {
                feVar4 = C14329fe.f43345c;
            }
            C14333fi fiVar3 = feVar4.f43348b;
            if (fiVar3 == null) {
                fiVar3 = C14333fi.f43350q;
            }
            if (fiVar3.f43352a == 6) {
                gjVar = (C14361gj) fiVar3.f43353b;
            } else {
                gjVar = C14361gj.f43456e;
            }
            C14360gi giVar = (C14360gi) gjVar.toBuilder();
            giVar.copyOnWrite();
            ((C14361gj) giVar.instance).f43458a = C14361gj.f43456e.f43458a;
            fhVar.copyOnWrite();
            C14333fi fiVar4 = (C14333fi) fhVar.instance;
            C14361gj gjVar2 = (C14361gj) giVar.build();
            gjVar2.getClass();
            fiVar4.f43353b = gjVar2;
            fiVar4.f43352a = 6;
            fdVar.copyOnWrite();
            C14333fi fiVar5 = (C14333fi) fhVar.build();
            fiVar5.getClass();
            ((C14329fe) fdVar.instance).f43348b = fiVar5;
            dfVar.copyOnWrite();
            C14278dh dhVar6 = (C14278dh) dfVar.instance;
            C14329fe feVar5 = (C14329fe) fdVar.build();
            feVar5.getClass();
            dhVar6.f43186b = feVar5;
            dhVar6.f43185a = 3;
            lkVar.copyOnWrite();
            C14499lm lmVar2 = (C14499lm) lkVar.instance;
            C14278dh dhVar7 = (C14278dh) dfVar.build();
            dhVar7.getClass();
            lmVar2.f43851b = dhVar7;
            lmVar2.f43850a = 3;
            C14499lm lmVar3 = (C14499lm) lkVar.build();
        }
    }
}

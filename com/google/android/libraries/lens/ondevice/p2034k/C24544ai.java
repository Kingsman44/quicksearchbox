package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.lens.p4701g.C62253ac;
import com.google.p4172bg.C55746g;
import com.google.p4172bg.C55747h;
import com.google.p4172bg.p4174b.C55715d;
import com.google.p4172bg.p4174b.C55721j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ai */
/* compiled from: PG */
public final /* synthetic */ class C24544ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ C62253ac f67224a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f67225b;

    public /* synthetic */ C24544ai(C62253ac acVar, Bitmap bitmap) {
        this.f67224a = acVar;
        this.f67225b = bitmap;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        float f;
        int i;
        int i2;
        C62253ac acVar = this.f67224a;
        Bitmap bitmap = this.f67225b;
        C55715d dVar = ((C55721j) obj).f147021c;
        if (dVar == null) {
            dVar = C55715d.f146997g;
        }
        float f2 = 0.0f;
        if (bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0 || (i = acVar.f168072g) <= 0 || (i2 = acVar.f168073h) <= 0 || acVar.f168075j <= 0 || acVar.f168074i <= 0) {
            f = 0.0f;
        } else {
            float f3 = (float) i2;
            float width = (float) bitmap.getWidth();
            float height = ((float) bitmap.getHeight()) - ((float) i);
            if (width - f3 <= height) {
                f3 = width - height;
            }
            float f4 = f3 / width;
            float f5 = ((float) acVar.f168075j) / f4;
            f = ((float) acVar.f168074i) / f4;
            f2 = f5;
        }
        float cos = (float) Math.cos(Math.toRadians((double) (-dVar.f147004f)));
        float sin = (float) Math.sin(Math.toRadians((double) (-dVar.f147004f)));
        int i3 = dVar.f147000b;
        int i4 = dVar.f147001c;
        C55746g gVar = (C55746g) C55747h.f147114g.createBuilder();
        int round = Math.round((((float) i3) - (f2 * cos)) - (f * sin));
        gVar.copyOnWrite();
        C55747h hVar = (C55747h) gVar.instance;
        hVar.f147116a |= 1;
        hVar.f147117b = round;
        int round2 = Math.round((((float) i4) + (sin * f2)) - (cos * f));
        gVar.copyOnWrite();
        C55747h hVar2 = (C55747h) gVar.instance;
        hVar2.f147116a |= 2;
        hVar2.f147118c = round2;
        int round3 = Math.round(((float) dVar.f147002d) + f2 + f2);
        gVar.copyOnWrite();
        C55747h hVar3 = (C55747h) gVar.instance;
        hVar3.f147116a |= 4;
        hVar3.f147119d = round3;
        int round4 = Math.round(((float) dVar.f147003e) + f + f);
        gVar.copyOnWrite();
        C55747h hVar4 = (C55747h) gVar.instance;
        hVar4.f147116a |= 8;
        hVar4.f147120e = round4;
        float f6 = dVar.f147004f;
        gVar.copyOnWrite();
        C55747h hVar5 = (C55747h) gVar.instance;
        hVar5.f147116a |= 16;
        hVar5.f147121f = f6;
        return (C55747h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

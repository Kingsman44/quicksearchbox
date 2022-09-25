package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1064c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c.b */
/* compiled from: PG */
public final /* synthetic */ class C14030b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C14030b f42646a = new C14030b();

    private /* synthetic */ C14030b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        Bitmap bitmap;
        Uri uri;
        C52174hz hzVar = (C52174hz) obj;
        if ((hzVar.f136894a & 1) != 0) {
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C52567wn b = C52567wn.m86649b(woVar.f138003j);
            if (b == null) {
                b = C52567wn.UNKNOWN;
            }
            optional = Optional.m71637of(b.name() + "||" + hzVar.f136895b);
        } else {
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            C59104x d = C14035g.f42652a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NewsBrowserCntPrvdr");
            ((C59052c) ((C59052c) d).mo56372aa(45305)).mo56386p("Skipping MediaItem because of missing mediaId");
            return Optional.empty();
        }
        C52568wo woVar2 = hzVar.f136897d;
        if (woVar2 == null) {
            woVar2 = C52568wo.f137992v;
        }
        String str = (String) optional.get();
        String str2 = woVar2.f137998e;
        String str3 = woVar2.f138000g;
        Uri parse = Uri.parse(hzVar.f136895b);
        C51012dc dcVar = woVar2.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        if ((dcVar.f132815a & 8) != 0) {
            C51012dc dcVar2 = woVar2.f138004k;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            C63088z zVar = dcVar2.f132819e;
            bitmap = BitmapFactory.decodeByteArray(zVar.mo59174N(), 0, zVar.mo59031d());
        } else {
            bitmap = null;
        }
        C51012dc dcVar3 = woVar2.f138004k;
        if (((dcVar3 == null ? C51012dc.f132813k : dcVar3).f132815a & 2) != 0) {
            if (dcVar3 == null) {
                dcVar3 = C51012dc.f132813k;
            }
            uri = Uri.parse(dcVar3.f132817c);
        } else {
            uri = null;
        }
        return Optional.m71637of(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat(str, str2, str3, (CharSequence) null, bitmap, uri, (Bundle) null, parse), 2));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}

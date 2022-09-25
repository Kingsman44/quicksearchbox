package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8652h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.C63088z;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.h.b */
/* compiled from: PG */
public final /* synthetic */ class C115488b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C115492f f320336a;

    public /* synthetic */ C115488b(C115492f fVar) {
        this.f320336a = fVar;
    }

    public final Object apply(Object obj) {
        Bitmap bitmap;
        Uri uri;
        C115492f fVar = this.f320336a;
        C52176ia e = fVar.mo102053e((C52176ia) obj);
        if (fVar.f320343c.mo79746e(C90014bt.f247489iC)) {
            fVar.mo102054f(e);
        }
        ArrayList arrayList = new ArrayList();
        for (C52174hz hzVar : e.f136914b) {
            C58833ax a = C115485b.m191567a(hzVar);
            if (a.mo56113h()) {
                C52568wo woVar = hzVar.f136897d;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                String str = (String) a.mo56107c();
                String str2 = woVar.f137998e;
                String str3 = woVar.f138000g;
                Uri parse = Uri.parse(hzVar.f136895b);
                C51012dc dcVar = woVar.f138004k;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                if ((dcVar.f132815a & 8) != 0) {
                    C51012dc dcVar2 = woVar.f138004k;
                    if (dcVar2 == null) {
                        dcVar2 = C51012dc.f132813k;
                    }
                    C63088z zVar = dcVar2.f132819e;
                    bitmap = BitmapFactory.decodeByteArray(zVar.mo59174N(), 0, zVar.mo59031d());
                } else {
                    bitmap = null;
                }
                C51012dc dcVar3 = woVar.f138004k;
                if (((dcVar3 == null ? C51012dc.f132813k : dcVar3).f132815a & 2) != 0) {
                    if (dcVar3 == null) {
                        dcVar3 = C51012dc.f132813k;
                    }
                    uri = Uri.parse(dcVar3.f132817c);
                } else {
                    uri = null;
                }
                arrayList.add(C115492f.m191577c(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat(str, str2, str3, (CharSequence) null, bitmap, uri, (Bundle) null, parse), 2)));
            }
        }
        return arrayList;
    }
}

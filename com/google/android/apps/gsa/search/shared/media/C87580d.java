package com.google.android.apps.gsa.search.shared.media;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.adu;
import com.google.common.p4552o.adv;
import com.google.common.p4552o.adw;
import com.google.common.p4552o.adx;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.shared.media.d */
/* compiled from: PG */
public final class C87580d {

    /* renamed from: a */
    public static final C59071e f236621a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.media.d");

    /* renamed from: b */
    private static final C58495hd f236622b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(6, 6);
        gzVar.mo55429h(7, 7);
        gzVar.mo55429h(4, 4);
        gzVar.mo55429h(0, 0);
        gzVar.mo55429h(2, 2);
        gzVar.mo55429h(3, 3);
        gzVar.mo55429h(5, 5);
        gzVar.mo55429h(10, 10);
        gzVar.mo55429h(9, 9);
        gzVar.mo55429h(1, 1);
        f236622b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static void m142368a(C87594r rVar) {
        adw adw = (adw) adx.f158423e.createBuilder();
        MediaController a = rVar.mo81722a(BuildConfig.FLAVOR, false, true);
        if (a == null) {
            ((C59052c) ((C59052c) f236621a.mo56224b()).mo56372aa(9617)).mo56386p("#logMediaContent: Failed to get active media controller.");
            adw.copyOnWrite();
            adx adx = (adx) adw.instance;
            adx.f158425a |= 1;
            adx.f158426b = BuildConfig.FLAVOR;
        } else {
            String packageName = a.getPackageName();
            adw.copyOnWrite();
            adx adx2 = (adx) adw.instance;
            packageName.getClass();
            adx2.f158425a |= 1;
            adx2.f158426b = packageName;
            if (a.getPlaybackState() != null) {
                int intValue = ((Integer) f236622b.getOrDefault(Integer.valueOf(a.getPlaybackState().getState()), 0)).intValue();
                adw.copyOnWrite();
                adx adx3 = (adx) adw.instance;
                adx3.f158425a |= 2;
                adx3.f158427c = intValue;
            }
            MediaMetadata metadata = a.getMetadata();
            if (metadata != null) {
                adu adu = (adu) adv.f158410l.createBuilder();
                String string = metadata.getString("android.media.metadata.TITLE");
                if (!TextUtils.isEmpty(string)) {
                    adu.copyOnWrite();
                    adv adv = (adv) adu.instance;
                    string.getClass();
                    adv.f158412a = 1 | adv.f158412a;
                    adv.f158413b = string;
                }
                String string2 = metadata.getString("android.media.metadata.ARTIST");
                if (!TextUtils.isEmpty(string2)) {
                    adu.copyOnWrite();
                    adv adv2 = (adv) adu.instance;
                    string2.getClass();
                    adv2.f158412a |= 2;
                    adv2.f158414c = string2;
                }
                String string3 = metadata.getString("android.media.metadata.ALBUM");
                if (!TextUtils.isEmpty(string3)) {
                    adu.copyOnWrite();
                    adv adv3 = (adv) adu.instance;
                    string3.getClass();
                    adv3.f158412a |= 4;
                    adv3.f158415d = string3;
                }
                String string4 = metadata.getString("android.media.metadata.AUTHOR");
                if (!TextUtils.isEmpty(string4)) {
                    adu.copyOnWrite();
                    adv adv4 = (adv) adu.instance;
                    string4.getClass();
                    adv4.f158412a |= 8;
                    adv4.f158416e = string4;
                }
                long j = metadata.getLong("android.media.metadata.DURATION");
                if (j > 0) {
                    adu.copyOnWrite();
                    adv adv5 = (adv) adu.instance;
                    adv5.f158412a |= 16;
                    adv5.f158417f = j;
                }
                String string5 = metadata.getString("android.media.metadata.GENRE");
                if (!TextUtils.isEmpty(string5)) {
                    adu.copyOnWrite();
                    adv adv6 = (adv) adu.instance;
                    string5.getClass();
                    adv6.f158412a |= 32;
                    adv6.f158418g = string5;
                }
                String string6 = metadata.getString("android.media.metadata.MEDIA_ID");
                if (!TextUtils.isEmpty(string6)) {
                    adu.copyOnWrite();
                    adv adv7 = (adv) adu.instance;
                    string6.getClass();
                    adv7.f158412a |= 64;
                    adv7.f158419h = string6;
                }
                String string7 = metadata.getString("android.media.metadata.MEDIA_URI");
                if (!TextUtils.isEmpty(string7)) {
                    adu.copyOnWrite();
                    adv adv8 = (adv) adu.instance;
                    string7.getClass();
                    adv8.f158412a |= 128;
                    adv8.f158420i = string7;
                }
                long j2 = metadata.getLong("android.media.metadata.TRACK_NUMBER");
                if (j2 > 0) {
                    adu.copyOnWrite();
                    adv adv9 = (adv) adu.instance;
                    adv9.f158412a |= 256;
                    adv9.f158421j = j2;
                }
                long j3 = metadata.getLong("android.media.metadata.YEAR");
                if (j3 > 0) {
                    adu.copyOnWrite();
                    adv adv10 = (adv) adu.instance;
                    adv10.f158412a |= 512;
                    adv10.f158422k = j3;
                }
                adv adv11 = (adv) adu.build();
                adw.copyOnWrite();
                adx adx4 = (adx) adw.instance;
                adv11.getClass();
                adx4.f158428d = adv11;
                adx4.f158425a |= 4;
            }
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1182;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        adx adx5 = (adx) adw.build();
        adx5.getClass();
        ufVar2.f164224cb = adx5;
        ufVar2.f164254i |= C89885b.NOW_VALUE;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}

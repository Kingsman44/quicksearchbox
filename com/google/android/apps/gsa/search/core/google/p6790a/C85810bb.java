package com.google.android.apps.gsa.search.core.google.p6790a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87576a;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.media.C87596t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51445hz;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3917i.p3918a.C51449ic;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3917i.p3918a.C51452if;
import com.google.assistant.p3897e.p3917i.p3918a.C51454ih;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60861co;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.bb */
/* compiled from: PG */
public final class C85810bb {

    /* renamed from: a */
    public static final C59071e f232032a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.bb");

    /* renamed from: d */
    private static final C58495hd f232033d;

    /* renamed from: e */
    private static final C58495hd f232034e;

    /* renamed from: f */
    private static final C58495hd f232035f;

    /* renamed from: b */
    public final C86124t f232036b;

    /* renamed from: c */
    final C87594r f232037c;

    /* renamed from: g */
    private final SharedPreferences f232038g;

    /* renamed from: h */
    private final C68214a f232039h;

    /* renamed from: i */
    private final C68214a f232040i;

    /* renamed from: j */
    private final C68214a f232041j;

    /* renamed from: k */
    private final C68214a f232042k;

    /* renamed from: l */
    private final C58833ax f232043l;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C87596t.NONE, C51452if.UNKNOWN_STATE);
        gzVar.mo55429h(C87596t.BUFFERING, C51452if.BUFFERING);
        gzVar.mo55429h(C87596t.ERROR, C51452if.ERROR);
        gzVar.mo55429h(C87596t.FAST_FORWARDING, C51452if.FAST_FORWARDING);
        gzVar.mo55429h(C87596t.PAUSED, C51452if.PAUSED);
        gzVar.mo55429h(C87596t.PLAYING, C51452if.PLAYING);
        gzVar.mo55429h(C87596t.REWINDING, C51452if.REWINDING);
        gzVar.mo55429h(C87596t.SKIPPING_TO_NEXT, C51452if.SKIPPING_TO_NEXT);
        gzVar.mo55429h(C87596t.SKIPPING_TO_PREVIOUS, C51452if.SKIPPING_TO_PREVIOUS);
        gzVar.mo55429h(C87596t.STOPPED, C51452if.STOPPED);
        f232033d = C58662ni.m90343b(gzVar.mo55427f(false));
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(6, C51452if.BUFFERING);
        gzVar2.mo55429h(7, C51452if.ERROR);
        gzVar2.mo55429h(4, C51452if.FAST_FORWARDING);
        gzVar2.mo55429h(0, C51452if.UNKNOWN_STATE);
        gzVar2.mo55429h(2, C51452if.PAUSED);
        gzVar2.mo55429h(3, C51452if.PLAYING);
        gzVar2.mo55429h(5, C51452if.REWINDING);
        gzVar2.mo55429h(10, C51452if.SKIPPING_TO_NEXT);
        gzVar2.mo55429h(9, C51452if.SKIPPING_TO_PREVIOUS);
        gzVar2.mo55429h(1, C51452if.STOPPED);
        f232034e = gzVar2.mo55427f(false);
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h(64L, C51454ih.FAST_FORWARD);
        gzVar3.mo55429h(2L, C51454ih.PAUSE);
        gzVar3.mo55429h(4L, C51454ih.PLAY);
        gzVar3.mo55429h(2048L, C51454ih.PLAY_FROM_SEARCH);
        gzVar3.mo55429h(8192L, C51454ih.PLAY_FROM_URI);
        gzVar3.mo55429h(8L, C51454ih.REWIND);
        gzVar3.mo55429h(256L, C51454ih.SEEK_TO);
        gzVar3.mo55429h(128L, C51454ih.SET_RATING);
        gzVar3.mo55429h(262144L, C51454ih.SET_REPEAT_MODE);
        gzVar3.mo55429h(2097152L, C51454ih.SHUFFLE);
        gzVar3.mo55429h(32L, C51454ih.SKIP_TO_NEXT);
        gzVar3.mo55429h(16L, C51454ih.SKIP_TO_PREVIOUS);
        gzVar3.mo55429h(4096L, C51454ih.SKIP_TO_QUEUE_ITEM);
        gzVar3.mo55429h(1L, C51454ih.STOP);
        f232035f = gzVar3.mo55427f(false);
    }

    public C85810bb(SharedPreferences sharedPreferences, C68214a aVar, C86124t tVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, Context context, C22871g gVar, C22871g gVar2, C58833ax axVar) {
        this.f232038g = sharedPreferences;
        this.f232039h = aVar;
        this.f232036b = tVar;
        this.f232040i = aVar2;
        this.f232041j = aVar3;
        this.f232042k = aVar4;
        this.f232043l = axVar;
        this.f232037c = new C87594r(context, gVar, gVar2);
    }

    /* renamed from: f */
    public static C52232kc m137872f(C51450id idVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "media";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.MediaParams";
        C63088z byteString = idVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: i */
    private static C52568wo m137873i(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
            return null;
        }
        C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            wjVar.copyOnWrite();
            C52568wo woVar = (C52568wo) wjVar.instance;
            str.getClass();
            woVar.f137994a |= 1;
            woVar.f137998e = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            wjVar.copyOnWrite();
            C52568wo woVar2 = (C52568wo) wjVar.instance;
            str2.getClass();
            woVar2.f137994a |= 2;
            woVar2.f137999f = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            wjVar.copyOnWrite();
            C52568wo woVar3 = (C52568wo) wjVar.instance;
            str3.getClass();
            woVar3.f137994a |= 8;
            woVar3.f138000g = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            wjVar.copyOnWrite();
            C52568wo woVar4 = (C52568wo) wjVar.instance;
            str4.getClass();
            woVar4.f137994a |= 32;
            woVar4.f138002i = str4;
        }
        return (C52568wo) wjVar.build();
    }

    /* renamed from: j */
    private final C58833ax m137874j() {
        if (this.f232043l.mo56113h() && this.f232036b.mo79746e(C90086ek.f250296aU)) {
            try {
                C51449ic icVar = (C51449ic) C60861co.m92917c(((C42876ab) this.f232043l.mo56107c()).mo46042d(), IOException.class, this.f232036b.mo79743a(C90086ek.f250375bu), TimeUnit.MILLISECONDS);
                if (!icVar.equals(C51449ic.f133990a)) {
                    return C58833ax.m90834k(icVar);
                }
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f232032a.mo56225c()).mo56382g(e)).mo56372aa(7986)).mo56386p("Getting station name data failed");
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: k */
    private final String m137875k() {
        return this.f232038g.getString("opa_on_auto_oem_radio_sticky_app", BuildConfig.FLAVOR);
    }

    /* renamed from: l */
    private final boolean m137876l(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setPackage(str);
            intent.setAction("android.media.action.MEDIA_PLAY_FROM_SEARCH");
            if (((PackageManager) this.f232039h.mo27525b()).resolveActivity(intent, 65536) != null) {
                if (this.f232036b.mo79745c(C90014bt.f247460ha).contains(str) || ((C87576a) this.f232041j.mo27525b()).mo81719a(str)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C51447ia mo79454b(C0320v vVar, boolean z) {
        PlaybackStateCompat f;
        MediaMetadataCompat d;
        if (vVar == null || (f = vVar.mo1038f()) == null || (d = vVar.mo1036d()) == null) {
            return null;
        }
        C51445hz hzVar = (C51445hz) C51447ia.f133979i.createBuilder();
        hzVar.copyOnWrite();
        C51447ia iaVar = (C51447ia) hzVar.instance;
        iaVar.f133985e = ((C51452if) f232034e.getOrDefault(Integer.valueOf(f.f994a), C51452if.UNKNOWN_STATE)).f134016m;
        iaVar.f133981a |= 16;
        List g = mo79458g(f.f998e);
        if (!g.isEmpty()) {
            hzVar.mo53620a(g);
        }
        C51098gh a = C85813be.m137887a(vVar.mo1039g(), (PackageManager) this.f232039h.mo27525b());
        if (a != null) {
            hzVar.copyOnWrite();
            C51447ia iaVar2 = (C51447ia) hzVar.instance;
            iaVar2.f133982b = a;
            iaVar2.f133981a |= 1;
        }
        if (!z) {
            return (C51447ia) hzVar.build();
        }
        C52568wo i = m137873i(d.mo821f("android.media.metadata.TITLE"), d.mo821f("android.media.metadata.ARTIST"), d.mo821f("android.media.metadata.ALBUM"), d.mo821f("android.media.metadata.DISPLAY_DESCRIPTION"));
        if (i != null) {
            hzVar.copyOnWrite();
            C51447ia iaVar3 = (C51447ia) hzVar.instance;
            iaVar3.f133983c = i;
            iaVar3.f133981a |= 4;
        }
        long j = f.f995b;
        hzVar.copyOnWrite();
        C51447ia iaVar4 = (C51447ia) hzVar.instance;
        iaVar4.f133981a |= 64;
        iaVar4.f133987g = j;
        return (C51447ia) hzVar.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3897e.p3917i.p3918a.C51450id mo79455c(java.util.List r9, com.google.android.apps.gsa.shared.search.Query r10, boolean r11) {
        /*
            r8 = this;
            android.content.SharedPreferences r0 = r8.f232038g
            java.lang.String r1 = "opa_android_media_focus_device_id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0011:
            r1 = r2
            goto L_0x006e
        L_0x0013:
            android.content.SharedPreferences r1 = r8.f232038g
            java.lang.String r3 = "opa_android_media_focus_expiration_timestamp_ms"
            r4 = 0
            long r6 = r1.getLong(r3, r4)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0022
            goto L_0x0011
        L_0x0022:
            r1 = 0
            byte[] r1 = android.util.Base64.decode(r0, r1)     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.j.rj r3 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m     // Catch:{ ct -> 0x005f }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r1)     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.j.rj r1 = (com.google.assistant.p3897e.p3921j.C52428rj) r1     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.i.a.hx r3 = com.google.assistant.p3897e.p3917i.p3918a.C51443hx.f133974d     // Catch:{ ct -> 0x005f }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.i.a.hw r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51442hw) r3     // Catch:{ ct -> 0x005f }
            r3.copyOnWrite()     // Catch:{ ct -> 0x005f }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.i.a.hx r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51443hx) r4     // Catch:{ ct -> 0x005f }
            r1.getClass()     // Catch:{ ct -> 0x005f }
            r4.f133977b = r1     // Catch:{ ct -> 0x005f }
            int r1 = r4.f133976a     // Catch:{ ct -> 0x005f }
            r1 = r1 | 1
            r4.f133976a = r1     // Catch:{ ct -> 0x005f }
            r3.copyOnWrite()     // Catch:{ ct -> 0x005f }
            com.google.protobuf.bv r1 = r3.instance     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.i.a.hx r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51443hx) r1     // Catch:{ ct -> 0x005f }
            int r4 = r1.f133976a     // Catch:{ ct -> 0x005f }
            r4 = r4 | 2
            r1.f133976a = r4     // Catch:{ ct -> 0x005f }
            r1.f133978c = r6     // Catch:{ ct -> 0x005f }
            com.google.protobuf.bv r1 = r3.build()     // Catch:{ ct -> 0x005f }
            com.google.assistant.e.i.a.hx r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51443hx) r1     // Catch:{ ct -> 0x005f }
            goto L_0x006e
        L_0x005f:
            r1 = move-exception
            com.google.common.f.e r3 = f232032a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Failed to parse DeviceId from stored device id %s"
            r5 = 7968(0x1f20, float:1.1166E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r5)).mo56389s(r4, r0)
            goto L_0x0011
        L_0x006e:
            if (r11 != 0) goto L_0x0076
            if (r10 == 0) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            r10 = r2
            r11 = r10
            goto L_0x0094
        L_0x0076:
            java.lang.Object r11 = com.google.common.p4522b.C58557jl.m90130k(r9, r2)
            com.google.assistant.e.i.a.ia r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r11
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.c.c.gh r11 = r8.mo79453a(r11, r10, r0)
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90130k(r9, r2)
            com.google.assistant.e.i.a.ia r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r0
            java.lang.String r3 = r8.m137875k()
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            com.google.assistant.e.c.c.gh r10 = r8.mo79453a(r0, r10, r3)
        L_0x0094:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00ad
            if (r1 != 0) goto L_0x00ad
            if (r11 == 0) goto L_0x009f
            goto L_0x00ad
        L_0x009f:
            com.google.common.f.e r9 = f232032a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r10 = "Failed to populate MediaParams, no media session, media focus, or sticky app."
            r11 = 7978(0x1f2a, float:1.118E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r11)).mo56386p(r10)
            return r2
        L_0x00ad:
            com.google.assistant.e.i.a.id r0 = com.google.assistant.p3897e.p3917i.p3918a.C51450id.f133992h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.i.a.hy r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51444hy) r0
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x00be
            r0.mo53617b(r9)
        L_0x00be:
            if (r1 == 0) goto L_0x00cf
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.assistant.e.i.a.id r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r9
            r9.f133996c = r1
            int r1 = r9.f133994a
            r1 = r1 | 1
            r9.f133994a = r1
        L_0x00cf:
            if (r11 == 0) goto L_0x00e0
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.assistant.e.i.a.id r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r9
            r9.f133997d = r11
            int r11 = r9.f133994a
            r11 = r11 | 2
            r9.f133994a = r11
        L_0x00e0:
            if (r10 == 0) goto L_0x00f1
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.assistant.e.i.a.id r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r9
            r9.f133998e = r10
            int r10 = r9.f133994a
            r10 = r10 | 4
            r9.f133994a = r10
        L_0x00f1:
            com.google.common.base.ax r9 = r8.m137874j()
            boolean r10 = r9.mo56113h()
            if (r10 == 0) goto L_0x0104
            java.lang.Object r9 = r9.mo56107c()
            com.google.assistant.e.i.a.ic r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51449ic) r9
            r0.mo53619d(r9)
        L_0x0104:
            com.google.protobuf.bv r9 = r0.build()
            com.google.assistant.e.i.a.id r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6790a.C85810bb.mo79455c(java.util.List, com.google.android.apps.gsa.shared.search.Query, boolean):com.google.assistant.e.i.a.id");
    }

    /* renamed from: d */
    public final C52232kc mo79456d(C0320v vVar) {
        boolean h = mo79459h();
        if (h || this.f232036b.mo79746e(C90014bt.f247691lt)) {
            ArrayList arrayList = new ArrayList();
            C51447ia b = mo79454b(vVar, h);
            if (b != null) {
                arrayList.add(b);
            }
            C51450id c = mo79455c(arrayList, (Query) null, false);
            if (c != null) {
                return m137872f(c);
            }
            return null;
        }
        ((C59052c) ((C59052c) f232032a.mo56226d()).mo56372aa(7979)).mo56386p("Signed-out user adding partial media session info from mediacontroller not available.");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0278 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3897e.p3921j.C52232kc mo79457e(com.google.android.apps.gsa.search.shared.media.PlaybackStatus r11, com.google.android.apps.gsa.shared.search.Query r12) {
        /*
            r10 = this;
            com.google.assistant.e.i.a.id r0 = com.google.assistant.p3897e.p3917i.p3918a.C51450id.f133992h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.i.a.hy r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51444hy) r0
            r1 = 0
            if (r12 == 0) goto L_0x0052
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.c.c.gh r2 = r10.mo79453a(r1, r12, r2)
            java.lang.String r3 = r10.m137875k()
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            com.google.assistant.e.c.c.gh r3 = r10.mo79453a(r1, r12, r3)
            if (r2 == 0) goto L_0x002e
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.i.a.id r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r4
            r4.f133997d = r2
            int r2 = r4.f133994a
            r2 = r2 | 2
            r4.f133994a = r2
        L_0x002e:
            if (r3 == 0) goto L_0x003f
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.i.a.id r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r2
            r2.f133998e = r3
            int r3 = r2.f133994a
            r3 = r3 | 4
            r2.f133994a = r3
        L_0x003f:
            com.google.common.base.ax r2 = r10.m137874j()
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r2 = r2.mo56107c()
            com.google.assistant.e.i.a.ic r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51449ic) r2
            r0.mo53619d(r2)
        L_0x0052:
            boolean r2 = r10.mo79459h()
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.i.a.id r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r0
            if (r2 != 0) goto L_0x0086
            com.google.android.apps.gsa.search.core.i.t r2 = r10.f232036b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247691lt
            boolean r2 = r2.mo79746e(r3)
            if (r2 != 0) goto L_0x0086
            com.google.common.f.e r11 = f232032a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r12 = "Signed-out user adding partial media session info not available."
            r2 = 7983(0x1f2f, float:1.1187E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r2)).mo56386p(r12)
            int r11 = r0.f133994a
            r12 = r11 & 2
            if (r12 == 0) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0081
            return r1
        L_0x0081:
            com.google.assistant.e.j.kc r11 = m137872f(r0)
            return r11
        L_0x0086:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.getClass()
            java.lang.String r2 = "android.speech.extra.PLAYBACK_STATUS_FROM_CLIENT"
            android.os.Parcelable r2 = r12.mo84478h(r2)
            com.google.android.apps.gsa.search.shared.media.PlaybackStatus r2 = (com.google.android.apps.gsa.search.shared.media.PlaybackStatus) r2
            if (r2 == 0) goto L_0x0099
            r11 = r2
        L_0x0099:
            boolean r2 = r12.mo84411cr()
            if (r2 == 0) goto L_0x00a2
        L_0x009f:
            r2 = r1
            goto L_0x0146
        L_0x00a2:
            if (r11 != 0) goto L_0x00a5
            goto L_0x009f
        L_0x00a5:
            com.google.assistant.e.i.a.ia r2 = com.google.assistant.p3897e.p3917i.p3918a.C51447ia.f133979i
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.i.a.hz r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51445hz) r2
            com.google.common.b.hd r3 = f232033d
            com.google.android.apps.gsa.search.shared.media.t r4 = r11.f236604a
            boolean r4 = r3.containsKey(r4)
            if (r4 == 0) goto L_0x00c0
            com.google.android.apps.gsa.search.shared.media.t r4 = r11.f236604a
            java.lang.Object r3 = r3.get(r4)
            com.google.assistant.e.i.a.if r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51452if) r3
            goto L_0x00c2
        L_0x00c0:
            com.google.assistant.e.i.a.if r3 = com.google.assistant.p3897e.p3917i.p3918a.C51452if.UNKNOWN_STATE
        L_0x00c2:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.i.a.ia r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r4
            int r3 = r3.f134016m
            r4.f133985e = r3
            int r3 = r4.f133981a
            r3 = r3 | 16
            r4.f133981a = r3
            long r3 = r11.f236611h
            java.util.List r3 = r10.mo79458g(r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x00e2
            r2.mo53620a(r3)
        L_0x00e2:
            java.lang.String r3 = r11.f236609f
            dagger.a r4 = r10.f232039h
            java.lang.Object r4 = r4.mo27525b()
            android.content.pm.PackageManager r4 = (android.content.pm.PackageManager) r4
            com.google.assistant.e.c.c.gh r3 = com.google.android.apps.gsa.search.core.google.p6790a.C85813be.m137887a(r3, r4)
            if (r3 == 0) goto L_0x0101
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.i.a.ia r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r4
            r4.f133982b = r3
            int r3 = r4.f133981a
            r3 = r3 | 1
            r4.f133981a = r3
        L_0x0101:
            java.lang.String r3 = r11.f236606c
            java.lang.String r4 = r11.f236605b
            java.lang.String r5 = r11.f236607d
            java.lang.String r6 = r11.f236610g
            com.google.assistant.e.j.wo r3 = m137873i(r3, r4, r5, r6)
            if (r3 == 0) goto L_0x011e
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.i.a.ia r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r4
            r4.f133983c = r3
            int r3 = r4.f133981a
            r3 = r3 | 4
            r4.f133981a = r3
        L_0x011e:
            long r3 = r11.f236615l
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.ia r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r5
            int r6 = r5.f133981a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r5.f133981a = r6
            r5.f133988h = r3
            long r3 = r11.f236614k
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.i.a.ia r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r5
            int r6 = r5.f133981a
            r6 = r6 | 64
            r5.f133981a = r6
            r5.f133987g = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.i.a.ia r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r2
        L_0x0146:
            if (r2 == 0) goto L_0x0177
            r0.add(r2)
            java.lang.String r2 = r11.f236609f
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0177
            java.lang.String r2 = r11.f236609f
            com.google.android.apps.gsa.search.core.i.t r3 = r10.f232036b
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250355ba
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0179
            com.google.common.f.e r3 = f232032a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 7982(0x1f2e, float:1.1185E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "topActiveMediaApp is %s, playbackstatus is %s"
            com.google.android.apps.gsa.search.shared.media.t r11 = r11.f236604a
            r3.mo56354G(r4, r2, r11)
            goto L_0x0179
        L_0x0177:
            java.lang.String r2 = ""
        L_0x0179:
            com.google.android.apps.gsa.search.shared.media.r r11 = r10.f232037c
            java.util.List r11 = r11.mo81728g()
            java.util.Iterator r11 = r11.iterator()
        L_0x0183:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0259
            java.lang.Object r3 = r11.next()
            android.media.session.MediaController r3 = (android.media.session.MediaController) r3
            java.lang.String r4 = r3.getPackageName()
            if (r4 == 0) goto L_0x0183
            java.lang.String r4 = r3.getPackageName()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0183
            android.media.session.PlaybackState r4 = r3.getPlaybackState()
            if (r4 != 0) goto L_0x01a8
        L_0x01a5:
            r3 = r1
            goto L_0x0252
        L_0x01a8:
            android.media.MediaMetadata r5 = r3.getMetadata()
            if (r5 != 0) goto L_0x01af
            goto L_0x01a5
        L_0x01af:
            com.google.assistant.e.i.a.ia r6 = com.google.assistant.p3897e.p3917i.p3918a.C51447ia.f133979i
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.i.a.hz r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51445hz) r6
            com.google.common.b.hd r7 = f232034e
            int r8 = r4.getState()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.assistant.e.i.a.if r9 = com.google.assistant.p3897e.p3917i.p3918a.C51452if.UNKNOWN_STATE
            java.lang.Object r7 = r7.getOrDefault(r8, r9)
            com.google.assistant.e.i.a.if r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51452if) r7
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.assistant.e.i.a.ia r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r8
            int r7 = r7.f134016m
            r8.f133985e = r7
            int r7 = r8.f133981a
            r7 = r7 | 16
            r8.f133981a = r7
            long r7 = r4.getActions()
            java.util.List r7 = r10.mo79458g(r7)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x01eb
            r6.mo53620a(r7)
        L_0x01eb:
            java.lang.String r3 = r3.getPackageName()
            dagger.a r7 = r10.f232039h
            java.lang.Object r7 = r7.mo27525b()
            android.content.pm.PackageManager r7 = (android.content.pm.PackageManager) r7
            com.google.assistant.e.c.c.gh r3 = com.google.android.apps.gsa.search.core.google.p6790a.C85813be.m137887a(r3, r7)
            if (r3 == 0) goto L_0x020c
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.i.a.ia r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r7
            r7.f133982b = r3
            int r3 = r7.f133981a
            r3 = r3 | 1
            r7.f133981a = r3
        L_0x020c:
            java.lang.String r3 = "android.media.metadata.TITLE"
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r7 = "android.media.metadata.ARTIST"
            java.lang.String r7 = r5.getString(r7)
            java.lang.String r8 = "android.media.metadata.ALBUM"
            java.lang.String r8 = r5.getString(r8)
            java.lang.String r9 = "android.media.metadata.DISPLAY_DESCRIPTION"
            java.lang.String r5 = r5.getString(r9)
            com.google.assistant.e.j.wo r3 = m137873i(r3, r7, r8, r5)
            if (r3 == 0) goto L_0x0239
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.i.a.ia r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r5
            r5.f133983c = r3
            int r3 = r5.f133981a
            r3 = r3 | 4
            r5.f133981a = r3
        L_0x0239:
            long r3 = r4.getPosition()
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.i.a.ia r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r5
            int r7 = r5.f133981a
            r7 = r7 | 64
            r5.f133981a = r7
            r5.f133987g = r3
            com.google.protobuf.bv r3 = r6.build()
            com.google.assistant.e.i.a.ia r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51447ia) r3
        L_0x0252:
            if (r3 == 0) goto L_0x0183
            r0.add(r3)
            goto L_0x0183
        L_0x0259:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x026c
            com.google.common.f.e r11 = f232032a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r2 = "Active media session list is empty."
            r3 = 7981(0x1f2d, float:1.1184E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r3)).mo56386p(r2)
        L_0x026c:
            r11 = 0
            com.google.assistant.e.i.a.id r11 = r10.mo79455c(r0, r12, r11)
            if (r11 == 0) goto L_0x0278
            com.google.assistant.e.j.kc r11 = m137872f(r11)
            return r11
        L_0x0278:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6790a.C85810bb.mo79457e(com.google.android.apps.gsa.search.shared.media.PlaybackStatus, com.google.android.apps.gsa.shared.search.Query):com.google.assistant.e.j.kc");
    }

    /* renamed from: g */
    public final List mo79458g(long j) {
        BitFlags bitFlags = new BitFlags((Class) null, "FLAG_", j);
        ArrayList arrayList = new ArrayList();
        C58800sl lA = f232035f.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (BitFlags.m148144f(bitFlags.f253762b, ((Long) entry.getKey()).longValue())) {
                arrayList.add((C51454ih) entry.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final boolean mo79459h() {
        try {
            if (((C86054o) this.f232042k.mo27525b()).mo79668a() != null) {
                return true;
            }
            ((C59052c) ((C59052c) f232032a.mo56224b()).mo56372aa(7987)).mo56386p("This user is signed-out, only partial media session info can be sent.");
            return false;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f232032a.mo56225c()).mo56382g(e)).mo56372aa(7988)).mo56386p("Failed to retrieve user login info,  therefore assuming user is signed-out, only partial media session info can be sent.");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        if (m137876l(r4) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3897e.p3902c.p3907c.C51098gh mo79453a(com.google.assistant.p3897e.p3917i.p3918a.C51447ia r4, com.google.android.apps.gsa.shared.search.Query r5, com.google.common.base.C58833ax r6) {
        /*
            r3 = this;
            boolean r0 = r6.mo56113h()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r4 = r6.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00c2
        L_0x000e:
            dagger.a r6 = r3.f232042k
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r6 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r6
            android.accounts.Account r6 = r6.mo79668a()
            java.lang.String r0 = ""
            if (r6 == 0) goto L_0x009f
            if (r5 == 0) goto L_0x003c
            boolean r6 = r5.mo84412cs()
            if (r6 == 0) goto L_0x003c
            com.google.common.o.amo r5 = r5.f252760R
            if (r5 == 0) goto L_0x003c
            com.google.common.o.amo r6 = com.google.common.p4552o.amo.ANDROID_AUTO_EMBEDDED
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x003c
            android.content.SharedPreferences r4 = r3.f232038g
            java.lang.String r5 = "opa_on_auto_sticky_media_app"
            java.lang.String r4 = r4.getString(r5, r0)
            goto L_0x00c2
        L_0x003c:
            dagger.a r5 = r3.f232040i
            java.lang.Object r5 = r5.mo27525b()
            com.google.common.base.ax r5 = (com.google.common.base.C58833ax) r5
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x005d
            dagger.a r5 = r3.f232040i
            java.lang.Object r5 = r5.mo27525b()
            com.google.common.base.ax r5 = (com.google.common.base.C58833ax) r5
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r5 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r5
            java.lang.String r5 = r5.mo96439d()
            goto L_0x005e
        L_0x005d:
            r5 = r0
        L_0x005e:
            if (r4 == 0) goto L_0x0084
            int r6 = r4.f133981a
            r1 = 1
            r6 = r6 & r1
            if (r6 == 0) goto L_0x0084
            com.google.assistant.e.c.c.gh r6 = r4.f133982b
            if (r6 != 0) goto L_0x006c
            com.google.assistant.e.c.c.gh r6 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x006c:
            int r6 = r6.f133012b
            if (r6 != r1) goto L_0x0084
            com.google.assistant.e.c.c.gh r4 = r4.f133982b
            if (r4 != 0) goto L_0x0076
            com.google.assistant.e.c.c.gh r4 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0076:
            int r6 = r4.f133012b
            if (r6 != r1) goto L_0x007f
            java.lang.Object r4 = r4.f133013c
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            goto L_0x0081
        L_0x007f:
            com.google.assistant.e.c.c.ev r4 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0081:
            java.lang.String r4 = r4.f132944b
            goto L_0x0085
        L_0x0084:
            r4 = r0
        L_0x0085:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0093
            boolean r6 = r3.m137876l(r5)
            if (r6 == 0) goto L_0x0093
            r4 = r5
            goto L_0x00c2
        L_0x0093:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x009f
            boolean r5 = r3.m137876l(r4)
            if (r5 != 0) goto L_0x00c2
        L_0x009f:
            android.content.SharedPreferences r4 = r3.f232038g
            java.lang.String r5 = "opa_android_sticky_media_app"
            java.lang.String r4 = r4.getString(r5, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00c2
            android.content.SharedPreferences r4 = r3.f232038g
            java.lang.String r5 = "audio/music"
            java.lang.String r4 = r4.getString(r5, r0)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x00c1
            boolean r5 = r3.m137876l(r4)
            if (r5 != 0) goto L_0x00c2
        L_0x00c1:
            r4 = r0
        L_0x00c2:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 0
            if (r5 == 0) goto L_0x00ca
            return r6
        L_0x00ca:
            dagger.a r5 = r3.f232039h     // Catch:{ NameNotFoundException -> 0x00f2 }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ NameNotFoundException -> 0x00f2 }
            android.content.pm.PackageManager r5 = (android.content.pm.PackageManager) r5     // Catch:{ NameNotFoundException -> 0x00f2 }
            r0 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r4, r0)     // Catch:{ NameNotFoundException -> 0x00f2 }
            if (r5 == 0) goto L_0x00f1
            android.content.pm.ApplicationInfo r0 = r5.applicationInfo     // Catch:{ NameNotFoundException -> 0x00f2 }
            if (r0 == 0) goto L_0x00f1
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch:{ NameNotFoundException -> 0x00f2 }
            boolean r5 = r5.enabled     // Catch:{ NameNotFoundException -> 0x00f2 }
            if (r5 != 0) goto L_0x00e4
            goto L_0x00f1
        L_0x00e4:
            dagger.a r5 = r3.f232039h     // Catch:{ NameNotFoundException -> 0x00f2 }
            java.lang.Object r5 = r5.mo27525b()     // Catch:{ NameNotFoundException -> 0x00f2 }
            android.content.pm.PackageManager r5 = (android.content.pm.PackageManager) r5     // Catch:{ NameNotFoundException -> 0x00f2 }
            com.google.assistant.e.c.c.gh r4 = com.google.android.apps.gsa.search.core.google.p6790a.C85813be.m137887a(r4, r5)     // Catch:{ NameNotFoundException -> 0x00f2 }
            return r4
        L_0x00f1:
            return r6
        L_0x00f2:
            r5 = move-exception
            com.google.common.f.e r0 = f232032a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Failed to fetch sticky app; couldn't find package name %s"
            r2 = 7967(0x1f1f, float:1.1164E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r5)).mo56372aa(r2)).mo56389s(r1, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6790a.C85810bb.mo79453a(com.google.assistant.e.i.a.ia, com.google.android.apps.gsa.shared.search.Query, com.google.common.base.ax):com.google.assistant.e.c.c.gh");
    }
}

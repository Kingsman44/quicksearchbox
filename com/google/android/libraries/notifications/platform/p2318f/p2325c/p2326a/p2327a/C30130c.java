package com.google.android.libraries.notifications.platform.p2318f.p2325c.p2326a.p2327a;

import android.net.Uri;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p297b.C5751ac;
import com.bumptech.glide.load.p297b.C5753ae;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.bumptech.glide.p287f.C5593j;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30115i;
import com.google.android.libraries.notifications.platform.p2318f.p2325c.p2326a.C30127a;
import com.google.android.libraries.notifications.platform.p2335g.C30141a;
import com.google.android.libraries.notifications.platform.p2335g.C30143b;
import com.google.android.libraries.notifications.platform.p2339i.p2341b.C30149b;
import com.google.android.libraries.p3501z.C44492a;
import com.google.android.libraries.p3501z.C44493b;
import com.google.android.libraries.social.p3267c.p3268a.C41921c;
import com.google.common.base.C58825ap;
import com.google.common.base.C58838bb;
import com.google.common.p4541l.C59326i;
import com.google.common.p4575r.C60761r;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4215bk.p4219b.C56041a;
import com.google.p4215bk.p4219b.C56043c;
import com.google.p4215bk.p4219b.C56044d;
import com.google.p4215bk.p4219b.C56045e;
import com.google.p4215bk.p4219b.C56046f;
import com.google.p4215bk.p4219b.C56047g;
import com.google.p4215bk.p4219b.C56048h;
import com.google.p4215bk.p4219b.C56049i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.libraries.notifications.platform.f.c.a.a.c */
/* compiled from: PG */
public final class C30130c implements C30127a {

    /* renamed from: a */
    public final C30115i f81500a;

    static {
        C5593j jVar = (C5593j) new C5593j().mo11989z(C5731x.f17282a);
    }

    public C30130c(C30115i iVar) {
        this.f81500a = iVar;
    }

    /* renamed from: b */
    private static final int m55976b(int i) {
        return i == -1 ? LinearLayoutManager.INVALID_OFFSET : i;
    }

    /* renamed from: a */
    public final C60870cx mo35523a(C30149b bVar, C30143b bVar2) {
        String str;
        boolean z;
        Map.Entry entry;
        String str2;
        C30141a aVar = (C30141a) bVar2;
        String str3 = aVar.f81511a;
        if (str3.startsWith("//")) {
            str3 = "https:".concat(str3);
        }
        String str4 = str3;
        boolean startsWith = str4.startsWith("https://www.gstatic.com/gnp_");
        if (!C41921c.m73452a(str4)) {
            if (startsWith) {
                startsWith = true;
            }
            str = aVar.f81512b;
            boolean booleanValue = aVar.f81515e.booleanValue();
            C5753ae aeVar = new C5753ae();
            if (str == null && booleanValue && !TextUtils.isEmpty(str4) && C41921c.m73452a(str4)) {
                C30129b bVar3 = new C30129b(this, str, str4);
                boolean z2 = aeVar.f17330a;
                aeVar.mo12256b();
                aeVar.mo12257c().add(bVar3);
            }
            C5750ab abVar = new C5750ab(str4, (C5751ac) aeVar.mo12255a());
            int intValue = aVar.f81513c.intValue();
            int intValue2 = aVar.f81514d.intValue();
            C30058b.m55794f("GlideMediaFetcherImpl", "Downloading media from url: %s", str4);
            return C5528f.m14300b(C5528f.m14299a((C6007z) ((C6007z) bVar.f81523a.mo51286a().mo11864b().mo12447i(abVar).mo11988y()).mo11962O(m55976b(intValue), m55976b(intValue2))));
        }
        int intValue3 = aVar.f81513c.intValue() == -1 ? -1 : aVar.f81513c.intValue();
        int intValue4 = aVar.f81514d.intValue() == -1 ? -1 : aVar.f81514d.intValue();
        int i = 126;
        if (startsWith) {
            int i2 = C44493b.f115644a;
            C56048h hVar = new C56048h();
            hVar.mo54319b(C56045e.WIDTH, Integer.valueOf(intValue3));
            hVar.mo54318a(C56045e.WIDTH);
            hVar.mo54319b(C56045e.HEIGHT, Integer.valueOf(intValue4));
            hVar.mo54318a(C56045e.HEIGHT);
            try {
                Uri parse = Uri.parse(str4);
                C58838bb.m90869d(parse.getPath() != null, "url path is null");
                String path = parse.getPath();
                if (!path.contains("=")) {
                    String str5 = hVar.f149352a;
                    Map map = hVar.f149353b;
                    Map map2 = hVar.f149354c;
                    int size = map2.size();
                    String str6 = BuildConfig.FLAVOR;
                    if (size != 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = map.entrySet().iterator();
                        Iterator it2 = map2.entrySet().iterator();
                        Map.Entry entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                        Map.Entry entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        boolean z3 = false;
                        while (true) {
                            if (entry2 == null) {
                                if (entry3 == null) {
                                    if (z3) {
                                        arrayList.add(str5.substring(0, 0));
                                    }
                                    if (!arrayList.isEmpty()) {
                                        str6 = str6.concat(C56047g.f149351a.mo56097d(arrayList));
                                    }
                                }
                            }
                            if (entry3 == null) {
                                z = true;
                            } else if (entry2 == null) {
                                z = false;
                            } else {
                                int compareTo = ((C56045e) entry2.getKey()).compareTo((C56045e) entry3.getKey());
                                z = compareTo < 0;
                                if (compareTo == 0) {
                                    entry2 = null;
                                }
                            }
                            if (z) {
                                C56046f fVar = (C56046f) entry2.getValue();
                                if (!z3) {
                                    int i3 = fVar.f149348a;
                                    int i4 = fVar.f149349b;
                                } else {
                                    int i5 = fVar.f149348a;
                                    arrayList.add(str5.substring(0, 0));
                                    int i6 = fVar.f149348a;
                                    int i7 = fVar.f149349b;
                                }
                                entry2 = null;
                                z3 = true;
                            } else {
                                C56045e eVar = (C56045e) entry3.getKey();
                                C56049i iVar = (C56049i) entry3.getValue();
                                if (z3) {
                                    arrayList.add(str5.substring(0, 0));
                                }
                                if (iVar.f149355a != null) {
                                    boolean z4 = iVar.f149356b;
                                    String str7 = eVar.f149346aS;
                                    int i8 = eVar.f149347aT;
                                    int i9 = i8 - 1;
                                    if (i8 != 0) {
                                        switch (i9) {
                                            case 0:
                                                str2 = C59326i.f157517e.mo56826f().mo56837l(C60761r.m92760f(((Long) ((C56049i) entry3.getValue()).f149355a).longValue()), 8);
                                                break;
                                            case 1:
                                                str2 = str6;
                                                break;
                                            case 2:
                                                str2 = ((String) ((C56049i) entry3.getValue()).f149355a).replace(';', ':');
                                                break;
                                            case 3:
                                                str2 = ((Integer) ((C56049i) entry3.getValue()).f149355a).toString();
                                                break;
                                            case 4:
                                                str2 = ((Long) ((C56049i) entry3.getValue()).f149355a).toString();
                                                break;
                                            case 5:
                                                str2 = ((Float) ((C56049i) entry3.getValue()).f149355a).toString();
                                                break;
                                            case 6:
                                                str2 = "0x".concat(String.valueOf(String.format("%08x", new Object[]{Integer.valueOf(((Integer) ((C56049i) entry3.getValue()).f149355a).intValue())})));
                                                break;
                                            case 7:
                                                C59326i f = C59326i.f157517e.mo56826f();
                                                byte[] bytes = ((String) ((C56049i) entry3.getValue()).f149355a).getBytes(StandardCharsets.ISO_8859_1);
                                                str2 = f.mo56837l(bytes, bytes.length).replace('-', '~');
                                                break;
                                            default:
                                                throw new IllegalStateException("OptionType " + C56044d.m87887a(i8) + " not handled.");
                                        }
                                        arrayList.add(String.valueOf(str7).concat(String.valueOf(str2)));
                                        entry = null;
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    entry = null;
                                }
                                z3 = false;
                            }
                            if (entry2 == null && it.hasNext()) {
                                entry2 = (Map.Entry) it.next();
                            }
                            if (entry3 == null && it2.hasNext()) {
                                entry3 = (Map.Entry) it2.next();
                            }
                        }
                    } else if (!str5.isEmpty()) {
                        str6 = str6.concat(String.valueOf(str5));
                    }
                    if (!str6.isEmpty()) {
                        path = C56043c.f149248b.mo56097d(new C58825ap(new Object[0], path, str6));
                    }
                    str4 = parse.buildUpon().encodedPath(path).build().toString();
                } else {
                    throw new C56041a();
                }
            } catch (C56041a e) {
                throw new C44492a(e);
            } catch (C44492a e2) {
                C30058b.m55797i("GnpMedia", e2, "SCS options could not be added. Using raw url.", new Object[0]);
            }
        } else if (aVar.f81516f.booleanValue()) {
            if (aVar.f81513c.intValue() == 0 || aVar.f81514d.intValue() == 0) {
                i = 54;
            }
            str4 = C41921c.m73454c(str4, i, intValue3, intValue4, 0, 1);
        } else {
            str4 = C41921c.m73453b(str4, intValue3, intValue4);
        }
        str = aVar.f81512b;
        boolean booleanValue2 = aVar.f81515e.booleanValue();
        C5753ae aeVar2 = new C5753ae();
        if (str == null) {
        }
        C5750ab abVar2 = new C5750ab(str4, (C5751ac) aeVar2.mo12255a());
        int intValue5 = aVar.f81513c.intValue();
        int intValue22 = aVar.f81514d.intValue();
        C30058b.m55794f("GlideMediaFetcherImpl", "Downloading media from url: %s", str4);
        return C5528f.m14300b(C5528f.m14299a((C6007z) ((C6007z) bVar.f81523a.mo51286a().mo11864b().mo12447i(abVar2).mo11988y()).mo11962O(m55976b(intValue5), m55976b(intValue22))));
    }
}

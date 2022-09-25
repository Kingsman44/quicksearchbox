package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.android.p266f.p267a.C5115a;
import com.android.p266f.p267a.p268a.C5120e;
import com.android.p266f.p267a.p268a.C5125j;
import com.android.p266f.p267a.p268a.C5133r;
import com.android.p266f.p267a.p268a.C5139x;
import com.android.p266f.p267a.p269b.C5141a;
import com.google.android.libraries.p11029ao.p11032c.C147805f;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4535g.C59203do;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.de */
/* compiled from: PG */
public final /* synthetic */ class C35670de implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C35674di f93553a;

    /* renamed from: b */
    public final /* synthetic */ C35668dc f93554b;

    public /* synthetic */ C35670de(C35674di diVar, C35668dc dcVar) {
        this.f93553a = diVar;
        this.f93554b = dcVar;
    }

    public final Object call() {
        long j;
        C5139x xVar;
        long j2;
        String str;
        double d;
        long j3;
        long j4;
        C35674di diVar = this.f93553a;
        C35668dc dcVar = this.f93554b;
        Context context = diVar.f93558a;
        String d2 = dcVar.mo39794d();
        C58485gu b = dcVar.mo39792b();
        if (TextUtils.isEmpty(d2) && !dcVar.mo39795f()) {
            throw new C35673dh("Empty message is not supported.");
        } else if (!b.isEmpty()) {
            int size = b.size();
            int i = 0;
            while (i < size) {
                String str2 = (String) b.get(i);
                i++;
                if (!PhoneNumberUtils.isGlobalPhoneNumber(str2)) {
                    throw new C35673dh(String.format("Invalid recipient[%s]", new Object[]{str2}));
                }
            }
            if (dcVar.mo39795f()) {
                C58485gu a = dcVar.mo39791a();
                int size2 = a.size();
                int i2 = 0;
                while (i2 < size2) {
                    Uri uri = (Uri) a.get(i2);
                    if (uri != null) {
                        i2++;
                        if (Uri.EMPTY.equals(uri)) {
                        }
                    }
                    throw new C35673dh("Invalid Attachment Uri. MessageData contains an empty Uri.");
                }
            }
            C5139x xVar2 = new C5139x();
            String a2 = C5141a.m14058a(context);
            if (!TextUtils.isEmpty(a2)) {
                xVar2.mo10148a(new C5120e(a2));
            }
            C5120e[] e = C5120e.m13993e((String[]) b.toArray(new String[b.size()]));
            if (e != null) {
                xVar2.mo10192e(e);
            }
            C5125j jVar = new C5125j();
            xVar2.f16313b = jVar;
            if (!TextUtils.isEmpty(dcVar.mo39794d())) {
                String d3 = dcVar.mo39794d();
                C5133r rVar = new C5133r();
                rVar.mo10178a(106);
                rVar.mo10181d("text/plain".getBytes());
                rVar.mo10182e(d3.getBytes());
                jVar.mo10152c(rVar);
                j = (long) rVar.mo10186i().length;
            } else {
                j = 0;
            }
            if (dcVar.mo39795f()) {
                if (!C5115a.m13990b(dcVar.mo39793c())) {
                    xVar = xVar2;
                    j2 = j;
                    if (C5115a.m13989a(dcVar.mo39793c())) {
                        Uri uri2 = (Uri) dcVar.mo39791a().get(0);
                        String c = dcVar.mo39793c();
                        int d4 = C35674di.m64081d("maxMessageSize", 307200);
                        long c2 = C35674di.m64080c(context, uri2);
                        if (c2 <= 0) {
                            throw new C35673dh("Can't get audio message");
                        } else if (c2 <= ((long) d4)) {
                            C5133r rVar2 = new C5133r();
                            rVar2.f16341b = uri2;
                            rVar2.mo10181d(c.getBytes());
                            String b2 = diVar.mo39798b("audio_");
                            if (C58890d.m90990e(c, "audio/mp3")) {
                                str = ".mp3";
                            } else if (C58890d.m90990e(c, "audio/mp4")) {
                                str = MediaUtilities.VIDEO_FILE_EXTENSION;
                            } else if (C58890d.m90990e(c, "audio/amr")) {
                                str = ".amr";
                            } else if (C58890d.m90990e(c, "audio/mpeg")) {
                                str = ".mpeg";
                            } else if (C58890d.m90990e(c, "audio/x-wav")) {
                                str = ".wav";
                            } else {
                                throw new C35673dh("Unsupported audio contentType: %".concat(String.valueOf(c)));
                            }
                            rVar2.mo10180c(b2.concat(str).getBytes());
                            rVar2.mo10179b(b2.getBytes());
                            jVar.mo10152c(rVar2);
                            j = j2 + c2;
                        } else {
                            throw new C35673dh("Audio Message Size: " + c2 + " is greater than max message size: " + d4);
                        }
                    }
                } else if (dcVar.mo39791a().size() > 1) {
                    int d5 = C35674di.m64081d("maxMessageSize", 307200);
                    try {
                        C35575cd cdVar = diVar.f93561d;
                        long j5 = (long) d5;
                        C58485gu a3 = dcVar.mo39791a();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (a3 == null || a3.isEmpty()) {
                            xVar = xVar2;
                            long j6 = j;
                        } else if (j5 <= 0) {
                            xVar = xVar2;
                        } else {
                            long j7 = j5 - 2048;
                            Iterator it = a3.iterator();
                            int i3 = 0;
                            long j8 = 0;
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                Uri uri3 = (Uri) it.next();
                                AssetFileDescriptor assetFileDescriptor = null;
                                C35575cd cdVar2 = cdVar;
                                C5139x xVar3 = xVar2;
                                try {
                                    AssetFileDescriptor a4 = C147806g.m240907a(cdVar.f93401b, uri3, C33259r.f88929b, C147805f.f398780b);
                                    if (a4 == null) {
                                        ((C59052c) ((C59052c) C35575cd.f93400a.mo56225c()).mo56372aa(51646)).mo56389s("Failed to open asset for length of uri: %s", uri3);
                                        j4 = 0;
                                        arrayList.add(Long.valueOf(j4));
                                        arrayList2.add(true);
                                        j8 += j4;
                                        i3++;
                                        it = it2;
                                        cdVar = cdVar2;
                                        xVar2 = xVar3;
                                    } else {
                                        j4 = a4.getLength();
                                        try {
                                            a4.close();
                                        } catch (IOException e2) {
                                            ((C59052c) ((C59052c) ((C59052c) C35575cd.f93400a.mo56225c()).mo56382g(e2)).mo56372aa(51642)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri3);
                                        }
                                        arrayList.add(Long.valueOf(j4));
                                        arrayList2.add(true);
                                        j8 += j4;
                                        i3++;
                                        it = it2;
                                        cdVar = cdVar2;
                                        xVar2 = xVar3;
                                    }
                                } catch (FileNotFoundException e3) {
                                    ((C59052c) ((C59052c) ((C59052c) C35575cd.f93400a.mo56225c()).mo56382g(e3)).mo56372aa(51643)).mo56389s("Failed to query length of uri: %s", uri3);
                                    if (assetFileDescriptor != null) {
                                        try {
                                            assetFileDescriptor.close();
                                        } catch (IOException e4) {
                                            ((C59052c) ((C59052c) ((C59052c) C35575cd.f93400a.mo56225c()).mo56382g(e4)).mo56372aa(51644)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri3);
                                        }
                                    }
                                } catch (Throwable th) {
                                    Throwable th2 = th;
                                    if (assetFileDescriptor != null) {
                                        try {
                                            assetFileDescriptor.close();
                                        } catch (IOException e5) {
                                            ((C59052c) ((C59052c) ((C59052c) C35575cd.f93400a.mo56225c()).mo56382g(e5)).mo56372aa(51645)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri3);
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            xVar = xVar2;
                            if (j8 > j7) {
                                long j9 = j7 / ((long) i3);
                                long j10 = 0;
                                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                    long longValue = ((Long) arrayList.get(i4)).longValue();
                                    if (((Boolean) arrayList2.get(i4)).booleanValue() && longValue <= j9) {
                                        j10 += longValue;
                                        i3--;
                                        arrayList2.set(i4, false);
                                    }
                                }
                                long j11 = j7 - j10;
                                if (i3 != 0) {
                                    double d6 = C59203do.f157270a;
                                    int i5 = 0;
                                    while (i5 < arrayList.size()) {
                                        if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                                            j3 = j;
                                            d6 += Math.sqrt((double) ((Long) arrayList.get(i5)).longValue());
                                        } else {
                                            j3 = j;
                                        }
                                        i5++;
                                        j = j3;
                                    }
                                    long j12 = j;
                                    int i6 = 0;
                                    while (i6 < arrayList.size()) {
                                        if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                                            double sqrt = Math.sqrt((double) ((Long) arrayList.get(i6)).longValue()) / d6;
                                            d = d6;
                                            double d7 = (double) j11;
                                            Double.isNaN(d7);
                                            arrayList.set(i6, Long.valueOf((long) (sqrt * d7)));
                                        } else {
                                            d = d6;
                                        }
                                        i6++;
                                        d6 = d;
                                    }
                                    j = j12;
                                } else if (j11 < 0) {
                                    throw new Exception("Expected at least 0 for maxMessageSize but got " + j11);
                                }
                            }
                        }
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            j += diVar.mo39797a(context, jVar, (Uri) dcVar.mo39791a().get(i7), dcVar.mo39793c(), ((Long) arrayList.get(i7)).intValue());
                            i7++;
                            arrayList = arrayList;
                        }
                    } catch (Exception e6) {
                        throw new C35673dh("Failed to calculate per image size limit. Reason: ".concat(String.valueOf(e6.getMessage())));
                    }
                } else {
                    xVar = xVar2;
                    j += diVar.mo39797a(context, jVar, (Uri) dcVar.mo39791a().get(0), dcVar.mo39793c(), C35674di.m64081d("maxMessageSize", 307200) - 2048);
                }
                C5139x xVar4 = xVar;
                xVar4.mo10191d(j);
                xVar4.mo10190c("personal".getBytes());
                xVar4.mo10193f();
                xVar4.mo10194g();
                return xVar4;
            }
            xVar = xVar2;
            j2 = j;
            j = j2;
            C5139x xVar42 = xVar;
            xVar42.mo10191d(j);
            xVar42.mo10190c("personal".getBytes());
            xVar42.mo10193f();
            xVar42.mo10194g();
            return xVar42;
        } else {
            throw new C35673dh("Empty recipients are not supported.");
        }
    }
}

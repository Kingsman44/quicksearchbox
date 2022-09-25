package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.android.p266f.p267a.C5115a;
import com.android.p266f.p267a.C5140b;
import com.android.p266f.p267a.p268a.C5120e;
import com.android.p266f.p267a.p268a.C5125j;
import com.android.p266f.p267a.p268a.C5133r;
import com.android.p266f.p267a.p268a.C5139x;
import com.android.p266f.p267a.p269b.C5141a;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85458b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p11029ao.p11032c.C147805f;
import com.google.android.libraries.p11029ao.p11032c.C147806g;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.d */
/* compiled from: PG */
public final /* synthetic */ class C100649d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100653h f281447a;

    /* renamed from: b */
    public final /* synthetic */ C85458b f281448b;

    public /* synthetic */ C100649d(C100653h hVar, C85458b bVar) {
        this.f281447a = hVar;
        this.f281448b = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        int length;
        long j;
        String str;
        double d;
        int i;
        long j2;
        C100653h hVar = this.f281447a;
        C85458b bVar = this.f281448b;
        try {
            Context context = hVar.f281453a;
            String str2 = bVar.f231287b;
            String[] strArr = bVar.f231289d;
            if (TextUtils.isEmpty(str2)) {
                if (!bVar.mo78986a()) {
                    throw new C100655j("Empty message is not supported.");
                }
            }
            if (strArr == null || (length = strArr.length) == 0) {
                throw new C100655j("Empty recipients are not supported.");
            }
            int i2 = 0;
            while (i2 < length) {
                String str3 = strArr[i2];
                if (PhoneNumberUtils.isGlobalPhoneNumber(str3)) {
                    i2++;
                } else {
                    throw new C100655j(String.format("Invalid recipient[%s]", new Object[]{str3}));
                }
            }
            if (bVar.mo78986a()) {
                for (Uri uri : bVar.f231288c) {
                    if (uri == null || Uri.EMPTY.equals(uri)) {
                        throw new C100655j("Invalid Attachment Uri. MessageData contains an empty Uri.");
                    }
                }
            }
            C5139x xVar = new C5139x();
            String a = C5141a.m14058a(context);
            if (!TextUtils.isEmpty(a)) {
                xVar.mo10148a(new C5120e(a));
            }
            C5120e[] e = C5120e.m13993e(strArr);
            if (e != null) {
                xVar.mo10192e(e);
            }
            C5125j jVar = new C5125j();
            xVar.f16313b = jVar;
            if (!TextUtils.isEmpty(bVar.f231287b)) {
                String str4 = bVar.f231287b;
                C5133r rVar = new C5133r();
                rVar.mo10178a(106);
                rVar.mo10181d("text/plain".getBytes());
                rVar.mo10182e(str4.getBytes());
                jVar.mo10152c(rVar);
                j = (long) rVar.mo10186i().length;
            } else {
                j = 0;
            }
            if (bVar.mo78986a()) {
                if (C5115a.m13990b(bVar.f231286a)) {
                    if (bVar.f231288c.size() > 1) {
                        int d2 = C100653h.m166817d("maxMessageSize", 307200);
                        try {
                            C100643a aVar = hVar.f281456d;
                            long j3 = (long) d2;
                            List list = bVar.f231288c;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            if (list != null && !list.isEmpty()) {
                                if (j3 > 0) {
                                    long j4 = j3 - 2048;
                                    Iterator it = list.iterator();
                                    int i3 = 0;
                                    long j5 = 0;
                                    while (it.hasNext()) {
                                        Uri uri2 = (Uri) it.next();
                                        AssetFileDescriptor assetFileDescriptor = null;
                                        Iterator it2 = it;
                                        try {
                                            AssetFileDescriptor a2 = C147806g.m240907a(aVar.f281443b, uri2, C33259r.f88929b, C147805f.f398780b);
                                            if (a2 == null) {
                                                C59104x c = C100643a.f281442a.mo56225c();
                                                c.mo56378ag(C58975e.f156826a, "ImageAttachmentSizeCalc");
                                                ((C59052c) ((C59052c) c).mo56372aa(33909)).mo56389s("Failed to open asset for length of uri: %s", uri2);
                                                j2 = 0;
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList2.add(true);
                                                j5 += j2;
                                                i3++;
                                                it = it2;
                                            } else {
                                                j2 = a2.getLength();
                                                try {
                                                    a2.close();
                                                } catch (IOException e2) {
                                                    IOException iOException = e2;
                                                    C59104x c2 = C100643a.f281442a.mo56225c();
                                                    c2.mo56378ag(C58975e.f156826a, "ImageAttachmentSizeCalc");
                                                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(iOException)).mo56372aa(33905)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri2);
                                                }
                                                arrayList.add(Long.valueOf(j2));
                                                arrayList2.add(true);
                                                j5 += j2;
                                                i3++;
                                                it = it2;
                                            }
                                        } catch (FileNotFoundException e3) {
                                            C59104x c3 = C100643a.f281442a.mo56225c();
                                            c3.mo56378ag(C58975e.f156826a, "ImageAttachmentSizeCalc");
                                            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(33906)).mo56389s("Failed to query length of uri: %s", uri2);
                                            if (assetFileDescriptor != null) {
                                                try {
                                                    assetFileDescriptor.close();
                                                } catch (IOException e4) {
                                                    IOException iOException2 = e4;
                                                    C59104x c4 = C100643a.f281442a.mo56225c();
                                                    c4.mo56378ag(C58975e.f156826a, "ImageAttachmentSizeCalc");
                                                    ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(iOException2)).mo56372aa(33907)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri2);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Throwable th2 = th;
                                            if (assetFileDescriptor != null) {
                                                try {
                                                    assetFileDescriptor.close();
                                                } catch (IOException e5) {
                                                    IOException iOException3 = e5;
                                                    C59104x c5 = C100643a.f281442a.mo56225c();
                                                    c5.mo56378ag(C58975e.f156826a, "ImageAttachmentSizeCalc");
                                                    ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(iOException3)).mo56372aa(33908)).mo56389s("Failed to close assetFileDescriptor for uri: %s", uri2);
                                                }
                                            }
                                            throw th2;
                                        }
                                    }
                                    if (j5 > j4) {
                                        long j6 = j4 / ((long) i3);
                                        long j7 = 0;
                                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                            long longValue = ((Long) arrayList.get(i4)).longValue();
                                            if (((Boolean) arrayList2.get(i4)).booleanValue() && longValue <= j6) {
                                                j7 += longValue;
                                                i3--;
                                                arrayList2.set(i4, false);
                                            }
                                        }
                                        long j8 = j4 - j7;
                                        if (i3 != 0) {
                                            double d3 = C59203do.f157270a;
                                            int i5 = 0;
                                            while (i5 < arrayList.size()) {
                                                if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                                                    i = i5;
                                                    d3 += Math.sqrt((double) ((Long) arrayList.get(i5)).longValue());
                                                } else {
                                                    i = i5;
                                                }
                                                i5 = i + 1;
                                            }
                                            int i6 = 0;
                                            while (i6 < arrayList.size()) {
                                                if (((Boolean) arrayList2.get(i6)).booleanValue()) {
                                                    double sqrt = Math.sqrt((double) ((Long) arrayList.get(i6)).longValue()) / d3;
                                                    d = d3;
                                                    double d4 = (double) j8;
                                                    Double.isNaN(d4);
                                                    arrayList.set(i6, Long.valueOf((long) (sqrt * d4)));
                                                } else {
                                                    d = d3;
                                                }
                                                i6++;
                                                d3 = d;
                                            }
                                        } else if (j8 < 0) {
                                            throw new Exception("Expected at least 0 for maxMessageSize but got " + j8);
                                        }
                                    }
                                }
                            }
                            int i7 = 0;
                            while (i7 < arrayList.size()) {
                                j += hVar.mo91993a(context, jVar, (Uri) bVar.f231288c.get(i7), bVar.f231286a, ((Long) arrayList.get(i7)).intValue());
                                i7++;
                                arrayList = arrayList;
                            }
                        } catch (Exception e6) {
                            throw new C100655j("Failed to calculate per image size limit. Reason: ".concat(String.valueOf(e6.getMessage())));
                        }
                    } else {
                        j += hVar.mo91993a(context, jVar, (Uri) bVar.f231288c.get(0), bVar.f231286a, C100653h.m166817d("maxMessageSize", 307200) - 2048);
                    }
                } else if (C5115a.m13989a(bVar.f231286a)) {
                    Uri uri3 = (Uri) bVar.f231288c.get(0);
                    String str5 = bVar.f231286a;
                    int d5 = C100653h.m166817d("maxMessageSize", 307200);
                    long c6 = C100653h.m166816c(context, uri3);
                    if (c6 <= 0) {
                        throw new C100655j("Can't get audio message");
                    } else if (c6 <= ((long) d5)) {
                        C5133r rVar2 = new C5133r();
                        rVar2.f16341b = uri3;
                        rVar2.mo10181d(str5.getBytes());
                        String b = hVar.mo91994b("audio_");
                        if (C58890d.m90990e(str5, "audio/mp3")) {
                            str = ".mp3";
                        } else if (C58890d.m90990e(str5, "audio/mp4")) {
                            str = MediaUtilities.VIDEO_FILE_EXTENSION;
                        } else if (C58890d.m90990e(str5, "audio/amr")) {
                            str = ".amr";
                        } else if (C58890d.m90990e(str5, "audio/mpeg")) {
                            str = ".mpeg";
                        } else if (C58890d.m90990e(str5, "audio/x-wav")) {
                            str = ".wav";
                        } else {
                            throw new C100655j("Unsupported audio contentType: %".concat(String.valueOf(str5)));
                        }
                        rVar2.mo10180c(b.concat(str).getBytes());
                        rVar2.mo10179b(b.getBytes());
                        jVar.mo10152c(rVar2);
                        j += c6;
                    } else {
                        throw new C100655j("Audio Message Size: " + c6 + " is greater than max message size: " + d5);
                    }
                }
            }
            xVar.mo10191d(j);
            xVar.mo10190c("personal".getBytes());
            xVar.mo10193f();
            xVar.mo10194g();
            return xVar;
        } catch (C5140b | C100655j e7) {
            ((C89859i) hVar.f281457e.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_MMS_CREATE_REQ_FAILED);
            throw e7;
        }
    }
}

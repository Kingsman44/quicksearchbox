package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.search.C90494d;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public class StreamedMessageContentProvider extends C90494d {

    /* renamed from: a */
    public static final C59071e f269806a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider");

    /* renamed from: b */
    public static int f269807b;

    /* renamed from: c */
    public static boolean f269808c;

    /* renamed from: d */
    public static String f269809d = null;

    /* renamed from: e */
    public final ConcurrentHashMap f269810e = new ConcurrentHashMap();

    /* renamed from: f */
    public C60888db f269811f;

    /* renamed from: g */
    public C60888db f269812g;

    /* renamed from: h */
    public C89656k f269813h;

    /* renamed from: i */
    private boolean f269814i;

    /* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.StreamedMessageContentProvider$a */
    /* compiled from: PG */
    public interface C96441a {
        /* renamed from: qv */
        void mo90131qv(StreamedMessageContentProvider streamedMessageContentProvider);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo90124a() {
        if (!this.f269814i) {
            ((C96441a) C47266f.m84076a(getContext(), C96441a.class)).mo90131qv(this);
            this.f269814i = true;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        C74507e.m120468d(7);
        mo90124a();
        C58976aa aaVar = C58975e.f156826a;
        C96473bd bdVar = (C96473bd) this.f269810e.get(uri);
        if (bdVar == null) {
            C59104x d = f269806a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) d).mo56372aa(17204)).mo56389s("delete: Unrecognized URI: %s", uri);
            return 0;
        }
        bdVar.f269897a.set(true);
        return 1;
    }

    public final String getType(Uri uri) {
        return "audio/l16";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        C74507e.m120469e(7);
        C59071e eVar = f269806a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
        ((C59052c) ((C59052c) b).mo56372aa(17212)).mo56389s("inserting uri = %s:", uri);
        if (contentValues != null && contentValues.containsKey("locally_record_audio_content_key")) {
            Boolean asBoolean = contentValues.getAsBoolean("locally_record_audio_content_key");
            asBoolean.getClass();
            boolean booleanValue = asBoolean.booleanValue();
            f269808c = booleanValue;
            if (booleanValue) {
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
                ((C59052c) ((C59052c) b2).mo56372aa(17216)).mo56386p("LocallyRecordAudio is set, recording audio to file.");
            }
        }
        if (contentValues != null && contentValues.containsKey("external_dir_content_key")) {
            f269809d = contentValues.getAsString("external_dir_content_key");
        }
        boolean z = false;
        if (contentValues != null && contentValues.containsKey("has_pre_encoded_audio")) {
            Boolean asBoolean2 = contentValues.getAsBoolean("has_pre_encoded_audio");
            asBoolean2.getClass();
            z = asBoolean2.booleanValue();
            if (z) {
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
                ((C59052c) ((C59052c) b3).mo56372aa(17215)).mo56386p("HasPreEncodedAudio is set.");
            }
        }
        mo90124a();
        try {
            C96473bd bdVar = new C96473bd(ByteBuffer.allocate(960000), uri, z);
            this.f269810e.put(uri, bdVar);
            if (!this.f269813h.mo83555j(60)) {
                this.f269811f.mo29164d(new C96472bc(this, uri, bdVar), 30, TimeUnit.SECONDS);
            }
            return uri;
        } catch (IOException e) {
            C59104x c = f269806a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17214)).mo56386p("Error creating pipe");
            return null;
        }
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        C74507e.m120470f(7);
        mo90124a();
        C58976aa aaVar = C58975e.f156826a;
        C96473bd bdVar = (C96473bd) this.f269810e.get(uri);
        if (bdVar == null) {
            C59104x d = f269806a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) d).mo56372aa(17219)).mo56389s("Unrecognized URI: %s", uri);
            return null;
        } else if (bdVar.f269904h.getAndSet(true)) {
            C59104x d2 = f269806a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) d2).mo56372aa(17218)).mo56386p("Uri data is outputting.");
            return null;
        } else {
            this.f269812g.mo19398a(new C96474be(this, bdVar, uri));
            return bdVar.f269898b;
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C74507e.m120471g(7);
        C59104x c = f269806a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
        ((C59052c) ((C59052c) c).mo56372aa(17211)).mo56386p("Can't query");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C74507e.m120472h(7);
        mo90124a();
        C58976aa aaVar = C58975e.f156826a;
        byte[] asByteArray = contentValues.getAsByteArray("audio_data_key");
        boolean z = true;
        if (uri == null || asByteArray == null) {
            C59104x c = f269806a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            C59052c cVar = (C59052c) c;
            cVar.mo56380ai(C58979ad.FULL);
            C59052c cVar2 = (C59052c) cVar.mo56372aa(17206);
            boolean z2 = uri == null;
            if (asByteArray != null) {
                z = false;
            }
            cVar2.mo56358K("Cannot add data to uri. uri is null %b, audio is null %b", z2, z);
            return 0;
        }
        C96473bd bdVar = (C96473bd) this.f269810e.get(uri);
        if (bdVar == null) {
            C59104x c2 = f269806a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) c2).mo56372aa(17210)).mo56389s("Couldn't find StreamData to write to for Uri: %s", uri);
            return -1;
        }
        int length = asByteArray.length;
        try {
            bdVar.f269901e.capacity();
            bdVar.f269901e.position();
            if (this.f269813h.mo83555j(60) && bdVar.f269901e.capacity() <= bdVar.f269901e.position() + length) {
                int capacity = bdVar.f269901e.capacity();
                ByteBuffer allocate = ByteBuffer.allocate(capacity + capacity);
                allocate.put(bdVar.f269901e);
                bdVar.f269901e.clear();
                bdVar.f269901e = allocate;
            }
            bdVar.f269901e.put(asByteArray, 0, length);
            bdVar.f269903g.getAndAdd(length);
            return 1;
        } catch (IndexOutOfBoundsException | BufferOverflowException e) {
            Object obj = e;
            C59104x d = f269806a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) d).mo56372aa(17209)).mo56360M("Can't add data: buffer is already full for Uri: %s, exception = %s, buffer capacity = %d, buffer position = %d", uri, obj, Integer.valueOf(bdVar.f269901e.capacity()), Integer.valueOf(bdVar.f269901e.position()));
            return -1;
        }
    }
}

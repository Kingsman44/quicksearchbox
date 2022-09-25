package com.google.android.libraries.lens.view.p2152n;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import com.google.common.base.C58827ar;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.n.i */
/* compiled from: PG */
public final class C27456i {

    /* renamed from: a */
    public static final C58974d f75108a = C58974d.m91135i("LensDataDumper");

    /* renamed from: b */
    public final C60887da f75109b;

    /* renamed from: c */
    public File f75110c;

    /* renamed from: d */
    public File f75111d;

    /* renamed from: e */
    public final boolean f75112e;

    /* renamed from: f */
    public final boolean f75113f;

    /* renamed from: g */
    public final boolean f75114g;

    /* renamed from: h */
    public final List f75115h = Collections.synchronizedList(new ArrayList());

    /* renamed from: i */
    public final AtomicBoolean f75116i = new AtomicBoolean(false);

    /* renamed from: j */
    public final AtomicBoolean f75117j = new AtomicBoolean(false);

    /* renamed from: k */
    public final Map f75118k = new C27455h();

    /* renamed from: l */
    private final Context f75119l;

    /* renamed from: m */
    private File f75120m;

    static {
        new C58827ar(" ");
    }

    public C27456i(Context context, C60887da daVar, C21370a aVar, boolean z, boolean z2, boolean z3) {
        this.f75119l = context;
        this.f75109b = daVar;
        this.f75112e = z;
        this.f75113f = z2;
        this.f75114g = z3;
        if (z) {
            String concat = "lens_dump_".concat(String.valueOf(new SimpleDateFormat(MediaUtilities.VIDEO_FILE_DATETIME_FORMAT, Locale.US).format(Long.valueOf(aVar.mo26870b()))));
            context.getClass();
            File file = new File(context.getFilesDir(), "lens_dump");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file.getAbsolutePath(), concat);
            this.f75120m = file2;
            if (!file2.exists()) {
                this.f75120m.mkdirs();
                ((C58970a) ((C58970a) f75108a.mo56224b()).mo56372aa(49295)).mo56389s("Created %s", this.f75120m.getAbsolutePath());
            }
            File file3 = new File(this.f75120m, "analyzer_images");
            this.f75110c = file3;
            if (!file3.exists()) {
                this.f75110c.mkdirs();
                ((C58970a) ((C58970a) f75108a.mo56224b()).mo56372aa(49294)).mo56389s("Created %s", this.f75110c.getAbsolutePath());
            }
            File file4 = new File(this.f75120m, "capture_images");
            this.f75111d = file4;
            if (!file4.exists()) {
                this.f75111d.mkdirs();
                ((C58970a) ((C58970a) f75108a.mo56224b()).mo56372aa(49293)).mo56389s("Created %s", this.f75111d.getAbsolutePath());
            }
        }
    }

    /* renamed from: c */
    public static String m51111c(int i, int i2, int i3) {
        return TextUtils.join(" ", Arrays.asList(new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    /* renamed from: a */
    public final long mo32987a(long j) {
        Map map = this.f75118k;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            return j;
        }
        Long l = (Long) this.f75118k.get(valueOf);
        l.getClass();
        return l.longValue();
    }

    /* renamed from: b */
    public final long mo32988b() {
        return Collection.EL.stream(this.f75115h).filter(C27450c.f75097a).count();
    }

    /* renamed from: d */
    public final void mo32989d(String str, String str2) {
        BufferedWriter bufferedWriter;
        try {
            File file = new File(this.f75120m, str);
            if (!file.exists()) {
                file.createNewFile();
                ((C58970a) ((C58970a) f75108a.mo56224b()).mo56372aa(49289)).mo56389s("Created %s", file.getAbsolutePath());
            }
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, true), 1024);
                bufferedWriter.append(str2);
                bufferedWriter.newLine();
                bufferedWriter.close();
                ((C58970a) ((C58970a) f75108a.mo56224b()).mo56372aa(49290)).mo56354G("Appended '%s' to %s", str2, str);
                bufferedWriter.close();
                return;
            } catch (IOException e) {
                ((C58970a) ((C58970a) ((C58970a) f75108a.mo56225c()).mo56382g(e)).mo56372aa(49291)).mo56389s("Failed to append timestamp to %s", str);
                return;
            } catch (Throwable th) {
                C27448a.m51109a(th, th);
            }
            throw th;
        } catch (IOException e2) {
            ((C58970a) ((C58970a) ((C58970a) f75108a.mo56225c()).mo56382g(e2)).mo56372aa(49292)).mo56389s("Failed to get file %s", str);
        }
    }

    /* renamed from: e */
    public final void mo32990e(ByteBuffer byteBuffer, String str) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        int size = this.f75115h.size() + 1;
        ((C58970a) ((C58970a) f75108a.mo56224b()).mo56372aa(49299)).mo56395y("Queueing write for buffer %d to %s", size, str);
        this.f75115h.add(this.f75109b.mo19398a(new C27451d(this, str, allocate, size)));
    }
}

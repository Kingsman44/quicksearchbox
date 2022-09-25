package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import android.content.Context;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32012f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.util.UUID;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.a */
/* compiled from: PG */
final class C32027a {

    /* renamed from: f */
    private static final C59071e f86075f = C59071e.m91332i("com.google.android.libraries.privatetelemetry.tqcobalt.worker.a");

    /* renamed from: a */
    public final String f86076a;

    /* renamed from: b */
    public final String f86077b;

    /* renamed from: c */
    public final String f86078c;

    /* renamed from: d */
    public final String f86079d;

    /* renamed from: e */
    public final String f86080e;

    public C32027a(Context context, C32012f fVar) {
        String format = String.format("%s/%s_%s_", new Object[]{context.getFilesDir().getAbsolutePath(), Integer.valueOf(fVar.mo37777a()), Long.valueOf(fVar.mo37778b())});
        this.f86076a = String.valueOf(format).concat("tqcobalt_local_aggregate_store");
        this.f86077b = String.valueOf(format).concat("tqcobalt_obs_store");
        this.f86078c = String.valueOf(format).concat("tqcobalt_local_aggregatre_proto_store");
        this.f86079d = String.valueOf(format).concat("tqcobalt_obs_history_proto_store");
        this.f86080e = String.valueOf(format).concat("tqcobalt_system_data_cache");
    }

    /* renamed from: c */
    public static File[] m59692c(String str) {
        return m59694e(new File(str));
    }

    /* renamed from: d */
    public static final void m59693d(File file) {
        if (!file.delete()) {
            ((C59052c) ((C59052c) f86075f.mo56226d()).mo56372aa(50481)).mo56389s("Cobalt: couldn't delete file %s", file.getAbsolutePath());
        }
    }

    /* renamed from: e */
    private static File[] m59694e(File file) {
        File[] listFiles = file.listFiles();
        return listFiles == null ? new File[0] : listFiles;
    }

    /* renamed from: a */
    public final void mo37811a(File file) {
        if (!file.isDirectory()) {
            m59693d(file);
            return;
        }
        for (File file2 : m59694e(file)) {
            mo37811a(file2);
            if (!file2.delete()) {
                ((C59052c) ((C59052c) f86075f.mo56226d()).mo56372aa(50482)).mo56389s("Cobalt: couldn't delete directory %s", file2.getAbsolutePath());
            }
        }
    }

    /* renamed from: b */
    public final void mo37812b() {
        File file = new File(this.f86077b.concat("/in_progress.data"));
        String str = this.f86077b + "/" + String.valueOf(UUID.randomUUID()) + ".data";
        if (!file.renameTo(new File(str))) {
            ((C59052c) ((C59052c) f86075f.mo56226d()).mo56372aa(50483)).mo56389s("Cobalt: couldn't rename active file to %s", str);
        }
    }
}

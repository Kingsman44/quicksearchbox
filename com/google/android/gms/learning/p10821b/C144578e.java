package com.google.android.gms.learning.p10821b;

import android.content.Context;
import android.os.Build;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29691a;
import com.google.android.libraries.micore.learning.p2258a.C29692b;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.channels.FileLockInterruptionException;

/* renamed from: com.google.android.gms.learning.b.e */
/* compiled from: PG */
public final class C144578e {

    /* renamed from: a */
    private static final C29719k f391232a = C29712d.m54801a("FileLogger");

    /* renamed from: b */
    private static final Object f391233b = Build.ID;

    /* renamed from: a */
    public static void m235071a(Context context, C59628h hVar) {
        FileLock lock;
        synchronized (f391233b) {
            File file = new File(context.getExternalFilesDir((String) null).getAbsolutePath().replace(context.getPackageName(), context.getPackageName()), "brella_clearcut_log");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    try {
                        lock = fileOutputStream.getChannel().lock();
                        C29691a aVar = (C29691a) C29692b.f80422b.createBuilder();
                        aVar.copyOnWrite();
                        C29692b bVar = (C29692b) aVar.instance;
                        hVar.getClass();
                        C62971cq cqVar = bVar.f80424a;
                        if (!cqVar.mo58948c()) {
                            bVar.f80424a = C62942bv.mutableCopy(cqVar);
                        }
                        bVar.f80424a.add(hVar);
                        ((C29692b) aVar.build()).writeTo(dataOutputStream);
                        dataOutputStream.flush();
                        file.getAbsolutePath();
                        if (lock != null) {
                            lock.close();
                        }
                        dataOutputStream.close();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        dataOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileLockInterruptionException unused) {
                Thread.interrupted();
                m235071a(context, hVar);
                Thread.currentThread().interrupt();
            } catch (IOException e) {
                f391232a.mo34863e("Make sure you have READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions declared in your AndroidManifest.xml");
                throw new RuntimeException(e);
            } catch (Throwable th3) {
                C144577d.m235070a(th2, th3);
            }
        }
        return;
        throw th;
    }
}

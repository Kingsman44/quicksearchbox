package com.google.android.libraries.blocks;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62971cq;
import p5690r.p5691a.C72768b;
import p5690r.p5691a.C72770d;

/* compiled from: PG */
public final class StatusException extends RuntimeException {
    public StatusException(String str) {
        super(str);
        setStackTrace(new StackTraceElement[0]);
    }

    public StatusException(String str, StackTraceElement[] stackTraceElementArr) {
        super(str);
        setStackTrace(stackTraceElementArr);
    }

    public StatusException(String str, StackTraceElement[] stackTraceElementArr, C72768b bVar) {
        super(str, new StatusException(BuildConfig.FLAVOR, stackTraceElementArr));
        if (bVar.f193462a.size() > 0) {
            C62971cq cqVar = bVar.f193462a;
            int size = cqVar.size();
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[size];
            for (int i = 0; i < size; i++) {
                C72770d dVar = (C72770d) cqVar.get(i);
                int i2 = dVar.f193468d;
                stackTraceElementArr2[i] = new StackTraceElement("_blocks_js_:" + i2, dVar.f193465a, dVar.f193466b, dVar.f193467c);
            }
            setStackTrace(stackTraceElementArr2);
        }
    }
}

package androidx.core.content.p091b;

import android.graphics.Shader;

/* renamed from: androidx.core.content.b.l */
/* compiled from: PG */
final class C1863l {
    /* renamed from: a */
    public static Shader.TileMode m5091a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}

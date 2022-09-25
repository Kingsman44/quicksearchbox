package com.google.p3723ar.core;

import java.util.Locale;

/* renamed from: com.google.ar.core.Pose */
/* compiled from: PG */
public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.f124025a);
    private final Quaternion quaternion;
    private final float[] translation;

    private Pose(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.quaternion = new Quaternion(f4, f5, f6, f7);
        this.translation = new float[]{f, f2, f3};
    }

    private Pose(float[] fArr, Quaternion quaternion2) {
        this.translation = fArr;
        this.quaternion = quaternion2;
    }

    public static Pose makeInterpolated(Pose pose, Pose pose2, float f) {
        float f2;
        if (f == 0.0f) {
            return pose;
        }
        if (f == 1.0f) {
            return pose2;
        }
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = (pose.translation[i] * (1.0f - f)) + (pose2.translation[i] * f);
        }
        Quaternion quaternion2 = pose.quaternion;
        Quaternion quaternion3 = pose2.quaternion;
        Quaternion quaternion4 = new Quaternion();
        float f3 = (quaternion2.f124027x * quaternion3.f124027x) + (quaternion2.f124028y * quaternion3.f124028y) + (quaternion2.f124029z * quaternion3.f124029z) + (quaternion2.f124026w * quaternion3.f124026w);
        if (f3 < 0.0f) {
            Quaternion quaternion5 = new Quaternion(quaternion3);
            f3 = -f3;
            quaternion5.f124027x = -quaternion5.f124027x;
            quaternion5.f124028y = -quaternion5.f124028y;
            quaternion5.f124029z = -quaternion5.f124029z;
            quaternion5.f124026w = -quaternion5.f124026w;
            quaternion3 = quaternion5;
        }
        float acos = (float) Math.acos((double) f3);
        float sqrt = (float) Math.sqrt((double) (1.0f - (f3 * f3)));
        if (((double) Math.abs(sqrt)) > 0.001d) {
            float f4 = 1.0f / sqrt;
            f2 = ((float) Math.sin((double) ((1.0f - f) * acos))) * f4;
            f = ((float) Math.sin((double) (f * acos))) * f4;
        } else {
            f2 = 1.0f - f;
        }
        float f5 = (quaternion2.f124027x * f2) + (quaternion3.f124027x * f);
        quaternion4.f124027x = f5;
        float f6 = (quaternion2.f124028y * f2) + (quaternion3.f124028y * f);
        quaternion4.f124028y = f6;
        float f7 = (quaternion2.f124029z * f2) + (quaternion3.f124029z * f);
        quaternion4.f124029z = f7;
        float f8 = (f2 * quaternion2.f124026w) + (f * quaternion3.f124026w);
        quaternion4.f124026w = f8;
        float sqrt2 = (float) (1.0d / Math.sqrt((double) ((((f5 * f5) + (f6 * f6)) + (f7 * f7)) + (f8 * f8))));
        quaternion4.f124027x *= sqrt2;
        quaternion4.f124028y *= sqrt2;
        quaternion4.f124029z *= sqrt2;
        quaternion4.f124026w *= sqrt2;
        return new Pose(fArr, quaternion4);
    }

    public static Pose makeRotation(float f, float f2, float f3, float f4) {
        return new Pose(IDENTITY.translation, new Quaternion(f, f2, f3, f4));
    }

    public static Pose makeTranslation(float f, float f2, float f3) {
        return new Pose(new float[]{f, f2, f3}, IDENTITY.quaternion);
    }

    public Pose compose(Pose pose) {
        float[] fArr = new float[3];
        Quaternion.m85104a(this.quaternion, pose.translation, 0, fArr, 0);
        float f = fArr[0];
        float[] fArr2 = this.translation;
        fArr[0] = f + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
        Quaternion quaternion2 = this.quaternion;
        Quaternion quaternion3 = pose.quaternion;
        Quaternion quaternion4 = new Quaternion();
        float f2 = quaternion2.f124027x;
        float f3 = quaternion3.f124026w;
        float f4 = quaternion2.f124028y;
        float f5 = quaternion3.f124029z;
        float f6 = quaternion2.f124029z;
        float f7 = quaternion3.f124028y;
        float f8 = quaternion2.f124026w;
        quaternion4.f124027x = (((f2 * f3) + (f4 * f5)) - (f6 * f7)) + (quaternion3.f124027x * f8);
        float f9 = quaternion2.f124027x;
        float f10 = -f9;
        float f11 = quaternion3.f124027x;
        quaternion4.f124028y = (f10 * f5) + (f4 * f3) + (f6 * f11) + (f7 * f8);
        float f12 = quaternion3.f124028y;
        float f13 = quaternion2.f124028y;
        quaternion4.f124029z = ((f9 * f12) - (f13 * f11)) + (f6 * f3) + (f5 * f8);
        quaternion4.f124026w = (((f10 * f11) - (f13 * f12)) - (quaternion2.f124029z * quaternion3.f124029z)) + (f8 * f3);
        return new Pose(fArr, quaternion4);
    }

    public Pose extractRotation() {
        return new Pose(IDENTITY.translation, this.quaternion);
    }

    public Pose extractTranslation() {
        return new Pose(this.translation, IDENTITY.quaternion);
    }

    /* access modifiers changed from: package-private */
    public Quaternion getQuaternion() {
        return this.quaternion;
    }

    public float[] getRotationQuaternion() {
        float[] fArr = new float[4];
        getRotationQuaternion(fArr, 0);
        return fArr;
    }

    public float[] getTransformedAxis(int i, float f) {
        float[] fArr = new float[3];
        getTransformedAxis(i, f, fArr, 0);
        return fArr;
    }

    public float[] getTranslation() {
        float[] fArr = new float[3];
        getTranslation(fArr, 0);
        return fArr;
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    public Pose inverse() {
        float[] fArr = new float[3];
        Quaternion quaternion2 = this.quaternion;
        Quaternion quaternion3 = new Quaternion(-quaternion2.f124027x, -quaternion2.f124028y, -quaternion2.f124029z, quaternion2.f124026w);
        Quaternion.m85104a(quaternion3, this.translation, 0, fArr, 0);
        fArr[0] = -fArr[0];
        fArr[1] = -fArr[1];
        fArr[2] = -fArr[2];
        return new Pose(fArr, quaternion3);
    }

    /* renamed from: qw */
    public float mo52017qw() {
        return this.quaternion.f124026w;
    }

    /* renamed from: qx */
    public float mo52018qx() {
        return this.quaternion.f124027x;
    }

    /* renamed from: qy */
    public float mo52019qy() {
        return this.quaternion.f124028y;
    }

    /* renamed from: qz */
    public float mo52020qz() {
        return this.quaternion.f124029z;
    }

    public float[] rotateVector(float[] fArr) {
        float[] fArr2 = new float[3];
        rotateVector(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public void toMatrix(float[] fArr, int i) {
        Quaternion quaternion2 = this.quaternion;
        float f = quaternion2.f124027x;
        float f2 = quaternion2.f124028y;
        float f3 = quaternion2.f124029z;
        float f4 = quaternion2.f124026w;
        float f5 = (f * f) + (f2 * f2) + (f3 * f3) + (f4 * f4);
        float f6 = f5 > 0.0f ? 2.0f / f5 : 0.0f;
        float f7 = f * f6;
        float f8 = f2 * f6;
        float f9 = f6 * f3;
        float f10 = f4 * f7;
        float f11 = f4 * f8;
        float f12 = f4 * f9;
        float f13 = f7 * f;
        float f14 = f * f8;
        float f15 = f * f9;
        float f16 = f8 * f2;
        float f17 = f2 * f9;
        float f18 = f3 * f9;
        fArr[i] = 1.0f - (f16 + f18);
        fArr[i + 4] = f14 - f12;
        fArr[i + 8] = f15 + f11;
        fArr[i + 1] = f14 + f12;
        fArr[i + 5] = 1.0f - (f18 + f13);
        fArr[i + 9] = f17 - f10;
        fArr[i + 2] = f15 - f11;
        fArr[i + 6] = f17 + f10;
        fArr[i + 10] = 1.0f - (f13 + f16);
        float[] fArr2 = this.translation;
        fArr[i + 12] = fArr2[0];
        fArr[i + 13] = fArr2[1];
        fArr[i + 14] = fArr2[2];
        fArr[i + 3] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        float[] fArr = this.translation;
        Quaternion quaternion2 = this.quaternion;
        return String.format(locale, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", new Object[]{Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Float.valueOf(quaternion2.f124027x), Float.valueOf(quaternion2.f124028y), Float.valueOf(quaternion2.f124029z), Float.valueOf(quaternion2.f124026w)});
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    /* renamed from: tx */
    public float mo52027tx() {
        return this.translation[0];
    }

    /* renamed from: ty */
    public float mo52028ty() {
        return this.translation[1];
    }

    /* renamed from: tz */
    public float mo52029tz() {
        return this.translation[2];
    }

    public Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }

    public static Pose makeRotation(float[] fArr) {
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static Pose makeTranslation(float[] fArr) {
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public void getRotationQuaternion(float[] fArr, int i) {
        Quaternion quaternion2 = this.quaternion;
        fArr[i] = quaternion2.f124027x;
        fArr[i + 1] = quaternion2.f124028y;
        fArr[i + 2] = quaternion2.f124029z;
        fArr[i + 3] = quaternion2.f124026w;
    }

    public void getTransformedAxis(int i, float f, float[] fArr, int i2) {
        Quaternion quaternion2 = this.quaternion;
        float[] fArr2 = {0.0f, 0.0f, 0.0f};
        fArr2[i] = f;
        Quaternion.m85104a(quaternion2, fArr2, 0, fArr, i2);
    }

    public void getTranslation(float[] fArr, int i) {
        System.arraycopy(this.translation, 0, fArr, i, 3);
    }

    public void rotateVector(float[] fArr, int i, float[] fArr2, int i2) {
        Quaternion.m85104a(this.quaternion, fArr, i, fArr2, i2);
    }

    public void transformPoint(float[] fArr, int i, float[] fArr2, int i2) {
        rotateVector(fArr, i, fArr2, i2);
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = i3 + i2;
            fArr2[i4] = fArr2[i4] + this.translation[i3];
        }
    }
}

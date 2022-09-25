package com.android.launcher3;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.MimeTypeMap;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.android.launcher3.WallpaperCropActivity;
import com.android.launcher3.util.WallpaperUtils;
import com.android.p261d.p262a.C5037a;
import com.android.p261d.p262a.C5038b;
import com.android.p261d.p262a.C5039c;
import com.android.p261d.p262a.C5040d;
import com.android.p261d.p262a.C5041e;
import com.android.p271h.C5163b;
import com.android.p271h.C5164c;
import com.android.p271h.p272a.C5156d;
import com.google.android.googlequicksearchbox.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
public class WallpaperPickerActivity extends WallpaperCropActivity {
    ActionMode mActionMode;
    ActionMode.Callback mActionModeCallback;
    boolean mIgnoreNextTap;
    View.OnLongClickListener mLongClickListener;
    public SavedWallpaperImages mSavedImages;
    int mSelectedIndex = -1;
    View mSelectedTile;
    final ArrayList mTempWallpaperTiles = new ArrayList();
    View.OnClickListener mThumbnailOnClickListener;
    public float mWallpaperParallaxOffset;
    HorizontalScrollView mWallpaperScrollContainer;
    View mWallpaperStrip;
    LinearLayout mWallpapersView;

    /* compiled from: PG */
    public final class DefaultWallpaperInfo extends WallpaperTileInfo {
        public DefaultWallpaperInfo(Drawable drawable) {
            this.mThumb = drawable;
        }

        public final boolean isNamelessWallpaper() {
            return true;
        }

        public final boolean isSelectable() {
            return true;
        }

        public final void onClick(WallpaperPickerActivity wallpaperPickerActivity) {
            CropView cropView = wallpaperPickerActivity.mCropView;
            Drawable builtInDrawable = WallpaperManager.getInstance(wallpaperPickerActivity).getBuiltInDrawable(cropView.getWidth(), cropView.getHeight(), false, 0.5f, 0.5f);
            if (builtInDrawable == null) {
                Log.w("WallpaperPickerActivity", "Null default wallpaper encountered.");
                cropView.setTileSource$ar$ds((C5156d) null);
                return;
            }
            WallpaperCropActivity.LoadRequest loadRequest = new WallpaperCropActivity.LoadRequest();
            loadRequest.moveToLeft = false;
            loadRequest.touchEnabled = false;
            loadRequest.scaleAndOffsetProvider = new WallpaperCropActivity.CropViewScaleAndOffsetProvider();
            loadRequest.result = new DrawableTileSource(wallpaperPickerActivity, builtInDrawable);
            wallpaperPickerActivity.onLoadRequestComplete(loadRequest, true);
        }

        public final void onSave(final WallpaperPickerActivity wallpaperPickerActivity) {
            if (!Utilities.ATLEAST_NOUGAT) {
                try {
                    WallpaperManager.getInstance(wallpaperPickerActivity).clear();
                    wallpaperPickerActivity.setResult(-1);
                } catch (IOException e) {
                    Log.e("WallpaperPickerActivity", "Setting wallpaper to default threw exception", e);
                } catch (SecurityException e2) {
                    Log.w("WallpaperPickerActivity", "Setting wallpaper to default threw exception", e2);
                    wallpaperPickerActivity.setResult(-1);
                }
                wallpaperPickerActivity.finish();
                return;
            }
            NycWallpaperUtils.executeCropTaskAfterPrompt(wallpaperPickerActivity, new C5039c(new C5038b() {
                public final void run(boolean z) {
                    if (z) {
                        WallpaperPickerActivity.this.setResult(-1);
                    }
                    WallpaperPickerActivity.this.finish();
                }
            }, wallpaperPickerActivity) {
                /* access modifiers changed from: protected */
                public final Boolean doInBackground(Integer... numArr) {
                    boolean z = false;
                    int intValue = numArr[0].intValue();
                    if (intValue == 2) {
                        try {
                            Bitmap bitmap = ((BitmapDrawable) WallpaperManager.getInstance(wallpaperPickerActivity.getApplicationContext()).getBuiltInDrawable()).getBitmap();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
                            if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                                NycWallpaperUtils.setStream$ar$ds(wallpaperPickerActivity.getApplicationContext(), new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), (Rect) null, 2);
                            }
                        } catch (IOException e) {
                            Log.e("WallpaperPickerActivity", "Setting wallpaper to default threw exception", e);
                        } catch (SecurityException e2) {
                            Log.w("WallpaperPickerActivity", "Setting wallpaper to default threw exception", e2);
                        }
                    } else {
                        WallpaperManager instance = WallpaperManager.getInstance(wallpaperPickerActivity);
                        if (Utilities.ATLEAST_NOUGAT) {
                            try {
                                WallpaperManager.class.getMethod("clear", new Class[]{Integer.TYPE}).invoke(instance, new Object[]{Integer.valueOf(intValue)});
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                                e3.printStackTrace();
                            }
                        } else {
                            instance.clear();
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
                    return doInBackground((Integer[]) objArr);
                }
            }, wallpaperPickerActivity.mOnDialogCancelListener);
        }
    }

    /* compiled from: PG */
    public class FileWallpaperInfo extends WallpaperTileInfo {
        protected final File mFile;

        public FileWallpaperInfo(File file, Drawable drawable) {
            this.mFile = file;
            this.mThumb = drawable;
        }

        /* access modifiers changed from: protected */
        public WallpaperCropActivity.CropViewScaleAndOffsetProvider getCropViewScaleAndOffsetProvider() {
            return null;
        }

        public final boolean isNamelessWallpaper() {
            return true;
        }

        public final boolean isSelectable() {
            return true;
        }

        public final void onClick(final WallpaperPickerActivity wallpaperPickerActivity) {
            wallpaperPickerActivity.mSetWallpaperButton.setEnabled(false);
            final C5164c cVar = new C5164c(wallpaperPickerActivity, Uri.fromFile(this.mFile));
            wallpaperPickerActivity.setCropViewTileSource(cVar, false, true, getCropViewScaleAndOffsetProvider(), new Runnable() {
                public final void run() {
                    if (C5164c.this.f16361d == 2) {
                        wallpaperPickerActivity.mSetWallpaperButton.setEnabled(true);
                    }
                }
            });
        }

        public void onSave(WallpaperPickerActivity wallpaperPickerActivity) {
            boolean z = wallpaperPickerActivity.mWallpaperParallaxOffset == 0.0f;
            Uri fromFile = Uri.fromFile(this.mFile);
            C5039c cVar = new C5039c(wallpaperPickerActivity, fromFile, (RectF) null, C5040d.m13841a((Resources) null, 0, wallpaperPickerActivity, fromFile), 0, 0, true, false, (C5038b) null);
            cVar.mOnEndCropHandler = new C5038b(cVar.getImageBounds(), z) {
                final /* synthetic */ Point val$bounds;
                final /* synthetic */ boolean val$shouldFadeOutOnFinish;

                public final void run(
/*
Method generation error in method: com.android.launcher3.WallpaperCropActivity.7.run(boolean):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.WallpaperCropActivity.7.run(boolean):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            };
            cVar.mNoCrop = true;
            NycWallpaperUtils.executeCropTaskAfterPrompt(wallpaperPickerActivity, cVar, wallpaperPickerActivity.mOnDialogCancelListener);
        }
    }

    /* compiled from: PG */
    public final class PickImageInfo extends WallpaperTileInfo {
        public final void onClick(WallpaperPickerActivity wallpaperPickerActivity) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            Utilities.startActivityForResultSafely(wallpaperPickerActivity, intent, 5);
        }
    }

    /* compiled from: PG */
    public final class ResourceWallpaperInfo extends WallpaperTileInfo {
        private final int mResId;
        private final Resources mResources;

        public ResourceWallpaperInfo(Resources resources, int i, Drawable drawable) {
            this.mResources = resources;
            this.mResId = i;
            this.mThumb = drawable;
        }

        public final boolean isNamelessWallpaper() {
            return true;
        }

        public final boolean isSelectable() {
            return true;
        }

        public final void onClick(final WallpaperPickerActivity wallpaperPickerActivity) {
            wallpaperPickerActivity.mSetWallpaperButton.setEnabled(false);
            final C5163b bVar = new C5163b(this.mResources, this.mResId);
            wallpaperPickerActivity.setCropViewTileSource(bVar, false, false, new WallpaperCropActivity.CropViewScaleAndOffsetProvider() {
                public final float getParallaxOffset() {
                    return WallpaperPickerActivity.this.mWallpaperParallaxOffset;
                }

                public final float getScale(Point point, RectF rectF) {
                    return ((float) point.x) / rectF.width();
                }
            }, new Runnable() {
                public final void run() {
                    if (C5163b.this.f16361d == 2) {
                        wallpaperPickerActivity.mSetWallpaperButton.setEnabled(true);
                    }
                }
            });
        }

        public final void onSave(WallpaperPickerActivity wallpaperPickerActivity) {
            Resources resources = this.mResources;
            int i = this.mResId;
            int a = C5040d.m13841a(resources, i, (Context) null, (Uri) null);
            Point sourceDimensions = wallpaperPickerActivity.mCropView.getSourceDimensions();
            Point defaultWallpaperSize = WallpaperUtils.getDefaultWallpaperSize(wallpaperPickerActivity.getResources(), wallpaperPickerActivity.getWindowManager());
            RectF b = C5041e.m13843b(sourceDimensions.x, sourceDimensions.y, defaultWallpaperSize.x, defaultWallpaperSize.y, false);
            WallpaperCropActivity.C53948 r10 = new C5038b() {
                public final void run(
/*
Method generation error in method: com.android.launcher3.WallpaperCropActivity.8.run(boolean):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.WallpaperCropActivity.8.run(boolean):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            };
            NycWallpaperUtils.executeCropTaskAfterPrompt(wallpaperPickerActivity, new C5039c(wallpaperPickerActivity, resources, i, b, a, defaultWallpaperSize.x, defaultWallpaperSize.y, true, false, r10), wallpaperPickerActivity.mOnDialogCancelListener);
        }
    }

    /* compiled from: PG */
    final class SimpleWallpapersAdapter extends ArrayAdapter {
        private final LayoutInflater mLayoutInflater;

        public SimpleWallpapersAdapter(Context context, ArrayList arrayList) {
            super(context, R.layout.wallpaper_picker_item, arrayList);
            this.mLayoutInflater = LayoutInflater.from(context);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            Drawable drawable = ((WallpaperTileInfo) getItem(i)).mThumb;
            if (drawable == null) {
                Log.e("WallpaperPickerActivity", "Error decoding thumbnail for wallpaper #" + i);
            }
            return WallpaperPickerActivity.createImageTileView(this.mLayoutInflater, view, viewGroup, drawable);
        }
    }

    /* compiled from: PG */
    public final class UriWallpaperInfo extends WallpaperTileInfo {
        public final Uri mUri;

        public UriWallpaperInfo(Uri uri) {
            this.mUri = uri;
        }

        public final boolean isNamelessWallpaper() {
            return true;
        }

        public final boolean isSelectable() {
            return true;
        }

        public final void onClick(final WallpaperPickerActivity wallpaperPickerActivity) {
            wallpaperPickerActivity.mSetWallpaperButton.setEnabled(false);
            final C5164c cVar = new C5164c(wallpaperPickerActivity, this.mUri);
            wallpaperPickerActivity.setCropViewTileSource(cVar, true, false, (WallpaperCropActivity.CropViewScaleAndOffsetProvider) null, new Runnable() {
                public final void run() {
                    if (cVar.f16361d == 2) {
                        wallpaperPickerActivity.selectTile(UriWallpaperInfo.this.mView);
                        wallpaperPickerActivity.mSetWallpaperButton.setEnabled(true);
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) UriWallpaperInfo.this.mView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(UriWallpaperInfo.this.mView);
                        Toast.makeText(wallpaperPickerActivity, R.string.image_load_fail, 0).show();
                    }
                }
            });
        }

        public final void onSave(final WallpaperPickerActivity wallpaperPickerActivity) {
            wallpaperPickerActivity.cropImageAndSetWallpaper$ar$ds(this.mUri, new C5037a() {
                public final void onBitmapCropped(byte[] bArr, Rect rect) {
                    Point defaultThumbnailSize = WallpaperPickerActivity.getDefaultThumbnailSize(wallpaperPickerActivity.getResources());
                    Bitmap bitmap = null;
                    if (bArr != null) {
                        Bitmap createThumbnail = WallpaperPickerActivity.createThumbnail(defaultThumbnailSize, (Context) null, (Uri) null, bArr, (Resources) null, 0, 0, true);
                        try {
                            wallpaperPickerActivity.mSavedImages.writeImage(createThumbnail, new ByteArrayInputStream(bArr), (Float[]) null);
                        } catch (IOException e) {
                            Log.e("Launcher3.SavedWallpaperImages", "Failed writing images to storage ".concat(e.toString()));
                        }
                    } else {
                        try {
                            Point defaultThumbnailSize2 = WallpaperPickerActivity.getDefaultThumbnailSize(wallpaperPickerActivity.getResources());
                            Rect rect2 = new Rect();
                            C5041e.m13843b(rect.width(), rect.height(), defaultThumbnailSize2.x, defaultThumbnailSize2.y, false).roundOut(rect2);
                            rect2.offset(rect.left, rect.top);
                            InputStream openInputStream = wallpaperPickerActivity.getContentResolver().openInputStream(UriWallpaperInfo.this.mUri);
                            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(openInputStream, true);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = rect2.width() / defaultThumbnailSize2.x;
                            bitmap = newInstance.decodeRegion(rect2, options);
                            newInstance.recycle();
                            C5041e.m13845d(openInputStream);
                            if (bitmap != null) {
                                bitmap = Bitmap.createScaledBitmap(bitmap, defaultThumbnailSize2.x, defaultThumbnailSize2.y, true);
                            }
                        } catch (IOException unused) {
                        }
                        PointF center = wallpaperPickerActivity.mCropView.getCenter();
                        Float[] fArr = {Float.valueOf(wallpaperPickerActivity.mCropView.mRenderer.f16404a), Float.valueOf(center.x), Float.valueOf(center.y)};
                        SavedWallpaperImages savedWallpaperImages = wallpaperPickerActivity.mSavedImages;
                        try {
                            savedWallpaperImages.writeImage(bitmap, savedWallpaperImages.mContext.getContentResolver().openInputStream(UriWallpaperInfo.this.mUri), fArr);
                        } catch (IOException e2) {
                            Log.e("Launcher3.SavedWallpaperImages", "Failed writing images to storage ".concat(e2.toString()));
                        }
                    }
                }
            }, wallpaperPickerActivity.mWallpaperParallaxOffset == 0.0f);
        }
    }

    /* compiled from: PG */
    public class WallpaperTileInfo {
        public Drawable mThumb;
        protected View mView;

        public boolean isNamelessWallpaper() {
            return false;
        }

        public boolean isSelectable() {
            return false;
        }

        public void onClick(WallpaperPickerActivity wallpaperPickerActivity) {
            throw null;
        }

        public void onDelete(WallpaperPickerActivity wallpaperPickerActivity) {
        }

        public void onSave(WallpaperPickerActivity wallpaperPickerActivity) {
        }
    }

    private final void addLongPressHandler(View view) {
        view.setOnLongClickListener(this.mLongClickListener);
        final StylusEventHelper stylusEventHelper = new StylusEventHelper(view);
        view.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return StylusEventHelper.this.checkAndPerformStylusEvent(motionEvent);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addTemporaryWallpaperTile(android.net.Uri r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            android.widget.LinearLayout r2 = r10.mWallpapersView
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L_0x0027
            android.widget.LinearLayout r2 = r10.mWallpapersView
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.Object r3 = r2.getTag()
            boolean r4 = r3 instanceof com.android.launcher3.WallpaperPickerActivity.UriWallpaperInfo
            if (r4 == 0) goto L_0x0024
            com.android.launcher3.WallpaperPickerActivity$UriWallpaperInfo r3 = (com.android.launcher3.WallpaperPickerActivity.UriWallpaperInfo) r3
            android.net.Uri r3 = r3.mUri
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x0028
        L_0x0024:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0035
            android.widget.LinearLayout r3 = r10.mWallpapersView
            r3.removeViewAt(r1)
            android.widget.LinearLayout r1 = r10.mWallpapersView
            r1.addView(r2, r0)
            goto L_0x0054
        L_0x0035:
            android.view.LayoutInflater r1 = r10.getLayoutInflater()
            r2 = 2131627235(0x7f0e0ce3, float:1.8881729E38)
            android.widget.LinearLayout r3 = r10.mWallpapersView
            android.view.View r1 = r1.inflate(r2, r3, r0)
            r2 = r1
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r1 = 8
            r2.setVisibility(r1)
            android.widget.LinearLayout r1 = r10.mWallpapersView
            r1.addView(r2, r0)
            java.util.ArrayList r1 = r10.mTempWallpaperTiles
            r1.add(r11)
        L_0x0054:
            r1 = 2131437044(0x7f0b25f4, float:1.8495976E38)
            android.view.View r1 = r2.findViewById(r1)
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.res.Resources r1 = r10.getResources()
            android.graphics.Point r7 = getDefaultThumbnailSize(r1)
            com.android.launcher3.WallpaperPickerActivity$10 r1 = new com.android.launcher3.WallpaperPickerActivity$10
            r3 = r1
            r4 = r10
            r5 = r10
            r6 = r11
            r9 = r2
            r3.<init>(r5, r6, r7, r8, r9)
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.execute(r0)
            com.android.launcher3.WallpaperPickerActivity$UriWallpaperInfo r0 = new com.android.launcher3.WallpaperPickerActivity$UriWallpaperInfo
            r0.<init>(r11)
            r2.setTag(r0)
            r0.mView = r2
            r10.addLongPressHandler(r2)
            r10.updateTileIndices()
            android.view.View$OnClickListener r11 = r10.mThumbnailOnClickListener
            r2.setOnClickListener(r11)
            if (r12 != 0) goto L_0x0091
            android.view.View$OnClickListener r11 = r10.mThumbnailOnClickListener
            r11.onClick(r2)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.WallpaperPickerActivity.addTemporaryWallpaperTile(android.net.Uri, boolean):void");
    }

    private static final void addWallpapers$ar$ds(ArrayList arrayList, Resources resources, String str, int i) {
        for (String str2 : resources.getStringArray(i)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0) {
                int identifier2 = resources.getIdentifier(String.valueOf(str2).concat("_small"), "drawable", str);
                if (identifier2 != 0) {
                    arrayList.add(new ResourceWallpaperInfo(resources, identifier, resources.getDrawable(identifier2)));
                }
            } else {
                Log.e("WallpaperPickerActivity", "Couldn't find wallpaper ".concat(String.valueOf(str2)));
            }
        }
    }

    public static View createImageTileView(LayoutInflater layoutInflater, View view, ViewGroup viewGroup, Drawable drawable) {
        if (view == null) {
            view = layoutInflater.inflate(R.layout.wallpaper_picker_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.wallpaper_image);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            drawable.setDither(true);
        }
        return view;
    }

    static Bitmap createThumbnail(Point point, Context context, Uri uri, byte[] bArr, Resources resources, int i, int i2, boolean z) {
        C5039c cVar;
        Point point2 = point;
        byte[] bArr2 = bArr;
        int i3 = i2;
        int i4 = point2.x;
        int i5 = point2.y;
        if (uri != null) {
            cVar = new C5039c(context, uri, (RectF) null, i2, i4, i5, false, true, (C5038b) null);
        } else if (bArr2 != null) {
            cVar = new C5039c(bArr2, i3, i4, i5);
        } else {
            cVar = new C5039c(context, resources, i, (RectF) null, i2, i4, i5, false, true, (C5038b) null);
        }
        Point imageBounds = cVar.getImageBounds();
        if (!(imageBounds == null || imageBounds.x == 0 || imageBounds.y == 0)) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i3);
            float[] fArr = {(float) imageBounds.x, (float) imageBounds.y};
            matrix.mapPoints(fArr);
            fArr[0] = Math.abs(fArr[0]);
            float abs = Math.abs(fArr[1]);
            fArr[1] = abs;
            cVar.mCropBounds = C5041e.m13843b((int) fArr[0], (int) abs, i4, i5, z);
            if (cVar.cropBitmap(1)) {
                return cVar.mCroppedBitmap;
            }
        }
        return null;
    }

    private final File getDefaultThumbFile() {
        File filesDir = getFilesDir();
        int i = Build.VERSION.SDK_INT;
        return new File(filesDir, i + "_default_thumb2.jpg");
    }

    static Point getDefaultThumbnailSize(Resources resources) {
        return new Point(resources.getDimensionPixelSize(R.dimen.wallpaperThumbnailWidth), resources.getDimensionPixelSize(R.dimen.wallpaperThumbnailHeight));
    }

    private final boolean saveDefaultWallpaperThumb(Bitmap bitmap) {
        new File(getFilesDir(), "default_thumb.jpg").delete();
        new File(getFilesDir(), "default_thumb2.jpg").delete();
        for (int i = 16; i < Build.VERSION.SDK_INT; i++) {
            File filesDir = getFilesDir();
            new File(filesDir, i + "_default_thumb2.jpg").delete();
        }
        File defaultThumbFile = getDefaultThumbFile();
        try {
            defaultThumbFile.createNewFile();
            FileOutputStream openFileOutput = openFileOutput(defaultThumbFile.getName(), 0);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 95, openFileOutput);
            openFileOutput.close();
            return true;
        } catch (IOException e) {
            Log.e("WallpaperPickerActivity", "Error while writing bitmap to file ".concat(e.toString()));
            defaultThumbFile.delete();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void changeWallpaperFlags(boolean z) {
        int i = true != z ? 0 : 1048576;
        if (i != (getWindow().getAttributes().flags & 1048576)) {
            getWindow().setFlags(i, 1048576);
        }
    }

    public final boolean enableRotation() {
        return true;
    }

    public Pair getWallpaperArrayResourceId() {
        try {
            return new Pair(getPackageManager().getApplicationInfo(getResources().getResourcePackageName(R.array.wallpapers), 0), Integer.valueOf(R.array.wallpapers));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r23 = this;
            r8 = r23
            r0 = 2131627233(0x7f0e0ce1, float:1.8881725E38)
            r8.setContentView(r0)
            r0 = 2131430059(0x7f0b0aab, float:1.8481808E38)
            android.view.View r0 = r8.findViewById(r0)
            com.android.launcher3.CropView r0 = (com.android.launcher3.CropView) r0
            r8.mCropView = r0
            com.android.launcher3.CropView r0 = r8.mCropView
            r9 = 4
            r0.setVisibility(r9)
            r0 = 2131432932(0x7f0b15e4, float:1.8487635E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.mProgressView = r0
            r0 = 2131437047(0x7f0b25f7, float:1.8495982E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.HorizontalScrollView r0 = (android.widget.HorizontalScrollView) r0
            r8.mWallpaperScrollContainer = r0
            r0 = 2131437048(0x7f0b25f8, float:1.8495984E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.mWallpaperStrip = r0
            com.android.launcher3.CropView r0 = r8.mCropView
            com.android.launcher3.WallpaperPickerActivity$2 r1 = new com.android.launcher3.WallpaperPickerActivity$2
            r1.<init>()
            r0.mTouchCallback$ar$class_merging = r1
            com.android.launcher3.WallpaperPickerActivity$3 r0 = new com.android.launcher3.WallpaperPickerActivity$3
            r0.<init>()
            r8.mThumbnailOnClickListener = r0
            com.android.launcher3.WallpaperPickerActivity$4 r0 = new com.android.launcher3.WallpaperPickerActivity$4
            r0.<init>()
            r8.mLongClickListener = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = "com.android.launcher3.WALLPAPER_OFFSET"
            r2 = 0
            float r0 = r0.getFloatExtra(r1, r2)
            r8.mWallpaperParallaxOffset = r0
            android.content.pm.PackageManager r0 = r23.getPackageManager()
            java.util.ArrayList r10 = new java.util.ArrayList
            r1 = 24
            r10.<init>(r1)
            com.android.launcher3.Partner r0 = com.android.launcher3.Partner.get(r0)
            r11 = 0
            r12 = 0
            if (r0 == 0) goto L_0x0105
            android.content.res.Resources r1 = r0.mResources
            java.lang.String r2 = "array"
            java.lang.String r3 = r0.mPackageName
            java.lang.String r4 = "partner_wallpapers"
            int r2 = r1.getIdentifier(r4, r2, r3)
            if (r2 == 0) goto L_0x0080
            java.lang.String r3 = r0.mPackageName
            addWallpapers$ar$ds(r10, r1, r3, r2)
        L_0x0080:
            android.content.res.Resources r1 = r0.mResources
            java.lang.String r2 = "string"
            java.lang.String r3 = r0.mPackageName
            java.lang.String r4 = "system_wallpaper_directory"
            int r1 = r1.getIdentifier(r4, r2, r3)
            if (r1 == 0) goto L_0x009a
            java.io.File r2 = new java.io.File
            android.content.res.Resources r3 = r0.mResources
            java.lang.String r1 = r3.getString(r1)
            r2.<init>(r1)
            goto L_0x009b
        L_0x009a:
            r2 = r11
        L_0x009b:
            if (r2 == 0) goto L_0x0105
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L_0x0105
            java.io.File[] r1 = r2.listFiles()
            int r3 = r1.length
            r4 = 0
        L_0x00a9:
            if (r4 >= r3) goto L_0x0105
            r5 = r1[r4]
            boolean r6 = r5.isFile()
            if (r6 != 0) goto L_0x00b4
            goto L_0x0102
        L_0x00b4:
            java.lang.String r6 = r5.getName()
            r7 = 46
            int r7 = r6.lastIndexOf(r7)
            r13 = -1
            if (r7 < r13) goto L_0x00ca
            java.lang.String r13 = r6.substring(r7)
            java.lang.String r6 = r6.substring(r12, r7)
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r13 = ""
        L_0x00cc:
            java.lang.String r7 = "_small"
            boolean r14 = r6.endsWith(r7)
            if (r14 != 0) goto L_0x0102
            java.io.File r14 = new java.io.File
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            r15.append(r7)
            r15.append(r13)
            java.lang.String r6 = r15.toString()
            r14.<init>(r2, r6)
            java.lang.String r6 = r14.getAbsolutePath()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6)
            if (r6 == 0) goto L_0x0102
            com.android.launcher3.WallpaperPickerActivity$FileWallpaperInfo r7 = new com.android.launcher3.WallpaperPickerActivity$FileWallpaperInfo
            android.graphics.drawable.BitmapDrawable r13 = new android.graphics.drawable.BitmapDrawable
            r13.<init>(r6)
            r7.<init>(r5, r13)
            r10.add(r7)
        L_0x0102:
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x0105:
            android.util.Pair r1 = r23.getWallpaperArrayResourceId()
            if (r1 == 0) goto L_0x012a
            android.content.pm.PackageManager r2 = r23.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0129 }
            java.lang.Object r3 = r1.first     // Catch:{ NameNotFoundException -> 0x0129 }
            android.content.pm.ApplicationInfo r3 = (android.content.pm.ApplicationInfo) r3     // Catch:{ NameNotFoundException -> 0x0129 }
            android.content.res.Resources r2 = r2.getResourcesForApplication(r3)     // Catch:{ NameNotFoundException -> 0x0129 }
            java.lang.Object r3 = r1.first     // Catch:{ NameNotFoundException -> 0x0129 }
            android.content.pm.ApplicationInfo r3 = (android.content.pm.ApplicationInfo) r3     // Catch:{ NameNotFoundException -> 0x0129 }
            java.lang.String r3 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0129 }
            java.lang.Object r1 = r1.second     // Catch:{ NameNotFoundException -> 0x0129 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ NameNotFoundException -> 0x0129 }
            int r1 = r1.intValue()     // Catch:{ NameNotFoundException -> 0x0129 }
            addWallpapers$ar$ds(r10, r2, r3, r1)     // Catch:{ NameNotFoundException -> 0x0129 }
            goto L_0x012a
        L_0x0129:
        L_0x012a:
            r13 = 1
            if (r0 == 0) goto L_0x0145
            android.content.res.Resources r1 = r0.mResources
            java.lang.String r2 = "bool"
            java.lang.String r3 = r0.mPackageName
            java.lang.String r4 = "default_wallpapper_hidden"
            int r1 = r1.getIdentifier(r4, r2, r3)
            if (r1 == 0) goto L_0x0145
            android.content.res.Resources r0 = r0.mResources
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L_0x0145
            goto L_0x0201
        L_0x0145:
            boolean r0 = com.android.launcher3.Utilities.ATLEAST_KITKAT
            if (r0 == 0) goto L_0x01ac
            java.io.File r0 = r23.getDefaultThumbFile()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x015d
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            r1 = 1
            goto L_0x019f
        L_0x015d:
            android.content.res.Resources r0 = r23.getResources()
            android.graphics.Point r0 = getDefaultThumbnailSize(r0)
            android.app.WallpaperManager r1 = android.app.WallpaperManager.getInstance(r23)
            int r2 = r0.x
            int r3 = r0.y
            r4 = 1
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1056964608(0x3f000000, float:0.5)
            android.graphics.drawable.Drawable r1 = r1.getBuiltInDrawable(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0196
            int r2 = r0.x
            int r3 = r0.y
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            int r4 = r0.x
            int r0 = r0.y
            r1.setBounds(r12, r12, r4, r0)
            r1.draw(r3)
            r3.setBitmap(r11)
            r0 = r2
            goto L_0x0197
        L_0x0196:
            r0 = r11
        L_0x0197:
            if (r0 == 0) goto L_0x019e
            boolean r1 = r8.saveDefaultWallpaperThumb(r0)
            goto L_0x019f
        L_0x019e:
            r1 = 0
        L_0x019f:
            if (r1 == 0) goto L_0x01fb
            com.android.launcher3.WallpaperPickerActivity$DefaultWallpaperInfo r1 = new com.android.launcher3.WallpaperPickerActivity$DefaultWallpaperInfo
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0)
            r1.<init>(r2)
            goto L_0x01fc
        L_0x01ac:
            android.content.res.Resources r14 = android.content.res.Resources.getSystem()
            java.lang.String r0 = "drawable"
            java.lang.String r1 = "android"
            java.lang.String r2 = "default_wallpaper"
            int r15 = r14.getIdentifier(r2, r0, r1)
            java.io.File r0 = r23.getDefaultThumbFile()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x01ce
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            r1 = 1
            goto L_0x01ee
        L_0x01ce:
            android.content.res.Resources r0 = r23.getResources()
            android.graphics.Point r1 = getDefaultThumbnailSize(r0)
            r2 = 0
            r3 = 0
            int r6 = com.android.p261d.p262a.C5040d.m13841a(r0, r15, r11, r11)
            r7 = 0
            r0 = r1
            r1 = r23
            r4 = r14
            r5 = r15
            android.graphics.Bitmap r0 = createThumbnail(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x01ed
            boolean r1 = r8.saveDefaultWallpaperThumb(r0)
            goto L_0x01ee
        L_0x01ed:
            r1 = 0
        L_0x01ee:
            if (r1 == 0) goto L_0x01fb
            com.android.launcher3.WallpaperPickerActivity$ResourceWallpaperInfo r1 = new com.android.launcher3.WallpaperPickerActivity$ResourceWallpaperInfo
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0)
            r1.<init>(r14, r15, r2)
            goto L_0x01fc
        L_0x01fb:
            r1 = r11
        L_0x01fc:
            if (r1 == 0) goto L_0x0201
            r10.add(r12, r1)
        L_0x0201:
            r0 = 2131437046(0x7f0b25f6, float:1.849598E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r8.mWallpapersView = r0
            com.android.launcher3.WallpaperPickerActivity$SimpleWallpapersAdapter r0 = new com.android.launcher3.WallpaperPickerActivity$SimpleWallpapersAdapter
            r0.<init>(r8, r10)
            android.widget.LinearLayout r1 = r8.mWallpapersView
            r8.populateWallpapersFromAdapter(r1, r0, r12)
            com.android.launcher3.SavedWallpaperImages r0 = new com.android.launcher3.SavedWallpaperImages
            r0.<init>(r8)
            r8.mSavedImages = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mImages = r1
            com.android.launcher3.SavedWallpaperImages$ImageDb r1 = r0.mDb
            android.database.sqlite.SQLiteDatabase r14 = r1.getReadableDatabase()
            java.lang.String[] r1 = new java.lang.String[r9]
            java.lang.String r2 = "id"
            r1[r12] = r2
            java.lang.String r2 = "image_thumbnail"
            r1[r13] = r2
            java.lang.String r2 = "image"
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "extras"
            r4 = 3
            r1[r4] = r2
            java.lang.String r15 = "saved_wallpaper_images"
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r21 = "id DESC"
            r22 = 0
            r16 = r1
            android.database.Cursor r1 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0252:
            boolean r2 = r1.moveToNext()
            if (r2 == 0) goto L_0x02b7
            java.lang.String r2 = r1.getString(r13)
            java.io.File r5 = new java.io.File
            android.content.Context r6 = r0.mContext
            java.io.File r6 = r6.getFilesDir()
            r5.<init>(r6, r2)
            java.lang.String r2 = r5.getAbsolutePath()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2)
            if (r2 == 0) goto L_0x0252
            java.lang.String r5 = r1.getString(r4)
            if (r5 == 0) goto L_0x0293
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            java.lang.Float[] r6 = new java.lang.Float[r6]
            r7 = 0
        L_0x0281:
            int r9 = r5.length
            if (r7 >= r9) goto L_0x0294
            r9 = r5[r7]     // Catch:{ Exception -> 0x0293 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ Exception -> 0x0293 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ Exception -> 0x0293 }
            r6[r7] = r9     // Catch:{ Exception -> 0x0293 }
            int r7 = r7 + 1
            goto L_0x0281
        L_0x0293:
            r6 = r11
        L_0x0294:
            java.util.ArrayList r5 = r0.mImages
            com.android.launcher3.SavedWallpaperImages$SavedWallpaperTile r7 = new com.android.launcher3.SavedWallpaperImages$SavedWallpaperTile
            int r9 = r1.getInt(r12)
            java.io.File r10 = new java.io.File
            android.content.Context r14 = r0.mContext
            java.io.File r14 = r14.getFilesDir()
            java.lang.String r15 = r1.getString(r3)
            r10.<init>(r14, r15)
            android.graphics.drawable.BitmapDrawable r14 = new android.graphics.drawable.BitmapDrawable
            r14.<init>(r2)
            r7.<init>(r9, r10, r14, r6)
            r5.add(r7)
            goto L_0x0252
        L_0x02b7:
            r1.close()
            android.widget.LinearLayout r0 = r8.mWallpapersView
            com.android.launcher3.SavedWallpaperImages r1 = r8.mSavedImages
            r8.populateWallpapersFromAdapter(r0, r1, r13)
            r0 = 2131432923(0x7f0b15db, float:1.8487617E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.android.launcher3.LiveWallpaperListAdapter r1 = new com.android.launcher3.LiveWallpaperListAdapter
            r1.<init>(r8)
            com.android.launcher3.WallpaperPickerActivity$5 r2 = new com.android.launcher3.WallpaperPickerActivity$5
            r2.<init>(r0, r1)
            r1.registerDataSetObserver(r2)
            r0 = 2131436555(0x7f0b240b, float:1.8494984E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.android.launcher3.ThirdPartyWallpaperPickerListAdapter r1 = new com.android.launcher3.ThirdPartyWallpaperPickerListAdapter
            r1.<init>(r8)
            r8.populateWallpapersFromAdapter(r0, r1, r12)
            r0 = 2131433061(0x7f0b1665, float:1.8487897E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.view.LayoutInflater r1 = r23.getLayoutInflater()
            r2 = 2131627234(0x7f0e0ce2, float:1.8881727E38)
            android.view.View r1 = r1.inflate(r2, r0, r12)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.addView(r1, r12)
            int r0 = android.os.Process.myPid()
            int r2 = android.os.Process.myUid()
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = r8.checkPermission(r5, r0, r2)
            if (r0 != 0) goto L_0x0348
            android.content.ContentResolver r14 = r23.getContentResolver()
            android.net.Uri r15 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r2 = "_id"
            r0[r12] = r2
            java.lang.String r2 = "datetaken"
            r0[r13] = r2
            r17 = 0
            r18 = 0
            java.lang.String r19 = "datetaken DESC LIMIT 1"
            r16 = r0
            android.database.Cursor r0 = android.provider.MediaStore.Images.Media.query(r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0348
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x0343
            int r2 = r0.getInt(r12)
            android.content.ContentResolver r3 = r23.getContentResolver()
            long r5 = (long) r2
            android.graphics.Bitmap r2 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r3, r5, r13, r11)
            goto L_0x0344
        L_0x0343:
            r2 = r11
        L_0x0344:
            r0.close()
            goto L_0x0349
        L_0x0348:
            r2 = r11
        L_0x0349:
            if (r2 == 0) goto L_0x0367
            r0 = 2131437044(0x7f0b25f4, float:1.8495976E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r2)
            android.content.res.Resources r2 = r23.getResources()
            r3 = 2131104380(0x7f06127c, float:1.7821253E38)
            int r2 = r2.getColor(r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.setColorFilter(r2, r3)
        L_0x0367:
            com.android.launcher3.WallpaperPickerActivity$PickImageInfo r0 = new com.android.launcher3.WallpaperPickerActivity$PickImageInfo
            r0.<init>()
            r1.setTag(r0)
            r0.mView = r1
            android.view.View$OnClickListener r0 = r8.mThumbnailOnClickListener
            r1.setOnClickListener(r0)
            com.android.launcher3.CropView r0 = r8.mCropView
            com.android.launcher3.WallpaperPickerActivity$6 r1 = new com.android.launcher3.WallpaperPickerActivity$6
            r1.<init>()
            r0.addOnLayoutChangeListener(r1)
            r23.updateTileIndices()
            r23.initializeScrollForRtl()
            android.animation.LayoutTransition r0 = new android.animation.LayoutTransition
            r0.<init>()
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            r1 = 0
            r0.setStartDelay(r13, r1)
            r0.setAnimator(r4, r11)
            android.widget.LinearLayout r1 = r8.mWallpapersView
            r1.setLayoutTransition(r0)
            android.app.ActionBar r0 = r23.getActionBar()
            r1 = 2131624058(0x7f0e007a, float:1.8875285E38)
            r0.setCustomView(r1)
            android.view.View r1 = r0.getCustomView()
            com.android.launcher3.WallpaperPickerActivity$7 r2 = new com.android.launcher3.WallpaperPickerActivity$7
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            r0 = 2131435766(0x7f0b20f6, float:1.8493383E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.mSetWallpaperButton = r0
            com.android.launcher3.WallpaperPickerActivity$8 r0 = new com.android.launcher3.WallpaperPickerActivity$8
            r0.<init>()
            r8.mActionModeCallback = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.WallpaperPickerActivity.init():void");
    }

    /* access modifiers changed from: package-private */
    public final void initializeScrollForRtl() {
        if (Utilities.isRtl(getResources())) {
            this.mWallpaperScrollContainer.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    WallpaperPickerActivity.this.mWallpaperScrollContainer.scrollTo(((LinearLayout) WallpaperPickerActivity.this.findViewById(R.id.master_wallpaper_list)).getWidth(), 0);
                    WallpaperPickerActivity.this.mWallpaperScrollContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void onLoadRequestComplete(WallpaperCropActivity.LoadRequest loadRequest, boolean z) {
        super.onLoadRequestComplete(loadRequest, z);
        if (z) {
            setSystemWallpaperVisiblity(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TEMP_WALLPAPER_TILES");
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            addTemporaryWallpaperTile((Uri) parcelableArrayList.get(i), true);
        }
        this.mSelectedIndex = bundle.getInt("SELECTED_INDEX", -1);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelableArrayList("TEMP_WALLPAPER_TILES", this.mTempWallpaperTiles);
        bundle.putInt("SELECTED_INDEX", this.mSelectedIndex);
    }

    public final void onStop() {
        super.onStop();
        View findViewById = findViewById(R.id.wallpaper_strip);
        this.mWallpaperStrip = findViewById;
        if (findViewById.getAlpha() < 1.0f) {
            this.mWallpaperStrip.setAlpha(1.0f);
            this.mWallpaperStrip.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void populateWallpapersFromAdapter(ViewGroup viewGroup, BaseAdapter baseAdapter, boolean z) {
        for (int i = 0; i < baseAdapter.getCount(); i++) {
            FrameLayout frameLayout = (FrameLayout) baseAdapter.getView(i, (View) null, viewGroup);
            viewGroup.addView(frameLayout, i);
            WallpaperTileInfo wallpaperTileInfo = (WallpaperTileInfo) baseAdapter.getItem(i);
            frameLayout.setTag(wallpaperTileInfo);
            wallpaperTileInfo.mView = frameLayout;
            if (z) {
                addLongPressHandler(frameLayout);
            }
            frameLayout.setOnClickListener(this.mThumbnailOnClickListener);
        }
    }

    /* access modifiers changed from: package-private */
    public final void selectTile(View view) {
        View view2 = this.mSelectedTile;
        if (view2 != null) {
            view2.setSelected(false);
        }
        this.mSelectedTile = view;
        view.setSelected(true);
        this.mSelectedIndex = this.mWallpapersView.indexOfChild(view);
        view.announceForAccessibility(getString(R.string.announce_selection, new Object[]{view.getContentDescription()}));
    }

    /* access modifiers changed from: protected */
    public final void setSystemWallpaperVisiblity(final boolean z) {
        if (!z) {
            this.mCropView.setVisibility(0);
        } else {
            changeWallpaperFlags(true);
        }
        this.mCropView.postDelayed(new Runnable() {
            public final void run() {
                if (!z) {
                    WallpaperPickerActivity.this.changeWallpaperFlags(false);
                } else {
                    WallpaperPickerActivity.this.mCropView.setVisibility(4);
                }
            }
        }, 200);
    }

    /* access modifiers changed from: package-private */
    public final void updateTileIndices() {
        int i;
        int i2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.master_wallpaper_list);
        int childCount = linearLayout2.getChildCount();
        Resources resources = getResources();
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = linearLayout2.getChildAt(i6);
                if (childAt.getTag() instanceof WallpaperTileInfo) {
                    i = i6;
                    i2 = i6 + 1;
                    linearLayout = linearLayout2;
                } else {
                    linearLayout = (LinearLayout) childAt;
                    i2 = linearLayout.getChildCount();
                    i = 0;
                }
                while (i < i2) {
                    WallpaperTileInfo wallpaperTileInfo = (WallpaperTileInfo) linearLayout.getChildAt(i).getTag();
                    if (wallpaperTileInfo.isNamelessWallpaper()) {
                        if (i4 == 0) {
                            i3++;
                        } else {
                            i5++;
                            String string = resources.getString(R.string.wallpaper_accessibility_name, new Object[]{Integer.valueOf(i5), Integer.valueOf(i3)});
                            if (wallpaperTileInfo.isNamelessWallpaper()) {
                                wallpaperTileInfo.mView.setContentDescription(string);
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5) {
            if (i2 == -1 && intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(getContentResolver().getType(data));
                if (extensionFromMimeType == null || !extensionFromMimeType.equalsIgnoreCase("BMP")) {
                    addTemporaryWallpaperTile(data, false);
                } else {
                    Toast.makeText(this, R.string.image_load_fail, 0).show();
                }
            }
        } else if (i == 6 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }
}

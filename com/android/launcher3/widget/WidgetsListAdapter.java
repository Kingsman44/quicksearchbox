package com.android.launcher3.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.WidgetPreviewLoader;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.model.WidgetsModel;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* compiled from: PG */
public final class WidgetsListAdapter extends C0640fb {
    private final View.OnClickListener mIconClickListener;
    private final View.OnLongClickListener mIconLongClickListener;
    private int mIndent = 0;
    private final Launcher mLauncher;
    private final LayoutInflater mLayoutInflater;
    private WidgetPreviewLoader mWidgetPreviewLoader;
    public WidgetsModel mWidgetsModel;

    public WidgetsListAdapter(Context context, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, Launcher launcher) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mIconClickListener = onClickListener;
        this.mIconLongClickListener = onLongClickListener;
        this.mLauncher = launcher;
        Resources resources = launcher.getResources();
        DeviceProfile deviceProfile = launcher.mDeviceProfile;
        if (deviceProfile.isLargeTablet || deviceProfile.isTablet) {
            this.mIndent = Utilities.pxFromDp(56.0f, resources.getDisplayMetrics());
        }
    }

    public final int getItemCount() {
        WidgetsModel widgetsModel = this.mWidgetsModel;
        if (widgetsModel == null) {
            return 0;
        }
        return widgetsModel.mPackageItemInfos.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        WidgetsRowViewHolder widgetsRowViewHolder = (WidgetsRowViewHolder) ghVar;
        WidgetsModel widgetsModel = this.mWidgetsModel;
        List list = (List) widgetsModel.mWidgetsList.get(widgetsModel.mPackageItemInfos.get(i));
        ViewGroup viewGroup = (ViewGroup) widgetsRowViewHolder.mContent.findViewById(R.id.widgets_cell_list);
        int size = list.size() - viewGroup.getChildCount();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                WidgetCell widgetCell = (WidgetCell) this.mLayoutInflater.inflate(R.layout.widget_cell, viewGroup, false);
                widgetCell.setOnClickListener(this.mIconClickListener);
                widgetCell.setOnLongClickListener(this.mIconLongClickListener);
                viewGroup.addView(widgetCell);
            }
        } else if (size < 0) {
            for (int size2 = list.size(); size2 < viewGroup.getChildCount(); size2++) {
                viewGroup.getChildAt(size2).setVisibility(8);
            }
        }
        ((BubbleTextView) widgetsRowViewHolder.mContent.findViewById(R.id.section)).applyFromPackageItemInfo(this.mWidgetsModel.getPackageItemInfo(i));
        if (this.mWidgetPreviewLoader == null) {
            this.mWidgetPreviewLoader = LauncherAppState.getInstance().mWidgetCache;
        }
        if (this.mWidgetPreviewLoader != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                WidgetCell widgetCell2 = (WidgetCell) viewGroup.getChildAt(i3);
                if (list.get(i3) instanceof LauncherAppWidgetProviderInfo) {
                    LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = (LauncherAppWidgetProviderInfo) list.get(i3);
                    widgetCell2.setTag(new PendingAddWidgetInfo(this.mLauncher, launcherAppWidgetProviderInfo));
                    widgetCell2.applyFromAppWidgetProviderInfo(launcherAppWidgetProviderInfo, this.mWidgetPreviewLoader);
                } else if (list.get(i3) instanceof ShortcutConfigActivityInfo) {
                    ShortcutConfigActivityInfo shortcutConfigActivityInfo = (ShortcutConfigActivityInfo) list.get(i3);
                    widgetCell2.setTag(new PendingAddShortcutInfo(shortcutConfigActivityInfo));
                    widgetCell2.applyFromShortcutInfo(shortcutConfigActivityInfo, this.mWidgetPreviewLoader);
                }
                widgetCell2.ensurePreview();
                widgetCell2.setVisibility(0);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = (ViewGroup) this.mLayoutInflater.inflate(R.layout.widgets_list_row_view, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewGroup2.findViewById(R.id.widgets_cell_list);
        if (Utilities.ATLEAST_JB_MR1) {
            linearLayout.setPaddingRelative(this.mIndent, 0, 1, 0);
        } else {
            linearLayout.setPadding(this.mIndent, 0, 1, 0);
        }
        return new WidgetsRowViewHolder(viewGroup2);
    }

    public final /* synthetic */ boolean onFailedToRecycleView(C0673gh ghVar) {
        WidgetsRowViewHolder widgetsRowViewHolder = (WidgetsRowViewHolder) ghVar;
        return true;
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ViewGroup viewGroup = (ViewGroup) ((WidgetsRowViewHolder) ghVar).mContent.findViewById(R.id.widgets_cell_list);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            WidgetCell widgetCell = (WidgetCell) viewGroup.getChildAt(i);
            widgetCell.mWidgetImage.animate().cancel();
            WidgetImageView widgetImageView = widgetCell.mWidgetImage;
            widgetImageView.mBitmap = null;
            widgetImageView.invalidate();
            widgetCell.mWidgetName.setText((CharSequence) null);
            widgetCell.mWidgetDims.setText((CharSequence) null);
            WidgetPreviewLoader.PreviewLoadRequest previewLoadRequest = widgetCell.mActiveRequest;
            if (previewLoadRequest != null) {
                previewLoadRequest.mTask.cancel(true);
                if (previewLoadRequest.mTask.mBitmapToRecycle != null) {
                    WidgetPreviewLoader.this.mWorkerHandler.post(new Runnable() {
                        public final void run(
/*
Method generation error in method: com.android.launcher3.WidgetPreviewLoader.PreviewLoadRequest.1.run():void, dex: classes.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.WidgetPreviewLoader.PreviewLoadRequest.1.run():void, class status: UNLOADED
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
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    });
                }
                widgetCell.mActiveRequest = null;
            }
        }
    }
}
